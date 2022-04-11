package com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation;

public class JbpmOrderResiliationProxy implements com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType jbpmOrderResiliation_PortType = null;
  
  public JbpmOrderResiliationProxy() {
    _initJbpmOrderResiliationProxy();
  }
  
  public JbpmOrderResiliationProxy(String endpoint) {
    _endpoint = endpoint;
    _initJbpmOrderResiliationProxy();
  }
  
  private void _initJbpmOrderResiliationProxy() {
    try {
      jbpmOrderResiliation_PortType = (new com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_ServiceLocator()).getjbpmOrderResiliationPort();
      if (jbpmOrderResiliation_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jbpmOrderResiliation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jbpmOrderResiliation_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jbpmOrderResiliation_PortType != null)
      ((javax.xml.rpc.Stub)jbpmOrderResiliation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType getJbpmOrderResiliation_PortType() {
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType;
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse skipPaymentTimer(long processID) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.skipPaymentTimer(processID);
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationHumainTaskBean[] orderResiliationHumainTasks(java.lang.String userGroup, java.lang.String taskStatus) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.orderResiliationHumainTasks(userGroup, taskStatus);
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse startResiliationOrder(java.lang.String[] msisdns, long[] coids, java.lang.String[] coCodes, java.lang.String caseCRM, java.lang.String user_id, java.lang.String canal, java.lang.String dueDate, java.lang.String typeRes, boolean resDevice, java.lang.String motif, boolean contestClient, float FA, com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.AccFeesBean[] detailsFA, int custId, java.lang.Integer prgCode, java.lang.Integer tmCode, java.lang.String shdes, boolean resiliationTotal) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.startResiliationOrder(msisdns, coids, coCodes, caseCRM, user_id, canal, dueDate, typeRes, resDevice, motif, contestClient, FA, detailsFA, custId, prgCode, tmCode, shdes, resiliationTotal);
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse executeResiliationHumainTask(long processID, com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.ExecuteResiliationHumainTaskParametersEntry[] parameters, int humaintaskID, java.lang.String username, java.lang.String password, java.lang.String group) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.executeResiliationHumainTask(processID, parameters, humaintaskID, username, password, group);
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse abordResiliation(long processID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.abordResiliation(processID, username, password);
  }
  
  public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse abordResSignal(long processID) throws java.rmi.RemoteException{
    if (jbpmOrderResiliation_PortType == null)
      _initJbpmOrderResiliationProxy();
    return jbpmOrderResiliation_PortType.abordResSignal(processID);
  }
  
  
}