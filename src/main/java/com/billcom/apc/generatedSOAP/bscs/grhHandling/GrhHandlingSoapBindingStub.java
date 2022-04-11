/**
 * GrhHandlingSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class GrhHandlingSoapBindingStub extends org.apache.axis.client.Stub implements com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPendingGrhRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getPendingGrhRequestsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetPendingGrhRequestsRequest"), com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetPendingGrhRequestsResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getPendingGrhRequestsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takeNewGrhRequestIntoAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "takeNewGrhRequestIntoAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeNewGrhRequestIntoAccountRequest"), com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeNewGrhRequestIntoAccountResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "takeNewGrhRequestIntoAccountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addGrhRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addGrhRequestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddGrhRequestRequest"), com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddGrhRequestResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addGrhRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public GrhHandlingSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GrhHandlingSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GrhHandlingSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddGrhRequestRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddGrhRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCommitmentPackageElement");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentPackageElement");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfGrhRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GrhRequest");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentEntityType");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentPackageElement");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentPackageElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.ContractReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetPendingGrhRequestsRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetPendingGrhRequestsResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GrhRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationType");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProcessingMode");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RequestAll");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.RequestAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "StatusDefinition");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeNewGrhRequestIntoAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeNewGrhRequestIntoAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse getPendingGrhRequests(com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsRequest getPendingGrhRequestsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPendingGrhRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPendingGrhRequestsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.grhHandling.GetPendingGrhRequestsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse takeNewGrhRequestIntoAccount(com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountRequest takeNewGrhRequestIntoAccountRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "takeNewGrhRequestIntoAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {takeNewGrhRequestIntoAccountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.grhHandling.TakeNewGrhRequestIntoAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse addGrhRequest(com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestRequest addGrhRequestRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addGrhRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addGrhRequestRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.grhHandling.AddGrhRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.grhHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
