/**
 * ContractWriteService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractWrite;

public class ContractWriteService_ServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_Service {

    public ContractWriteService_ServiceLocator() {
    }


    public ContractWriteService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContractWriteService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContractWriteService
    private java.lang.String ContractWriteService_address = "http://192.168.1.11:8080/BscsWs_Resiliation/services/ContractWrite";

    public java.lang.String getContractWriteServiceAddress() {
        return ContractWriteService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContractWriteServiceWSDDServiceName = "ContractWriteService";

    public java.lang.String getContractWriteServiceWSDDServiceName() {
        return ContractWriteServiceWSDDServiceName;
    }

    public void setContractWriteServiceWSDDServiceName(java.lang.String name) {
        ContractWriteServiceWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType getContractWriteService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContractWriteService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContractWriteService(endpoint);
    }

    public com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType getContractWriteService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getContractWriteServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContractWriteServiceEndpointAddress(java.lang.String address) {
        ContractWriteService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub(new java.net.URL(ContractWriteService_address), this);
                _stub.setPortName(getContractWriteServiceWSDDServiceName());
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
        if ("ContractWriteService".equals(inputPortName)) {
            return getContractWriteService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractWriteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractWriteService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContractWriteService".equals(portName)) {
            setContractWriteServiceEndpointAddress(address);
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
