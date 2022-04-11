package com.billcom.apc.resiliation.service;

import java.io.IOException;  
import java.net.SocketTimeoutException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;

import com.billcom.apc.generatedSOAP.BalanceManagerV2.BalanceManagerV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.GetBalanceAndDateBeanInputV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.GetBalanceAndDateBeanOutputV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.OptionV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.SubscriberV2;
import com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.AdjustBalanceResponse;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.PercistResiliationOrderRequest;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.PercistResiliationOrderResponse;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationBean;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationManager;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.SetContractOrderIdRequest;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.SetContractOrderIdResponse;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.UpdateResiliationOrderRequest;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.UpdateResiliationOrderResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceHistRequest;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreRequest;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteBeanIn;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteBeanOut;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.In0;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.UnexpectedErrorFault;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistRequest;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse;
import com.billcom.apc.generatedSOAP.gps.AddApcRequest;
import com.billcom.apc.generatedSOAP.gps.AddApcResponse;
import com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub;
import com.billcom.apc.generatedSOAP.gps.AuthenticationData;
import com.billcom.apc.generatedSOAP.gps.GetStatusResiliationRequest;
import com.billcom.apc.generatedSOAP.gps.GetStatusResiliationResponse;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.apc.ws.manager.APCManager;
import com.billcom.apc.ws.manager.AdjustBalanceRequest;
import com.billcom.apc.ws.manager.NotFoundException;
import com.billcom.apc.ws.manager.NotFoundException_Exception;

/**
 * @author Bechir
 */

public class ResiliationServiceImp implements ResiliationService {
	
	private final  ResiliationConfigHandler config = new ResiliationConfigHandler();
	private Logger logger = Logger.getLogger(ResiliationServiceImp.class);
	
	public ResiliationConfigHandler getConfig() {
		return config;
	}
	
	public void printWorkItem(Logger logger,WorkItem wi) {
		Map<String, Object> paraList = wi.getParameters();
		logger.info("Inputs : ");
		for (Map.Entry<String, Object> entry : paraList.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if(!(value instanceof ArrayList) && !key.equals("resiliationMap")) //do not print (in info level) lists or resiliationMap because they are too long
				logger.info(key + " = " + value.toString());
			else //print the rest in debug level
				logger.debug(key + " = " + value.toString().replace("},","},\n"));
		}		
	}
	
	//retryNbre, set 0 if null or greater than retryConfigNumber
	public Integer getRetryNumber(Integer inputRetryNumber) throws IOException {
		Integer retryNbre =0;
		String retriesConfigNbre = config.getPropValues("retriesConfigNbre");		
		if (inputRetryNumber!= null ) 
			retryNbre = inputRetryNumber;
		logger.info("Retry Tentative N° : " + retryNbre);
		return retryNbre;
	}

	/*set Occ methods*/
	public SetOccResponse setOCC(Float faTotal, Long custId,ContractOccBean[] coIdList) throws Exception {
		logger.info("=> setOCC");
		
		ResiliationHandlingSoapBindingStub resiliationHandlingSoapBindingStub = config.consumeResiliationHandling();
		SetOccRequest setOccRequest = new SetOccRequest();
		setOccRequest.setAmount((double)  (Math.round(faTotal * 1000.0)/1000.0));
		setOccRequest.setCsId(custId);		
		setOccRequest.setRemark(config.getPropValues("occAcclerationFeesRemark"));
		setOccRequest.setSnCode(Long.valueOf(config.getPropValues("occAcclerationFeesSNCODE")));
		setOccRequest.setSpCode(Long.valueOf(config.getPropValues("occAcclerationFeesSPCODE")));
		setOccRequest.setCoIdList(coIdList);
		
		DateBean dateBean = new DateBean();
		dateBean.setDate(Calendar.getInstance());
		setOccRequest.setValidFrom(dateBean);
		
		SetOccResponse response = new SetOccResponse();
		try {
			response = resiliationHandlingSoapBindingStub.setOcc(setOccRequest);
		}catch(UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= setOCC with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= setOCC with error");
			throw e;
		}
		logger.info("<= setOCC");
		return  response;
	}


	public Map<String, Object> sucessOutputSetOcc(Map<String, Object> resiliationMap,String waitFailure,String taskName) {
		logger.info("=> sucessOutputSetOcc");

		Map<String, Object> resultsMap = new HashMap<String, Object>();

		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputSetOcc");

		return resultsMap;
		
	}


	public Map<String, Object> failOutputSetOcc(Map<String, Object> resiliationMap,String waitFailure,Integer retryNbre) {
		logger.info("=> failOutputSetOcc");

		Map<String, Object> resultsMap = new HashMap<String, Object>();

		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputSetOcc");

		return resultsMap;
		
	}

	/*Calculate Acc Fees methods*/

	public GetCalculatedFaccTotaleResponse getCalculatedFaccTotale(Long custId,Date duDate,String caseCrm,String motif,String motifClient) throws Exception {
		logger.info("=> getCalculatedFaccTotale");
		logger.info("INPUTS");

		logger.info("custId : "+custId);

		logger.info("caseCrm : "+caseCrm);
		logger.info("motif : "+motif);
		logger.info("motifClient : "+motifClient);

		ResiliationHandlingSoapBindingStub binding = config.consumeResiliationHandling();
		GetCalculatedFaccTotaleRequest request = new GetCalculatedFaccTotaleRequest();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(duDate);
		logger.info("calendar : "+calendar);

		request.setDuDate(calendar);
		request.setCustomerID(custId);
		request.setMotif(motif);
		request.setCaseCrm(caseCrm);
	    request.setMotifClient(motifClient);
		GetCalculatedFaccTotaleResponse response = new GetCalculatedFaccTotaleResponse();
		try {
			response = binding.getcalculatedFaccTotale(request);
		}
		catch(UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= getCalculatedFaccTotale with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= getCalculatedFaccTotale with error");
			throw e;
		}
		logger.info("<= getCalculatedFaccTotale");
		return response;
	}

	public Map<String, Object> sucessOutputgetFAtotal(Map<String, Object> resiliationMap, Float faTotal,String waitFailure,Boolean encours,String taskName) {
		logger.info("=> sucessOutputgetFAtotal");

		Map<String, Object> resultsMap = new HashMap<String, Object>();

		resultsMap.put("retryNbre", 0);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("FA", faTotal);
		resultsMap.put("encours", encours);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputgetFAtotal");

		return resultsMap;
	}

	public Map<String, Object> failOutputgetFAtotal(Map<String, Object> resiliationMap, Float faTotal,
			Integer retryNbre, String waitFailure) {
		
		logger.info("=> failOutputgetFAtotal");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", false);
		resultsMap.put("encours", false);
		resultsMap.put("FA", faTotal);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputgetFAtotal");

		return resultsMap;
	}

	/*Change RatePlan methods*/

	public ChangeRatePlanResiliationResponse changeRatePlanResiliation(Long coId, Long tmcode) throws Exception  {
		logger.info("=> changeRatePlanResiliation in: co_id="+coId+", tmcode "+tmcode);
		ResiliationHandlingSoapBindingStub binding = config.consumeResiliationHandling();
		ChangeRatePlanResiliationRequest request = new ChangeRatePlanResiliationRequest();
		request.setCoId(coId);
		request.setRpCodeTarget(tmcode);
		ChangeRatePlanResiliationResponse response = new ChangeRatePlanResiliationResponse();

			try {
				response = binding.changeRateplanforResiliation(request);
			} catch (UnexpectedErrorFault e) {
				logger.error("Axis Fault : "+e.getFaultString());
				logger.error("UnexpectedErrorFault : "+e.getFaultstring());
				e.printStackTrace();
			} catch (Exception e) {
				logger.error("<= changeRatePlanResiliation with error");
				throw e;
			}

		logger.info("<= changeRatePlanResiliation out:"+response.isFinished());
		return response;
	}

	public Map<String, Object> sucessOutputChangeRatePlan(Map<String, Object> resiliationMap, Map<String, Object> contractMap,
			String waitFailure,String taskName) {
		logger.info("=> sucessOutputChangeRatePlan");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("success", true);
		resultsMap.put("retryNbre", 0);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputChangeRatePlan");

		return resultsMap;
	}

	public Map<String, Object> failOutputChangeRatePlan(Map<String, Object> resiliationMap, Map<String, Object> contractMap,
			Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputChangeRatePlan");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("success", false);
		resultsMap.put("retryNbre", retryNbre+1);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("contractMap", contractMap);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputChangeRatePlan");

		return resultsMap;
	}
	
	/*Create Contract methods*/

	public CreateContractResResponse createContract(Long coId, Long rpCode) throws Exception{
		logger.info("=> createContract");
		ResiliationHandlingSoapBindingStub resiliationHandlingSoapBindingStub = config.consumeResiliationHandlingCreateContract();
		CreateContractResRequest createContractResRequest = new CreateContractResRequest();
		createContractResRequest.setCoId(coId);
		createContractResRequest.setRpCode(rpCode);
		CreateContractResResponse response = new CreateContractResResponse();
		try {
			response = resiliationHandlingSoapBindingStub.createContractForResiliation(createContractResRequest);
		}catch(UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= createContract with error");
			throw e;
		}
		
	/*	catch (Exception e) {			
			logger.error("<= createContract with error");
			throw e;
		}*/
		logger.info("<= createContract");
		logger.info("response: "+response.getIsSuccessful());
		return response;
	}

	public Map<String, Object> sucessOutputCreateContract(Map<String, Object> resiliationMap,
			Map<String, Object> contractMap, String waitFailure,String taskName) {
		logger.info("=> sucessOutputCreateContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", true);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputCreateContract");

		return resultsMap;
	}

	public Map<String, Object> failOutputCreateContract(Map<String, Object> resiliationMap,
			Map<String, Object> contractMap, Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputCreateContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", false);
		resultsMap.put("resiliationMap", resiliationMap);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputCreateContract");

		return resultsMap;
	}
	
	/*insertSheduled*/

	public InsertScheduledJobResponse insertSheduled(Long coId,Long csId,Calendar dueDate,Long jobTypeId,String remarque) throws Exception {
		logger.info("=> insertSheduled");
		logger.info("custId ="+csId);
		logger.info("dueDate ="+dueDate);
		ResiliationHandlingSoapBindingStub binding = config.consumeResiliationHandling();
		InsertScheduledJobRequest request = new InsertScheduledJobRequest();
	//	CoIdRequest request = new CoIdRequest(coId);
		request.setCoId(coId);
		request.setCsId(csId);
		request.setDateExecution(dueDate);
		request.setJobTypeId(jobTypeId);
		request.setRemarque(remarque);
		InsertScheduledJobResponse response =new InsertScheduledJobResponse();
		try {
			  response = binding.insertScheduledJob(request);
		}catch(com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= insertSheduled with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= insertSheduled with error");
			throw e;
		}
		logger.info("<= insertSheduled");
		return response;
	}
	/*deactivateContract*/

	public OperationResponse deactivateContract(Long coId) throws Exception {
		logger.info("=> deactivateContract");
		APCHandlingSoapBindingStub binding = config.consumeAPCHandling();
		CoIdRequest request = new CoIdRequest(coId);
		OperationResponse response =new OperationResponse();
		try {
			  response = binding.desactivateContract(request);
		}catch(com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= deactivateContract with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= deactivateContract with error");
			throw e;
		}
		logger.info("<= deactivateContract");
		return response;
	}
	public Map<String, Object> sucessOutputDeactivateContract(Map<String, Object> resiliationMap,
			Map<String, Object> contractMap, String waitFailure,String taskName) {
		logger.info("=> sucessOutputDeactivateContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();		
		resultsMap.put("retryNbre", 0);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputDeactivateContract");

		return resultsMap;
	}

	public Map<String, Object> failOutputDeactivateContract(Map<String, Object> resiliationMap, Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputDeactivateContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre+1); //retryNbre
		resultsMap.put("waitFailure", waitFailure); //waitFailure
		resultsMap.put("success",false);
		resultsMap.put("Result",resiliationMap);	
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputDeactivateContract");

		return resultsMap;
	}

	/*getMigrationGroup methods*/
	
	public GetCategoryResponse getMigrationGroup(Long tmcodeInit, Long tmcodeTarget) throws Exception {
		logger.info("=> getMigrationGroup");
		APCHandlingSoapBindingStub binding = config.consumeAPCHandling();
		GetCategoryRequest request = new GetCategoryRequest();
		request.setRpCodeInit(tmcodeInit);
		request.setRpCodeTarget(tmcodeTarget);
		
		GetCategoryResponse response ;
		try {
			response = binding.getCatMigration(request);
		}catch(com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= getMigrationGroup with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= getMigrationGroup with error");
			throw e;
		}
		logger.info("<= getMigrationGroup");
		return response;
	}


	public Map<String, Object> sucessOutputGetMigrationGroup(String waitFailure,Boolean isSameGroup,String taskName) {
		logger.info("=> sucessOutputGetMigrationGroup");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("isSameGroup", isSameGroup);
		resultsMap.put("success", true);
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputGetMigrationGroup");

		return resultsMap;
	}

	public Map<String, Object> failOutputGetMigrationGroup (Boolean isSameGroup,Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputGetMigrationGroup");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("isSameGroup", isSameGroup);
		resultsMap.put("success", false);
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputGetMigrationGroup");

		return resultsMap;
	}

	/*ModifierDFE (GRH) methods*/
	
	public AddGrhRequestResponse addGrh(Logger logger,Map<String, Object> resiliationMap,Map<String, Object> contractMap,String dueDate) throws  Exception {
		logger.info("=> addGrh");
		//binding GRH
		GrhHandlingSoapBindingStub bindingGrh = config.consumeGrhHandling();
		
		
		//requests
		AddGrhRequestRequest addGrhRequestRequest = new AddGrhRequestRequest();
		GrhRequest grhRequest = new GrhRequest();
		CommitmentRequest commitmentRequest = new CommitmentRequest();
		RequestAll requestAll = new RequestAll();		
		
		//grhOperationType = resiliation (code = 17)
		Integer grhOperationType = Integer.valueOf(config.getPropValues("grhOperationTypeResiliation").trim());
		
		logger.info("grhOperationType = " + grhOperationType);
		logger.info("User = " + resiliationMap.get("user"));
		logger.info("RequestPriority = " + Integer.valueOf(config.getPropValues("grhRequestPriority").trim()));

		//set requestAll
		requestAll.setCoId((Long) contractMap.get("coId")); //coId
		Long initTmcode = (Long) contractMap.get("tmcode");
		requestAll.setCoTmCode(Integer.valueOf((int) (long) initTmcode)); //tmcode contrat
		requestAll.setCustomerId((Long) resiliationMap.get("custId")); //custId
		requestAll.setOperationType(new OperationType(null, grhOperationType));//operation type
		requestAll.setPriority(Integer.valueOf(config.getPropValues("grhRequestPriority").trim()));//priority
		requestAll.setProcessingMode(new ProcessingMode(null, 1)); // Processing Mode
		requestAll.setSourceId(2L);
		requestAll.setStatusDefinition(new StatusDefinition(null, 2));
		requestAll.setRequestPostUser((String) resiliationMap.get("user"));

		//due date of type Calendar
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		sdf.setTimeZone(TimeZone.getTimeZone("UTC")); //server timezone is CET (UTC+1) (Africa/Tunis) and DataBase is UTC (UTC+0) (we parse timezone to UTC to insert correct value) please check timezone if there is a problem
		Date date = sdf.parse(dueDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		requestAll.setCoNewTrialEnd_date(cal);

		//set commitmentRequest
		commitmentRequest.setEntryDate(Calendar.getInstance());
		commitmentRequest.setCommitmentEntityType(new CommitmentEntityType(null, 2));
		commitmentRequest.setPriority(1);

		//set grhRequest
		grhRequest.setRequestAll(requestAll);
		grhRequest.setCommitmentRequest(commitmentRequest);
		
		//set addGrhRequestRequest
		addGrhRequestRequest.setGrhRequest(grhRequest);
		
		AddGrhRequestResponse response = new AddGrhRequestResponse();
		
		try {
			response = bindingGrh.addGrhRequest(addGrhRequestRequest);
		}catch(com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= addGrh with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= addGrh with error");
			throw e;
		}
		logger.info("<= addGrh");
		return response;
	}

	public Map<String, Object> sucessOutputModifierDFE(String waitFailure,Map<String, Object> resiliationMap,Map<String, Object> contractMap,String taskName) {
		logger.info("=> sucessOutputModifierDFE");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputModifierDFE");

		return resultsMap;
	}

	public Map<String, Object> failOutputModifierDFE(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,Map<String, Object> contractMap) {
		logger.info("=> failOutputModifierDFE");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputModifierDFE");


		return resultsMap;
	}

	/*PercistResiliationOrder methods*/
	
	public PercistResiliationOrderResponse percistResiliationOrder(List<ResiliationBean>  resiliation) throws Exception  {
		logger.info("=> percistResiliationOrder");
		ResiliationManager binding = config.consumeResiliationManager();
		PercistResiliationOrderRequest request = new PercistResiliationOrderRequest();
		request.getResiliations().addAll(resiliation);
		PercistResiliationOrderResponse response = new  PercistResiliationOrderResponse();
		try {
			response = binding.percisteResiliation(request);
		}
		catch (Exception e) {
			logger.error("<= percistResiliationOrder with error");
			throw e;
		}
		logger.info("<= percistResiliationOrder");
		return response;
	}

	public Map<String, Object> sucessOutputPercistResiliationOrder(String waitFailure, Map<String, Object> resiliationMap) {
		logger.info("=> sucessOutputPercistResiliationOrder");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("retryNbre", 0);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputPercistResiliationOrder");

		return resultsMap;
	}

	public Map<String, Object> failOutputPercistResiliationOrder(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap) {
		logger.info("=> failOutputPercistResiliationOrder");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", false);
		resultsMap.put("retryNbre", retryNbre+1);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputPercistResiliationOrder");

		return resultsMap;
	}
	
	/*PrepareMigrationForPre methods*/

	public Map<String, Object> sucessOutputPrepareMigrationForPre(String waitFailure,
			Map<String, Object> resiliationMap,String taskName) {
		logger.info("=> sucessOutputPrepareMigrationForPre");

		Map<String, Object> resultsMap = new HashMap<String, Object>();	
		resultsMap.put("Result", resiliationMap);		
		resultsMap.put("retryNbre", 0);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure		
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputPrepareMigrationForPre");

		return resultsMap;
	}

	public Map<String, Object> failOutputPrepareMigrationForPre(Integer retryNbre, String waitFailure,
			Map<String, Object> resiliationMap) {
		logger.info("=> failOutputPrepareMigrationForPre");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("retryNbre", retryNbre+1);//retryNbre
		resultsMap.put("waitFailure", waitFailure);//waitFailure	
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputPrepareMigrationForPre");

		return resultsMap;
	}

	/*PrepareResiliation methods*/
	
	public GetListContractsResponse getListContracts(Long custId) throws  Exception {
		logger.info("=> getListContracts");
		ResiliationHandlingSoapBindingStub bindingRes = config.consumeResiliationHandling();
		GetListContractsRequest requestRes = new GetListContractsRequest();
		ContractIdentificationBean contractIdentification = new ContractIdentificationBean();
	//	contractIdentification.setStatusContract("2");
		requestRes.setCustomerId(custId);
		requestRes.setContractIdentification(contractIdentification);
		requestRes.setIsTotale(false);
		GetListContractsResponse response = new GetListContractsResponse();
		try {
			response = bindingRes.getContractsListForResiliation(requestRes);
		}catch(UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= getListContracts with error");
			throw e;
		}
		catch (Exception e) {
			logger.error("<= getListContracts with error");
			throw e;
		}
		logger.info("<= getListContracts");
		return response;
	}

	public Map<String, Object> sucessOutputPrepareResiliation(String waitFailure, Map<String, Object> resiliationMap,String retriesConfigNbre,String waitPayment,Boolean resiliationTotal, List<Map<String, Object>> contractMaps,String taskName,String waitGPS) {
		logger.info("=> sucessOutputPrepareResiliation");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retriesConfigNbre", retriesConfigNbre);// retriesConfigNbre
		resultsMap.put("waitPayment", waitPayment);// waitPayment
		resultsMap.put("waitGPS", waitGPS);// waitGPS 

		resultsMap.put("out_resiliationtotal", resiliationTotal);
		resultsMap.put("success", true);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("Listcontracts", contractMaps);
		resultsMap.put("size", resiliationMap.get("size"));
		resultsMap.put("sizeContracts", resiliationMap.get("sizeContracts"));
		resultsMap.put("taskName", taskName);

		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputPrepareResiliation");

		return resultsMap;
	}

	public Map<String, Object> failOutputPrepareResiliation(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,String retriesConfigNbre,String waitPayment,Boolean resiliationTotal, List<Map<String, Object>> contractMaps,String waitGPS) {
		logger.info("=> failOutputPrepareResiliation");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retriesConfigNbre", retriesConfigNbre);// retriesConfigNbre
		resultsMap.put("waitPayment", waitPayment);// waitPayment 
		resultsMap.put("waitGPS", waitGPS);// waitGPS 
		resultsMap.put("out_resiliationtotal", resiliationTotal);
		resultsMap.put("success", false);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("Listcontracts", contractMaps);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputPrepareResiliation");

		return resultsMap;
	}
	
	public GetCalculatedFaccTotaleResponse getCalculatedFaccByContract(Long custId, Long coId, Date duDate) throws  Exception {
		logger.info("=> get FA for contract "+coId);
		ResiliationHandlingSoapBindingStub binding = config.consumeResiliationHandling();

		GetCalculatedFaccTotaleRequest request = new GetCalculatedFaccTotaleRequest();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(duDate);
		request.setDuDate(calendar);
		request.setCustomerID(custId);
		long[] coIds = {coId};
		request.setCoIdList(coIds);
		GetCalculatedFaccTotaleResponse response = new GetCalculatedFaccTotaleResponse();
		try {
			response = binding.getcalculatedFaccTotale(request);
		}catch(UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= get FA for contract with error"+coId);
			throw e;
		}
		catch (Exception e) {
			logger.error("<= get FA for contract with error "+coId);
			throw e;
		}
		logger.info("<= get FA for contract "+coId);
		return response;
	}
	

	public Map<String, Object> sucessOutputSuspendContract(Map<String, Object> resiliationMap,
			Map<String, Object> contractMap, String waitFailure,String taskName) {
		logger.info("=> sucessOutputSuspendContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputSuspendContract");

		return resultsMap;
	}

	public Map<String, Object> failOutputSuspendContract(Map<String, Object> resiliationMap,
			Map<String, Object> contractMap, Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputSuspendContract");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputSuspendContract");

		return resultsMap;
	}
	
	/*updateResiliation Order _SubProcess_ Methods*/

	public UpdateResiliationOrderResponse updateResiliationOrder(ResiliationBean resiliation) throws Exception  {
		logger.info("=> updateResiliationOrder for subProcess");
		ResiliationManager binding = config.consumeResiliationManager();
		UpdateResiliationOrderRequest request = new UpdateResiliationOrderRequest();
		request.setResiliation(resiliation);
		UpdateResiliationOrderResponse response = new UpdateResiliationOrderResponse();
		try {
			response = binding.updateResiliationSubProcess(request);
		}
		catch (Exception e) {
			logger.error("<= updateResiliationOrder for subProcess with error");
			throw e;
		}
		logger.info("<= updateResiliationOrder for subProcess");
		return response;
	}
	
	/*updateResiliation Order _Process_ Methods*/

	public UpdateResiliationOrderResponse updateOrder(ResiliationBean resiliation) throws Exception  {
		logger.info("=> updateResiliationOrder for ParentProcess");
		ResiliationManager binding = config.consumeResiliationManager();
		UpdateResiliationOrderRequest request = new UpdateResiliationOrderRequest();
		request.setResiliation(resiliation);
		UpdateResiliationOrderResponse response = new UpdateResiliationOrderResponse();
		try {
			response = binding.updateResiliationProcessParent(request);
		}
		catch (Exception e) {
			logger.error("<= updateResiliationOrder for ParentProcess with error");
			throw e;
		}
		logger.info("<= updateResiliationOrder for ParentProcess");
		return response;
	}

	public Map<String, Object> sucessOutputUpdateResiliationOrder(String waitFailure,
			Map<String, Object> resiliationMap, Map<String, Object> contractMap) {
		logger.info("=> sucessOutputUpdateResiliationOrder");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputUpdateResiliationOrder");

		return resultsMap;
	}

	public Map<String, Object> failOutputUpdateResiliationOrder(Integer retryNbre, String waitFailure,
			Map<String, Object> resiliationMap, Map<String, Object> contractMap) {
		logger.info("=> failOutputUpdateResiliationOrder");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("success", false);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputUpdateResiliationOrder");

		return resultsMap;
	}
	
	/*Verify Pending methods*/

	public HasPendingRequestResponse verifyPending(Long coId) throws  Exception {
		logger.info("=> verifyPending coid = "+coId);
		APCHandlingSoapBindingStub binding = config.consumeAPCHandling();
		CoIdRequest request = new CoIdRequest(coId);
		HasPendingRequestResponse response = new HasPendingRequestResponse();
		try {
			response = binding.hasPendingRequest(request);
		}
		catch(com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			logger.error("Axis Fault : "+e.getFaultString());
			logger.error("UnexpectedErrorFault : "+e.getFaultstring());
			logger.error("<= verifyPending with error coid = "+coId);
			throw e;
		}
		catch (Exception e) {
			logger.error("<= verifyPending coid = "+coId);
			throw e;
		}
		logger.info("<= verifyPending coid = "+coId);

		return	response;
	}

	public Map<String, Object> sucessOutputVerifyPending(String waitFailure, Map<String, Object> resiliationMap,Boolean isPending,String taskName) {
		logger.info("=> sucessOutputVerifyPending");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("hasPending",isPending );
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName",taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputVerifyPending");

		return resultsMap;
	}

	public Map<String, Object> sucessOutputVerifyPendingTrue(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,Boolean isPending,String taskName) {
		logger.info("=> sucessOutputVerifyPendingTrue");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre",retryNbre+1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("hasPending",isPending );
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", false); //a verifier
		resultsMap.put("taskName",taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputVerifyPendingTrue");

		return resultsMap;
	}
	public Map<String, Object> failOutputVerifyPendingr(Integer retryNbre, String waitFailure,
			Map<String, Object> resiliationMap) {
		
		logger.info("=> failOutputVerifyPendingr");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("hasPending", false);
		resultsMap.put("Result", resiliationMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputVerifyPendingr");

		return resultsMap;
	}


	
	/* set resiliation order id */
	
	public Boolean setContractOrderID(Integer orderId,Integer coId,Logger logger,String taskName) throws Exception{
		logger.info("=> setContractOrderID");
		try {
			
			ResiliationManager binding = config.consumeResiliationManager();
			SetContractOrderIdRequest request = new SetContractOrderIdRequest();
			request.setContractOrderId(orderId);
			request.setCoId(coId+"");
			request.setTask(taskName);
			SetContractOrderIdResponse response = binding.setContractOrderIdForResiliation(request);
			if(response.isFinished()) {
				logger.info("Contract Order ID "+orderId+" for coId= "+coId+" is set successfully");
				logger.info("<= setContractOrderID");
				return true;
	
			}
			else{
				logger.info("Contract Order ID "+orderId+" for coId= "+coId+" failed to set");
				logger.info("<= setContractOrderID");
				return false;
			}
		}
		catch (Exception e) {
			logger.error("<=setContractOrderID with error");
			return false;
		}
				
	}

	public Map<String, Object> sucessOutputsetContractOrderID(String waitFailure, Map<String, Object> contractMap,
			int timer,String TypeRes,String taskName,String contractStatus) {
		
		logger.info("=> sucessOutputsetContractOrderID");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", true);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("DueDateTimer", timer + "s");
		resultsMap.put("TypeRes", TypeRes);
		resultsMap.put("taskName", taskName);
		resultsMap.put("contractStatus", contractStatus);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputsetContractOrderID");

		return resultsMap;
	}

	public Map<String, Object> failOutputSetContractOrderID(Integer retryNbre, String waitFailure,
			Map<String, Object> contractMap, int timer) {
		logger.info("=> failOutputSetContractOrderID");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", false);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("DueDateTimer", timer + "s");
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputSetContractOrderID");

		return resultsMap;
	}

	/*GPS*/
	
	public AddApcResponse addApc(Long processId, Long custId, Float faTotal,String waitGPS) throws Exception {
		logger.info("=> addApc");
		ApcWebServiceWebServicePortBindingStub bindingGps = config.consumeGpsWsdl();
		AddApcRequest addApcRequestRequest = new AddApcRequest();
		addApcRequestRequest.setProcessId(processId);
		addApcRequestRequest.setCustomerId(custId);
		   Float facc =  (float) (Math.round(faTotal * 1000.0)/1000.0) ;
			logger.info("facc "+facc);
		addApcRequestRequest.setMontantTTC(facc);
		addApcRequestRequest.setStatus(1);
		
		Calendar calendar=	Calendar.getInstance(); 
		
       
		String waitGPSseconds=waitGPS.split("s")[0];
		logger.info("seconds to wait in GPS  ="+waitGPSseconds );

			calendar.add(Calendar.SECOND, Integer. parseInt(waitGPSseconds));

		
	  


		logger.info("validDate for payment = "+calendar.getTime());
		addApcRequestRequest.setValidationDate(calendar);
		Calendar calendar2=	Calendar.getInstance(); 

		addApcRequestRequest.setUpdateDate(calendar2); // a verifier
		AuthenticationData authenticationData = new AuthenticationData(config.getPropValues("wsdlGpsUsername"), config.getPropValues("wsdlGpsPassword"));
		AddApcResponse addApcResponse = new AddApcResponse();	

		try {
			addApcResponse = bindingGps.addApcRequest(authenticationData, addApcRequestRequest);	
		} 
		catch (Exception e) {
			logger.error("<= addApc with error");
			throw e;
		}
		logger.info("<= addApc"); 
		return addApcResponse;
	}

	public Map<String, Object> sucessOutputAppelGps(String waitFailure,String taskName,Map<String, Object> resiliationMap) {
		logger.info("=> sucessOutputAppelGps");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		resultsMap.put("resiliationMap", resiliationMap);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputAppelGps");

		return resultsMap;
	}
	
	public Map<String, Object> failOutputAppelGps(Integer retryNbre, String waitFailure,Map<String, Object> resiliationMap) {
		logger.info("=> failOutputAppelGps");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", false);
		resultsMap.put("resiliationMap", resiliationMap);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputAppelGps");

		return resultsMap;
	}
	
    public GetStatusResiliationResponse getStatusResiliation(Long processId) {
		logger.info("=> getStatusResiliation");

		ApcWebServiceWebServicePortBindingStub bindingGps = config.consumeGpsWsdl();

		GetStatusResiliationRequest getStatusResiliationRequest = new GetStatusResiliationRequest();
		getStatusResiliationRequest.setProcessId(processId);
		AuthenticationData authenticationData = new AuthenticationData(config.getPropValues("wsdlGpsUsername"), config.getPropValues("wsdlGpsPassword"));
		GetStatusResiliationResponse getStatusResiliationResponse = new GetStatusResiliationResponse();
		try {
			getStatusResiliationResponse = bindingGps.getStatusResiliationRequest(authenticationData, getStatusResiliationRequest);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			logger.error("<= getStatusResiliation with error");
			logger.error("getStatusResiliationResponse : "+getStatusResiliationResponse.isIsSuccessful());

			e.printStackTrace();
		}
		logger.info("getStatusResiliationResponse : "+getStatusResiliationResponse.isIsSuccessful());
		logger.info("<= getStatusResiliationResponse");

		return getStatusResiliationResponse;
    }
    
	public Map<String, Object> sucessOutputGetStatusResiliation(String waitFailure,String taskName,Map<String, Object> resiliationMap,Boolean abord) {
		logger.info("=> sucessOutputGetStatusResiliation");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", 0);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("abord", abord);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputGetStatusResiliation");

		return resultsMap;
	}
	public Map<String, Object> failOutputGetStatusResiliation(Integer retryNbre, String waitFailure,Map<String, Object> resiliationMap,Boolean abord) {
		logger.info("=> failOutputGetStatusResiliation");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("retryNbre", retryNbre + 1);// retryNbre
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("success", false);
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("abord", abord);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputGetStatusResiliation");

		return resultsMap;
	}
	public Map<String, Object> sucessOutputSmsNotif(String waitFailure, Map<String, Object> resiliationMap,
			Map<String, Object> contractMap,String taskName) {
		logger.info("=> sucessOutputSmsNotif");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= sucessOutputSmsNotif");

		return resultsMap;
	}


	public Map<String, Object> failOutputSmsNotif(Integer retryNbre, String waitFailure,
			Map<String, Object> resiliationMap, Map<String, Object> contractMap) {
		logger.info("=> failOutputSmsNotif");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputSmsNotif");

		return resultsMap;
	}
	
	public GetBalanceAndDateBeanOutputV2 getBalanceAndDate(Map<String, Object> contractMap) throws Exception {
		logger.info("=> getBalanceAndDate");

		BalanceManagerV2 binding = config.consumeWsdlWsPortal();
		GetBalanceAndDateBeanInputV2 getBalanceAndDateBeanInputV2 = new GetBalanceAndDateBeanInputV2();
		SubscriberV2 subscriberV2 = new SubscriberV2();
		subscriberV2.setInternationNumberPhone(Long.parseLong(contractMap.get("msisdn").toString()));

		getBalanceAndDateBeanInputV2.setSubscriber(subscriberV2);
		getBalanceAndDateBeanInputV2.setTmCode(Integer.parseInt(contractMap.get("tmcode").toString()));
		GetBalanceAndDateBeanOutputV2 response = new GetBalanceAndDateBeanOutputV2();
		try {
			 response = binding.getBalanceAndDate(getBalanceAndDateBeanInputV2);
		} 
		catch (Exception e) {
			logger.error("<=getBalanceAndDate with error");
			throw e;
		}
		logger.info("<= getBalanceAndDate");

		return response;
	}
	
	public OperationResponse insertBalanceHist(Map<String, Object>contractMap,String balanceType,String unit,double remAmount,Long orderId) throws Exception {
		logger.info("=> insertBalanceHist");

		BalanceHistRequest insertBalanceHistRequest = new BalanceHistRequest("IN",Long.parseLong( contractMap.get("coId").toString() ),orderId, null,
				Long.parseLong(contractMap.get("tmcode").toString()), balanceType, unit,
				remAmount);	
		APCHandlingSoapBindingStub bindingBscsAPC = config.consumeAPCHandling();

		OperationResponse balanceInsertResponse = new OperationResponse();
		try {
		 balanceInsertResponse = bindingBscsAPC
					.insertBalanceHist(insertBalanceHistRequest);
		}
		catch (Exception e) {
			logger.error("<=insertBalanceHist with error");
			throw e;
		}
		logger.info("<= insertBalanceHist");
		return balanceInsertResponse;
         
	}
	
	public Map<String, Object> successOutputInserttBalancesIN( Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName,List<OptionV2> listOptions) {
		logger.info("=> successOutputInserttBalancesIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		resultsMap.put("listOptions", listOptions);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= successOutputInserttBalancesIN");

		return resultsMap;
	}
	
	public Map<String, Object> failOutputInsertBalancesIN(Map<String, Object> resiliationMap, Map<String, Object> contractMap,
			Integer retryNbre, String waitFailure,List<OptionV2> listOptions,Integer j) {
		logger.info("=> failOutputInsertBalancesIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", false);
		resultsMap.put("listOptions", listOptions);
		resultsMap.put("j", j);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputInsertBalancesIN");

		return resultsMap;
	}
	public Map<String, Object> successOutputGetBalancesIN( Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName,boolean insertBalance,List<OptionV2> listOptions) {
		logger.info("=> successOutputGetBalancesIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		resultsMap.put("insertBalance", insertBalance);
		resultsMap.put("listOptions", listOptions);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= successOutputGetBalancesIN");

		return resultsMap;
	}

	
	public Map<String, Object> failOutputGetBalancesIN(Map<String, Object> resiliationMap, Map<String, Object> contractMap,
			Integer retryNbre, String waitFailure) {
		logger.info("=> failOutputGetBalancesIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("contractMap", contractMap);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failOutputGetBalancesIN");

		return resultsMap;
	}
	
	
    public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceIn(Map<String, Object> resiliationMap, Map<String, Object> contractMap,Long cust_id,String offreValue) throws Exception {
		logger.info("=> adjustBalanceIn");

    	APCManager bindingPBICMS_APC = config.consumeWsdlPBICMS();
		AdjustBalanceRequest adjustBalanceRequest = new AdjustBalanceRequest();

		adjustBalanceRequest.setAmount(Long.parseLong(contractMap.get("mainBalanceAmount").toString()));
		if(contractMap.get("oldCoId") != null)
		{
			logger.info("oldCoId injected :"+ Long.parseLong(contractMap.get("oldCoId").toString()));

			adjustBalanceRequest.setCoId(Long.parseLong(contractMap.get("oldCoId").toString()));
		}
		else {
			logger.info("coId injected :"+ Long.parseLong(contractMap.get("coId").toString()));

			adjustBalanceRequest.setCoId(Long.parseLong(contractMap.get("coId").toString()));

		}
		adjustBalanceRequest.setCsId(cust_id);
		adjustBalanceRequest.setDesSource(contractMap.get("offer").toString());
		adjustBalanceRequest.setRpCodeSource(Long.parseLong(contractMap.get("tmcode").toString()));
		adjustBalanceRequest.setRpCodeCible(Long.parseLong(resiliationMap.get("tmcode").toString()));
		logger.info("ValueSource = "+offreValue);
		adjustBalanceRequest.setValueSource(offreValue);
		adjustBalanceRequest.setValueTarget("");
		adjustBalanceRequest.setMsisdn(contractMap.get("msisdn").toString());
		com.billcom.apc.ws.manager.AdjustBalanceResponse responseAsjustBalance = new com.billcom.apc.ws.manager.AdjustBalanceResponse();
		try {
			responseAsjustBalance = bindingPBICMS_APC.adjustBalanceIn(adjustBalanceRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("<=adjustBalanceIn with error");
            throw e;

		} 
		logger.info("<= adjustBalanceIn");

		
		return responseAsjustBalance;
     }
	
	public Map<String, Object> successAdjustBalanceIN( Map<String, Object> resiliationMap,String waitFailure,String taskName) {
		logger.info("=> successAdjustBalanceIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= successAdjustBalanceIN");

		return resultsMap;
	}

	public Map<String, Object> failAdjustBalanceIN(Map<String, Object> resiliationMap, Integer retryNbre, String waitFailure) {
		logger.info("=> failAdjustBalanceIN");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failAdjustBalanceIN");

		return resultsMap;
	}
	
	public Map<String, Object> successChangeBillcycle( Map<String, Object> resiliationMap,String waitFailure,String taskName) {
		logger.info("=> successChangeBillcycle");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", 0);
		resultsMap.put("success", true);
		resultsMap.put("taskName", taskName);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= successChangeBillcycle");

		return resultsMap;
	}
	
	public Map<String, Object> failChangeBillcycle(Map<String, Object> resiliationMap, Integer retryNbre, String waitFailure) {
		logger.info("=> failChangeBillcycle");

		Map<String, Object> resultsMap = new HashMap<String, Object>();
		resultsMap.put("resiliationMap", resiliationMap);
		resultsMap.put("waitFailure", waitFailure);// waitFailure
		resultsMap.put("retryNbre", retryNbre+1);
		resultsMap.put("success", false);
		for (Entry<String, Object> entry : resultsMap.entrySet()) {
			logger.info("[OUTPUT] " + entry.getKey() + " : " + entry.getValue());
		}
		logger.info("<= failChangeBillcycle");

		return resultsMap;
	}
  
	
	public UpdateStatusDemandeHistResponse updateStatus(Long custId) {
		logger.info("=> updadeStatus");

		ResiliationHandlingSoapBindingStub binding = config.consumeResiliationHandling();
		UpdateStatusDemandeHistRequest request = new UpdateStatusDemandeHistRequest();
		request.setCustomerId(custId);
		UpdateStatusDemandeHistResponse response = new UpdateStatusDemandeHistResponse();
		try {
			response = binding.updateStatusDemandeHist(request);
			
		} catch (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			logger.error("<= updadeStatus with error");

		} catch (RemoteException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			logger.error("<= updadeStatus with error" );

		}
		logger.info("<= updadeStatus");

		return response;
		
	}

 
	
	public GetOffreResponse getOffreSource(Long tmcode,Long coid) {
		APCHandlingSoapBindingStub bindingBscsAPC = config.consumeAPCHandling();
		GetOffreResponse response = new GetOffreResponse();

	
		try {
			GetOffreRequest  request = new GetOffreRequest();
			request.setCoId(coid);
			request.setRpCode(tmcode);
			response=bindingBscsAPC.getOffreSource(request);
		} catch (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
           return response;
	 }

	
}

