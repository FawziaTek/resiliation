package com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead;

public class ContractServiceParametersReadServiceProxy implements com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadService_PortType {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadService_PortType contractServiceParametersReadService_PortType = null;
  
  public ContractServiceParametersReadServiceProxy() {
    _initContractServiceParametersReadServiceProxy();
  }
  
  public ContractServiceParametersReadServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractServiceParametersReadServiceProxy();
  }
  
  private void _initContractServiceParametersReadServiceProxy() {
    try {
      contractServiceParametersReadService_PortType = (new com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadService_ServiceLocator()).getContractServiceParametersReadService();
      if (contractServiceParametersReadService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractServiceParametersReadService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractServiceParametersReadService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractServiceParametersReadService_PortType != null)
      ((javax.xml.rpc.Stub)contractServiceParametersReadService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadService_PortType getContractServiceParametersReadService_PortType() {
    if (contractServiceParametersReadService_PortType == null)
      _initContractServiceParametersReadServiceProxy();
    return contractServiceParametersReadService_PortType;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadBeanOut execute(com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.In0 in0) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.UnexpectedErrorFault{
    if (contractServiceParametersReadService_PortType == null)
      _initContractServiceParametersReadServiceProxy();
    return contractServiceParametersReadService_PortType.execute(in0);
  }
  
  
}