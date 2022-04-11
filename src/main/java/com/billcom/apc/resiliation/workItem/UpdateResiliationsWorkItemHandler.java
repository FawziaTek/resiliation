package com.billcom.apc.resiliation.workItem;

import java.util.HashMap;   
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.GetListOrdersRequest;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.GetListOrdersResiliationResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author Bechir
 *  Updated by Fethi
 */

public class UpdateResiliationsWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(UpdateResiliationsWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> AbordResiliationsWorkItemHandler in");
		Map<String, Object> resultsMap = new HashMap<String, Object>();
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
       // String custId=(String) wi.getParameter("custId");
		logger.info("Resiliation in progress...Abord  Resiliation");
		ResiliationConfigHandler config = new ResiliationConfigHandler();
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			Boolean abord = (Boolean) wi.getParameter("abord");
	        Integer custId=(Integer) wi.getParameter("custId");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);
			logger.info("custId " + custId);
			String comment = (String) wi.getParameter("comment");

			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));
			logger.info("Retry Tentative N° : " + retryNbre);

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.info("waitFailure from config = " + waitFailure);

//			GetListOrdersRequest getListOrdersRequest = new GetListOrdersRequest();
//			// XMLGregorianCalendar a;a.set
//			// getListOrdersRequest.setDebPeriod(a)
//			getListOrdersRequest.setStatus(1);
//			getListOrdersRequest.setUser((String) resiliationMap.get("user"));// new_resiliation.getUser().getId()
//			getListOrdersRequest.setCustId(custId.toString());   
//			getListOrdersRequest.setHasRight(true); // a verifier 
//			GetListOrdersResiliationResponse listOrdersResiliationResponse = config.consumeResiliationManager()
//					.getListOrdersForResiliation(getListOrdersRequest);
//			if (listOrdersResiliationResponse.getResponse().isIsSuccessful()) {
//				logger.debug("Nbre : " + listOrdersResiliationResponse.getBeans().size());
//				// List<String> listProcess = new ArrayList<String>()
//				for (int i = 0; i < listOrdersResiliationResponse.getBeans().size(); i++) {
//					// listProcess.add(listOrdersResiliationResponse.getBeans().get(i).getOrderIdPub())
//					if (!listOrdersResiliationResponse.getBeans().get(i).getOrderIdPub()
//							.equals(String.valueOf(resiliationMap.get("resiliationOrderId")))) {
//						if (abord)
//							config.consumeJbpmOrderResiliation().abordResSignal(
//									Long.parseLong(listOrdersResiliationResponse.getBeans().get(i).getOrderIdPub()));
//						else
//							config.consumeJbpmOrderResiliation().skipPaymentTimer(
//									Long.parseLong(listOrdersResiliationResponse.getBeans().get(i).getOrderIdPub()));
//					}
//				}
//				resultsMap.put("Result", resiliationMap);
//				resultsMap.put("success", true);
//				resultsMap.put("retryNbre", 0);// retryNbre
//				resultsMap.put("waitFailure", waitFailure);// waitFailure
//				wim.completeWorkItem(wi.getId(), resultsMap);
//			} else {
//				logger.debug("GetListOrdersResiliationResponse : "
//						+ listOrdersResiliationResponse.getResponse().isIsSuccessful());
//				listOrdersResiliationResponse.getResponse().getComment();
//				logger.debug("GetListOrdersResiliationResponse Comment : "
//						+ listOrdersResiliationResponse.getResponse().getComment());
//				logger.debug("GetListOrdersResiliationResponse Error : "
//						+ listOrdersResiliationResponse.getResponse().getError());
//				resultsMap.put("Result", resiliationMap);
//				resultsMap.put("success", true);
//				resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
//				resultsMap.put("waitFailure", waitFailure);// waitFailure
//				wim.completeWorkItem(wi.getId(), resultsMap);
//			}
			
			if(abord) {
				resiliationMap.put("comments",comment +"/" + " Order aborded ");
				resultsMap.put("success", true);
				resultsMap.put("retryNbre", 0);
				resultsMap.put("waitFailure", waitFailure);// waitFailure
				resultsMap.put("Result", resiliationMap);

				wim.completeWorkItem(wi.getId(), resultsMap);
			}
			else {
				resultsMap.put("success", true);
				resultsMap.put("retryNbre", 0);
				resultsMap.put("waitFailure", waitFailure);// waitFailure
				resultsMap.put("Result", resiliationMap);

				wim.completeWorkItem(wi.getId(), resultsMap);
			}

		} catch (Exception e) {
			logger.error("",e);	
			resiliationMap.put("comments",resiliationMap.get("comments") +"/" + e.getMessage());

			//resiliationMap.put("comments", e.getMessage());
			resultsMap.put("Result", resiliationMap);
			resultsMap.put("success", false);
			resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
			resultsMap.put("waitFailure", waitFailure);// waitFailure
			wim.completeWorkItem(wi.getId(), resultsMap);
		}
		logger.info("<= AbordResiliationsWorkItemHandler out");
	}
}
