/**
 * ContractServicesReadService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ContractServicesReadService_ServiceLocator extends org.apache.axis.client.Service implements com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_Service {

    public ContractServicesReadService_ServiceLocator() {
    }


    public ContractServicesReadService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContractServicesReadService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContractServicesReadService
    private java.lang.String ContractServicesReadService_address = "http://192.168.1.11:8080/BscsWs_Resiliation/services/ContractServicesRead";

    public java.lang.String getContractServicesReadServiceAddress() {
        return ContractServicesReadService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContractServicesReadServiceWSDDServiceName = "ContractServicesReadService";

    public java.lang.String getContractServicesReadServiceWSDDServiceName() {
        return ContractServicesReadServiceWSDDServiceName;
    }

    public void setContractServicesReadServiceWSDDServiceName(java.lang.String name) {
        ContractServicesReadServiceWSDDServiceName = name;
    }

    public com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType getContractServicesReadService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContractServicesReadService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContractServicesReadService(endpoint);
    }

    public com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType getContractServicesReadService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadServiceSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getContractServicesReadServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContractServicesReadServiceEndpointAddress(java.lang.String address) {
        ContractServicesReadService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadServiceSoapBindingStub _stub = new com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadServiceSoapBindingStub(new java.net.URL(ContractServicesReadService_address), this);
                _stub.setPortName(getContractServicesReadServiceWSDDServiceName());
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
        if ("ContractServicesReadService".equals(inputPortName)) {
            return getContractServicesReadService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractServicesReadService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractServicesReadService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContractServicesReadService".equals(portName)) {
            setContractServicesReadServiceEndpointAddress(address);
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
