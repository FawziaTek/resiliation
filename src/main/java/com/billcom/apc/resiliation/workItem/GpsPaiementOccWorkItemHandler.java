package com.billcom.apc.resiliation.workItem;


import java.util.Calendar;  
import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.gps.AddApcRequest;
import com.billcom.apc.generatedSOAP.gps.AddApcResponse;
import com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub;
import com.billcom.apc.generatedSOAP.gps.AuthenticationData;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author achref.boumiza
 *
 * This workitem aim for setting OCC on the fees table of BSCS and informing GPS for the paiment.
 */
public class GpsPaiementOccWorkItemHandler implements WorkItemHandler{
	
	private Logger logger = Logger.getLogger(GpsPaiementOccWorkItemHandler.class);
	
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		//  Auto-generated method stub
		
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("Resiliation in progress...Gps Paiement");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		Map<String, Object> resiliationMap = new HashMap<String, Object>();

		
	
		ResiliationConfigHandler config = new ResiliationConfigHandler();
		ApcWebServiceWebServicePortBindingStub bindingGps = config.consumeGpsWsdl();
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		try {
			resiliationMap = (Map<String, Object> ) wi.getParameter("resiliationMap");
			Float faTotal = (Float) wi.getParameter("FA");
			logger.info(wi.getParameter("resiliation"));
			logger.info("Resiliation id : "+resiliationMap.get("resiliationOrderId"));
			//
			String retriesConfigNbre = config.getPropValues("retriesConfigNbre");

			if ((Integer) wi.getParameter("retryNbre") != null && (Integer) wi.getParameter("retryNbre") <= Integer.valueOf(retriesConfigNbre)) {
				retryNbre = (Integer) wi.getParameter("retryNbre");
				logger.info("Retry Tentative N° : " + retryNbre);
			} else {
				retryNbre = 0;
				logger.info("Retry Tentative N° : " + retryNbre);
			}
			// waitfailure
			String waitpalier = autoRecycle.palierwaittime(waitFailure, retryNbre);
			waitFailure = waitpalier;
			logger.info("waitFailure from config = " + waitFailure);
			//
			
			if (faTotal==0) {
				logger.info("AccelerationFees = "+faTotal);
				logger.info("=====> No GPS Call ");
				resultsMap.put("retryNbre", 0);//retryNbre
				resultsMap.put("waitFailure", waitFailure);//waitFailure
				resultsMap.put("Result", resiliationMap);
				resultsMap.put("success", true);

				wim.completeWorkItem(wi.getId(), resultsMap);
			}
			else {
			
			//Gps---
			AddApcRequest addApcRequestRequest = new AddApcRequest();
			addApcRequestRequest.setProcessId((Long)resiliationMap.get("resiliationOrderId"));
			addApcRequestRequest.setCustomerId((Long)resiliationMap.get("custId"));
			//addApcRequestRequest.setCoCode(new_resiliation.getCoCode());
//			addApcRequestRequest.setAmountHt(faTotal);
//			addApcRequestRequest.setStatus(1);
//			addApcRequestRequest.setValidDate(Calendar.getInstance());
			AuthenticationData authenticationData = new AuthenticationData(config.getPropValues("wsdlGpsUsername"), config.getPropValues("wsdlGpsPassword"));
			AddApcResponse addApcResponse = bindingGps.addApcRequest(authenticationData, addApcRequestRequest);
			if(addApcResponse.isIsSuccessful()) {
				logger.info("addApcResponse : "+addApcResponse.isIsSuccessful());
				resultsMap.put("retryNbre", 0);//retryNbre
				resultsMap.put("waitFailure", waitFailure);//waitFailure
				resultsMap.put("Result", resiliationMap);
				resultsMap.put("success", true);

				wim.completeWorkItem(wi.getId(), resultsMap);
			}
			else {
				logger.info("addApcResponse : "+addApcResponse.isIsSuccessful());
				logger.info("addApcResponse Error : "+addApcResponse.getErrorCode());
				logger.info("addApcResponse Comment : "+addApcResponse.getComment());
				resultsMap.put("retryNbre", retryNbre+1);//retryNbre
				resultsMap.put("waitFailure", waitFailure);//waitFailure
				resultsMap.put("Result", resiliationMap);
				resultsMap.put("success", true);

				wim.completeWorkItem(wi.getId(), resultsMap);
			}

			}

			
		} catch (Exception e) {
			logger.error("",e);	
			resultsMap.put("retryNbre", retryNbre+1);//retryNbre
			resultsMap.put("waitFailure", waitFailure);//waitFailure
			resultsMap.put("Result", resiliationMap);
			resultsMap.put("success",true);
			wim.completeWorkItem(wi.getId(), resultsMap);
		}
		
	}

	

}
