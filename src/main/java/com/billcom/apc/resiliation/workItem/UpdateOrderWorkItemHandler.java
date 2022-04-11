package com.billcom.apc.resiliation.workItem;

import java.util.Date;  
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationBean;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.UpdateResiliationOrderResponse;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Fethi
 */

public class UpdateOrderWorkItemHandler implements WorkItemHandler{


	private Logger logger = Logger.getLogger(UpdateOrderWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// Auto-generated method stub

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> UpdateOrderWorkItemHander in:");
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();

		  
		logger.info("Resiliation in progress...Update  Resiliation Order");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			 Float FA = (Float) wi.getParameter("FA");
		        Float FA_AFTER_CHECK = (Float) wi.getParameter("FA_after_check");
		        logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId"));
				resiliationService.printWorkItem(logger,wi);
				String comment = (String) wi.getParameter("comment");
				logger.info("=> comment from workflow " + comment);
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			//resiliationMap.put("remarque", remarque);
			if(comment != null)
				{
				resiliationMap.put("comments",resiliationMap.get("comments") +"/" + comment);
				comment =null;
				}
			logger.info("comments ="+resiliationMap.get("comments"));
         
			
			if(FA!=null && FA_AFTER_CHECK == null)
				resiliationMap.put("TotalFA",FA);
			else if (FA==null  && FA_AFTER_CHECK != null)
				resiliationMap.put("TotalFA",FA_AFTER_CHECK);

			ResiliationBean resiliation = setResiliationBean(resiliationMap,contractMap,wi);

			logger.info("prepare to call ws: "+resiliation.toString());
			//consume ws updateResiliation
			UpdateResiliationOrderResponse response = resiliationService.updateOrder(resiliation);
			logger.info("response: "+response.isFinished());

			if (response.isFinished()) {
                  comment=null;
          		logger.info("<= UpdateOrderWorkItemHander out");

				wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputUpdateResiliationOrder(waitFailure, resiliationMap,contractMap));
			} else {
				logger.info("<= UpdateOrderWorkItemHander out with error ");

				wim.completeWorkItem(wi.getId(), resiliationService.failOutputUpdateResiliationOrder( retryNbre,waitFailure, resiliationMap,contractMap));
			}

		} catch (Exception e) {
			logger.error("",e);		
			resiliationMap.put("comments",resiliationMap.get("comments") +"/" + e.getMessage());
			logger.info("<= UpdateOrderWorkItemHander out with error ");

			wim.completeWorkItem(wi.getId(), resiliationService.failOutputUpdateResiliationOrder( retryNbre,waitFailure, resiliationMap,contractMap));
		}

	}
	
	
	/************************************Methods***************************************************/
	
	private ResiliationBean setResiliationBean(Map<String, Object> resiliationMap, Map<String, Object> contractMap,WorkItem wi) throws Exception {

		ResiliationBean resiliation = new ResiliationBean();
		
		//prepare values
		
		String caseCRM = (String) resiliationMap.get("caseCRM");
		String comments = (String) resiliationMap.get("comments");
		logger.info("comments in update="+comments);

		Boolean aborded = (Boolean) wi.getParameter("abord");

		Boolean contestClient = (Boolean) resiliationMap.get("contestClient");
		//Integer contractOrderId =  (int) wi.getProcessInstanceId();
		String custCode = (String) resiliationMap.get("custCode");
		String custId = resiliationMap.get("custId") + "";
		String dueDate = (String) resiliationMap.get("dueDate");
		String endDate = (String) resiliationMap.get("endDate");

		String faComment = (String) resiliationMap.get("commentFA");

		Boolean isResiliationTotal = (Boolean) resiliationMap.get("isResiliationTotal");
		String motif = (String) resiliationMap.get("motif");
		String offerTarget = (String) resiliationMap.get("offre");
		Integer orderId = (int)(long)(Long) resiliationMap.get("resiliationOrderId") ;
		String orderIdPub = (String) resiliationMap.get("orderIdPub");
		Integer prgCode = (Integer) resiliationMap.get("prgCode");
		String remarque = (String) resiliationMap.get("remarque");
		String resComment = (String) resiliationMap.get("comments");
		Boolean resDevice = (Boolean) resiliationMap.get("resDevice");
		Integer rpCodeTarget = (int) (long) ((Long) resiliationMap.get("tmcode"));
		String startDate = (String) resiliationMap.get("startDate");

	//	String task = wi.getName();

		String taskName = (String) wi.getParameter("taskName");
		logger.info("taskName in update="+taskName);

		float totalFA = (float) (Float) resiliationMap.get("TotalFA");
		String typeRes = (String) resiliationMap.get("typeRes");
		String user = (String) resiliationMap.get("user");
		String userGroup = (String) resiliationMap.get("");

		if(contractMap != null) {
			
		
			String coId = contractMap.get("coId") + "";
			String coCode = (String) contractMap.get("coIdPub");
			String contractStatus = (String) contractMap.get("contractStatus");
			float faContract =  (float) (Float) contractMap.get("valueFA");
		 String msisdn = (String) contractMap.get("msisdn");
		 String offerInit = (String) contractMap.get("offer");
		 String oldCoCode = (String) contractMap.get("oldCoIdPub");
		 String oldCoId = contractMap.get("oldCoId") + "";
		 Integer rpCodeInit = (int) (long) ((Long) contractMap.get("tmcode"));
		 
			resiliation.setCoCode(coCode);
			 if(oldCoId != null && oldCoId!="" )
			{
				 resiliation.setCoId(oldCoId);
				logger.info("old coId injected  ="+oldCoId);

			}
			 else
			{
				 resiliation.setCoId(coId);
					logger.info(" coId injected  ="+coId);

				 
			}
			 
			resiliation.setContractStatus(contractStatus);
			resiliation.setFaContract(faContract);
			resiliation.setMsisdn(msisdn);
			resiliation.setOfferInit(offerInit);
			resiliation.setOldCoCode(oldCoCode);
			resiliation.setOldCoId(oldCoId);
			resiliation.setRpCodeInit(rpCodeInit);

			logger.info("coCode in update="+coCode);
			logger.info("coId in update="+coId);

		}
	

        resiliation.setOrderIdPub(orderIdPub);

		resiliation.setCaseCRM(caseCRM);
		resiliation.setComments(comments);
		resiliation.setContestClient(contestClient);
		
		
		logger.info("Order ID in update="+orderId);

		resiliation.setCustCode(custCode);
		resiliation.setCustId(custId);

		if(dueDate!=null) {
			resiliation.setDueDate(dueDate)  ;
		}
		
		if(endDate==null) {
			endDate = new Date().toString();	//set end date of resiliation => now date			
			resiliation.setEndDate(endDate);
		}
		
		if(startDate!=null) { 
			resiliation.setStartDate(startDate);
		}
	
		resiliation.setFaComment(faComment);
		resiliation.setIsResiliationTotal(isResiliationTotal);
		resiliation.setMotif(motif);
		resiliation.setOfferTarget(offerTarget);
		resiliation.setOrderId(orderId);
		resiliation.setPrgCode(prgCode);
		resiliation.setRemarque(remarque);
		resiliation.setResComment(resComment);
		resiliation.setResDevice(resDevice);
		resiliation.setRpCodeTarget(rpCodeTarget);
		if(aborded!=null && aborded) {
			resiliation.setStatus(2);

		}
		else
		resiliation.setStatus(1);
		resiliation.setTask(taskName);
		resiliation.setTotalFA(totalFA);
		resiliation.setTypeRes(typeRes);
		resiliation.setUser(user);
		resiliation.setUserGroup(userGroup);
		return resiliation;
	}

	private XMLGregorianCalendar convertDateToXMLGregorianCal(Date date) throws Exception {
		GregorianCalendar calDueDate = new GregorianCalendar();
		calDueDate.setTime(date);
		XMLGregorianCalendar dueDateGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(calDueDate);
		return dueDateGregCal;
	}

}
