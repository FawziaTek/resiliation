package com.billcom.apc.resiliation.workItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteBeanOut;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 * updated by fethi
 */

public class SuspensionContractWorkitemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(SuspensionContractWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		//auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> SuspensionContractWorkitemHandler in:");
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		

		logger.info("Resiliation in progress...Suspension contract");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		Calendar DueDate = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		String date_format = sdf.format(date);
        

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			String contractStatus = (String) contractMap.get("contractStatus");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));		
			resiliationService.printWorkItem(logger,wi);
			Long csId = (Long)  resiliationMap.get("custId");
			String DueDateS =(String)  wi.getParameter("DueDate");
			
			String contractStatusSuspend=resiliationService.getConfig().getPropValues("contractStatusSuspend").trim();
	        String contractStatusActif =resiliationService.getConfig().getPropValues("contractStatusActif").trim();
			logger.info("contractStatus = " + contractStatus);
			logger.info("contractStatusActif = " + contractStatusActif);
			
			
			Date Date = sdf.parse(date_format);

			DueDate.setTime(Date);

			
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
            String taskName=resiliationService.getConfig().getPropValues("SuspendcontractWIH");

				 
			
			//consume insertSheduled suspendContract
        	if( (contractStatus != null) && (contractStatus.equals(contractStatusSuspend)) ) {
    			InsertScheduledJobResponse response1 = resiliationService.insertSheduled((Long)contractMap.get("coId"),csId,DueDate,(long) 4,"Désactivation suite à la resiliation");
    	  		logger.info("contract to desactivate");
    			logger.info("response: " + response1.toString());
    			
    			if(response1.getIsSuccessful()) {
        			contractMap.put("contractStatus", "desactivated");
        			resiliationMap.put("resiliationStatusFlag", "OK");
        			logger.info("<= SuspensionContractWorkitemHandler out:");

        			wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputSuspendContract(resiliationMap, contractMap, waitFailure,wi.getName()));

    			}
    			else {
    				logger.info("<= SuspensionContractWorkitemHandler out with error:");

    				wim.completeWorkItem(wi.getId(), resiliationService.failOutputSuspendContract(resiliationMap, contractMap, retryNbre, waitFailure));

    			}
    			
    			

        	}
        	else if((contractStatus != null) && (contractStatus.equals(contractStatusActif))) {
    			InsertScheduledJobResponse response1 = resiliationService.insertSheduled((Long)contractMap.get("coId"),csId,DueDate,(long)  3,"Suspension suite à la resiliation");
    	  		logger.info("contract to suspend");
    			logger.info("response: " + response1.toString());

    			if(response1.getIsSuccessful()) {
        			contractMap.put("contractStatus", "suspended");
        			resiliationMap.put("resiliationStatusFlag", "OK");
        			logger.info("<= SuspensionContractWorkitemHandler out:");

        			wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputSuspendContract(resiliationMap, contractMap, waitFailure,wi.getName()));

    			}
    			else {
    				logger.info("<= SuspensionContractWorkitemHandler out with error:");

    				wim.completeWorkItem(wi.getId(), resiliationService.failOutputSuspendContract(resiliationMap, contractMap, retryNbre, waitFailure));

    			}
        	}
			 
			
		} catch (Exception e) {
			logger.error("",e);
			logger.info("<= SuspensionContractWorkitemHandler out with error:");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputSuspendContract(resiliationMap, contractMap, retryNbre, waitFailure));
		}


	}

}
