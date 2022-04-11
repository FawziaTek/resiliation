/**
 * ResiliationWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.ws;

public interface ResiliationWs extends java.rmi.Remote {
    public com.billcom.ws.ResiliationOperationResponse skipPaymentTimer(long processID) throws java.rmi.RemoteException, com.billcom.ws.Exception;
    public com.billcom.ws.ResiliationOperationResponse abordResSignal(long processID) throws java.rmi.RemoteException, com.billcom.ws.Exception;
    public com.billcom.ws.OrderResiliationHumainTasksResponse orderResiliationHumainTasks(java.lang.String userGroup, java.lang.String taskStatus) throws java.rmi.RemoteException, com.billcom.ws.Exception;
    public com.billcom.ws.ResiliationOperationResponse executeResiliationHumainTask(long processID, com.billcom.ws.ExecuteResiliationHumainTaskParametersEntry[] parameters, int humaintaskID, java.lang.String username, java.lang.String password, java.lang.String group) throws java.rmi.RemoteException, com.billcom.ws.Exception;
    public com.billcom.ws.ResiliationOperationResponse abordResiliation(long processID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.billcom.ws.Exception;
    public com.billcom.ws.ResiliationOperationResponse startResiliationOrder(com.billcom.ws.ContractBeanResiliation[] contractBeans, java.lang.String caseCRM, java.lang.String user_id, java.lang.String canal, java.lang.String dueDate, java.lang.String typeRes, boolean resDevice, java.lang.String motif, boolean contestClient, float FA, com.billcom.ws.AccFeesBean[] detailsFA, int custId, java.lang.Integer prgCode, java.lang.Integer tmCode, java.lang.String shdes, boolean resiliationTotal, java.lang.String custCode, java.lang.String motifClient) throws java.rmi.RemoteException, com.billcom.ws.Exception;
}
