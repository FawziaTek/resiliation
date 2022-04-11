package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 * Updated by Fethi
 */

public class PrepareResiliationContractWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(PrepareResiliationContractWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> PrepareResiliationContractWorkItemHandler in:");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
       
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		String dueDate = (String) wi.getParameter("DueDate");
		int timer = 0;
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			contractMap.put("contractResiliationOrderId", wi.getProcessInstanceId());
	          String typeRes= (String) resiliationMap.get("typeRes");
	          String contractStatus = (String) contractMap.get("contractStatus");
	          String contractStatusSuspend=resiliationService.getConfig().getPropValues("contractStatusSuspend").trim();
	          String typeResSuspension=resiliationService.getConfig().getPropValues("typeResSuspension").trim();

	    		logger.info("contractStatus ="+contractStatus);

	  		logger.info("typeRes in Resiliation ="+typeRes);
	  		
	        String typeResContract= (String) wi.getParameter("TypeRes");
			logger.info("typeRes in contract ="+typeResContract);
			logger.info("Resiliation in progress...Prepare Resiliation Contract");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);

            String taskName=resiliationService.getConfig().getPropValues("PrepareResiliationContractWIH");

			timer = resiliationService.getConfig().isResiliationDateNow(dueDate);
			logger.debug("due date: " + dueDate);
			logger.debug("timer: " + timer);

			// orderId to set and it correspondent coId
			Integer orderId = (int) (long) (Long) contractMap.get("contractResiliationOrderId");
			Integer coId = (int) (long) (Long) contractMap.get("coId");
			logger.info("ContractOrder ID in prepare to set ="+orderId);

			logger.debug("getCoIdPub: " + contractMap.get("coIdPub"));
			logger.debug("getCoId: " + contractMap.get("coId"));
			logger.debug("getMsisdn: " + contractMap.get("msisdn"));

			// call the webs service setContractOrderId and returning a boolean (true =
			// success, false = fail)
			if (resiliationService.setContractOrderID(orderId, coId, logger,taskName)) {
				// contractOrderId is set
				logger.info("resiliation for contract " + contractMap.get("coIdPub") + "is prepared");
				logger.info("<= PrepareResiliationContractWorkItemHandler out:");

				wim.completeWorkItem(wi.getId(),resiliationService.sucessOutputsetContractOrderID(waitFailure, contractMap, timer,typeRes,taskName,contractStatus));
			} else {
				// fail
				logger.info("resiliation for contract " + contractMap.get("coIdPub") + "failed to prepare");
				logger.info("<= PrepareResiliationContractWorkItemHandler out with error:");

				wim.completeWorkItem(wi.getId(),resiliationService.failOutputSetContractOrderID(retryNbre, waitFailure, contractMap, timer));
			}
		} catch (Exception e) {
			logger.error("",e);
			logger.info("<= PrepareResiliationContractWorkItemHandler out with error:");

			wim.completeWorkItem(wi.getId(),resiliationService.failOutputSetContractOrderID(retryNbre, waitFailure, contractMap, timer));
		}
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

}
