/**
 * ResiliationHandlingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class ResiliationHandlingServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingService {

    public ResiliationHandlingServiceLocator() {
    }


    public ResiliationHandlingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResiliationHandlingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ResiliationHandling
    private java.lang.String ResiliationHandling_address = "http://192.168.1.11:8080/BscsWs/services/ResiliationHandling";

    public java.lang.String getResiliationHandlingAddress() {
        return ResiliationHandling_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ResiliationHandlingWSDDServiceName = "ResiliationHandling";

    public java.lang.String getResiliationHandlingWSDDServiceName() {
        return ResiliationHandlingWSDDServiceName;
    }

    public void setResiliationHandlingWSDDServiceName(java.lang.String name) {
        ResiliationHandlingWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling getResiliationHandling() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ResiliationHandling_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getResiliationHandling(endpoint);
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling getResiliationHandling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub(portAddress, this);
            _stub.setPortName(getResiliationHandlingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setResiliationHandlingEndpointAddress(java.lang.String address) {
        ResiliationHandling_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub(new java.net.URL(ResiliationHandling_address), this);
                _stub.setPortName(getResiliationHandlingWSDDServiceName());
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
        if ("ResiliationHandling".equals(inputPortName)) {
            return getResiliationHandling();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ResiliationHandlingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ResiliationHandling"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ResiliationHandling".equals(portName)) {
            setResiliationHandlingEndpointAddress(address);
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
