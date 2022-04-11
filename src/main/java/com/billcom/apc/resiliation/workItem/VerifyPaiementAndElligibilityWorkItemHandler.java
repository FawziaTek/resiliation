package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;  
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.gps.GetStatusResiliationResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author achref.boumiza
 *
 * This workitem aim for verifying the paiment of the GPS facture before continuing the resiliation process.
 * If not, process will be aborted.
 */
public class VerifyPaiementAndElligibilityWorkItemHandler implements WorkItemHandler{
	
	private Logger logger = Logger.getLogger(VerifyPaiementAndElligibilityWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		//
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> VerifyPaiementAndElligibilityWorkItemHandler");


		Map<String, Object> resultsMap = new HashMap<String, Object>();
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
				
		logger.info("Resiliation in progress.... Verify Paiement And Elligibility");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		Boolean abord;
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			Float faTotal = (Float) wi.getParameter("FA");
			String comment = (String) wi.getParameter("comment");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);


			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));
			logger.info("Retry Tentative N° : " + retryNbre);
	
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.info("waitFailure from config = " + waitFailure);
            String taskName=resiliationService.getConfig().getPropValues("VerifypaymentgpsWIH");
            
			if(comment != null)
			{
			resiliationMap.put("comments",resiliationMap.get("comments") +"/" + comment);
			comment =null;
			}
			
			GetStatusResiliationResponse getStatusResiliationResponse = this.resiliationService.getStatusResiliation(wi.getProcessInstanceId());
			if (getStatusResiliationResponse.isIsSuccessful()) {
				logger.info("getStatusResiliationResponse Status : "+getStatusResiliationResponse.getStatus());
				if (getStatusResiliationResponse.getStatus().equalsIgnoreCase(resiliationService.getConfig().getPropValues("GpsStatusOK"))) {
					abord=false;
					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputGetStatusResiliation(waitFailure,taskName,resiliationMap,abord));

				}
				else {
					logger.info("Payment KO ===> Non Eligibile ===> Resiliation will be aborted by OTN");
					abord=true;
					String commentaire =resiliationService.getConfig().getPropValues("commentaire"); 
					resiliationMap.put("comments",resiliationMap.get("comments") +"/" + commentaire);

					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputGetStatusResiliation(waitFailure,taskName,resiliationMap,abord));

				}
			}
			else {
				logger.info("getStatusResiliationResponse Error: "+getStatusResiliationResponse.getErrorCode());
				logger.info("getStatusResiliationResponse Comment: "+getStatusResiliationResponse.getComment());
				abord=false;
				wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetStatusResiliation(retryNbre,waitFailure,resiliationMap,abord));

			}
		} catch (Exception e) {
			logger.error("",e);	
			abord=false;
			logger.error("<= VerifyPaiementAndElligibilityWorkItemHandler with error");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetStatusResiliation(retryNbre,waitFailure,resiliationMap,abord));

		}
		
	}
			/*
			//GPS---
			GetStatusResiliationRequest getStatusResiliationRequest = new GetStatusResiliationRequest();
			getStatusResiliationRequest.setProcessId(new_resiliation.getResiliationId());
			AuthenticationData authenticationData = new AuthenticationData(config.getPropValues("wsdlGpsUsername"), config.getPropValues("wsdlGpsPassword"));
			GetStatusResiliationResponse getStatusResiliationResponse = bindingGps.getStatusResiliationRequest(authenticationData, getStatusResiliationRequest);
			logger.info("getStatusResiliationResponse : "+getStatusResiliationResponse.isIsSuccessful());
			if (getStatusResiliationResponse.isIsSuccessful()) {
				logger.info("getStatusResiliationResponse Status : "+getStatusResiliationResponse.getStatus());
				if (getStatusResiliationResponse.getStatus().equalsIgnoreCase(config.getPropValues("GpsStatusOK"))) {
					logger.info("Payment OK ===> Eligible ===> Resiliation ");
					resultsMap.put("retryNbre", 0);//retryNbre
					resultsMap.put("waitFailure", waitFailure);//waitFailure
					resultsMap.put("Result", new_resiliation);
					resultsMap.put("success", true);
					resultsMap.put("abord", false);
					updateResiliationOrder.updateResiliation(new_resiliation.getResiliationId(), 1, " --- ", wi.getName());
					wim.completeWorkItem(wi.getId(), resultsMap);
				} else {
					logger.info("Payment KO ===> Non Eligibile ===> Resiliation will be aborted by OTN");
					UpdateApcRequest updateApcRequest = new UpdateApcRequest();
					updateApcRequest.setProcessId(new_resiliation.getResiliationId());
					updateApcRequest.setStatus(2);
					UpdateApcResponse updateApcResponse = bindingGps.updateApcRequest(authenticationData, updateApcRequest);
					logger.info("updateApcResponse : "+updateApcResponse.isIsSuccessful());
					if (updateApcResponse.isIsSuccessful()) {
						resultsMap.put("retryNbre", 0);//retryNbre
						resultsMap.put("waitFailure", waitFailure);//waitFailure
						resultsMap.put("Result", new_resiliation);
						resultsMap.put("success", true);
						resultsMap.put("abord", true);
						updateResiliationOrder.updateResiliation(new_resiliation.getResiliationId(), 2, " Resiliation annulee par OTN suite Non paiement ", wi.getName());
						wim.completeWorkItem(wi.getId(), resultsMap);
					} else {
						logger.info("updateApcResponse Error : "+updateApcResponse.getErrorCode());
						logger.info("updateApcResponse Comment : "+updateApcResponse.getComment());
						resultsMap.put("retryNbre", retryNbre+1);//retryNbre
						resultsMap.put("waitFailure", waitFailure);//waitFailure
						resultsMap.put("Result", new_resiliation);
						resultsMap.put("success", false);
						resultsMap.put("abord", false);
						updateResiliationOrder.updateResiliation(new_resiliation.getResiliationId(), 1, " --- ", wi.getName());
						wim.completeWorkItem(wi.getId(), resultsMap);
					}
				}
			} else {
				logger.info("getStatusResiliationResponse Error: "+getStatusResiliationResponse.getErrorCode());
				logger.info("getStatusResiliationResponse Comment: "+getStatusResiliationResponse.getComment());
				resultsMap.put("retryNbre", retryNbre+1);//retryNbre
				resultsMap.put("waitFailure", waitFailure);//waitFailure
				resultsMap.put("Result", new_resiliation);
				resultsMap.put("success", false);
				resultsMap.put("abord", false);
				updateResiliationOrder.updateResiliation(new_resiliation.getResiliationId(), 1, " --- ", wi.getName());
				wim.completeWorkItem(wi.getId(), resultsMap);
			}
			//---GPS
			*/
			
//			if (faTotal == 0) {
//				logger.info("Eligibility OK");
//				resultsMap.put("retryNbre", 0);//retryNbre
//				resultsMap.put("waitFailure", waitFailure);//waitFailure
//				resultsMap.put("Result", resiliationMap);
//				resultsMap.put("success", true);
//				resultsMap.put("abord", false);
//				resultsMap.put("taskName",taskName);
//
//				logger.info("<= VerifyPaiementAndElligibilityWorkItemHandler");
//				wim.completeWorkItem(wi.getId(), resultsMap);
//			}
//			else {
//				logger.info("Eligibility KO ==> Resiliation will be aborted by OTN");
//				resultsMap.put("retryNbre", retryNbre+1);//retryNbre
//				resultsMap.put("waitFailure", waitFailure);//waitFailure
//				resultsMap.put("Result", resiliationMap);
//				resultsMap.put("success", true);
//				resultsMap.put("abord", false);//true
//				resultsMap.put("taskName",taskName);
//
//				logger.info("<= VerifyPaiementAndElligibilityWorkItemHandler");
//				wim.completeWorkItem(wi.getId(), resultsMap);
//			}
		

	
}
