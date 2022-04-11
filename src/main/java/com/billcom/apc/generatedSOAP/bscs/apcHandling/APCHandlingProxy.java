package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class APCHandlingProxy implements com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling {
  private String _endpoint = null;
  private com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling aPCHandling = null;
  
  public APCHandlingProxy() {
    _initAPCHandlingProxy();
  }
  
  public APCHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPCHandlingProxy();
  }
  
  private void _initAPCHandlingProxy() {
    try {
      aPCHandling = (new com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingServiceLocator()).getAPCHandling();
      if (aPCHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPCHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPCHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPCHandling != null)
      ((javax.xml.rpc.Stub)aPCHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandling getAPCHandling() {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling;
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeResponse getType(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetTypeRequest getTypeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getType(getTypeRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse getMigrationCategory(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest getMigrationCategoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationCategory(getMigrationCategoryRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractFromMsisdnResponse getContractFromMsisdn(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCoIdRequest getContractFromMsisdnRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getContractFromMsisdn(getContractFromMsisdnRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamterResponse activateAndSetParameterServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.ActivateServiceParamter activateAndSetParameterServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateAndSetParameterServices(activateAndSetParameterServicesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse activateOnHoldService(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest coIdRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateOnHoldService(coIdRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMsisdnFromCoIdResponse getMsisdnFromCoId(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getMsisdnFromCoIdRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMsisdnFromCoId(getMsisdnFromCoIdRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.HasPendingRequestResponse hasPendingRequest(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest hasPendingrequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.hasPendingRequest(hasPendingrequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateResponse getDifferentsServiceTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.DifferentServiceTemplateRequest getDifferentsServiceTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getDifferentsServiceTemplate(getDifferentsServiceTemplateRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateResponse updateOperationDate(com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationDateRequest updateOperationDateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.updateOperationDate(updateOperationDateRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerResponse getContractListForCustomer(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetContractListForCustomerRequest getContractListeForCustomerRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getContractListForCustomer(getContractListeForCustomerRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationResponse calculateAcceleration(com.billcom.apc.generatedSOAP.bscs.apcHandling.CalculateAccelerationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.calculateAcceleration(calculateAccelerationRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEngagementStatusResponse getEngagementStatus(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEngagementStatusRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEngagementStatus(getEngagementStatusRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesResponse desactivateServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.DesactivateServicesRequest desactivateServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.desactivateServices(desactivateServicesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.EligibilityTemplateResponse getEligebilityTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEligebilityTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEligebilityTemplate(getEligebilityTemplateRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceResponse getBalancesContractHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetBalancesRequest getBalancesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getBalancesContractHist(getBalancesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertBalanceHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.BalanceHistRequest insertBalanceHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertBalanceHist(insertBalanceHistRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOptionalServicesResponse getOptionalServices(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetServiceRequest getOptionalServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getOptionalServices(getOptionalServicesRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse desactivateContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest desactivateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.desactivateContract(desactivateContractRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertFafNumberHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcFafNumberHistRequest apcFafNumberHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertFafNumberHist(apcFafNumberHistRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.MontantFactureResponse getMontantFacture(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getMontantFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMontantFacture(getMontantFactureRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalResponse getMigrationInterval(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationIntervalRequest getMigrationIntervalRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationInterval(getMigrationIntervalRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsResponse getCustomerStatistics(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getCustomerStatisticsRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCustomerStatistics(getCustomerStatisticsRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCUGResponse getCUG(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getCUGRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCUG(getCUGRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.NbreMigrationResponse getNbreMigration(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getNbreMigrationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getNbreMigration(getNbreMigrationRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCResponse setOCC(com.billcom.apc.generatedSOAP.bscs.apcHandling.OCCRequest setOCCRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.setOCC(setOCCRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreResponse getOffreSource(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetOffreRequest getOffreSourceRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getOffreSource(getOffreSourceRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanResponse changeRateplan(com.billcom.apc.generatedSOAP.bscs.apcHandling.ChangeRatePlanRequest changeRatePlanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.changeRateplan(changeRatePlanRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetEligebilityResponse getEligebility(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest getEligebilityRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEligebility(getEligebilityRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryResponse getCatMigration(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCategoryRequest getCatMigrationRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCatMigration(getCatMigrationRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanResponse checkRateplan(com.billcom.apc.generatedSOAP.bscs.apcHandling.CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.checkRateplan(checkRateplanRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.PrixMigrationResponse getMigrationPrix(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest getMigrationPrixRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationPrix(getMigrationPrixRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.ProrateResponse calculateProrata(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest calculateProrataRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.calculateProrata(calculateProrataRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerResponse addTickler(com.billcom.apc.generatedSOAP.bscs.apcHandling.AddTicklerRequest addTicklerRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.addTickler(addTicklerRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightResponse userHasRight(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserHasRightRequest userHasRightRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.userHasRight(userHasRightRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupResponse userGroup(com.billcom.apc.generatedSOAP.bscs.apcHandling.UserGroupRequest userGroupRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.userGroup(userGroupRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse activateContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CoIdRequest activateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateContract(activateContractRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractResponse createContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.CreateContractRequest createContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.createContract(createContractRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetDateFactureResponse getDateFacture(com.billcom.apc.generatedSOAP.bscs.apcHandling.CustomerRequest getDateFactureRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getDateFacture(getDateFactureRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse addCugContract(com.billcom.apc.generatedSOAP.bscs.apcHandling.AddCugRequest addCugRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.addCugContract(addCugRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationTypeResponse getMigrationtype(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetMigrationRequest getMigrationTypeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationtype(getMigrationTypeRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse updateAdvCharge(com.billcom.apc.generatedSOAP.bscs.apcHandling.UpdateAdvChargeRequest updateAdvChargeRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.updateAdvCharge(updateAdvChargeRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequestResponse getListTemplate(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetListTemplateRequest getListTemplateRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getListTemplate(getListTemplateRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse insertApcCugHist(com.billcom.apc.generatedSOAP.bscs.apcHandling.ApcCugHistRequest apcCugHistRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertApcCugHist(apcCugHistRequest);
  }
  
  public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceResponse getconfigBalance(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetConfigBalanceRequest getconfigBalanceRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.apcHandling.UnexpectedErrorFault{
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getconfigBalance(getconfigBalanceRequest);
  }
  
  
}