/**
 * JbpmOrderResiliation_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation;

public class JbpmOrderResiliation_ServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_Service {

    public JbpmOrderResiliation_ServiceLocator() {
    }


    public JbpmOrderResiliation_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JbpmOrderResiliation_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for jbpmOrderResiliationPort
    private java.lang.String jbpmOrderResiliationPort_address = "http://192.168.1.11:9090/PBI_JBPM-1.0/jbpmOrderResiliation";

    public java.lang.String getjbpmOrderResiliationPortAddress() {
        return jbpmOrderResiliationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String jbpmOrderResiliationPortWSDDServiceName = "jbpmOrderResiliationPort";

    public java.lang.String getjbpmOrderResiliationPortWSDDServiceName() {
        return jbpmOrderResiliationPortWSDDServiceName;
    }

    public void setjbpmOrderResiliationPortWSDDServiceName(java.lang.String name) {
        jbpmOrderResiliationPortWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType getjbpmOrderResiliationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(jbpmOrderResiliationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getjbpmOrderResiliationPort(endpoint);
    }

    public com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType getjbpmOrderResiliationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliationPortBindingStub _stub = new com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliationPortBindingStub(portAddress, this);
            _stub.setPortName(getjbpmOrderResiliationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setjbpmOrderResiliationPortEndpointAddress(java.lang.String address) {
        jbpmOrderResiliationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliationPortBindingStub _stub = new com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliationPortBindingStub(new java.net.URL(jbpmOrderResiliationPort_address), this);
                _stub.setPortName(getjbpmOrderResiliationPortWSDDServiceName());
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
        if ("jbpmOrderResiliationPort".equals(inputPortName)) {
            return getjbpmOrderResiliationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PBI_JBPM.billcom.com/", "jbpmOrderResiliation");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PBI_JBPM.billcom.com/", "jbpmOrderResiliationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("jbpmOrderResiliationPort".equals(portName)) {
            setjbpmOrderResiliationPortEndpointAddress(address);
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
