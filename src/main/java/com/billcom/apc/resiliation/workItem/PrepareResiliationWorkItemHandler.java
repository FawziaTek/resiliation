package com.billcom.apc.resiliation.workItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResultResiliationBean;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;

/**
 * @author Bechir
 * Updated by Fethi
 *
 * This workitem aim for preparing all needed informations for next steps to
 * continue the process seccusfully.
 */
public class PrepareResiliationWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(PrepareResiliationWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();

	String caseCRM;
	String userId;
	String canal;
	String dueDate;
	String typeRes;
	Boolean resDevice;
	String motif;
	String motifClient;
	Boolean contestClient;
	Float faTotal;
	Integer custId;
	String custCode;
	Integer prgCode;
	Integer tmCode;
	String shdes;
	Boolean resiliationTotal;
	String comments = resiliationService.getConfig().getPropValues("comment");
	String taskName ;
	String waitGPSseconds="";
	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// auto generated
	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {

		logger.info("=> PrepareResiliationWorkItemHandler in:");
		logger.info("Resiliation in progress...Prepare resiliation");
		logger.info("Resiliation order id : " + wi.getProcessInstanceId());
		resiliationService.printWorkItem(logger, wi);

		// get input of the workitem
		getWorkItemInput(wi);	
		AutoRecycle autoRecycle = new AutoRecycle();
		String retriesConfigNbre = null;
		String waitFailure = "0s";
		Integer retryNbre = null;
		String waitPayment = "";	
		String waitGPS = "";	

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		List<Map<String, Object>> contractMaps = new ArrayList<Map<String, Object>>();
		try {
			// retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));

			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
            String taskName=resiliationService.getConfig().getPropValues("MainprepareresiliationWIH");
			waitPayment = resiliationService.getConfig().getPropValues("waitPayment").trim();
			waitGPS = resiliationService.getConfig().getPropValues("waitGPS").trim();
            logger.info("waitGPS for paymenet from config = "+waitGPS);
    		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    	    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    	    Date date = dateFormat.parse(waitGPS);
    	    long seconds = date.getTime() / 1000L;
    	    String[] array=waitGPS.split(":");
    	    System.out.println(array[0] +" hours");
    	    System.out.println(array[1] +" minutes");
    	    System.out.println(array[2] +" seconds");
    		 waitGPSseconds=seconds+"s";

    	    System.out.println("seconds to wait = "+waitGPSseconds);
			retriesConfigNbre = resiliationService.getConfig().getPropValues("retriesConfigNbre").trim();

			logger.debug("retriesConfigNbre from config = " + retriesConfigNbre);
			logger.debug("waitPayment from config = " + waitPayment);
			
		//	if (resiliationTotal) {// prepare for total resiliation
//				logger.info("resiliation TOTALE");
//				// consume ws getListContracts for given customer
//				GetListContractsResponse responseRes = resiliationService.getListContracts(custId.longValue());
//				
//				if (responseRes.getIsSuccessful() && responseRes.getBeans() != null) {
//					prepareResiliationTotal(resiliationMap,contractMaps,responseRes);								
//				} else {
//					// no contracts returned for this client => fail
//					logger.debug(responseRes.getComment());
//					wim.completeWorkItem(wi.getId(),resiliationService.failOutputPrepareResiliation(retryNbre, waitFailure, resiliationMap,
//										retriesConfigNbre, waitPayment, resiliationTotal, contractMaps,waitGPS));
//					return;
//				}

//			} else // prepare for partial resiliation
	//		{
	//			logger.info("resiliation PARTIELLE");
				// get contracts
				ArrayList<HashMap<String, String>> contracts = (ArrayList<HashMap<String, String>>) wi.getParameter("contractBeans");
				// get detailsFA
				List<HashMap<String, String>> detailsFA = (ArrayList<HashMap<String, String>>) wi.getParameter("accBeans");
                //size of listContracts
				Integer size;

				for (int i = 0; i < contracts.size(); i++) {
					// create the contractMap (which will be used in all the process)
					Map<String, Object> contractMap = createContractMap(contracts, i, detailsFA);
					contractMaps.add(contractMap);
		//			coIdList.add(Long.parseLong( contracts.get(i).get("coid").toString()));
				}
				size=contractMaps.size();
				logger.info("ListContracts size " + size);
				//logger.info("coIdList size " + coIdList.size());

				resiliationMap.put("contractResiliation", contractMaps);
				resiliationMap.put("size",size );
				resiliationMap.put("sizeContracts", size);


	//		}
			
			// put values related to the customer and the resiliation operation
			fillCustomerInfo(resiliationMap,wi);			
			logger.info("Prepares resiliation done");
		
			wim.completeWorkItem(wi.getId(), resiliationService.sucessOutputPrepareResiliation(waitFailure,
								resiliationMap, retriesConfigNbre, waitPayment, resiliationTotal, contractMaps,taskName,waitGPSseconds));

		} catch (Exception e) {
			logger.error("",e);	
			wim.completeWorkItem(wi.getId(), resiliationService.failOutputPrepareResiliation(retryNbre, waitFailure,
					resiliationMap, retriesConfigNbre, waitPayment, resiliationTotal, contractMaps,waitGPSseconds));
		}
		logger.info("<= PrepareResiliationWorkItemHandler out:");
	}
	


	/********************************************Methods**********************************************************/
	
//	private void prepareResiliationTotal(Map<String, Object> resiliationMap, List<Map<String, Object>> contractMaps, GetListContractsResponse responseRes) {
//		logger.info("=> prepareResiliationTotal in:");
//		// list of contract returned with success
//		ResultResiliationBean[] contracts = responseRes.getBeans();
//		List<Long> coIdList = new ArrayList<Long>();
//
//        //size of listContracts
//		Integer size;
//		logger.debug("number of contracts = " + contracts.length);
//
//		// contracts is table of size 2 => one item table for eligible contracts and the
//		// other for not eligible contracts
//		for (ResultResiliationBean c : contracts) {
//			if (c.isElig()) {// we deal with only eligible contracts
//				logger.debug("number of elig contracts = " + c.getContracts().length);
//				for (ContractBean cb : c.getContracts()) {
//					fillContractMaps(contractMaps, cb);
//					coIdList.add(cb.getCoId());
//				}
//				size=contractMaps.size();
//				logger.info("ListContracts size " + size);
//				logger.info("coIdList size " + coIdList.size());
//
//				resiliationMap.put("contractResiliation", contractMaps);
//				resiliationMap.put("size",size );
//				resiliationMap.put("sizeContracts", size);
//
//
//			} else {
//				logger.debug("number of non elig contracts = " + c.getContracts().length);
//			}
//		}
//		logger.info("<= prepareResiliationTotal out:");
//	}

	private void fillCustomerInfo(Map<String, Object> resiliationMap, WorkItem wi) throws Exception {
		logger.info("=> fillCustomerInfo in:");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String strDate = dateFormat.format(date);
		resiliationMap.put("resiliationOrderId", wi.getProcessInstanceId());
		resiliationMap.put("user", userId);
		resiliationMap.put("custId", Long.valueOf(custId));
		resiliationMap.put("custCode", custCode);
		resiliationMap.put("dueDate", dueDate);
		resiliationMap.put("startDate", strDate);
		resiliationMap.put("typeRes", typeRes);
		resiliationMap.put("offre", shdes);
		resiliationMap.put("tmcode", Long.valueOf(tmCode));
		resiliationMap.put("caseCRM", caseCRM);
		resiliationMap.put("canal", canal);
		resiliationMap.put("resDevice", resDevice);
		resiliationMap.put("motif", motif);
		resiliationMap.put("motifClient", motifClient);
		resiliationMap.put("contestClient", contestClient);
		resiliationMap.put("TotalFA", faTotal);
		resiliationMap.put("prgCode", prgCode);
		resiliationMap.put("isResiliationTotal", resiliationTotal);
		resiliationMap.put("userGroup", "OTNBORES");
		resiliationMap.put("comments", comments +" " + motif);

		logger.info("<= fillCustomerInfo out:");
	}

	private Map<String, Object> createContractMap(ArrayList<HashMap<String, String>> contracts, int i,
			List<HashMap<String, String>> detailsFA) {
		logger.info("=> createContractMap in: "+contracts.get(i).get("coid"));
		// get values from contracts
		String coCode = contracts.get(i).get("cocode");
		Integer coId = Integer.valueOf(contracts.get(i).get("coid"));
		String contractStatus = contracts.get(i).get("status");
		String msisdn = contracts.get(i).get("msisdn");
		Long tmcode = Long.valueOf(contracts.get(i).get("tmcode"));
		String offreAct = contracts.get(i).get("offre");
		Float valueFA = Float.valueOf(detailsFA.get(i).get("valueFA"));
		String commentFA = detailsFA.get(i).get("commentFA");
		String dfe =contracts.get(i).get("dateFinEng");

		Map<String, Object> contractMap = new HashMap<String, Object>();
		contractMap.put("coId", Long.valueOf(coId));
		contractMap.put("coIdPub", coCode);
		contractMap.put("msisdn", msisdn);
		contractMap.put("offer", offreAct);
		contractMap.put("tmcode", tmcode);
		contractMap.put("contractStatus", contractStatus);
		
		if(resiliationTotal)
		contractMap.put("valueFA", 0F);
		else
		contractMap.put("valueFA", valueFA);
	
		contractMap.put("commentFA", commentFA);
		contractMap.put("dfe", dfe);

		logger.info("<= createContractMap out: "+contracts.get(i).get("coid"));

		return contractMap;
	}

//	private void fillContractMaps(List<Map<String, Object>> contractMaps, ContractBean cb) {
//		logger.info("=> fillContractMaps in:");
//		logger.debug(cb.getContractStatus());
//		logger.debug("elig = yes");
//		String coCode = cb.getCoCode();
//		Long coId = cb.getCoId();
//		String contractStatus = cb.getContractStatus();
//		String msisdn = cb.getMsisdn();
//		Long tmcode = cb.getTmcode();
//		String offreAct = cb.getOffreAct();
//		Map<String, Object> contractMap = new HashMap<String, Object>();
//		Calendar dfe =cb.getDateFinEng();
//		contractMap.put("dfe", dfe);
//        contractMap.put("coId", coId);
//		contractMap.put("coIdPub", coCode);
//		contractMap.put("msisdn", msisdn);
//		contractMap.put("offer", offreAct);
//		contractMap.put("tmcode", tmcode);
//		contractMap.put("contractStatus", contractStatus);
//		contractMap.put("valueFA", 0F);
//		contractMaps.add(contractMap);
//		logger.info("<= fillContractMaps out:");
//	}

	private void getWorkItemInput(WorkItem wi) {
		logger.info("=> getWorkItemInput in:");
		caseCRM = (String) wi.getParameter("CaseCRM");
		userId = (String) wi.getParameter("UserId");
		canal = (String) wi.getParameter("Canal");
		dueDate = (String) wi.getParameter("dueDate");
		logger.info("=> dueDate in:" + dueDate);

		typeRes = (String) wi.getParameter("TypeRes");
		resDevice = (Boolean) wi.getParameter("ResDevice");
		motif = (String) wi.getParameter("Motif");
		motifClient = (String) wi.getParameter("motifClient");
		logger.info("motifClient =" +motifClient);

		contestClient = (Boolean) wi.getParameter("ContestClient");
		faTotal = (Float) wi.getParameter("FA");
		custId = (Integer) wi.getParameter("custId");
		custCode = (String) wi.getParameter("custCode");
		prgCode = (Integer) wi.getParameter("prgCode");
		tmCode = (Integer) wi.getParameter("tmCode");
		shdes = (String) wi.getParameter("shdes");
		resiliationTotal = (Boolean) wi.getParameter("resiliationTotal");
		logger.info("<= getWorkItemInput out:");
	}

}
