/**
 * ContractHandling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public interface ContractHandling extends java.rmi.Remote {
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse changeRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.ChangeRateplanRequest changeRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse checkRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse getContractDetails(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contractReference) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse getDetailedInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileRequest getDetailedInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse getConsoDataHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest consoDataHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse getDetInvoicesByInv(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvRequest detInvoicesByInvRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse getDetailedInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesRequest getDetailedInvoicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse deactivateService(com.billcom.apc.generatedSOAP.bscs.contractHandling.DeactivateServiceRequest request) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse getCreditRechargeHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest rechargeHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse retrieveServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesRequest retrieveServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse moveContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.MoveContractRequest moveContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse getInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesRequest invoicesReq) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse getCallsHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest callHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse updateContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.UpdateContractRequest updateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse getInfoConso(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoRequest infoConsoRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse getInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileRequest getInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse takeOver(com.billcom.apc.generatedSOAP.bscs.contractHandling.TakeOverRequest takeOverRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse getContractList(com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault;
}
