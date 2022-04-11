package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;
/**
 * @author fethi
 */

public class UpdateStatusWorkitemHandler implements WorkItemHandler{
	
	
	private Logger logger = Logger.getLogger(UpdateStatusWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		// TODO Auto-generated method stub
		logger.info("=> UpdateStatusWorkitemHandler");

		Map<String, Object> resultsMap = new HashMap<String, Object>();

		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		String retryWaiting="";
		String pendingWaiting="";
		try {
			Integer custId = (Integer) wi.getParameter("custId");
		    Boolean	resiliationTotal = (Boolean) wi.getParameter("resiliationTotal");

			logger.info(" custId for updateStatus :"+custId);
			logger.info(" resTotal :"+resiliationTotal);
	         retryWaiting=resiliationService.getConfig().getPropValues("retryWaiting");
			logger.info(" retryWaiting :"+retryWaiting);

	         pendingWaiting=resiliationService.getConfig().getPropValues("pendingWaiting");
			logger.info(" pendingWaiting :"+pendingWaiting);
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));
			logger.info("Retry Tentative N° : " + retryNbre);
	
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.info("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("UpdateStatusWIH");

			if(resiliationTotal) {
				
		
			UpdateStatusDemandeHistResponse response = resiliationService.updateStatus(Long.valueOf(custId)) ;
			if (response.getIsSuccessful()) 
			{
				resultsMap.put("success", true) ;
				resultsMap.put("taskName", taskName) ;
				resultsMap.put("retryWaiting", retryWaiting);
				resultsMap.put("pendingWaiting", pendingWaiting);

				logger.info(" success :"+resultsMap.get("success"));

				logger.info("<= UpdateStatusWorkitemHandler");
				wim.completeWorkItem(wi.getId(), resultsMap);

			}
			else {
				resultsMap.put("success", false) ;
				logger.info(" success :"+resultsMap.get("success"));
				resultsMap.put("retryWaiting", retryWaiting);
				resultsMap.put("pendingWaiting", pendingWaiting);

				logger.info("<= UpdateStatusWorkitemHandler");
				wim.completeWorkItem(wi.getId(), resultsMap);

			}
	
			}
			//Partielle
			else {
				resultsMap.put("success", true) ;
				resultsMap.put("taskName", taskName) ;
				resultsMap.put("retryWaiting", retryWaiting);
				resultsMap.put("pendingWaiting", pendingWaiting);

				logger.info("<= UpdateStatusWorkitemHandler");
				wim.completeWorkItem(wi.getId(), resultsMap);

			}
			

		} catch (Exception e) {
			resultsMap.put("success", false) ;
			resultsMap.put("retryWaiting", retryWaiting);
			resultsMap.put("pendingWaiting", pendingWaiting);

			logger.error("",e);	
			logger.info(" success :"+resultsMap.get("success"));

			logger.info("<= UpdateStatusWorkitemHandler");
			wim.completeWorkItem(wi.getId(), resultsMap);
		}
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
	}

}
