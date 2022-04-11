package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class ResiliationHandlingProxy implements com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling resiliationHandling = null;
  
  public ResiliationHandlingProxy() {
    _initResiliationHandlingProxy();
  }
  
  public ResiliationHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initResiliationHandlingProxy();
  }
  
  private void _initResiliationHandlingProxy() {
    try {
      resiliationHandling = (new com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingServiceLocator()).getResiliationHandling();
      if (resiliationHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)resiliationHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)resiliationHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (resiliationHandling != null)
      ((javax.xml.rpc.Stub)resiliationHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling getResiliationHandling() {
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse getMontantFacture(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureRequest getMontantFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.getMontantFacture(getMontantFactureRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse changeRateplanforResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationRequest changeRatePlanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.changeRateplanforResiliation(changeRatePlanRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse getcalculatedFaccTotale(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleRequest getcalculatedFaccTotaleRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.getcalculatedFaccTotale(getcalculatedFaccTotaleRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse getCustomerOfferAndStatistique(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueRequest getCustomerOffreRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.getCustomerOfferAndStatistique(getCustomerOffreRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse createContractForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResRequest createContractResRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.createContractForResiliation(createContractResRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse getContractsListForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsRequest getListContractsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.getContractsListForResiliation(getListContractsRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse insertScheduledJob(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobRequest insertScheduledRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.insertScheduledJob(insertScheduledRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse getCustomerRequestDetails(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsRequest getCustomerRequestDetailsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.getCustomerRequestDetails(getCustomerRequestDetailsRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse updateStatusDemandeHist(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistRequest updateStatusDemandeHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.updateStatusDemandeHist(updateStatusDemandeHistRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse calculateAccelerationForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.calculateAccelerationForResiliation(calculateAccelerationRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse setOcc(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccRequest setOccRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.setOcc(setOccRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse addFaccRequest(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccRequest addFacc) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault{
    if (resiliationHandling == null)
      _initResiliationHandlingProxy();
    return resiliationHandling.addFaccRequest(addFacc);
  }
  
  
}