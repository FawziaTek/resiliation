package com.billcom.apc.generatedSOAP.bscs.contractWrite;

public class ContractWriteServiceProxy implements com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType contractWriteService_PortType = null;
  
  public ContractWriteServiceProxy() {
    _initContractWriteServiceProxy();
  }
  
  public ContractWriteServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractWriteServiceProxy();
  }
  
  private void _initContractWriteServiceProxy() {
    try {
      contractWriteService_PortType = (new com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_ServiceLocator()).getContractWriteService();
      if (contractWriteService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractWriteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractWriteService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractWriteService_PortType != null)
      ((javax.xml.rpc.Stub)contractWriteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType getContractWriteService_PortType() {
    if (contractWriteService_PortType == null)
      _initContractWriteServiceProxy();
    return contractWriteService_PortType;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteBeanOut execute(com.billcom.apc.generatedSOAP.bscs.contractWrite.In0 in0) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractWrite.UnexpectedErrorFault{
    if (contractWriteService_PortType == null)
      _initContractWriteServiceProxy();
    return contractWriteService_PortType.execute(in0);
  }
  
  
}