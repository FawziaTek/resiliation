package com.billcom.apc.resiliation.service;

import java.io.IOException;      
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;

import com.billcom.apc.generatedSOAP.BalanceManagerV2.GetBalanceAndDateBeanOutputV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.OptionV2;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.PercistResiliationOrderResponse;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationBean;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.UpdateResiliationOrderResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteBeanOut;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse;
import com.billcom.apc.generatedSOAP.gps.AddApcResponse;
import com.billcom.apc.generatedSOAP.gps.GetStatusResiliationResponse;
import com.billcom.apc.resiliation.utils.ResiliationConfigHandler;
import com.billcom.apc.ws.manager.AdjustBalanceResponse;
 
/**
 * @author Bechir
 */


public interface ResiliationService {
	
	public ResiliationConfigHandler getConfig();
	public Integer getRetryNumber(Integer inputRetryNumber) throws IOException;
	public void printWorkItem(Logger logger,WorkItem wi);//print all inputs of workItem

	
	//setOCc
	public SetOccResponse setOCC(Float faTotal, Long custid,ContractOccBean[] coIdList) throws  Exception ;
	public Map<String, Object> sucessOutputSetOcc(Map<String, Object> resiliationMap,String waitFailure,String taskName);
	public Map<String, Object> failOutputSetOcc(Map<String, Object> resiliationMap,String waitFailure,Integer retryNbre);
	
	//GetCalculatedFaccTotale
	public GetCalculatedFaccTotaleResponse getCalculatedFaccTotale(Long custID,Date dueDate,String caseCrm,String motif,String motifClient) throws   Exception;
	public Map<String, Object> sucessOutputgetFAtotal(Map<String, Object> resiliationMap,Float faTotal,String waitFailure,Boolean encours,String taskName);
	public Map<String, Object> failOutputgetFAtotal(Map<String, Object> resiliationMap,Float faTotal,Integer retryNbre,String waitFailure);
	
	//changeRatePlan
	public ChangeRatePlanResiliationResponse changeRatePlanResiliation(Long coId,Long tmcode) throws  Exception ;
	public Map<String, Object> sucessOutputChangeRatePlan(Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName);
	public Map<String, Object> failOutputChangeRatePlan(Map<String, Object> resiliationMap,Map<String, Object> contractMap,Integer retryNbre,String waitFailure);
	
	//CreerContrat
	public CreateContractResResponse createContract(Long coId,Long rpCode) throws   Exception ;
	public Map<String, Object> sucessOutputCreateContract(Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName);
	public Map<String, Object> failOutputCreateContract(Map<String, Object> resiliationMap,Map<String, Object> contractMap,Integer retryNbre,String waitFailure);
	

	//DeactivateContract
	//public OperationResponse deactivateContract(Long coId) throws   Exception ;
	public Map<String, Object> sucessOutputDeactivateContract(Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName);
	public Map<String, Object> failOutputDeactivateContract(Map<String, Object> resiliationMap,Integer retryNbre,String waitFailure);
	public OperationResponse deactivateContract(Long coId) throws   Exception ;

	//GetMigrationGroup	
	public GetCategoryResponse getMigrationGroup(Long coId,Long rpCode) throws  Exception ;
	public Map<String, Object> sucessOutputGetMigrationGroup(String waitFailure,Boolean isSameGroup,String taskName);
	public Map<String, Object> failOutputGetMigrationGroup(Boolean isSameGroup,Integer retryNbre, String waitFailure);
	
	//ModifierDFE (GRH)
	public AddGrhRequestResponse addGrh(Logger logger,Map<String, Object> resiliationMap,Map<String, Object> contractMap,String dueDate) throws   Exception ;
	public Map<String, Object> sucessOutputModifierDFE(String waitFailure,Map<String, Object> resiliationMap,Map<String, Object> contractMap,String taskName);
	public Map<String, Object> failOutputModifierDFE(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,Map<String, Object> contractMap);

	//PercistResiliationOrder
	public PercistResiliationOrderResponse percistResiliationOrder(List<ResiliationBean>  resiliation) throws Exception ;
	public Map<String, Object> sucessOutputPercistResiliationOrder(String waitFailure, Map<String, Object> resiliationMap);
	public Map<String, Object> failOutputPercistResiliationOrder(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap);
	
	//PrepareMigrationForPre
	public Map<String, Object> sucessOutputPrepareMigrationForPre(String waitFailure, Map<String, Object> resiliationMap,String taskName);
	public Map<String, Object> failOutputPrepareMigrationForPre(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap);
	
	//prepareResiliation
	public GetListContractsResponse getListContracts(Long custId)throws  Exception;
	public Map<String, Object> sucessOutputPrepareResiliation(String waitFailure, Map<String, Object> resiliationMap,String retriesConfigNbre,String waitPayment,Boolean resiliationTotal, List<Map<String, Object>> contractMaps,String taskName,String waitGPS) ;
	public Map<String, Object> failOutputPrepareResiliation(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,String retriesConfigNbre,String waitPayment,Boolean resiliationTotal, List<Map<String, Object>> contractMaps,String waitGPS);
	public GetCalculatedFaccTotaleResponse getCalculatedFaccByContract(Long custId, Long coId, Date duDate) throws Exception;

	//suspendContract
	//public ContractWriteBeanOut suspendContract(Long coId) throws   Exception;
	public Map<String, Object> sucessOutputSuspendContract(Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName);
	public Map<String, Object> failOutputSuspendContract(Map<String, Object> resiliationMap,Map<String, Object> contractMap,Integer retryNbre,String waitFailure);
	
	//updateResiliationOrder
	public UpdateResiliationOrderResponse updateResiliationOrder(ResiliationBean resiliation) throws Exception ;
	public Map<String, Object> sucessOutputUpdateResiliationOrder(String waitFailure, Map<String, Object> resiliationMap, Map<String, Object> contractMap);
	public Map<String, Object> failOutputUpdateResiliationOrder(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap, Map<String, Object> contractMap);
	public UpdateResiliationOrderResponse updateOrder(ResiliationBean resiliation) throws Exception  ;

	//verifyPending
	public HasPendingRequestResponse verifyPending(Long coId) throws  Exception ;
	public Map<String, Object> sucessOutputVerifyPending(String waitFailure, Map<String, Object> resiliationMap,Boolean isPending,String taskName);
	public Map<String, Object> failOutputVerifyPendingr(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap);
	public Map<String, Object> sucessOutputVerifyPendingTrue(Integer retryNbre,String waitFailure, Map<String, Object> resiliationMap,Boolean isPending,String taskName);

	
	//setContractOrderID 
	public Boolean setContractOrderID(Integer orderId,Integer coId,Logger logger,String taskName) throws Exception;
	public Map<String, Object> sucessOutputsetContractOrderID (String waitFailure,Map<String, Object> contractMap,int timer,String TypeRes,String taskName,String contractStatus);
	public Map<String, Object> failOutputSetContractOrderID (Integer retryNbre,String waitFailure, Map<String, Object> contractMap,int timer);

	//Appelgps
	public AddApcResponse addApc(Long processId,Long custId,Float faTotal,String waitGPS) throws Exception;
	public Map<String, Object> sucessOutputAppelGps(String waitFailure,String taskName,Map<String, Object> resiliationMap);
	public Map<String, Object> failOutputAppelGps(Integer retryNbre,String waitFailure,Map<String, Object> resiliationMap);
    public GetStatusResiliationResponse getStatusResiliation(Long processId) throws Exception;
	public Map<String, Object> sucessOutputGetStatusResiliation(String waitFailure,String taskName,Map<String, Object> resiliationMap,Boolean abord) ;
	public Map<String, Object> failOutputGetStatusResiliation(Integer retryNbre, String waitFailure,Map<String, Object> resiliationMap ,Boolean abord);

	//SmsNotif
	public Map<String, Object> sucessOutputSmsNotif(String waitFailure,Map<String, Object> resiliationMap,Map<String, Object> contractMap ,String taskName);
	public Map<String, Object> failOutputSmsNotif(Integer retryNbre,String waitFailure,Map<String, Object> resiliationMap,Map<String, Object> contractMap);
	
	
	//getBalanceIN
	public GetBalanceAndDateBeanOutputV2 getBalanceAndDate(Map<String, Object> contractMap) throws Exception;
	public Map<String, Object> successOutputGetBalancesIN( Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName,boolean insertBalance,List<OptionV2> listOptions);
	public Map<String, Object> failOutputGetBalancesIN(Map<String, Object> resiliationMap, Map<String, Object> contractMap,Integer retryNbre, String waitFailure);
	
	
	//insertBalanceIN
	public OperationResponse insertBalanceHist(Map<String, Object>contractMap,String balanceType,String unit,double remAmount,Long orderId) throws Exception;
	public Map<String, Object> successOutputInserttBalancesIN( Map<String, Object> resiliationMap,Map<String, Object> contractMap,String waitFailure,String taskName,List<OptionV2> listOptions) ;
	public Map<String, Object> failOutputInsertBalancesIN(Map<String, Object> resiliationMap, Map<String, Object> contractMap,Integer retryNbre, String waitFailure,List<OptionV2> listOptions,Integer j);

	
	//adjustBalanceIN
	 public AdjustBalanceResponse adjustBalanceIn(Map<String, Object> resiliationMap, Map<String, Object> contractMap,Long cust_id,String offreValue) throws Exception;
	public Map<String, Object> successAdjustBalanceIN( Map<String, Object> resiliationMap,String waitFailure,String taskName);
	public Map<String, Object> failAdjustBalanceIN(Map<String, Object> resiliationMap, Integer retryNbre, String waitFailure);
	public GetOffreResponse getOffreSource(Long tmcode,Long coid);
	
	//ChangeBillcycle
	public Map<String, Object> successChangeBillcycle( Map<String, Object> resiliationMap,String waitFailure,String taskName);
	public Map<String, Object> failChangeBillcycle(Map<String, Object> resiliationMap, Integer retryNbre, String waitFailure);
	
	//insertSheduled
	public InsertScheduledJobResponse insertSheduled(Long coId,Long csId,Calendar dueDate,Long jobTypeId,String remarque) throws Exception ;
  
	//UpdateStatusDemandeHist
	public UpdateStatusDemandeHistResponse updateStatus(Long custId) ;
}
