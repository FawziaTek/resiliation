/**
 * JbpmOrderResiliation_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation;

public interface JbpmOrderResiliation_PortType extends java.rmi.Remote {
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse skipPaymentTimer(long processID) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationHumainTaskBean[] orderResiliationHumainTasks(java.lang.String userGroup, java.lang.String taskStatus) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse startResiliationOrder(java.lang.String[] msisdns, long[] coids, java.lang.String[] coCodes, java.lang.String caseCRM, java.lang.String user_id, java.lang.String canal, java.lang.String dueDate, java.lang.String typeRes, boolean resDevice, java.lang.String motif, boolean contestClient, float FA, com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.AccFeesBean[] detailsFA, int custId, java.lang.Integer prgCode, java.lang.Integer tmCode, java.lang.String shdes, boolean resiliationTotal) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse executeResiliationHumainTask(long processID, com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.ExecuteResiliationHumainTaskParametersEntry[] parameters, int humaintaskID, java.lang.String username, java.lang.String password, java.lang.String group) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse abordResiliation(long processID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.MigrationOperationResponse abordResSignal(long processID) throws java.rmi.RemoteException;
}
