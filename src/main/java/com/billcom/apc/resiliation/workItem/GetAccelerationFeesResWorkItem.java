package com.billcom.apc.resiliation.workItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.core.process.instance.WorkItemHandler;
import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * this workitem aim for getting acceleration fees for Total resiliation
 * 
 * @author Bechir
 * Updated by Fethi
 */

public class GetAccelerationFeesResWorkItem implements WorkItemHandler {

	private Logger logger = Logger.getLogger(GetAccelerationFeesResWorkItem.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> GetAccelerationFeesResWorkItem in:");

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
	
		
		logger.info("Resiliation in progress...calculate accelerationFee");
		logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
		resiliationService.printWorkItem(logger, wi);

		Float faTotal = 0F;
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			List<Map<String, Object>> contractMaps = (List<Map<String, Object>>) resiliationMap.get("contractResiliation");
			Integer custId = (Integer) wi.getParameter("custId");
			String dueDateString = (String) wi.getParameter("dueDate");
			String caseCrm = (String) wi.getParameter("CaseCRM");
			String motif = (String) wi.getParameter("Motif");
			String motifClient = (String) wi.getParameter("motifClient");


			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
 
            String taskName=resiliationService.getConfig().getPropValues("GetfatotalWIH");

			DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			// consume ws getCalculatedFaccTotale
			GetCalculatedFaccTotaleResponse response = resiliationService.getCalculatedFaccTotale(custId.longValue(),
					df.parse(dueDateString), caseCrm, motif, motifClient);
			Boolean encours = false;
			String comment = "";
			if (response.getIsSuccessful()
					&& (response.getBscsErrorCode() == null || response.getBscsErrorCode().equals("ENCOURS"))) {
				if (response.getBscsErrorCode() != null) {// calcul FA en cours
					encours = true;
					comment = response.getComment();
					logger.info("calculating FA in progress..");
				} else {// pas d'erreur
					
					logger.info("getFA Montant total ="+response.getMontantTotal());
					logger.info("getFA Montant total Tax ="+response.getMontantTotalTax().floatValue());
                 if(response.getMontantTotalTax().floatValue()!=0)
					faTotal = response.getMontantTotalTax().floatValue(); // get FA total with Tax
                 else
 					faTotal = response.getMontantTotal().floatValue(); // get FA total

					FraisAcc[] fraisAccContracts = response.getBean();
					contractMaps = setAccFessInContractMap(fraisAccContracts, contractMaps);
				}

				resiliationMap.put("contractResiliation", contractMaps);
				resiliationMap.put("TotalFA", faTotal);
				
				if(comment != null )
					resiliationMap.put("comments",resiliationMap.get("comments") +"/" + comment);
					else
						resiliationMap.put("comments",resiliationMap.get("comments"));	

				//resiliationMap.put("comments", comment);
				logger.info("Acceleration Fee : " + faTotal);
				logger.info("Comment : " + comment);
				wim.completeWorkItem(wi.getId(),
						resiliationService.sucessOutputgetFAtotal(resiliationMap, faTotal, waitFailure, encours,taskName));
			} else {
				logger.info("Erreur BSCS: " + response.getBscsErrorCode() + " : " + response.getComment());
				comment = response.getBscsErrorCode() + " : " + response.getComment();
				
				resiliationMap.put("comments",resiliationMap.get("comments") +"/" + comment);

				//resiliationMap.put("comments", comment);
				wim.completeWorkItem(wi.getId(),
						resiliationService.failOutputgetFAtotal(resiliationMap, faTotal, retryNbre, waitFailure));
			}

		} catch (Exception e) {
			logger.error("", e);
			wim.completeWorkItem(wi.getId(),
					resiliationService.failOutputgetFAtotal(resiliationMap, faTotal, retryNbre, waitFailure));
		}

		logger.info("<= GetAccelerationFeesResWorkItem out:");
	}

	/*********************************************************************************/
	private List<Map<String, Object>> setAccFessInContractMap(FraisAcc[] fraisAccContracts,
			List<Map<String, Object>> contractMaps) {
		for (FraisAcc fee : fraisAccContracts) {
			for (Map<String, Object> contractMap : contractMaps) {
				if (((String) contractMap.get("coIdPub")).equals(fee.getCodeContrat())) {
					contractMap.put("commentFA", "");
					contractMap.put("valueFA", fee.getMontantFA().floatValue());
				}
			}
		}
		return contractMaps;
	}

}
