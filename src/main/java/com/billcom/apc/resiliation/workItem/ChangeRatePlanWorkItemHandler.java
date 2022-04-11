package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author Bechir
 * Updated by Fethi
 */

public class ChangeRatePlanWorkItemHandler implements WorkItemHandler{

	private Logger logger = Logger.getLogger(ChangeRatePlanWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	
	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> ChangeRatePlanWorkItemHandler in:");
		
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();

		logger.info("Resiliation in progress...Change RatePlan");
	
	
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		

		try {
			
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");

			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId") );
			logger.info("Contractresiliation id : "+contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);
			
			//retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));			 
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("ChangerateplanWIH");

			//consume ws changeRatePlanResiliation
			ChangeRatePlanResiliationResponse response = resiliationService.changeRatePlanResiliation((Long)contractMap.get("coId"),(Long)resiliationMap.get("tmcode"));
			logger.info("response : " + response.getIsSuccessful());
			if(response.getIsSuccessful()) {
				logger.info("Rate Plan changed"); 
				logger.info("<= ChangeRatePlanWorkItemHandler out:");

				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputChangeRatePlan(resiliationMap, contractMap, waitFailure,taskName));
			}else {
				
				logger.info("Rate Plan failed to change"); 
				logger.info("response error : " + response.getBscsErrorCode()+" "+response.getComment());
				logger.info("<= ChangeRatePlanWorkItemHandler out:");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputChangeRatePlan(resiliationMap, contractMap, retryNbre, waitFailure));
			}
		}catch (Exception e) {
			logger.error("",e);
			logger.info("<= ChangeRatePlanWorkItemHandler out:");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputChangeRatePlan(resiliationMap, contractMap, retryNbre, waitFailure));
		}	
	}

	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		// Auto-generated method stub
		
	}

}
