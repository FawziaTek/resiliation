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
import com.billcom.apc.generatedSOAP.BalanceManagerV2.OptionV2;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse;
import com.billcom.apc.resiliation.model.ContractBalance;
import com.billcom.apc.resiliation.service.ResiliationService;
import com.billcom.apc.resiliation.service.ResiliationServiceImp;
import com.billcom.autorecycle.AutoRecycle;


public class InsertBalanceINWorkItemHandler implements WorkItemHandler {

	private Logger logger = Logger.getLogger(InsertBalanceINWorkItemHandler.class);
	private ResiliationService resiliationService = new ResiliationServiceImp();
	
	
	
	
	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		// TODO Auto-generated method stub
		logger.info("=> InsertBalanceINWorkItemHandler in: " + wi.getProcessInstanceId());

		Map<String, Object> resiliationMap = new HashMap<String, Object>();
		Map<String, Object> contractMap = new HashMap<String, Object>();
		List<OptionV2> listOptions =new ArrayList<OptionV2>();
		

		logger.info("Resiliation in progress...Insert Balances IN");


		String waitFailure = "0s";
		Integer retryNbre = null;
		AutoRecycle autoRecycle = new AutoRecycle();
		String balanceType;
		Integer i=0;
		Integer j=0;
		try {
			resiliationMap = (Map<String, Object>) wi.getParameter("resiliationMap");
			contractMap = (Map<String, Object>) wi.getParameter("contractMap");
			logger.info("Resiliation order id : " + resiliationMap.get("resiliationOrderId") );
			logger.info("ContractResiliation id : "+contractMap.get("contractResiliationOrderId"));
			resiliationService.printWorkItem(logger,wi);
			 listOptions =  (List<OptionV2>) wi.getParameter("listOptions");
			Integer j_wf = (Integer) wi.getParameter("j");
			logger.info("j_wf"+j_wf);
		
			if(j_wf !=null)
	         j=j_wf;

			//retryNbre
			retryNbre = resiliationService.getRetryNumber((Integer) wi.getParameter("retryNbre"));	 
			
			// waitfailure
			waitFailure = autoRecycle.palierwaittime(waitFailure, retryNbre);
			logger.debug("waitFailure from config = " + waitFailure);
			
            String taskName=resiliationService.getConfig().getPropValues("getBalanceResINWIH");  
             
			ArrayList<ContractBalance> iNbalances = new ArrayList<ContractBalance>();
		
			logger.info("listOptions size : " + listOptions.size());
			List<OptionV2> listOptionsClone = new ArrayList<OptionV2>();
			for (OptionV2 inBalance : listOptions) {
				logger.info("=> for 1 in " );

				logger.info("Option name : " + inBalance.getOptionName());
				if (inBalance.getOptionName().equalsIgnoreCase("MAIN_BALANCE"))
					balanceType = "MA";
				else if (inBalance.getOptionName().equalsIgnoreCase("UCIP_DA_17"))
					balanceType = "DA";
				else
					balanceType = "OTHER";
				logger.info("balance Type : " + balanceType);

				logger.info("inBalance.getBalances().getItem().size() " + inBalance.getBalances().getItem().size());

				if (null != inBalance.getBalances() && !inBalance.getBalances().getItem().isEmpty()) {
                      List<BalanceV2> balancesClone = new ArrayList<BalanceV2>();
                      List<BalanceV2> balances = inBalance.getBalances().getItem();

					for (BalanceV2 balance :balances ) {
						logger.info("=> for 2 in " );

						ContractBalance contractBalance = new ContractBalance();
						contractBalance.setCanal("IN");
						contractBalance.setCO_ID(((Long) contractMap.get("coId")).intValue());
						contractBalance.setTMCODE(((Long) contractMap.get("tmcode")).intValue());
						if (balance.getEndDate() != null)
							contractBalance.setDateEnd(balance.getEndDate().toString());
						if (balance.getExpirationDate() != null)
							contractBalance.setDateExpiration(balance.getExpirationDate().toString());
						if (balance.getStartDate() != null)
							contractBalance.setDateStart(balance.getStartDate().toString());
						if (balance.getRemainingAmount() != null)
							contractBalance.setVALUE(balance.getRemainingAmount().toString());
						if (balance.getUnit() != null)
							contractBalance.setUNIT(balance.getUnit());

						logger.info("restant: " + balance.getRemainingAmount());
						logger.info("unité: " + balance.getUnit());
						logger.info("start date: " + balance.getStartDate());
						logger.info("end date: " + balance.getEndDate());
						logger.info("expery date: " + balance.getExpirationDate());
						logger.info("description: " + balance.getDescription());

						// var
						Double remAmount = (double) 0;
						String unit ; // OTHER for null
						if (balance.getRemainingAmount() != null) {
							remAmount = balance.getRemainingAmount().doubleValue();
						}
						if (balance.getUnit() != null && !balance.getUnit().equals(""))
							unit = balance.getUnit();
						else
							unit = "OTHER";

						Long orderId = (Long) resiliationMap.get("resiliationOrderId");
						OperationResponse response=	resiliationService.insertBalanceHist(contractMap,balanceType,unit,remAmount,orderId);
						 if(!response.getIsSuccessful()) {
								logger.info("wsdl call insertBalanceHist is  "+ response.getIsSuccessful());
								logger.info("ErrorCode insertBalanceHist is  "+ response.getBscsErrorCode());
								logger.info("Comment insertBalanceHist is  "+ response.getComment());
								logger.info("<= insertBalanceHist out: "+wi.getProcessInstanceId());
								logger.info("=> j "+j);

								wim.completeWorkItem(wi.getId(), resiliationService.failOutputInsertBalancesIN(resiliationMap,contractMap, retryNbre, waitFailure,listOptions,j));

						 }
						iNbalances.add(contractBalance);
						//inBalance.getBalances().getItem().remove(j);
						balancesClone.remove(balance);
						j++;
					}
					balances=balancesClone;


					resiliationMap.put("INbalances",iNbalances);
				}
				// listOptions.remove(i);
				 listOptionsClone.remove(inBalance);
                  i++;
			}
			listOptions=listOptionsClone;
			wim.completeWorkItem(wi.getId(), resiliationService.successOutputInserttBalancesIN(resiliationMap,contractMap, waitFailure,taskName,listOptions));

		}
			 catch (Exception e) {
					//ko 
					logger.error("",e);
					logger.info("=> j "+j);

					logger.error("<= InsertBalanceINWorkItemHandler out with error "+wi.getProcessInstanceId());
					wim.completeWorkItem(wi.getId(), resiliationService.failOutputInsertBalancesIN(resiliationMap,contractMap, retryNbre, waitFailure,listOptions,j));
				}

		
		
		
	}
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
	}


}
