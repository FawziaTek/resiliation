/**
 * APCHandlingSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class APCHandlingSoapBindingStub extends org.apache.axis.client.Stub implements com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[44];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getTypeReturn"));
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
        oper.setName("getMigrationCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationCategoryReturn"));
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
        oper.setName("getContractFromMsisdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractFromMsisdnRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractFromMsisdnResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractFromMsisdnReturn"));
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
        oper.setName("activateAndSetParameterServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateAndSetParameterServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamter"), com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamterResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateAndSetParameterServicesReturn"));
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
        oper.setName("activateOnHoldService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateOnHoldServiceReturn"));
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
        oper.setName("getMsisdnFromCoId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMsisdnFromCoIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMsisdnFromCoIdResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMsisdnFromCoIdReturn"));
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
        oper.setName("hasPendingRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hasPendingrequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HasPendingRequestResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hasPendingRequestReturn"));
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
        oper.setName("getDifferentsServiceTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDifferentsServiceTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDifferentsServiceTemplateReturn"));
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
        oper.setName("updateOperationDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateOperationDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateOperationDateReturn"));
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
        oper.setName("getContractListForCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractListeForCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractListForCustomerReturn"));
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
        oper.setName("calculateAcceleration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationReturn"));
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
        oper.setName("getEngagementStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEngagementStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEngagementStatusResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEngagementStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desactivateServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEligebilityTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EligibilityTemplateResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalancesContractHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getBalancesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetBalancesRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetBalancesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getBalancesContractHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertBalanceHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertBalanceHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceHistRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertBalanceHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOptionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOptionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetServiceRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOptionalServicesResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOptionalServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desactivateContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertFafNumberHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "apcFafNumberHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcFafNumberHistRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcFafNumberHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertFafNumberHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMontantFacture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MontantFactureResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationInterval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationIntervalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationIntervalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerStatistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerStatisticsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerStatisticsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCUG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCUGRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCUGResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCUGReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNbreMigration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getNbreMigrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "NbreMigrationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getNbreMigrationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setOCC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOCCRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOCCReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOffreSource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOffreSourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOffreSourceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRatePlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEligebility");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEligebilityResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatMigration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCatMigrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCatMigrationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationPrix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationPrixRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "PrixMigrationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationPrixReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calculateProrata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateProrataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProrateResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateProrataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTickler");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addTicklerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addTicklerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userHasRight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userHasRightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userHasRightReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDateFacture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDateFactureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetDateFactureResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDateFactureReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCugContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addCugRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddCugRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.AddCugRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addCugContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationtype");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationTypeResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationtypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAdvCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateAdvChargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateAdvChargeRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.UpdateAdvChargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateAdvChargeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getListTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequestResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getListTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertApcCugHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "apcCugHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcCugHistRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcCugHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertApcCugHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getconfigBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getconfigBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceRequest"), com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getconfigBalanceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[43] = oper;

    }

    public APCHandlingSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public APCHandlingSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public APCHandlingSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamter");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamterResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddCugRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.AddCugRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcCugHistRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcCugHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcFafNumberHistRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcFafNumberHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns2_CugMembershipsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CugMembershipsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns3_BasicservicegroupassigmentsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.BasicservicegroupassigmentsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cug_memberships.services.contract_services_read.v2.beans.ws.lhs.com", "BasicservicegroupassigmentsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns4_NumParamsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.NumParamsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns5_MultValuesBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.MultValuesBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfBalance");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfContractBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ContractBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCUGBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfGetContractListForCustomerBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfGetCustomerStatisticsBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfParameter");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Parameter");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfRateplan");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Rateplan");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfService");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfTemplate");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Template[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Template");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Balance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceHistRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BaseSOIBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.BaseSOIBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ContractBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.DateBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EligibilityTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetBalancesRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetBalancesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCoIdRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCoIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractFromMsisdnResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCUGResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetDateFactureResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEligebilityResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEngagementStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMsisdnFromCoIdResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOptionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HasPendingRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoneyBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.MoneyBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MontantFactureResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "NbreMigrationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Parameter");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "PrixMigrationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProrateResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Rateplan");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Rateplan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Template");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.Template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateAdvChargeRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UpdateAdvChargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.NumParamsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cug_memberships.services.contract_services_read.v2.beans.ws.lhs.com", "BasicservicegroupassigmentsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.BasicservicegroupassigmentsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.MultValuesBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.apcHandling.CugMembershipsBeanOut.class;
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

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse getType(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeRequest getTypeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse getMigrationCategory(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest getMigrationCategoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMigrationCategoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse getContractFromMsisdn(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCoIdRequest getContractFromMsisdnRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractFromMsisdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getContractFromMsisdnRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse activateAndSetParameterServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamter activateAndSetParameterServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "activateAndSetParameterServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activateAndSetParameterServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse activateOnHoldService(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest coIdRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "activateOnHoldService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {coIdRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse getMsisdnFromCoId(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getMsisdnFromCoIdRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getMsisdnFromCoId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMsisdnFromCoIdRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse hasPendingRequest(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest hasPendingrequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "hasPendingRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hasPendingrequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse getDifferentsServiceTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateRequest getDifferentsServiceTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDifferentsServiceTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDifferentsServiceTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse updateOperationDate(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateRequest updateOperationDateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOperationDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateOperationDateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse getContractListForCustomer(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerRequest getContractListeForCustomerRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractListForCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getContractListeForCustomerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse calculateAcceleration(com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "calculateAcceleration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calculateAccelerationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse getEngagementStatus(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEngagementStatusRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getEngagementStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEngagementStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse desactivateServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesRequest desactivateServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "desactivateServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {desactivateServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse getEligebilityTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEligebilityTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEligebilityTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEligebilityTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse getBalancesContractHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetBalancesRequest getBalancesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBalancesContractHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBalancesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertBalanceHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceHistRequest insertBalanceHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertBalanceHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {insertBalanceHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse getOptionalServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetServiceRequest getOptionalServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOptionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOptionalServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse desactivateContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest desactivateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "desactivateContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {desactivateContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertFafNumberHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcFafNumberHistRequest apcFafNumberHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertFafNumberHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apcFafNumberHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse getMontantFacture(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getMontantFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
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
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse getMigrationInterval(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalRequest getMigrationIntervalRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationInterval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMigrationIntervalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse getCustomerStatistics(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getCustomerStatisticsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerStatistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomerStatisticsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse getCUG(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getCUGRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCUG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCUGRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse getNbreMigration(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getNbreMigrationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNbreMigration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNbreMigrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse setOCC(com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCRequest setOCCRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setOCC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setOCCRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse getOffreSource(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreRequest getOffreSourceRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOffreSource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOffreSourceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse changeRateplan(com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanRequest changeRatePlanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeRatePlanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse getEligebility(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEligebilityRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEligebility"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEligebilityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse getCatMigration(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest getCatMigrationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCatMigration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCatMigrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse checkRateplan(com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkRateplanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse getMigrationPrix(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest getMigrationPrixRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationPrix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMigrationPrixRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse calculateProrata(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest calculateProrataRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "calculateProrata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calculateProrataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse addTickler(com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerRequest addTicklerRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addTickler"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addTicklerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse userHasRight(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightRequest userHasRightRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "userHasRight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userHasRightRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse userGroup(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupRequest userGroupRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "userGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userGroupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse activateContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest activateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activateContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse createContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractRequest createContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse getDateFacture(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getDateFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDateFacture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDateFactureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse addCugContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.AddCugRequest addCugRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addCugContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addCugRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse getMigrationtype(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest getMigrationTypeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationtype"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMigrationTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse updateAdvCharge(com.billcom.apc.generatedSOAP.bscs.apcHandling.UpdateAdvChargeRequest updateAdvChargeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateAdvCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateAdvChargeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse getListTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequest getListTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getListTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getListTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertApcCugHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcCugHistRequest apcCugHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertApcCugHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apcCugHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse getconfigBalance(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceRequest getconfigBalanceRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getconfigBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getconfigBalanceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
