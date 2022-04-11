/**
 * ResiliationHandlingSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class ResiliationHandlingSoapBindingStub extends org.apache.axis.client.Stub implements com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMontantFacture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMontantFactureRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMontantFactureResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureReturn"));
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
        oper.setName("changeRateplanforResiliation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRatePlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResiliationRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResiliationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRateplanforResiliationReturn"));
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
        oper.setName("getcalculatedFaccTotale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getcalculatedFaccTotaleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCalculatedFaccTotaleRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCalculatedFaccTotaleResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getcalculatedFaccTotaleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerOfferAndStatistique");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerOffreRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerOfferAndStatistiqueRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerOfferAndStatistiqueResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerOfferAndStatistiqueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createContractForResiliation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractResRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractForResiliationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractsListForResiliation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getListContractsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListContractsRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListContractsResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractsListForResiliationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertScheduledJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertScheduledRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertScheduledJobReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerRequestDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerRequestDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerRequestDetailsRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerRequestDetailsResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerRequestDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateStatusDemandeHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateStatusDemandeHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateStatusDemandeHistRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateStatusDemandeHistResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateStatusDemandeHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calculateAccelerationForResiliation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationForResiliationRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationForResiliationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationForResiliationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setOcc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOccRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SetOccRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SetOccResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOccReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addFaccRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addFacc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddFaccRequest"), com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddFaccResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addFaccRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

    }

    public ResiliationHandlingSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ResiliationHandlingSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ResiliationHandlingSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddFaccRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddFaccResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfBeanTax");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.BeanTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BeanTax");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfContractBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfContractOccBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractOccBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCustomerOffreBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerOffreBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCustomerRequestBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequestBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfFraisAcc");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FraisAcc");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfResultResiliationBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResultResiliationBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ResultResiliationBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BaseSOIBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.BaseSOIBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BeanTax");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.BeanTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationForResiliationRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationForResiliationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResiliationRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResiliationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractIdentificationBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractIdentificationBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractOccBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ContractOccBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerOffreBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerOffreBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequestBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CustomerRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.DateBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FraisAcc");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.FraisAcc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCalculatedFaccTotaleRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCalculatedFaccTotaleResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerOfferAndStatistiqueRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerOfferAndStatistiqueResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerRequestDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerRequestDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListContractsRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListContractsResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMontantFactureRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMontantFactureResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoneyBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.MoneyBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ResultResiliationBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResultResiliationBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SetOccRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SetOccResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateStatusDemandeHistRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateStatusDemandeHistResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse.class;
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

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse getMontantFacture(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureRequest getMontantFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getMontantFacture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMontantFactureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetMontantFactureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse changeRateplanforResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationRequest changeRatePlanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "changeRateplanforResiliation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeRatePlanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ChangeRatePlanResiliationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse getcalculatedFaccTotale(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleRequest getcalculatedFaccTotaleRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getcalculatedFaccTotale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getcalculatedFaccTotaleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCalculatedFaccTotaleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse getCustomerOfferAndStatistique(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueRequest getCustomerOffreRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerOfferAndStatistique"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomerOffreRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerOfferAndStatistiqueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse createContractForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResRequest createContractResRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createContractForResiliation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createContractResRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CreateContractResResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse getContractsListForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsRequest getListContractsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractsListForResiliation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getListContractsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetListContractsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse insertScheduledJob(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobRequest insertScheduledRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertScheduledJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {insertScheduledRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.InsertScheduledJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse getCustomerRequestDetails(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsRequest getCustomerRequestDetailsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerRequestDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomerRequestDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.GetCustomerRequestDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse updateStatusDemandeHist(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistRequest updateStatusDemandeHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateStatusDemandeHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateStatusDemandeHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UpdateStatusDemandeHistResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse calculateAccelerationForResiliation(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "calculateAccelerationForResiliation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calculateAccelerationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.CalculateAccelerationForResiliationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse setOcc(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccRequest setOccRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setOcc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setOccRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.SetOccResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse addFaccRequest(com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccRequest addFacc) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addFaccRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addFacc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.resiliationHandling.AddFaccResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.resiliationHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
