package com.billcom.apc.resiliation.workItem;

import org.kie.api.runtime.process.WorkItem;

import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Session;

import org.jboss.logging.Logger;

import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.apc.resiliation.utils.EmailUtil;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;

/**
 * @author fethi
 */

public class MailNotificationWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(SmsNotificationWorkItemHandler.class);
	private ResiliationConfigHandler jbpmInstance = new ResiliationConfigHandler();
	private ResiliationService resiliationService = new ResiliationServiceImp();


	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> MailNotificationWorkItemHandler in:");
		Map<String, Object> resultsMap = new HashMap<String, Object>();

		String smtpHostServer;
		
		try {
			 smtpHostServer = jbpmInstance.getPropValues("smtpHost");
				Properties props = System.getProperties();
				props.put("mail.smtp.host", smtpHostServer);
				props.put("mail.smtp.port", jbpmInstance.getPropValues("port"));
				Session session = Session.getInstance(props, null);
            String taskName=resiliationService.getConfig().getPropValues("NotificationmailWIH");

			EmailUtil.sendEmail(jbpmInstance.getPropValues("emailSender"), session,
					jbpmInstance.getPropValues("emailReceiver"),
					jbpmInstance.getPropValues("emailSubject"),
					jbpmInstance.getPropValues("emailBody") );
			
			
			resultsMap.put("success", true);
			resultsMap.put("taskName", taskName);

			logger.info("<= MailNotificationWorkItemHandler out :");

			wim.completeWorkItem(wi.getId(), resultsMap);

		}
		catch (Exception e) {
			logger.error(wi.getId() + " : " + "An exception was thrown", e);
			resultsMap.put("success", false);


		logger.info("<= MailNotificationWorkItemHandler out :");
		wim.completeWorkItem(wi.getId(), resultsMap);
		}

	}
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		//  Auto-generated method stub
		
	}

}
