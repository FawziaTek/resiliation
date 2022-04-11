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

public class PrepareMigrationResWorkItemHandler implements WorkItemHandler {
	private Logger logger = Logger.getLogger(PrepareMigrationResWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();


	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		//auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> PrepareMigrationResWorkItemHandler in:");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();


		logger.info("Resiliation in progress ... Prepare Resiliation PRE");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			
			 resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
				logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
				logger.info("Contractresiliation id : " +  wi.getProcessInstanceId());
				resiliationService.printWorkItem(logger,wi);

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre")); 

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("MigtopreprepareWIH");

			logger.info("Migration Prepared");	
			logger.info("<= PrepareMigrationResWorkItemHandler out:");

			wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputPrepareMigrationForPre(waitFailure, resiliationMap,taskName));

		} catch (Exception e) {

			logger.error("",e);
			logger.info("<= PrepareMigrationResWorkItemHandler out with error:");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputPrepareMigrationForPre(retryNbre, waitFailure, resiliationMap));
		}
	}

}





