//package com.billcom.apc.ws.manager;
//
//public class APCManagerProxy implements com.billcom.apc.ws.manager.APCManager {
//  private String _endpoint = null;
//  private com.billcom.apc.ws.manager.APCManager aPCManager = null;
//  
//  public APCManagerProxy() {
//    _initAPCManagerProxy();
//  }
//  
//  public APCManagerProxy(String endpoint) {
//    _endpoint = endpoint;
//    _initAPCManagerProxy();
//  }
//  
//  private void _initAPCManagerProxy() {
//    try {
//      aPCManager = (new com.billcom.apc.ws.manager.APCManagerServiceLocator()).getAPCManagerPort();
//      if (aPCManager != null) {
//        if (_endpoint != null)
//          ((javax.xml.rpc.Stub)aPCManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
//        else
//          _endpoint = (String)((javax.xml.rpc.Stub)aPCManager)._getProperty("javax.xml.rpc.service.endpoint.address");
//      }
//      
//    }
//    catch (javax.xml.rpc.ServiceException serviceException) {}
//  }
//  
//  public String getEndpoint() {
//    return _endpoint;
//  }
//  
//  public void setEndpoint(String endpoint) {
//    _endpoint = endpoint;
//    if (aPCManager != null)
//      ((javax.xml.rpc.Stub)aPCManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
//    
//  }
//  
//  public com.billcom.apc.ws.manager.APCManager getAPCManager() {
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager;
//  }
//  
//  public com.billcom.apc.ws.manager.VerifyMigrationResponse contractHasMigration(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.contractHasMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.SendEmailResponse sendEmailMigration(com.billcom.apc.ws.manager.SendMailRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.sendEmailMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.GetMigrationsResponse getContractHistory(java.lang.String arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getContractHistory(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceBscs(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.adjustBalanceBscs(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.GetMigrationOrderParentResponse getMigrationOrderParentProcess(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getMigrationOrderParentProcess(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.PercistMigrationOrderResponse percistMigration(com.billcom.apc.ws.manager.PercistMigrationOrderRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.percistMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.NbreMigrationExecutedResponse getNBofmigrationexecutedforcontract(com.billcom.apc.ws.manager.NbreMigrationExecutedRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.ParseException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getNBofmigrationexecutedforcontract(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.UpdateMigrationOrderResponse updateMigration(com.billcom.apc.ws.manager.UpdateMigrationOrderRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.updateMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.DeleteMigrationOrderResponse deleteMigration(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.deleteMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.GetMigrationResponse getMigrationOrder(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getMigrationOrder(arg0);
//  }
//  
//  public long[] getListOrderId(java.lang.String arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getListOrderId(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.GetMigrationsResponse getMigrationList(com.billcom.apc.ws.manager.GetMigrationsRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getMigrationList(arg0);
//  }
//  
//  public java.lang.Boolean updateCoIdMigrationOrder(java.lang.String arg0, java.lang.String arg1, java.math.BigInteger arg2) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.updateCoIdMigrationOrder(arg0, arg1, arg2);
//  }
//  
//  public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceMigration(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.adjustBalanceMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.DetailsOrderBean[] getDetailsOrder(com.billcom.apc.ws.manager.OrderRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getDetailsOrder(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.VerifyEligebilityResponse verifyFunctionalEligebility(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.verifyFunctionalEligebility(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.AdjustBalanceResponse adjustBalanceIn(com.billcom.apc.ws.manager.AdjustBalanceRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.NotFoundException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.adjustBalanceIn(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.GetEligibleContractForMigrationResponse getEligibileContractForMigration(com.billcom.apc.ws.manager.GetEligibileContractForMigrationRequest arg0) throws java.rmi.RemoteException, com.billcom.apc.ws.manager.InvalidInputException, com.billcom.apc.ws.manager.NotFoundException, com.billcom.apc.ws.manager.ParseException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.getEligibileContractForMigration(arg0);
//  }
//  
//  public com.billcom.apc.ws.manager.VerifyEligebilityResponse verifyTechnicalEligibility(com.billcom.apc.ws.manager.VerifyMigrationRequest arg0) throws java.rmi.RemoteException{
//    if (aPCManager == null)
//      _initAPCManagerProxy();
//    return aPCManager.verifyTechnicalEligibility(arg0);
//  }
//  
//  
//}