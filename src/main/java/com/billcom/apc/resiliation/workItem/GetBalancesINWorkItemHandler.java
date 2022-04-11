package com.billcom.apc.resiliation.workItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.billcom.apc.generatedSOAP.BalanceManagerV2.BalanceV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.GetBalanceAndDateBeanOutputV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.OptionV2;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.resiliation.model.ContractBalance;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;


/**
 * @author fethi
 */


public class GetBalancesINWorkItemHandler implements WorkItemHandler{

	private Logger logger = Logger.getLogger(GetBalancesINWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();
	
	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		logger.info("=> GetBalancesINWorkItemHandler in: "+wi.getProcessInstanceId());
		
		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		
		logger.info("Resiliation in progress...Get Balances IN");
		
		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
        boolean insertBalance;

		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId") );
			logger.info("ContractResiliation id : "+contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);

			//retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));	 
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("getBalanceResINWIH");

			GetBalanceAndDateBeanOutputV2 response = resiliationService.getBalanceAndDate(contractMap);

			if (response.getOperationResponse().isIsSuccessful()) {
				
				
				
				if (null != response.getAmountMainBalance() && response.getAmountMainBalance() >= 0) { // was >0 only
					contractMap.put("mainBalanceAmount",response.getAmountMainBalance());
					logger.info("Main Balance value = "+ contractMap.get("mainBalanceAmount"));
				}
				if (null != response.getOptions() && !response.getOptions().getItem().isEmpty()) {
					insertBalance=true;
					List<OptionV2> listOptions = response.getOptions().getItem();
					logger.info("<= GetBalancesINWorkItemHandler out: "+wi.getProcessInstanceId());
					wim.completeWorkItem(wi.getId(), resiliationService.successOutputGetBalancesIN(resiliationMap,contractMap, waitFailure,taskName,insertBalance,listOptions));
				} else {
					insertBalance=false;

					logger.info(" No IN balances to get ");
					logger.info("<= GetBalancesINWorkItemHandler out: "+wi.getProcessInstanceId());

					wim.completeWorkItem(wi.getId(), resiliationService.successOutputGetBalancesIN(resiliationMap,contractMap, waitFailure,taskName,insertBalance,null));
				}
			} else {
				logger.info("wsdl call getBalanceAndDate is  "+ response.getOperationResponse().isIsSuccessful());
				logger.info("ErrorCode getBalanceAndDate is  "+ response.getOperationResponse().getErrorCode());
				logger.info("Comment getBalanceAndDate is  "+ response.getOperationResponse().getComment());
				logger.info("<= GetBalancesINWorkItemHandler out: "+wi.getProcessInstanceId());
				wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetBalancesIN(resiliationMap,contractMap, retryNbre, waitFailure));
			}
			
			
		} catch (Exception e) {
			//ko 
			logger.error("",e);
			logger.info("<= GetBalancesINWorkItemHandler out: "+wi.getProcessInstanceId());
			wim.completeWorkItem(wi.getId(), resiliationService.failOutputGetBalancesIN(resiliationMap,contractMap, retryNbre, waitFailure));
		}


		
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		//  Auto-generated method stub
		
	}

}
