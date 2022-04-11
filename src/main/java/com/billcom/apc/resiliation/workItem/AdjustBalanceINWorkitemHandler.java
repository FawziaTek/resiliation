package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.AdjustBalanceResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author fethi
 */
public class AdjustBalanceINWorkitemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(AdjustBalanceINWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> AdjustBalanceINWorkitemHandler in: " + wi.getProcessInstanceId());

		Map<String, Object> resiliationMap =new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
	
		logger.info("Resiliation in progress...Get Balances IN");
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("ContractResiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);

			Long cust_id = (Long) wi.getParameter("custId");
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);

			String migrationCat = "";
			Long tmcodeInit = (Long) contractMap.get("tmcode");
			Long tmcodeTarget = (Long) resiliationMap.get("tmcode");
            String taskName=resiliationService.getConfig().getPropValues("adjustBalanceResINWIH");
			String offreValue="";

			if (contractMap.get("mainBalanceAmount") == null || (Long) contractMap.get("mainBalanceAmount") == 0L) {
				logger.info("Main Balance = 0 ===> No Adjust balance IN");
				resiliationMap.put("resiliationStatusFlag", "OK");
				wim.completeWorkItem(wi.getId(),
						resiliationService.successAdjustBalanceIN(resiliationMap, waitFailure,taskName));
			} else {
				if (migrationCat.equalsIgnoreCase("POST2HYB")) {
					logger.info(migrationCat + " ===> No Adjust balance IN");
					resiliationMap.put("resiliationStatusFlag", "OK");
					wim.completeWorkItem(wi.getId(),
							resiliationService.successAdjustBalanceIN(resiliationMap, waitFailure,taskName));
				} else {

					logger.info("tmcodeInit ="+tmcodeInit);
					logger.info("coId ="+Long.parseLong(contractMap.get("oldCoId").toString()));

					GetOffreResponse responseGetOffre =resiliationService.getOffreSource(tmcodeInit,Long.parseLong(contractMap.get("oldCoId").toString()));
					
					if(responseGetOffre.getIsSuccessful())
					{						
						logger.info( " responseGetOffre.getOfferSource().getValue()"+responseGetOffre.getOfferSource().getValue() );

						if(responseGetOffre.getOfferSource().getValue()!=null) {
						offreValue=responseGetOffre.getOfferSource().getValue();
					}
						
					}
					else
					{			
						logger.info(" error :"+responseGetOffre.getBscsErrorCode());
						logger.info(" => getOffreSource :"+responseGetOffre.getIsSuccessful());


						wim.completeWorkItem(wi.getId(),
								resiliationService.failAdjustBalanceIN(resiliationMap, retryNbre, waitFailure));

						
					}
					com.billcom.apc.ws.manager.AdjustBalanceResponse responseAsjustBalance = resiliationService
							.adjustBalanceIn(resiliationMap, contractMap, cust_id,offreValue);

					logger.info("+ Adjust balance IN : " + resiliationMap.get("resiliationOrderId") + " : "
							+ responseAsjustBalance.isFinished());
					if (responseAsjustBalance.isFinished()) {
						resiliationMap.put("resiliationStatusFlag", "OK");
						wim.completeWorkItem(wi.getId(),
								resiliationService.successAdjustBalanceIN(resiliationMap, waitFailure,taskName));
					} else {
						logger.info("Adjust Balance Error code : " + responseAsjustBalance.getErrorCode());
						logger.info("Adjust Balance Comment : " + responseAsjustBalance.getComment());
						logger.info(" Error Adjust balance IN : Error Calling Reachrge WS ");
						resiliationMap.put("resiliationStatusFlag", "OK");
						wim.completeWorkItem(wi.getId(),
								resiliationService.failAdjustBalanceIN(resiliationMap, retryNbre, waitFailure));
					}
				}
			}
		} catch (Exception e) {
			// ko
			logger.error("", e);
			logger.info("<= AdjustBalanceINWorkitemHandler out: " + wi.getProcessInstanceId());
			wim.completeWorkItem(wi.getId(),
					resiliationService.failAdjustBalanceIN(resiliationMap, retryNbre, waitFailure));
		}

	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

}
