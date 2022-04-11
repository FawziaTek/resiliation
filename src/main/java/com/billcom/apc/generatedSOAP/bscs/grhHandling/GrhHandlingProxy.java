package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class GrhHandlingProxy implements com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandling {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandling grhHandling = null;
  
  public GrhHandlingProxy() {
    _initGrhHandlingProxy();
  }
  
  public GrhHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initGrhHandlingProxy();
  }
  
  private void _initGrhHandlingProxy() {
    try {
      grhHandling = (new com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandlingServiceLocator()).getGrhHandling();
      if (grhHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)grhHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)grhHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (grhHandling != null)
      ((javax.xml.rpc.Stub)grhHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandling getGrhHandling() {
    if (grhHandling == null)
      _initGrhHandlingProxy();
    return grhHandling;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse getPendingGrhRequests(com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsRequest getPendingGrhRequestsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault{
    if (grhHandling == null)
      _initGrhHandlingProxy();
    return grhHandling.getPendingGrhRequests(getPendingGrhRequestsRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse takeNewGrhRequestIntoAccount(com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountRequest takeNewGrhRequestIntoAccountRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault{
    if (grhHandling == null)
      _initGrhHandlingProxy();
    return grhHandling.takeNewGrhRequestIntoAccount(takeNewGrhRequestIntoAccountRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse addGrhRequest(com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest addGrhRequestRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault{
    if (grhHandling == null)
      _initGrhHandlingProxy();
    return grhHandling.addGrhRequest(addGrhRequestRequest);
  }
  
  
}