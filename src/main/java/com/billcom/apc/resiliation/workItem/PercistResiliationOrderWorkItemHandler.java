package com.billcom.apc.resiliation.workItem;

import java.util.ArrayList;    
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.PercistResiliationOrderResponse;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationBean;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;
 
/**
 * @author Bechir
 * Updated by Fethi
 */

public class PercistResiliationOrderWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(PercistResiliationOrderWorkItemHandler.class);
	
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> PercistResiliationOrderWorkItemHandler in");
		
		Map<String, Object> resiliationMap= new HashMap<String, Object>();

		logger.info("Resiliation in progress... Percist Resiliation Order");
		
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			List<Map<String, Object>> contractMaps = (List<Map<String, Object>>) resiliationMap.get("contractResiliation");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);

            String taskName=resiliationService.getConfig().getPropValues("PercistResiliationOrderWIH");

			
			// percist every contract => loop on contract, set the attribute of
			// ResiliationBean which will be percisted
			List<ResiliationBean> resiliationBeans = setResiliationBean(taskName,resiliationMap,contractMaps);
	
			PercistResiliationOrderResponse response = resiliationService.percistResiliationOrder(resiliationBeans);
			if (response.isFinished()) {
				logger.info("All contracts are percisted"); 
				logger.info("<= PercistResiliationOrderWorkItemHandler out:");

				wim.completeWorkItem(wi.getId(),resiliationService.sucessOutputPercistResiliationOrder(waitFailure, resiliationMap));
			}else {
				// if a contract fails to percist, all the percist operation is failed
				logger.info("percist failed "); 
				logger.info("<= PercistResiliationOrderWorkItemHandler out with error :");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputPercistResiliationOrder(retryNbre,waitFailure, resiliationMap));

			}
		} catch (Exception e) { 
			logger.error("",e);	
			resiliationMap.put("comments", e.getMessage());
			logger.info("<= PercistResiliationOrderWorkItemHandler out with error :");

			wim.completeWorkItem(wi.getId(),resiliationService.failOutputPercistResiliationOrder(retryNbre, waitFailure, resiliationMap));
		}

	}
	
	
	/**********************************MEthods ************************************************/

	private List<ResiliationBean> setResiliationBean(String  task,Map<String, Object> resiliationMap,
			List<Map<String, Object>> contractMaps) throws Exception {
		List<ResiliationBean> resiliationBeans=  new ArrayList<ResiliationBean>();
		for (Map<String, Object> contractMap : contractMaps) {

			ResiliationBean resiliation = new ResiliationBean();
			// prepare values which be set into resiliation
			String caseCRM = (String) resiliationMap.get("caseCRM");
			String coCode = (String) contractMap.get("coIdPub");
			String coId = contractMap.get("coId") + "";
			String comments = (String) contractMap.get("comments");
			Boolean contestClient = (Boolean) resiliationMap.get("contestClient");
			String contractStatus = (String) contractMap.get("contractStatus");
			String custCode = (String) resiliationMap.get("custCode");
			String custId = resiliationMap.get("custId") + "";
			String dueDate = (String) resiliationMap.get("dueDate");
			String endDate = (String) resiliationMap.get("endDate");
			logger.info("dueDate ready to percist =" + dueDate);

			String faComment = (String) contractMap.get("commentFA");
			float faContract = (float) (Float) contractMap.get("valueFA");

			Boolean isResiliationTotal = (Boolean) resiliationMap.get("isResiliationTotal");
			String motif = (String) resiliationMap.get("motif");
			String motifClient = (String) resiliationMap.get("motifClient");
			logger.info("motifClient in percist =" +motifClient);

			String msisdn = (String) contractMap.get("msisdn");
			String offerInit = (String) contractMap.get("offer");
			String offerTarget = (String) resiliationMap.get("offre");
			String oldCoCode = (String) contractMap.get("oldCoIdPub");
			String oldCoId = contractMap.get("oldCoId") + ""; 
			Integer orderId = (int)(long)(Long)  resiliationMap.get("resiliationOrderId");
			String orderIdPub = (String) resiliationMap.get("orderIdPub");
			Integer prgCode = (Integer) resiliationMap.get("prgCode");
			String remarque = (String) resiliationMap.get("remarque");
			String resComment = (String) resiliationMap.get("comments");
			Boolean resDevice = (Boolean) resiliationMap.get("resDevice");
			Integer rpCodeInit = (int) (long) ((Long) contractMap.get("tmcode"));
			Integer rpCodeTarget = (int) (long) ((Long) resiliationMap.get("tmcode"));
			String startDate = (String) resiliationMap.get("startDate");

			int status = 1; // status will be 1 by default => active process


			float totalFA = (float) (Float) resiliationMap.get("TotalFA");
			String typeRes = (String) resiliationMap.get("typeRes");
			String user = (String) resiliationMap.get("user");
			String userGroup = (String) resiliationMap.get("canal");

			// set attributes of resiliation
			resiliation.setOrderIdPub(orderIdPub);
			resiliation.setCaseCRM(caseCRM);
			resiliation.setCoCode(coCode);
			resiliation.setCoId(coId);
			resiliation.setComments(comments);
			resiliation.setContestClient(contestClient);
			resiliation.setContractStatus(contractStatus);
			resiliation.setCustCode(custCode);
			resiliation.setCustId(custId);

			// dates are of type XMLGregorianCalendar
			
			if(dueDate!=null) {
				resiliation.setDueDate(dueDate)  ;
			}
			
			if(endDate!=null) {
					resiliation.setEndDate(endDate);
			}
			
			if(startDate!=null) { 
				resiliation.setStartDate(startDate);
			}

			logger.info("dueDate in percist =" + dueDate);

			resiliation.setFaComment(faComment);
			resiliation.setFaContract(faContract);
			resiliation.setIsResiliationTotal(isResiliationTotal);
			resiliation.setMotif(motif);
			resiliation.setMotifClient(motifClient);
			resiliation.setMsisdn(msisdn);
			resiliation.setOfferInit(offerInit);
			resiliation.setOfferTarget(offerTarget);
			resiliation.setOldCoCode(oldCoCode);
			resiliation.setOldCoId(oldCoId);
			resiliation.setOrderId(orderId);
			resiliation.setPrgCode(prgCode);
			resiliation.setRemarque(remarque);
			resiliation.setResComment(resComment);
			resiliation.setResDevice(resDevice);
			resiliation.setRpCodeInit(rpCodeInit);
			resiliation.setRpCodeTarget(rpCodeTarget);

			
			resiliation.setStatus(status);
			resiliation.setTask(task);
			resiliation.setTotalFA(totalFA);
			resiliation.setTypeRes(typeRes);
			resiliation.setUser(user);
			resiliation.setUserGroup(userGroup);
			
			
			resiliationBeans.add(resiliation); 

		}
		return resiliationBeans;
	}



}
