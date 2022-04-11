package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 */

public class VerifierPendingWorkitemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(VerifierPendingWorkitemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> VerifierPendingWorkitemHandler in");
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();

		logger.info("Resiliation in progress...Verify Pending");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
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
            String taskName=resiliationService.getConfig().getPropValues("VerifypendingWIH");

			//consume ws verifyPending
			HasPendingRequestResponse response = resiliationService.verifyPending((Long) contractMap.get("coId"));
			if (response.getIsSuccessful()) {
				//success
				logger.info("has pending : " + response.isPended());
				contractMap.put("hasPending", response.isPended());
				if(response.isPended() == true)
				{		logger.info("<= VerifierPendingWorkitemHandler out");

					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputVerifyPendingTrue(retryNbre,waitFailure, resiliationMap,response.isPended(),taskName));
				}
				else
					{
					logger.info("<= VerifierPendingWorkitemHandler out");

					wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputVerifyPending(waitFailure, resiliationMap,response.isPended(),taskName));
					}

			} else {
				//failed
				logger.info("IsSuccessful " + response.getIsSuccessful());
				logger.info("BscsErrorCode " + response.getBscsErrorCode());
				logger.info("Comment " + response.getComment());
				logger.info("<= VerifierPendingWorkitemHandler out with error");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputVerifyPendingr(retryNbre, waitFailure, resiliationMap));
			}

		} catch (Exception e) {
			logger.error("",e);	
			logger.info("<= VerifierPendingWorkitemHandler out with error");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputVerifyPendingr(retryNbre, waitFailure, resiliationMap));
		}
	}

}
