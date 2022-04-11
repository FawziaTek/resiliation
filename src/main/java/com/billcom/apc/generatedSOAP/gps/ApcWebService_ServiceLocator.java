/**
 * ApcWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.gps;

public class ApcWebService_ServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.gps.ApcWebService_Service {

    public ApcWebService_ServiceLocator() {
    }


    public ApcWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ApcWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ApcWebServiceWebServicePort
    private java.lang.String ApcWebServiceWebServicePort_address = "http://localhost:8098/GPS/WebServices/ApcResiliation";

    public java.lang.String getApcWebServiceWebServicePortAddress() {
        return ApcWebServiceWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ApcWebServiceWebServicePortWSDDServiceName = "ApcWebServiceWebServicePort";

    public java.lang.String getApcWebServiceWebServicePortWSDDServiceName() {
        return ApcWebServiceWebServicePortWSDDServiceName;
    }

    public void setApcWebServiceWebServicePortWSDDServiceName(java.lang.String name) {
        ApcWebServiceWebServicePortWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType getApcWebServiceWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ApcWebServiceWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getApcWebServiceWebServicePort(endpoint);
    }

    public com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType getApcWebServiceWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub _stub = new com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub(portAddress, this);
            _stub.setPortName(getApcWebServiceWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setApcWebServiceWebServicePortEndpointAddress(java.lang.String address) {
        ApcWebServiceWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.gps.ApcWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub _stub = new com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub(new java.net.URL(ApcWebServiceWebServicePort_address), this);
                _stub.setPortName(getApcWebServiceWebServicePortWSDDServiceName());
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
        if ("ApcWebServiceWebServicePort".equals(inputPortName)) {
            return getApcWebServiceWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gps.webservices", "ApcWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gps.webservices", "ApcWebServiceWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ApcWebServiceWebServicePort".equals(portName)) {
            setApcWebServiceWebServicePortEndpointAddress(address);
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
