package com.billcom.apc.resiliation.workItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author fethi
 */

public class AjouterOCCWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(AjouterOCCWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> AjouterOCCWorkItemHandler in:");

		// get WIH input
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		
		logger.info("Resiliation in progress...Ajouter OCC");

		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();

		try {
			
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			logger.info("Resiliation Order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger, wi);

			String comment = (String) wi.getParameter("comment");
			Float faTotal = (Float) wi.getParameter("FA");
			Float faTotal_AC = (Float) wi.getParameter("FA_after_check");
			
	        Float fa=0f;
	        

	        if((faTotal != null)&&(faTotal_AC != null))
	        {
	        	fa = faTotal_AC-faTotal;
	        	
	        }
			List<Map<String, Object>> contractResiliation = (List<Map<String, Object>>) resiliationMap
					.get("contractResiliation");

			
			ContractOccBean[] coIdList = null;
			   Float facc =  (float) (Math.round(fa * 1000.0)/1000.0) ;

			logger.info("TotalFA = " + faTotal);
			logger.info("TotalFA_AFTER_CHECK = " + faTotal_AC);
			logger.info("FA = " + facc);

			resiliationMap.put("TotalFA",facc);


			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
  
            String taskName=resiliationService.getConfig().getPropValues("AjoutoccWIH");

			logger.debug("waitFailure from config = " + waitFailure);



			
			
		
			SetOccResponse occResponse = resiliationService.setOCC(facc, (Long) resiliationMap.get("custId"),
					coIdList);

			printOccResponse(occResponse);

			if (occResponse.getIsSuccessful() && occResponse.isFinished()) {
				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputSetOcc(resiliationMap, waitFailure,taskName));
			} else {
				wim.completeWorkItem(wi.getId(),
						resiliationService.failOutputSetOcc(resiliationMap, waitFailure, retryNbre));
			}

		} catch (Exception e) {
			logger.error("", e);
			wim.completeWorkItem(wi.getId(),
					resiliationService.failOutputSetOcc(resiliationMap, waitFailure, retryNbre));
		}
		logger.info("<= AjouterOCCWorkItemHandler out:");
	}

	private void printOccResponse(SetOccResponse occResponse) {
		logger.info("occResponse IsSuccessful : " + occResponse.getIsSuccessful());
		logger.info("occResponse isFinished : " + occResponse.isFinished());
		logger.info("occResponse BscsErrorCode : " + occResponse.getBscsErrorCode());
		logger.info("occResponse Comment : " + occResponse.getComment());
	}

}
