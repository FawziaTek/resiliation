package com.billcom.apc.resiliation.workItem;


import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * 
 * @author Bechir
 * Updated by Fethi
 * 
 */
public class ModifierDFEContractsWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(ModifierDFEContractsWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {	
		// Auto generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> ModifierDFEContractsWorkItemHandler in:");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		

		logger.info("Resiliation in progress...Modify DFE Contract");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		String dueDate = (String) wi.getParameter("DueDate");

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
            String taskName=resiliationService.getConfig().getPropValues("ModifycontractdfeWIH");
             String dfe=(String) contractMap.get("dfe");
        	logger.info("contractMap dfe = "+dfe);
            if((dfe != null)&&(dfe!= " ")&&(!dfe.equalsIgnoreCase("null")))
            {
            	logger.info("=> CALL GRH ");
			//consume ws addGrh 
			AddGrhRequestResponse addGrhRequestResponse = resiliationService.addGrh(logger, resiliationMap, contractMap, dueDate);
			logger.info("response : "+addGrhRequestResponse.getIsSuccessful());
			
			logger.debug("addGrhRequestResponse.getIsSuccessful() " + addGrhRequestResponse.getIsSuccessful());
			if (addGrhRequestResponse.getIsSuccessful()) {
				logger.info("<= ModifierDFEContractsWorkItemHandler out:");

				//ok
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputModifierDFE(waitFailure,  resiliationMap, contractMap,taskName));

			} else {
				//ko
				logger.info("error: "+addGrhRequestResponse.getBscsErrorCode()+" "+addGrhRequestResponse.getComment());
				logger.info("<= ModifierDFEContractsWorkItemHandler out with error :");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputModifierDFE(retryNbre, waitFailure, resiliationMap, contractMap));
			}
            }
            else
            {
				logger.info("Pas d engagement -------> NO GRH CALL");
				logger.info("<= ModifierDFEContractsWorkItemHandler out:");

				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputModifierDFE(waitFailure,  resiliationMap, contractMap,taskName));

            }

		} catch (Exception e) {
			logger.error("",e);	
			logger.info("<= ModifierDFEContractsWorkItemHandler out with error :");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputModifierDFE(retryNbre, waitFailure, resiliationMap, contractMap));
		}
		

	}

}
