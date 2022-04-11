/**
 * ContractHandlingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class ContractHandlingServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingService {

    public ContractHandlingServiceLocator() {
    }


    public ContractHandlingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContractHandlingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContractHandling
    private java.lang.String ContractHandling_address = "http://192.168.1.11:8080/BscsWs_Resiliation/services/ContractHandling";

    public java.lang.String getContractHandlingAddress() {
        return ContractHandling_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContractHandlingWSDDServiceName = "ContractHandling";

    public java.lang.String getContractHandlingWSDDServiceName() {
        return ContractHandlingWSDDServiceName;
    }

    public void setContractHandlingWSDDServiceName(java.lang.String name) {
        ContractHandlingWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling getContractHandling() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContractHandling_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContractHandling(endpoint);
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling getContractHandling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingSoapBindingStub(portAddress, this);
            _stub.setPortName(getContractHandlingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContractHandlingEndpointAddress(java.lang.String address) {
        ContractHandling_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingSoapBindingStub(new java.net.URL(ContractHandling_address), this);
                _stub.setPortName(getContractHandlingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ContractHandling".equals(inputPortName)) {
            return getContractHandling();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractHandlingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractHandling"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContractHandling".equals(portName)) {
            setContractHandlingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
