package com.billcom.ws;

public class ResiliationWsProxy implements com.billcom.ws.ResiliationWs {
  private String _endpoint = null;
  private com.billcom.ws.ResiliationWs resiliationWs = null;
  
  public ResiliationWsProxy() {
    _initResiliationWsProxy();
  }
  
  public ResiliationWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initResiliationWsProxy();
  }
  
  private void _initResiliationWsProxy() {
    try {
      resiliationWs = (new com.billcom.ws.JbpmOrderResiliationWsLocator()).getResiliationWsPort();
      if (resiliationWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)resiliationWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)resiliationWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (resiliationWs != null)
      ((javax.xml.rpc.Stub)resiliationWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.ws.ResiliationWs getResiliationWs() {
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs;
  }
  
  public com.billcom.ws.ResiliationOperationResponse skipPaymentTimer(long processID) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.skipPaymentTimer(processID);
  }
  
  public com.billcom.ws.ResiliationOperationResponse abordResSignal(long processID) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.abordResSignal(processID);
  }
  
  public com.billcom.ws.OrderResiliationHumainTasksResponse orderResiliationHumainTasks(java.lang.String userGroup, java.lang.String taskStatus) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.orderResiliationHumainTasks(userGroup, taskStatus);
  }
  
  public com.billcom.ws.ResiliationOperationResponse executeResiliationHumainTask(long processID, com.billcom.ws.ExecuteResiliationHumainTaskParametersEntry[] parameters, int humaintaskID, java.lang.String username, java.lang.String password, java.lang.String group) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.executeResiliationHumainTask(processID, parameters, humaintaskID, username, password, group);
  }
  
  public com.billcom.ws.ResiliationOperationResponse abordResiliation(long processID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.abordResiliation(processID, username, password);
  }
  
  public com.billcom.ws.ResiliationOperationResponse startResiliationOrder(com.billcom.ws.ContractBeanResiliation[] contractBeans, java.lang.String caseCRM, java.lang.String user_id, java.lang.String canal, java.lang.String dueDate, java.lang.String typeRes, boolean resDevice, java.lang.String motif, boolean contestClient, float FA, com.billcom.ws.AccFeesBean[] detailsFA, int custId, java.lang.Integer prgCode, java.lang.Integer tmCode, java.lang.String shdes, boolean resiliationTotal, java.lang.String custCode, java.lang.String motifClient) throws java.rmi.RemoteException, com.billcom.ws.Exception{
    if (resiliationWs == null)
      _initResiliationWsProxy();
    return resiliationWs.startResiliationOrder(contractBeans, caseCRM, user_id, canal, dueDate, typeRes, resDevice, motif, contestClient, FA, detailsFA, custId, prgCode, tmCode, shdes, resiliationTotal, custCode, motifClient);
  }
  
  
}