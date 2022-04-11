package com.billcom.apc.resiliation.workItem;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 *  Updated by Fethi
 */

public class CreerContratWorkitemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(CreerContratWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> CreerContratWorkitemHandler in:");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		logger.info("Resiliation in progress...Create New Contract");

		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
        Boolean byPassCreate=false;

		try {
			
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);
			Long rpCode = (Long) resiliationMap.get("tmcode");		
	        Boolean byPassCreateFromWi=(Boolean) wi.getParameter("byPassCreate");

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre")); 

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
            String taskName=resiliationService.getConfig().getPropValues("MigtoprecreatectrWIH");

			// consume ws createContract
			CreateContractResResponse createContractResResponse = resiliationService.createContract((Long) contractMap.get("coId"), rpCode);
			logger.info("response : " + createContractResResponse.getIsSuccessful());
			if (createContractResResponse.getIsSuccessful() && createContractResResponse.isCreated()) {
				// ok
				contractMap.put("oldCoId", contractMap.get("coId")); // OLD
				contractMap.put("oldCoIdPub", contractMap.get("coIdPub")); // OLD

				contractMap.put("coId", createContractResResponse.getCoId());// NEW
				contractMap.put("coIdPub", createContractResResponse.getCoIdPub());// NEW

				logger.debug("old co_id: " + contractMap.get("coId"));
				logger.debug("old co_code: " + contractMap.get("coIdPub"));
				logger.debug("new co_id: " + contractMap.get("coId"));
				logger.debug("new co_code: " + contractMap.get("coIdPub"));
				
				contractMap.put("comments", "");
				resiliationMap.put("resiliationStatusFlag", "OK");
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputCreateContract(resiliationMap, contractMap, waitFailure,taskName));
			} else {
			
				//Ko
			
					
				
				resiliationMap.put("resiliationStatusFlag", "KO");
				logger.info("Error while creating new contract: "+createContractResResponse.getBscsErrorCode()+" "+createContractResResponse.getComment()); 
				wim.completeWorkItem(wi.getId(), resiliationService.failOutputCreateContract(resiliationMap,contractMap, retryNbre, waitFailure));
				
				}

		} 

		catch (Exception e) { 
			
			resiliationMap.put("resiliationStatusFlag", "KO");
			
			logger.error("",e);
			logger.info("<= CreerContratWorkitemHandler out with error:");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputCreateContract(resiliationMap, contractMap, retryNbre, waitFailure));
		}
	}

}
