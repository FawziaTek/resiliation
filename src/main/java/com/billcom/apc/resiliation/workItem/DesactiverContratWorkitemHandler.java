package com.billcom.apc.resiliation.workItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 * Updated by fethi
 */

public class DesactiverContratWorkitemHandler implements WorkItemHandler {
	
	private Logger logger = Logger.getLogger(DesactiverContratWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();


	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		//auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> DesactiverContratWorkitemHandler in:");
		 
		//import input
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		logger.info("Resiliation in progress...Deactivate Contract");
		Calendar DueDate = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		String date_format = sdf.format(date);

		try {
			Date Date = sdf.parse(date_format);

			DueDate.setTime(Date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			Long csId = (Long)  resiliationMap.get("custId");
			String DueDateS =(String)  wi.getParameter("DueDate");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId") );
			logger.info("Contractresiliation id : "+contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);

			//retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));	 
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("MigtopredesactivatectrWIH");

			
			//consume ws deactivateContract
			OperationResponse response = resiliationService.deactivateContract((Long)contractMap.get("coId"));

			logger.info("desactiver Contrat : "+response.getIsSuccessful());
			
			if (response.getIsSuccessful()) {
				//ok
				//contractMap.put("contractStatus","deactivated")
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputDeactivateContract(resiliationMap, contractMap, waitFailure,taskName));
			} else { 
				//ADD COMMENt AND ERROR 
				logger.info("desactiver Contrat BscsErrorCode : "+response.getBscsErrorCode());
				logger.info("desactiver Contrat Comment : "+response.getComment()); 
				wim.completeWorkItem(wi.getId(), resiliationService.failOutputDeactivateContract(resiliationMap, retryNbre, waitFailure));
			}
			
		} catch (Exception e) {
			//ko 
			logger.error("",e);
			wim.completeWorkItem(wi.getId(), resiliationService.failOutputDeactivateContract(resiliationMap, retryNbre, waitFailure));
		}

		logger.info("<= DesactiverContratWorkitemHandler out:");
	}

}
