package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class ContractHandlingProxy implements com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling contractHandling = null;
  
  public ContractHandlingProxy() {
    _initContractHandlingProxy();
  }
  
  public ContractHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractHandlingProxy();
  }
  
  private void _initContractHandlingProxy() {
    try {
      contractHandling = (new com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingServiceLocator()).getContractHandling();
      if (contractHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractHandling != null)
      ((javax.xml.rpc.Stub)contractHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling getContractHandling() {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse changeRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.ChangeRateplanRequest changeRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.changeRateplan(changeRateplanRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse checkRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.checkRateplan(checkRateplanRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse getContractDetails(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contractReference) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getContractDetails(contractReference);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse getDetailedInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileRequest getDetailedInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetailedInvoiceFile(getDetailedInvoiceFileRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse getConsoDataHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest consoDataHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getConsoDataHistory(consoDataHistoryRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse getDetInvoicesByInv(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvRequest detInvoicesByInvRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetInvoicesByInv(detInvoicesByInvRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse getDetailedInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesRequest getDetailedInvoicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetailedInvoices(getDetailedInvoicesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse deactivateService(com.billcom.apc.generatedSOAP.bscs.contractHandling.DeactivateServiceRequest request) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.deactivateService(request);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse getCreditRechargeHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest rechargeHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getCreditRechargeHistory(rechargeHistoryRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse retrieveServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesRequest retrieveServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.retrieveServices(retrieveServicesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse moveContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.MoveContractRequest moveContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.moveContract(moveContractRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse getInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesRequest invoicesReq) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInvoices(invoicesReq);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse getCallsHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest callHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getCallsHistory(callHistoryRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse updateContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.UpdateContractRequest updateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.updateContract(updateContractRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse getInfoConso(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoRequest infoConsoRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInfoConso(infoConsoRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse getInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileRequest getInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInvoiceFile(getInvoiceFileRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse takeOver(com.billcom.apc.generatedSOAP.bscs.contractHandling.TakeOverRequest takeOverRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.takeOver(takeOverRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse getContractList(com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault{
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getContractList(customer);
  }
  
  
}