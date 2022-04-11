///**
// * APCManagerServiceSoapBindingStub.java
// *
// * This file was auto-generated from WSDL
// * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
// */
//
//package com.billcom.apc.ws.manager;
//
//public class APCManagerServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.billcom.apc.ws.manager.APCManager {
//    private java.util.Vector cachedSerClasses = new java.util.Vector();
//    private java.util.Vector cachedSerQNames = new java.util.Vector();
//    private java.util.Vector cachedSerFactories = new java.util.Vector();
//    private java.util.Vector cachedDeserFactories = new java.util.Vector();
//
//    static org.apache.axis.description.OperationDesc [] _operations;
//
//    static {
//        _operations = new org.apache.axis.description.OperationDesc[19];
//        _initOperationDesc1();
//        _initOperationDesc2();
//    }
//
//    private static void _initOperationDesc1(){
//        org.apache.axis.description.OperationDesc oper;
//        org.apache.axis.description.ParameterDesc param;
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("contractHasMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationRequest"), com.billcom.apc.ws.manager.VerifyMigrationRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.VerifyMigrationResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        _operations[0] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("sendEmailMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "sendMailRequest"), com.billcom.apc.ws.manager.SendMailRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "sendEmailResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.SendEmailResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[1] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getContractHistory");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationsResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.GetMigrationsResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        _operations[2] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("adjustBalanceBscs");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceRequest"), com.billcom.apc.ws.manager.AdjustBalanceRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[3] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getMigrationOrderParentProcess");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "orderRequest"), com.billcom.apc.ws.manager.OrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationOrderParentResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.GetMigrationOrderParentResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        _operations[4] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("percistMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "percistMigrationOrderRequest"), com.billcom.apc.ws.manager.PercistMigrationOrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "percistMigrationOrderResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.PercistMigrationOrderResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[5] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getNBofmigrationexecutedforcontract");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "nbreMigrationExecutedRequest"), com.billcom.apc.ws.manager.NbreMigrationExecutedRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "nbreMigrationExecutedResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.NbreMigrationExecutedResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "ParseException"),
//                      "com.billcom.apc.ws.manager.ParseException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "ParseException"), 
//                      true
//                     ));
//        _operations[6] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("updateMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateMigrationOrderRequest"), com.billcom.apc.ws.manager.UpdateMigrationOrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateMigrationOrderResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.UpdateMigrationOrderResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[7] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("deleteMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "orderRequest"), com.billcom.apc.ws.manager.OrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "deleteMigrationOrderResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.DeleteMigrationOrderResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[8] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getMigrationOrder");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "orderRequest"), com.billcom.apc.ws.manager.OrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.GetMigrationResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        _operations[9] = oper;
//
//    }
//
//    private static void _initOperationDesc2(){
//        org.apache.axis.description.OperationDesc oper;
//        org.apache.axis.description.ParameterDesc param;
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getListOrderId");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
//        oper.setReturnClass(long[].class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        _operations[10] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getMigrationList");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationsRequest"), com.billcom.apc.ws.manager.GetMigrationsRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationsResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.GetMigrationsResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[11] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("updateCoIdMigrationOrder");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
//        oper.setReturnClass(java.lang.Boolean.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[12] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("adjustBalanceMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceRequest"), com.billcom.apc.ws.manager.AdjustBalanceRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[13] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getDetailsOrder");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "orderRequest"), com.billcom.apc.ws.manager.OrderRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getOrderResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.DetailsOrderBean[].class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        param = oper.getReturnParamDesc();
//        param.setItemQName(new javax.xml.namespace.QName("", "beans"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[14] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("verifyFunctionalEligebility");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationRequest"), com.billcom.apc.ws.manager.VerifyMigrationRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyEligebilityResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.VerifyEligebilityResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[15] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("adjustBalanceIn");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceRequest"), com.billcom.apc.ws.manager.AdjustBalanceRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        _operations[16] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("getEligibileContractForMigration");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibileContractForMigrationRequest"), com.billcom.apc.ws.manager.GetEligibileContractForMigrationRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibleContractForMigrationResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"),
//                      "com.billcom.apc.ws.manager.InvalidInputException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException"), 
//                      true
//                     ));
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"),
//                      "com.billcom.apc.ws.manager.NotFoundException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException"), 
//                      true
//                     ));
//        oper.addFault(new org.apache.axis.description.FaultDesc(
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "ParseException"),
//                      "com.billcom.apc.ws.manager.ParseException",
//                      new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "ParseException"), 
//                      true
//                     ));
//        _operations[17] = oper;
//
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("verifyTechnicalEligibility");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationRequest"), com.billcom.apc.ws.manager.VerifyMigrationRequest.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyEligebilityResponse"));
//        oper.setReturnClass(com.billcom.apc.ws.manager.VerifyEligebilityResponse.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[18] = oper;
//
//    }
//
//    public APCManagerServiceSoapBindingStub() throws org.apache.axis.AxisFault {
//         this(null);
//    }
//
//    public APCManagerServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
//         this(service);
//         super.cachedEndpoint = endpointURL;
//    }
//
//    public APCManagerServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
//        if (service == null) {
//            super.service = new org.apache.axis.client.Service();
//        } else {
//            super.service = service;
//        }
//        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
//            java.lang.Class cls;
//            javax.xml.namespace.QName qName;
//            javax.xml.namespace.QName qName2;
//            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
//            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
//            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.AdjustBalanceRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.AdjustBalanceResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "deleteMigrationOrderResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.DeleteMigrationOrderResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "detailsOrderBean");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.DetailsOrderBean.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibileContractForMigrationRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetEligibileContractForMigrationRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibleContractForMigrationResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibleContractForMigrationResponseBean");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponseBean.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationOrderParentResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetMigrationOrderParentResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetMigrationResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationsRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetMigrationsRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationsResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.GetMigrationsResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getOrderResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.DetailsOrderBean[].class;
//            cachedSerClasses.add(cls);
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "detailsOrderBean");
//            qName2 = new javax.xml.namespace.QName("", "beans");
//            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
//            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "InvalidInputException");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.InvalidInputException.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "migrationBean");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.MigrationBean.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "nbreMigrationExecutedRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.NbreMigrationExecutedRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "nbreMigrationExecutedResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.NbreMigrationExecutedResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "NotFoundException");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.NotFoundException.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "operationResponseAPC");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.OperationResponseAPC.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "orderRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.OrderRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "ParseException");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.ParseException.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "percistMigrationOrderRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.PercistMigrationOrderRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "percistMigrationOrderResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.PercistMigrationOrderResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "sendEmailResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.SendEmailResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "sendMailRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.SendMailRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateMigrationOrderRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.UpdateMigrationOrderRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateMigrationOrderResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.UpdateMigrationOrderResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyEligebilityResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.VerifyEligebilityResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationRequest");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.VerifyMigrationRequest.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyMigrationResponse");
//            cachedSerQNames.add(qName);
//            cls = com.billcom.apc.ws.manager.VerifyMigrationResponse.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//    }
//
//    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
//        try {
//            org.apache.axis.client.Call _call = super._createCall();
//            if (super.maintainSessionSet) {
//                _call.setMaintainSession(super.maintainSession);
//            }
//            if (super.cachedUsername != null) {
//                _call.setUsername(super.cachedUsername);
//            }
//            if (super.cachedPassword != null) {
//                _call.setPassword(super.cachedPassword);
//            }
//            if (super.cachedEndpoint != null) {
//                _call.setTargetEndpointAddress(super.cachedEndpoint);
//            }
//            if (super.cachedTimeout != null) {
//                _call.setTimeout(super.cachedTimeout);
//            }
//            if (super.cachedPortName != null) {
//                _call.setPortName(super.cachedPortName);
//            }
//            java.util.Enumeration keys = super.cachedProperties.keys();
//            while (keys.hasMoreElements()) {
//                java.lang.String key = (java.lang.String) keys.nextElement();
//                _call.setProperty(key, super.cachedProperties.get(key));
//            }
//            // All the type mapping information is registered
//            // when the first call is made.
//            // The type mapping information is actually registered in
//            // the TypeMappingRegistry of the service, which
//            // is the reason why registration is only needed for the first call.
//            synchronized (this) {
//                if (firstCall()) {
//                    // must set encoding style before registering serializers
//                    _call.setEncodingStyle(null);
//                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
//                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
//                        javax.xml.namespace.QName qName =
//                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
//                        java.lang.Object x = cachedSerFactories.get(i);
//                        if (x instanceof Class) {
//                            java.lang.Class sf = (java.lang.Class)
//                                 cachedSerFactories.get(i);
//                            java.lang.Class df = (java.lang.Class)
//                                 cachedDeserFactories.get(i);
//                            _call.registerTypeMapping(cls, qName, sf, df, false);
//                        }
//                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
//                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
//                                 cachedSerFactories.get(i);
//                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
//                                 cachedDeserFactories.get(i);
//                            _call.registerTypeMapping(cls, qName, sf, df, false);
//                        }
//                    }
//                }
//            }
//            return _call;
//        }
//        catch (java.lang.Throwable _t) {
//            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
//        }
//    }
//
//    public com.billcom.apc.ws.manager.VerifyMigrationResponse contractHasMigration(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[0]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "contractHasMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.VerifyMigrationResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.VerifyMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.VerifyMigrationResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.SendEmailResponse sendEmailMigration(com.billcom.apc.ws.manager.SendMailRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[1]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "sendEmailMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.SendEmailResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.SendEmailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.SendEmailResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.GetMigrationsResponse getContractHistory(java.lang.String arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[2]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getContractHistory"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.GetMigrationsResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.GetMigrationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.GetMigrationsResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceBscs(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[3]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceBscs"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.GetMigrationOrderParentResponse getMigrationOrderParentProcess(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[4]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationOrderParentProcess"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.GetMigrationOrderParentResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.GetMigrationOrderParentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.GetMigrationOrderParentResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.PercistMigrationOrderResponse percistMigration(com.billcom.apc.ws.manager.PercistMigrationOrderRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[5]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "percistMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.PercistMigrationOrderResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.PercistMigrationOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.PercistMigrationOrderResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.NbreMigrationExecutedResponse getNBofmigrationexecutedforcontract(com.billcom.apc.ws.manager.NbreMigrationExecutedRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.ParseException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[6]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getNBofmigrationexecutedforcontract"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.NbreMigrationExecutedResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.NbreMigrationExecutedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.NbreMigrationExecutedResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.ParseException) {
//              throw (com.billcom.apc.ws.manager.ParseException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.UpdateMigrationOrderResponse updateMigration(com.billcom.apc.ws.manager.UpdateMigrationOrderRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[7]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.UpdateMigrationOrderResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.UpdateMigrationOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.UpdateMigrationOrderResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.DeleteMigrationOrderResponse deleteMigration(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[8]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "deleteMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.DeleteMigrationOrderResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.DeleteMigrationOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.DeleteMigrationOrderResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.GetMigrationResponse getMigrationOrder(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[9]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationOrder"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.GetMigrationResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.GetMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.GetMigrationResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public long[] getListOrderId(java.lang.String arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[10]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getListOrderId"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (long[]) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.GetMigrationsResponse getMigrationList(com.billcom.apc.ws.manager.GetMigrationsRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[11]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getMigrationList"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.GetMigrationsResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.GetMigrationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.GetMigrationsResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public java.lang.Boolean updateCoIdMigrationOrder(java.lang.String arg0, java.lang.String arg1, java.math.BigInteger arg2) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[12]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "updateCoIdMigrationOrder"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (java.lang.Boolean) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceMigration(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[13]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.DetailsOrderBean[] getDetailsOrder(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[14]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getDetailsOrder"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.DetailsOrderBean[]) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.DetailsOrderBean[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.DetailsOrderBean[].class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.VerifyEligebilityResponse verifyFunctionalEligebility(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[15]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyFunctionalEligebility"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.VerifyEligebilityResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.VerifyEligebilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.VerifyEligebilityResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceIn(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[16]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "adjustBalanceIn"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.AdjustBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.AdjustBalanceResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse getEligibileContractForMigration(com.billcom.apc.ws.manager.GetEligibileContractForMigrationRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException, com.billcom.apc.ws.manager.ParseException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[17]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "getEligibileContractForMigration"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//    if (axisFaultException.detail != null) {
//        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
//              throw (java.rmi.RemoteException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.InvalidInputException) {
//              throw (com.billcom.apc.ws.manager.InvalidInputException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.NotFoundException) {
//              throw (com.billcom.apc.ws.manager.NotFoundException) axisFaultException.detail;
//         }
//        if (axisFaultException.detail instanceof com.billcom.apc.ws.manager.ParseException) {
//              throw (com.billcom.apc.ws.manager.ParseException) axisFaultException.detail;
//         }
//   }
//  throw axisFaultException;
//}
//    }
//
//    public com.billcom.apc.ws.manager.VerifyEligebilityResponse verifyTechnicalEligibility(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[18]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://manager.ws.apc.billcom.com/", "verifyTechnicalEligibility"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (com.billcom.apc.ws.manager.VerifyEligebilityResponse) _resp;
//            } catch (java.lang.Exception _exception) {
//                return (com.billcom.apc.ws.manager.VerifyEligebilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.ws.manager.VerifyEligebilityResponse.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//}
