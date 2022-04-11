/**
 * GrhHandling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public interface GrhHandling extends java.rmi.Remote {
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse getPendingGrhRequests(com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsRequest getPendingGrhRequestsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse takeNewGrhRequestIntoAccount(com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountRequest takeNewGrhRequestIntoAccountRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse addGrhRequest(com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest addGrhRequestRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault;
}
