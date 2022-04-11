package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.drools.core.process.instance.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.resiliation.model.Client;
import com.billcom.apc.resiliation.model.MessageNotif;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author fethi
 */

public class SmsNotificationWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(SmsNotificationWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> SmsNotificationWorkItemHandler in:");
		
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();

		logger.info("Resiliation in progress... SMS Notification");

		ResiliationConfigHandler config = resiliationService.getConfig();

		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

	

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			logger.info("Contractresiliation id : " + contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);
			String resiliationStatusFlag = (String) resiliationMap.get("resiliationStatusFlag");
			String coCode = (String) contractMap.get("coIdPub");
			contractMap.put("remarque", "resiliation of contract " + coCode + " terminated with " + resiliationStatusFlag);
			logger.info("resiliationStatusFlag ="+resiliationStatusFlag);
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
 
            String taskName=resiliationService.getConfig().getPropValues("NotificationsmsWIH");

			String mock = config.getPropValues("mock").trim();
			int idMessage = 0;
			String messageDef = null;
			String typeMessage = null;
			String dnNum = config.getPropValues("mockMsisdn").trim();
			String ccemail = null;
			String contractStatus = (String) contractMap.get("contractStatus");
	        String contractStatusDesactivated=resiliationService.getConfig().getPropValues("contractStatusDesactivated").trim();

			if (resiliationStatusFlag != null) {
				String typeRes = (String) resiliationMap.get("typeRes");
				Boolean isMigration = typeRes.equals("Migration");
				if (isMigration) {
					String initOffer = (String) resiliationMap.get("offre");
					String targetOffer = (String) contractMap.get("offer");
					if (resiliationStatusFlag.equalsIgnoreCase("NA")) {
						messageDef = config.getPropValues("migrationNA").replace("#offre1#", initOffer)
								.replace("#offre2#", targetOffer);
					}
					if (resiliationStatusFlag.equalsIgnoreCase("OK")) {
						messageDef = config.getPropValues("migrationOK").replace("#offre1#", initOffer)
								.replace("#offre2#", targetOffer);
					}
					if (resiliationStatusFlag.equalsIgnoreCase("KO")) {
						messageDef = config.getPropValues("migrationKO").replace("#offre1#", initOffer)
								.replace("#offre2#", targetOffer);
					}
					if(contractStatus.equals(contractStatusDesactivated)) {
						
						if (resiliationStatusFlag.equalsIgnoreCase("NA")) {
							messageDef = config.getPropValues("resiliationNA");
						}
						if (resiliationStatusFlag.equalsIgnoreCase("OK")) {
							messageDef = config.getPropValues("resiliationOK");
						}
						if (resiliationStatusFlag.equalsIgnoreCase("KO")) {
							messageDef = config.getPropValues("resiliationKO");
						}
					}

						
				} else// supsension
				{
					if (resiliationStatusFlag.equalsIgnoreCase("NA")) {
						messageDef = config.getPropValues("resiliationNA");
					}
					if (resiliationStatusFlag.equalsIgnoreCase("OK")) {
						messageDef = config.getPropValues("resiliationOK");
					}
					if (resiliationStatusFlag.equalsIgnoreCase("KO")) {
						messageDef = config.getPropValues("resiliationKO");
					}
				}

				MessageNotif messageNotif = null;
				if (mock.equalsIgnoreCase("0")) {
					String msisdn = (String) contractMap.get("msisdn");
					messageNotif = new MessageNotif(idMessage, messageDef, typeMessage, "+216" + msisdn, ccemail);
				} else {
					messageNotif = new MessageNotif(idMessage, messageDef, typeMessage, "+216" + dnNum, ccemail);
				}
				if (Client.smsNotification(messageNotif, wi.getProcessInstanceId())) {
					logger.info("<= SmsNotificationWorkItemHandler out  :");

					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputSmsNotif(waitFailure, resiliationMap, contractMap,taskName));
			

					
				} else { 
					logger.info("error send message");
					logger.info("<= SmsNotificationWorkItemHandler out with error :");

					wim.completeWorkItem(wi.getId(), resiliationService.failOutputSmsNotif(retryNbre, waitFailure, resiliationMap, contractMap));
				}
			} else {
				logger.info("error send message");
				logger.info("<= SmsNotificationWorkItemHandler out with error :");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputSmsNotif(retryNbre, waitFailure, resiliationMap, contractMap));
			}

		} catch (Exception e) {
			logger.info("<= SmsNotificationWorkItemHandler out with error :");

			logger.error("",e);		

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputSmsNotif(retryNbre, waitFailure, resiliationMap, contractMap));
		}				
	}

}
