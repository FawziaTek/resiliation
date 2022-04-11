package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;  

import org.drools.core.process.instance.WorkItemHandler;
import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.gps.AddApcResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;
/**
 * @author fethi
 */
public class AppelGpsWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(AppelGpsWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> AppelgpsWorkItemHandler in:");
		Map<String, Object> resiliationMap = new HashMap<String, Object>();

		logger.info("Resiliation in progress... Call GPS for Paiement");

		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		try {
			
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);

			Float faTotal = (Float) wi.getParameter("FA");
			Float fa=(Float) resiliationMap.get("TotalFA");
			
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.info("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("AppelgpsWIH");
            String waitGPS=(String) wi.getParameter("waitGPS");

			//bypass
		//	wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputAppelGps(waitFailure,taskName,resiliationMap));
			logger.info("AccelerationFees = " + faTotal);
			if (faTotal == 0) {
				
				logger.info("=====> No GPS Call ");

				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputAppelGps(waitFailure,taskName,resiliationMap));
			} else {
				logger.info("custId = "+	(Long) resiliationMap.get("custId"));

				// call addApc ws  
				AddApcResponse addApcResponse = resiliationService.addApc((Long) resiliationMap.get("resiliationOrderId"), (Long) resiliationMap.get("custId"), fa,waitGPS);
				logger.info("addApcResponse : " + addApcResponse.isIsSuccessful());
				logger.info("addApcResponse Error : " + addApcResponse.getErrorCode());
				logger.info("addApcResponse Comment : " + addApcResponse.getComment()); 
				
				if (addApcResponse.isIsSuccessful()) { 
					logger.info("<= AppelgpsWorkItemHandler out:");

					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputAppelGps(waitFailure,taskName,resiliationMap));
				} else {
					logger.info("<= AppelgpsWorkItemHandler out:");

					wim.completeWorkItem(wi.getId(), resiliationService.failOutputAppelGps(retryNbre,waitFailure,resiliationMap));
				}

			}

		} catch (Exception e) {
			logger.info("<= AppelgpsWorkItemHandler out with error:");

			logger.error("",e);
			//bypass
			wim.completeWorkItem(wi.getId(), resiliationService.failOutputAppelGps(retryNbre,waitFailure,resiliationMap));
		}

	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		//auto generated
	}

}
