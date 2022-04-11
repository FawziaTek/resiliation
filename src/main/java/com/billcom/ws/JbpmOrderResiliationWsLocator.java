/**
 * JbpmOrderResiliationWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.ws;

public class JbpmOrderResiliationWsLocator extends org.apache.axis.client.Service implements com.billcom.ws.JbpmOrderResiliationWs {

    public JbpmOrderResiliationWsLocator() {
    }


    public JbpmOrderResiliationWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JbpmOrderResiliationWsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ResiliationWsPort
    private java.lang.String ResiliationWsPort_address = "http://192.168.1.11:9090/PBI_JBPM-1.0/jbpmOrderResiliationWs";

    public java.lang.String getResiliationWsPortAddress() {
        return ResiliationWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ResiliationWsPortWSDDServiceName = "ResiliationWsPort";

    public java.lang.String getResiliationWsPortWSDDServiceName() {
        return ResiliationWsPortWSDDServiceName;
    }

    public void setResiliationWsPortWSDDServiceName(java.lang.String name) {
        ResiliationWsPortWSDDServiceName = name;
    }

    public com.billcom.ws.ResiliationWs getResiliationWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ResiliationWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getResiliationWsPort(endpoint);
    }

    public com.billcom.ws.ResiliationWs getResiliationWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.ws.ResiliationWsPortBindingStub _stub = new com.billcom.ws.ResiliationWsPortBindingStub(portAddress, this);
            _stub.setPortName(getResiliationWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setResiliationWsPortEndpointAddress(java.lang.String address) {
        ResiliationWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.ws.ResiliationWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.ws.ResiliationWsPortBindingStub _stub = new com.billcom.ws.ResiliationWsPortBindingStub(new java.net.URL(ResiliationWsPort_address), this);
                _stub.setPortName(getResiliationWsPortWSDDServiceName());
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
        if ("ResiliationWsPort".equals(inputPortName)) {
            return getResiliationWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.billcom.com/", "jbpmOrderResiliationWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.billcom.com/", "ResiliationWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ResiliationWsPort".equals(portName)) {
            setResiliationWsPortEndpointAddress(address);
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
