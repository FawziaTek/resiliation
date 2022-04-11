package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ContractServicesReadServiceProxy implements com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType contractServicesReadService_PortType = null;
  
  public ContractServicesReadServiceProxy() {
    _initContractServicesReadServiceProxy();
  }
  
  public ContractServicesReadServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractServicesReadServiceProxy();
  }
  
  private void _initContractServicesReadServiceProxy() {
    try {
      contractServicesReadService_PortType = (new com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_ServiceLocator()).getContractServicesReadService();
      if (contractServicesReadService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractServicesReadService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractServicesReadService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractServicesReadService_PortType != null)
      ((javax.xml.rpc.Stub)contractServicesReadService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType getContractServicesReadService_PortType() {
    if (contractServicesReadService_PortType == null)
      _initContractServicesReadServiceProxy();
    return contractServicesReadService_PortType;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadBeanOut execute(com.billcom.apc.generatedSOAP.bscs.contractServicesRead.In0 in0) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractServicesRead.UnexpectedErrorFault{
    if (contractServicesReadService_PortType == null)
      _initContractServicesReadServiceProxy();
    return contractServicesReadService_PortType.execute(in0);
  }
  
  
}