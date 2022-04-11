/**
 * ApcWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.gps;

public interface ApcWebService_PortType extends java.rmi.Remote {
    public com.billcom.apc.generatedSOAP.gps.AddApcResponse addApcRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.AddApcRequest addApcRequest) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.gps.GetStatusResiliationResponse getStatusResiliationRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.GetStatusResiliationRequest getStatusResiliationRequest) throws java.rmi.RemoteException;
    public com.billcom.apc.generatedSOAP.gps.UpdateApcResponse updateApcRequest(com.billcom.apc.generatedSOAP.gps.AuthenticationData authenticationData, com.billcom.apc.generatedSOAP.gps.UpdateApcRequest updateApcRequest) throws java.rmi.RemoteException;
}
