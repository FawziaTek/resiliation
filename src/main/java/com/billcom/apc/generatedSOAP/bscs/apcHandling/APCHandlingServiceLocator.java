/**
 * APCHandlingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class APCHandlingServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingService {

    public APCHandlingServiceLocator() {
    }


    public APCHandlingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public APCHandlingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APCHandling
    private java.lang.String APCHandling_address = "http://192.168.1.11:8080/BscsWs_Resiliation/services/APCHandling";

    public java.lang.String getAPCHandlingAddress() {
        return APCHandling_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APCHandlingWSDDServiceName = "APCHandling";

    public java.lang.String getAPCHandlingWSDDServiceName() {
        return APCHandlingWSDDServiceName;
    }

    public void setAPCHandlingWSDDServiceName(java.lang.String name) {
        APCHandlingWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling getAPCHandling() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APCHandling_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPCHandling(endpoint);
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling getAPCHandling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub(portAddress, this);
            _stub.setPortName(getAPCHandlingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPCHandlingEndpointAddress(java.lang.String address) {
        APCHandling_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub(new java.net.URL(APCHandling_address), this);
                _stub.setPortName(getAPCHandlingWSDDServiceName());
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
        if ("APCHandling".equals(inputPortName)) {
            return getAPCHandling();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "APCHandlingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "APCHandling"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APCHandling".equals(portName)) {
            setAPCHandlingEndpointAddress(address);
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
