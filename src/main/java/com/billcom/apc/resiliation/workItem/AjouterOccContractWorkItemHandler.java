package com.billcom.apc.resiliation.workItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author fethi
 */

public class AjouterOccContractWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(AjouterOccContractWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> AjouterOccContractWorkItemHandler in:");

		// get WIH input
		Map<String, Object> resiliationMap = new HashMap<String, Object>();

		// logger.info("TotalFA = "+faTotal);

		logger.info("Resiliation in progress...Ajouter OccContract");

		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			logger.info("Resiliation Order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);

			String comment = (String) wi.getParameter("comment");
			Float faTotal = (Float) wi.getParameter("FA");
			List<Map<String, Object>> contractResiliation = (List<Map<String, Object>>) resiliationMap.get("contractResiliation");
			Map<String, Object> contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			ContractOccBean[] coIdList = new ContractOccBean[1];

			resiliationMap.put("TotalFA", faTotal);
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);

			logger.debug("waitFailure from config = " + waitFailure);
 
            String taskName=resiliationService.getConfig().getPropValues("AjoutoccContractWIH");

			if(comment != null)
			{
			resiliationMap.put("comments",resiliationMap.get("comments") +"/" + comment);
			comment =null;
			}
			ContractOccBean c = new ContractOccBean();
			c.setCoId(Long.parseLong(contractMap.get("coId").toString()));
			c.setAmoutCoid(Double.parseDouble(contractMap.get("valueFA").toString()));
			coIdList[0] = c;

			logger.info("set OCC for contract " + c.getCoId() + " with amount : " + c.getAmoutCoid()
					+ " for customer : " + resiliationMap.get("custId"));

			// consume ws setOCC
			SetOccResponse occResponse = resiliationService.setOCC(faTotal, (Long) resiliationMap.get("custId"),
					coIdList);

			printOccResponse(occResponse);

			if (occResponse.getIsSuccessful() && occResponse.isFinished()) {
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputSetOcc(resiliationMap, waitFailure,taskName));
			} else {
				wim.completeWorkItem(wi.getId(),
						resiliationService.failOutputSetOcc(resiliationMap, waitFailure, retryNbre));
			}

		} catch (Exception e) {
			logger.error("", e);
			wim.completeWorkItem(wi.getId(),
					resiliationService.failOutputSetOcc(resiliationMap, waitFailure, retryNbre));
		}
		logger.info("<= AjouterOccContractWorkItemHandler out:");
	}

	private void printOccResponse(SetOccResponse occResponse) {
		logger.info("occResponse IsSuccessful : " + occResponse.getIsSuccessful());
		logger.info("occResponse isFinished : " + occResponse.isFinished());
		logger.info("occResponse BscsErrorCode : " + occResponse.getBscsErrorCode());
		logger.info("occResponse Comment : " + occResponse.getComment());
	}

}
