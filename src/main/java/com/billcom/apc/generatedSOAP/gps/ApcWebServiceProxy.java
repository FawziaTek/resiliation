package com.billcom.apc.generatedSOAP.gps;

public class ApcWebServiceProxy implements com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType apcWebService_PortType = null;
  
  public ApcWebServiceProxy() {
    _initApcWebServiceProxy();
  }
  
  public ApcWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initApcWebServiceProxy();
  }
  
  private void _initApcWebServiceProxy() {
    try {
      apcWebService_PortType = (new com.billcom.apc.generatedSOAP.gps.ApcWebService_ServiceLocator()).getApcWebServiceWebServicePort();
      if (apcWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)apcWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)apcWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (apcWebService_PortType != null)
      ((javax.xml.rpc.Stub)apcWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType getApcWebService_PortType() {
    if (apcWebService_PortType == null)
      _initApcWebServiceProxy();
    return apcWebService_PortType;
  }
  
  public com.billcom.apc.generatedSOAP.gps.AddApcResponse addApcRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.AddApcRequest addApcRequest) throws java.rmi.RemoteException{
    if (apcWebService_PortType == null)
      _initApcWebServiceProxy();
    return apcWebService_PortType.addApcRequest(authenticationData, addApcRequest);
  }
  
  public com.billcom.apc.generatedSOAP.gps.GetStatusResiliationResponse getStatusResiliationRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.GetStatusResiliationRequest getStatusResiliationRequest) throws java.rmi.RemoteException{
    if (apcWebService_PortType == null)
      _initApcWebServiceProxy();
    return apcWebService_PortType.getStatusResiliationRequest(authenticationData, getStatusResiliationRequest);
  }
  
  public com.billcom.apc.generatedSOAP.gps.UpdateApcResponse updateApcRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.UpdateApcRequest updateApcRequest) throws java.rmi.RemoteException{
    if (apcWebService_PortType == null)
      _initApcWebServiceProxy();
    return apcWebService_PortType.updateApcRequest(authenticationData, updateApcRequest);
  }
  
  
}