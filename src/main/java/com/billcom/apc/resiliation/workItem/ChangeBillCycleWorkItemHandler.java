package com.billcom.apc.resiliation.workItem;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.jboss.logging.Logger;

import org.drools.core.process.instance.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcFafNumberHistRequest;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.UpdateAdvChargeRequest;

import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author fethi
 */
public class ChangeBillCycleWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(ChangeBillCycleWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public ChangeBillCycleWorkItemHandler() {

	}

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> ChangeBillCycleWorkItemHandler in:");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		Boolean updAdvChDone = false;
		Boolean adjFaFDone = false;
		String action = "";
		String remark = " ";
		logger.info("**************** resiliation id : ******" + wi.getProcessInstanceId() + "***********");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			boolean isSameGroup = (Boolean) wi.getParameter("isSameGroup");

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			
            String taskName=resiliationService.getConfig().getPropValues("changeBillCycleResiliationWIH");

			logger.debug("waitFailure from config = " + waitFailure);
			ResiliationConfigHandler config = new ResiliationConfigHandler();
			APCHandlingSoapBindingStub binding = config.consumeAPCHandling();
			String dateUpdateAdvCharge = config.getPropValues("dateUpdateAdvCharge").trim();
			logger.info("=> Update Advanced Charge in:");

			// Update Advanced Charge
			String dateMig = (String) resiliationMap.get("dueDate");
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
			Date date = format.parse(dateMig);

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int MigDueDate_Day = calendar.get(Calendar.DAY_OF_MONTH);
			// logger.info(MigDueDate_Day + " - " + new_mig.getBillCycle());
			// if (MigDueDate_Day == 01 /*&& new_mig.getBillCycle() == 0*/) {
			logger.info("Update Adv Charge");
			UpdateAdvChargeRequest updateAdvChargeRequest = new UpdateAdvChargeRequest();
			if (!dateUpdateAdvCharge.equalsIgnoreCase(String.valueOf(0)) && dateUpdateAdvCharge != null
					&& dateUpdateAdvCharge != ""
					&& Integer.valueOf(dateUpdateAdvCharge) < calendar.getMaximum(Calendar.DAY_OF_MONTH)) {
				Date daf = new Date();
				daf.setDate(Integer.valueOf(dateUpdateAdvCharge));
				calendar.setTime(daf);
				updateAdvChargeRequest.setDateMig(calendar);
			} else {
				updateAdvChargeRequest.setDateMig(Calendar.getInstance());
			}
			// updateAdvChargeRequest.setDateMig(calendar);
			updateAdvChargeRequest.setRpCodeSrc(Long.parseLong(contractMap.get("tmcode").toString()));
			updateAdvChargeRequest.setRpCodeCible(Long.parseLong(resiliationMap.get("tmcode").toString()));
			if (isSameGroup) {

				if (contractMap.get("coId") != null)
					updateAdvChargeRequest.setCoIdSrc(Long.parseLong(contractMap.get("coId").toString()));
				if (contractMap.get("coId") != null)
					updateAdvChargeRequest.setCoIdTarget(Long.parseLong(contractMap.get("coId").toString()));
			} else {
				if (contractMap.get("coId") != null)
					updateAdvChargeRequest.setCoIdSrc(Long.parseLong(contractMap.get("coId").toString()));
				if (contractMap.get("coId") != null)
					updateAdvChargeRequest.setCoIdTarget(Long.parseLong(contractMap.get("oldCoId").toString()));
			}

			if (updateAdvChargeRequest != null) {
				OperationResponse responseUpdateAdvCh = binding.updateAdvCharge(updateAdvChargeRequest);
				logger.info(+wi.getProcessInstanceId() + " : " + " --- response : "
						+ responseUpdateAdvCh.getIsSuccessful() + " | comment : " + responseUpdateAdvCh.getComment());

				if (responseUpdateAdvCh.getIsSuccessful()) {
					updAdvChDone = true;
					logger.info("<= Update Advanced Charge out:");

					logger.info(" ChangeBillCycleWorkItemHandler out: <=");
					wim.completeWorkItem(wi.getId(), resiliationService.successChangeBillcycle(resiliationMap, waitFailure,taskName));

				} else {
					updAdvChDone = false;
					logger.info(" ChangeBillCycleWorkItemHandler out: <=");

					wim.completeWorkItem(wi.getId(),
							resiliationService.failChangeBillcycle(resiliationMap, retryNbre, waitFailure));

				}
			}

		} catch (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			logger.error("An exception was thrown", e);
			logger.info(wi.getProcessInstanceId() + " : " + "C1 ==> Update Adv Charge statut : " + updAdvChDone
					+ " Adjust FaF statut : " + adjFaFDone);

			if (adjFaFDone == false && updAdvChDone == true)
				action = "adjustFaF";
			else
				action = "updateAdvancedCharge";
			if (e.getMessage() != null)
				remark = e.getMessage();
			logger.info(" ChangeBillCycleWorkItemHandler out: <=");
			wim.completeWorkItem(wi.getId(),
					resiliationService.failChangeBillcycle(resiliationMap, retryNbre, waitFailure));

		} catch (Exception e) {
			logger.error("An exception was thrown", e);
			logger.info(wi.getProcessInstanceId() + " : " + "C2 ==> Update Adv Charge statut : " + updAdvChDone
					+ " Adjust FaF statut : " + adjFaFDone);
			if (adjFaFDone == false && updAdvChDone == true)
				action = "adjustFaF";
			else
				action = "updateAdvancedCharge";
			resultsMap.put("resiliationMap", resiliationMap);
			resultsMap.put("success", false);
			if (e.getMessage() != null)
				remark = e.getMessage();

			logger.info(" ChangeBillCycleWorkItemHandler out: <=");

			wim.completeWorkItem(wi.getId(),
					resiliationService.failChangeBillcycle(resiliationMap, retryNbre, waitFailure));
		}

	}
}
