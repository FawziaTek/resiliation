package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 * Updated by Fethi
 */

public class GetMigrationGroupWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(GetMigrationGroupWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		// Auto-generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> GetMigrationGroupWorkItemHandler in:");
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();

		logger.info("Resiliation in progress...Get Migration Group");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		Boolean isSameGroup = false;
		try {
			
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");

			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);

			//retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));	
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);

            String taskName=resiliationService.getConfig().getPropValues("GetmigrationtypeWIH");

			//consume ws getMigrationGroup
			GetCategoryResponse response = resiliationService.getMigrationGroup((Long) contractMap.get("tmcode"), (Long) resiliationMap.get("tmcode"));
			
			logger.info("response : " + response.getIsSuccessful());
			if (response.getIsSuccessful()) {
				//success				
				//get category
				//if category == intra => same group
				//else different group
				String categoryString = response.getCategory();
				isSameGroup = categoryString.equalsIgnoreCase("intra");	
				logger.info("offer init : " + contractMap.get("tmcode")); 
				logger.info("offer target : " + resiliationMap.get("tmcode")); 
				logger.info("category : " + categoryString); 
				logger.info("isSameGroup? : " + isSameGroup); 				
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputGetMigrationGroup(waitFailure, isSameGroup,taskName));
			} else {		
				//ko
				logger.info("error: "+response.getBscsErrorCode()+" "+response.getComment());
				wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetMigrationGroup(isSameGroup, retryNbre, waitFailure));
			}

		} catch (Exception e) {
			//ko 
			logger.error("",e);		
			wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetMigrationGroup(isSameGroup, retryNbre, waitFailure));
		}

		logger.info("<= GetMigrationGroupWorkItemHandler out:");
	}

}
