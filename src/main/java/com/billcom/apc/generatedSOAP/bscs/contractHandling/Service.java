/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class Service  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Double advanceAccessOvw;

    private java.lang.Integer advanceAccessOvwPrd;

    private java.lang.String advanceAccessOvwType;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration[] bsgConfiguration;

    private java.lang.Double cosAccfeeOvw;

    private java.lang.Integer cosAccfeeOvwPrd;

    private java.lang.String cosAccfeeOvwType;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosActivationDate;

    private java.lang.Integer cosPendingStatus;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosPendingStatusDate;

    private java.lang.Integer cosQuantity;

    private java.lang.Integer cosStatus;

    private java.lang.Double cosSubfeeOvw;

    private java.lang.String cosSubfeeOvwType;

    private java.lang.Long cosTemplId;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosTrialEndDate;

    private java.lang.Integer csPaymentConditionUsgInd;

    private java.lang.Long csPrepaidTpId;

    private java.lang.String csPrepaidTpIdPub;

    private java.lang.String cugAction;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership[] cugMemberships;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber[] directoryNumbers;

    private java.lang.Long extServiceId;

    private java.lang.String extServiceIdPub;

    private boolean isNewService;

    private java.lang.String opAssistedAction;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue[] paramValues;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.Port[] ports;

    private java.lang.Long profileId;

    private java.lang.String snDes;

    private java.lang.Long sncode;

    private java.lang.String sncodePub;

    private java.lang.String spDes;

    private java.lang.Long spcode;

    private java.lang.String spcodePub;

    private java.lang.Long userReason;

    public Service() {
    }

    public Service(
           java.lang.Double advanceAccessOvw,
           java.lang.Integer advanceAccessOvwPrd,
           java.lang.String advanceAccessOvwType,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration[] bsgConfiguration,
           java.lang.Double cosAccfeeOvw,
           java.lang.Integer cosAccfeeOvwPrd,
           java.lang.String cosAccfeeOvwType,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosActivationDate,
           java.lang.Integer cosPendingStatus,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosPendingStatusDate,
           java.lang.Integer cosQuantity,
           java.lang.Integer cosStatus,
           java.lang.Double cosSubfeeOvw,
           java.lang.String cosSubfeeOvwType,
           java.lang.Long cosTemplId,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosTrialEndDate,
           java.lang.Integer csPaymentConditionUsgInd,
           java.lang.Long csPrepaidTpId,
           java.lang.String csPrepaidTpIdPub,
           java.lang.String cugAction,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership[] cugMemberships,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber[] directoryNumbers,
           java.lang.Long extServiceId,
           java.lang.String extServiceIdPub,
           boolean isNewService,
           java.lang.String opAssistedAction,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue[] paramValues,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.Port[] ports,
           java.lang.Long profileId,
           java.lang.String snDes,
           java.lang.Long sncode,
           java.lang.String sncodePub,
           java.lang.String spDes,
           java.lang.Long spcode,
           java.lang.String spcodePub,
           java.lang.Long userReason) {
        this.advanceAccessOvw = advanceAccessOvw;
        this.advanceAccessOvwPrd = advanceAccessOvwPrd;
        this.advanceAccessOvwType = advanceAccessOvwType;
        this.bsgConfiguration = bsgConfiguration;
        this.cosAccfeeOvw = cosAccfeeOvw;
        this.cosAccfeeOvwPrd = cosAccfeeOvwPrd;
        this.cosAccfeeOvwType = cosAccfeeOvwType;
        this.cosActivationDate = cosActivationDate;
        this.cosPendingStatus = cosPendingStatus;
        this.cosPendingStatusDate = cosPendingStatusDate;
        this.cosQuantity = cosQuantity;
        this.cosStatus = cosStatus;
        this.cosSubfeeOvw = cosSubfeeOvw;
        this.cosSubfeeOvwType = cosSubfeeOvwType;
        this.cosTemplId = cosTemplId;
        this.cosTrialEndDate = cosTrialEndDate;
        this.csPaymentConditionUsgInd = csPaymentConditionUsgInd;
        this.csPrepaidTpId = csPrepaidTpId;
        this.csPrepaidTpIdPub = csPrepaidTpIdPub;
        this.cugAction = cugAction;
        this.cugMemberships = cugMemberships;
        this.directoryNumbers = directoryNumbers;
        this.extServiceId = extServiceId;
        this.extServiceIdPub = extServiceIdPub;
        this.isNewService = isNewService;
        this.opAssistedAction = opAssistedAction;
        this.paramValues = paramValues;
        this.ports = ports;
        this.profileId = profileId;
        this.snDes = snDes;
        this.sncode = sncode;
        this.sncodePub = sncodePub;
        this.spDes = spDes;
        this.spcode = spcode;
        this.spcodePub = spcodePub;
        this.userReason = userReason;
    }


    /**
     * Gets the advanceAccessOvw value for this Service.
     * 
     * @return advanceAccessOvw
     */
    public java.lang.Double getAdvanceAccessOvw() {
        return advanceAccessOvw;
    }


    /**
     * Sets the advanceAccessOvw value for this Service.
     * 
     * @param advanceAccessOvw
     */
    public void setAdvanceAccessOvw(java.lang.Double advanceAccessOvw) {
        this.advanceAccessOvw = advanceAccessOvw;
    }


    /**
     * Gets the advanceAccessOvwPrd value for this Service.
     * 
     * @return advanceAccessOvwPrd
     */
    public java.lang.Integer getAdvanceAccessOvwPrd() {
        return advanceAccessOvwPrd;
    }


    /**
     * Sets the advanceAccessOvwPrd value for this Service.
     * 
     * @param advanceAccessOvwPrd
     */
    public void setAdvanceAccessOvwPrd(java.lang.Integer advanceAccessOvwPrd) {
        this.advanceAccessOvwPrd = advanceAccessOvwPrd;
    }


    /**
     * Gets the advanceAccessOvwType value for this Service.
     * 
     * @return advanceAccessOvwType
     */
    public java.lang.String getAdvanceAccessOvwType() {
        return advanceAccessOvwType;
    }


    /**
     * Sets the advanceAccessOvwType value for this Service.
     * 
     * @param advanceAccessOvwType
     */
    public void setAdvanceAccessOvwType(java.lang.String advanceAccessOvwType) {
        this.advanceAccessOvwType = advanceAccessOvwType;
    }


    /**
     * Gets the bsgConfiguration value for this Service.
     * 
     * @return bsgConfiguration
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration[] getBsgConfiguration() {
        return bsgConfiguration;
    }


    /**
     * Sets the bsgConfiguration value for this Service.
     * 
     * @param bsgConfiguration
     */
    public void setBsgConfiguration(com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration[] bsgConfiguration) {
        this.bsgConfiguration = bsgConfiguration;
    }


    /**
     * Gets the cosAccfeeOvw value for this Service.
     * 
     * @return cosAccfeeOvw
     */
    public java.lang.Double getCosAccfeeOvw() {
        return cosAccfeeOvw;
    }


    /**
     * Sets the cosAccfeeOvw value for this Service.
     * 
     * @param cosAccfeeOvw
     */
    public void setCosAccfeeOvw(java.lang.Double cosAccfeeOvw) {
        this.cosAccfeeOvw = cosAccfeeOvw;
    }


    /**
     * Gets the cosAccfeeOvwPrd value for this Service.
     * 
     * @return cosAccfeeOvwPrd
     */
    public java.lang.Integer getCosAccfeeOvwPrd() {
        return cosAccfeeOvwPrd;
    }


    /**
     * Sets the cosAccfeeOvwPrd value for this Service.
     * 
     * @param cosAccfeeOvwPrd
     */
    public void setCosAccfeeOvwPrd(java.lang.Integer cosAccfeeOvwPrd) {
        this.cosAccfeeOvwPrd = cosAccfeeOvwPrd;
    }


    /**
     * Gets the cosAccfeeOvwType value for this Service.
     * 
     * @return cosAccfeeOvwType
     */
    public java.lang.String getCosAccfeeOvwType() {
        return cosAccfeeOvwType;
    }


    /**
     * Sets the cosAccfeeOvwType value for this Service.
     * 
     * @param cosAccfeeOvwType
     */
    public void setCosAccfeeOvwType(java.lang.String cosAccfeeOvwType) {
        this.cosAccfeeOvwType = cosAccfeeOvwType;
    }


    /**
     * Gets the cosActivationDate value for this Service.
     * 
     * @return cosActivationDate
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean getCosActivationDate() {
        return cosActivationDate;
    }


    /**
     * Sets the cosActivationDate value for this Service.
     * 
     * @param cosActivationDate
     */
    public void setCosActivationDate(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosActivationDate) {
        this.cosActivationDate = cosActivationDate;
    }


    /**
     * Gets the cosPendingStatus value for this Service.
     * 
     * @return cosPendingStatus
     */
    public java.lang.Integer getCosPendingStatus() {
        return cosPendingStatus;
    }


    /**
     * Sets the cosPendingStatus value for this Service.
     * 
     * @param cosPendingStatus
     */
    public void setCosPendingStatus(java.lang.Integer cosPendingStatus) {
        this.cosPendingStatus = cosPendingStatus;
    }


    /**
     * Gets the cosPendingStatusDate value for this Service.
     * 
     * @return cosPendingStatusDate
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean getCosPendingStatusDate() {
        return cosPendingStatusDate;
    }


    /**
     * Sets the cosPendingStatusDate value for this Service.
     * 
     * @param cosPendingStatusDate
     */
    public void setCosPendingStatusDate(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosPendingStatusDate) {
        this.cosPendingStatusDate = cosPendingStatusDate;
    }


    /**
     * Gets the cosQuantity value for this Service.
     * 
     * @return cosQuantity
     */
    public java.lang.Integer getCosQuantity() {
        return cosQuantity;
    }


    /**
     * Sets the cosQuantity value for this Service.
     * 
     * @param cosQuantity
     */
    public void setCosQuantity(java.lang.Integer cosQuantity) {
        this.cosQuantity = cosQuantity;
    }


    /**
     * Gets the cosStatus value for this Service.
     * 
     * @return cosStatus
     */
    public java.lang.Integer getCosStatus() {
        return cosStatus;
    }


    /**
     * Sets the cosStatus value for this Service.
     * 
     * @param cosStatus
     */
    public void setCosStatus(java.lang.Integer cosStatus) {
        this.cosStatus = cosStatus;
    }


    /**
     * Gets the cosSubfeeOvw value for this Service.
     * 
     * @return cosSubfeeOvw
     */
    public java.lang.Double getCosSubfeeOvw() {
        return cosSubfeeOvw;
    }


    /**
     * Sets the cosSubfeeOvw value for this Service.
     * 
     * @param cosSubfeeOvw
     */
    public void setCosSubfeeOvw(java.lang.Double cosSubfeeOvw) {
        this.cosSubfeeOvw = cosSubfeeOvw;
    }


    /**
     * Gets the cosSubfeeOvwType value for this Service.
     * 
     * @return cosSubfeeOvwType
     */
    public java.lang.String getCosSubfeeOvwType() {
        return cosSubfeeOvwType;
    }


    /**
     * Sets the cosSubfeeOvwType value for this Service.
     * 
     * @param cosSubfeeOvwType
     */
    public void setCosSubfeeOvwType(java.lang.String cosSubfeeOvwType) {
        this.cosSubfeeOvwType = cosSubfeeOvwType;
    }


    /**
     * Gets the cosTemplId value for this Service.
     * 
     * @return cosTemplId
     */
    public java.lang.Long getCosTemplId() {
        return cosTemplId;
    }


    /**
     * Sets the cosTemplId value for this Service.
     * 
     * @param cosTemplId
     */
    public void setCosTemplId(java.lang.Long cosTemplId) {
        this.cosTemplId = cosTemplId;
    }


    /**
     * Gets the cosTrialEndDate value for this Service.
     * 
     * @return cosTrialEndDate
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean getCosTrialEndDate() {
        return cosTrialEndDate;
    }


    /**
     * Sets the cosTrialEndDate value for this Service.
     * 
     * @param cosTrialEndDate
     */
    public void setCosTrialEndDate(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean cosTrialEndDate) {
        this.cosTrialEndDate = cosTrialEndDate;
    }


    /**
     * Gets the csPaymentConditionUsgInd value for this Service.
     * 
     * @return csPaymentConditionUsgInd
     */
    public java.lang.Integer getCsPaymentConditionUsgInd() {
        return csPaymentConditionUsgInd;
    }


    /**
     * Sets the csPaymentConditionUsgInd value for this Service.
     * 
     * @param csPaymentConditionUsgInd
     */
    public void setCsPaymentConditionUsgInd(java.lang.Integer csPaymentConditionUsgInd) {
        this.csPaymentConditionUsgInd = csPaymentConditionUsgInd;
    }


    /**
     * Gets the csPrepaidTpId value for this Service.
     * 
     * @return csPrepaidTpId
     */
    public java.lang.Long getCsPrepaidTpId() {
        return csPrepaidTpId;
    }


    /**
     * Sets the csPrepaidTpId value for this Service.
     * 
     * @param csPrepaidTpId
     */
    public void setCsPrepaidTpId(java.lang.Long csPrepaidTpId) {
        this.csPrepaidTpId = csPrepaidTpId;
    }


    /**
     * Gets the csPrepaidTpIdPub value for this Service.
     * 
     * @return csPrepaidTpIdPub
     */
    public java.lang.String getCsPrepaidTpIdPub() {
        return csPrepaidTpIdPub;
    }


    /**
     * Sets the csPrepaidTpIdPub value for this Service.
     * 
     * @param csPrepaidTpIdPub
     */
    public void setCsPrepaidTpIdPub(java.lang.String csPrepaidTpIdPub) {
        this.csPrepaidTpIdPub = csPrepaidTpIdPub;
    }


    /**
     * Gets the cugAction value for this Service.
     * 
     * @return cugAction
     */
    public java.lang.String getCugAction() {
        return cugAction;
    }


    /**
     * Sets the cugAction value for this Service.
     * 
     * @param cugAction
     */
    public void setCugAction(java.lang.String cugAction) {
        this.cugAction = cugAction;
    }


    /**
     * Gets the cugMemberships value for this Service.
     * 
     * @return cugMemberships
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership[] getCugMemberships() {
        return cugMemberships;
    }


    /**
     * Sets the cugMemberships value for this Service.
     * 
     * @param cugMemberships
     */
    public void setCugMemberships(com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership[] cugMemberships) {
        this.cugMemberships = cugMemberships;
    }


    /**
     * Gets the directoryNumbers value for this Service.
     * 
     * @return directoryNumbers
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber[] getDirectoryNumbers() {
        return directoryNumbers;
    }


    /**
     * Sets the directoryNumbers value for this Service.
     * 
     * @param directoryNumbers
     */
    public void setDirectoryNumbers(com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber[] directoryNumbers) {
        this.directoryNumbers = directoryNumbers;
    }


    /**
     * Gets the extServiceId value for this Service.
     * 
     * @return extServiceId
     */
    public java.lang.Long getExtServiceId() {
        return extServiceId;
    }


    /**
     * Sets the extServiceId value for this Service.
     * 
     * @param extServiceId
     */
    public void setExtServiceId(java.lang.Long extServiceId) {
        this.extServiceId = extServiceId;
    }


    /**
     * Gets the extServiceIdPub value for this Service.
     * 
     * @return extServiceIdPub
     */
    public java.lang.String getExtServiceIdPub() {
        return extServiceIdPub;
    }


    /**
     * Sets the extServiceIdPub value for this Service.
     * 
     * @param extServiceIdPub
     */
    public void setExtServiceIdPub(java.lang.String extServiceIdPub) {
        this.extServiceIdPub = extServiceIdPub;
    }


    /**
     * Gets the isNewService value for this Service.
     * 
     * @return isNewService
     */
    public boolean isIsNewService() {
        return isNewService;
    }


    /**
     * Sets the isNewService value for this Service.
     * 
     * @param isNewService
     */
    public void setIsNewService(boolean isNewService) {
        this.isNewService = isNewService;
    }


    /**
     * Gets the opAssistedAction value for this Service.
     * 
     * @return opAssistedAction
     */
    public java.lang.String getOpAssistedAction() {
        return opAssistedAction;
    }


    /**
     * Sets the opAssistedAction value for this Service.
     * 
     * @param opAssistedAction
     */
    public void setOpAssistedAction(java.lang.String opAssistedAction) {
        this.opAssistedAction = opAssistedAction;
    }


    /**
     * Gets the paramValues value for this Service.
     * 
     * @return paramValues
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue[] getParamValues() {
        return paramValues;
    }


    /**
     * Sets the paramValues value for this Service.
     * 
     * @param paramValues
     */
    public void setParamValues(com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue[] paramValues) {
        this.paramValues = paramValues;
    }


    /**
     * Gets the ports value for this Service.
     * 
     * @return ports
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.Port[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this Service.
     * 
     * @param ports
     */
    public void setPorts(com.billcom.apc.generatedSOAP.bscs.contractHandling.Port[] ports) {
        this.ports = ports;
    }


    /**
     * Gets the profileId value for this Service.
     * 
     * @return profileId
     */
    public java.lang.Long getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this Service.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.Long profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the snDes value for this Service.
     * 
     * @return snDes
     */
    public java.lang.String getSnDes() {
        return snDes;
    }


    /**
     * Sets the snDes value for this Service.
     * 
     * @param snDes
     */
    public void setSnDes(java.lang.String snDes) {
        this.snDes = snDes;
    }


    /**
     * Gets the sncode value for this Service.
     * 
     * @return sncode
     */
    public java.lang.Long getSncode() {
        return sncode;
    }


    /**
     * Sets the sncode value for this Service.
     * 
     * @param sncode
     */
    public void setSncode(java.lang.Long sncode) {
        this.sncode = sncode;
    }


    /**
     * Gets the sncodePub value for this Service.
     * 
     * @return sncodePub
     */
    public java.lang.String getSncodePub() {
        return sncodePub;
    }


    /**
     * Sets the sncodePub value for this Service.
     * 
     * @param sncodePub
     */
    public void setSncodePub(java.lang.String sncodePub) {
        this.sncodePub = sncodePub;
    }


    /**
     * Gets the spDes value for this Service.
     * 
     * @return spDes
     */
    public java.lang.String getSpDes() {
        return spDes;
    }


    /**
     * Sets the spDes value for this Service.
     * 
     * @param spDes
     */
    public void setSpDes(java.lang.String spDes) {
        this.spDes = spDes;
    }


    /**
     * Gets the spcode value for this Service.
     * 
     * @return spcode
     */
    public java.lang.Long getSpcode() {
        return spcode;
    }


    /**
     * Sets the spcode value for this Service.
     * 
     * @param spcode
     */
    public void setSpcode(java.lang.Long spcode) {
        this.spcode = spcode;
    }


    /**
     * Gets the spcodePub value for this Service.
     * 
     * @return spcodePub
     */
    public java.lang.String getSpcodePub() {
        return spcodePub;
    }


    /**
     * Sets the spcodePub value for this Service.
     * 
     * @param spcodePub
     */
    public void setSpcodePub(java.lang.String spcodePub) {
        this.spcodePub = spcodePub;
    }


    /**
     * Gets the userReason value for this Service.
     * 
     * @return userReason
     */
    public java.lang.Long getUserReason() {
        return userReason;
    }


    /**
     * Sets the userReason value for this Service.
     * 
     * @param userReason
     */
    public void setUserReason(java.lang.Long userReason) {
        this.userReason = userReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advanceAccessOvw==null && other.getAdvanceAccessOvw()==null) || 
             (this.advanceAccessOvw!=null &&
              this.advanceAccessOvw.equals(other.getAdvanceAccessOvw()))) &&
            ((this.advanceAccessOvwPrd==null && other.getAdvanceAccessOvwPrd()==null) || 
             (this.advanceAccessOvwPrd!=null &&
              this.advanceAccessOvwPrd.equals(other.getAdvanceAccessOvwPrd()))) &&
            ((this.advanceAccessOvwType==null && other.getAdvanceAccessOvwType()==null) || 
             (this.advanceAccessOvwType!=null &&
              this.advanceAccessOvwType.equals(other.getAdvanceAccessOvwType()))) &&
            ((this.bsgConfiguration==null && other.getBsgConfiguration()==null) || 
             (this.bsgConfiguration!=null &&
              java.util.Arrays.equals(this.bsgConfiguration, other.getBsgConfiguration()))) &&
            ((this.cosAccfeeOvw==null && other.getCosAccfeeOvw()==null) || 
             (this.cosAccfeeOvw!=null &&
              this.cosAccfeeOvw.equals(other.getCosAccfeeOvw()))) &&
            ((this.cosAccfeeOvwPrd==null && other.getCosAccfeeOvwPrd()==null) || 
             (this.cosAccfeeOvwPrd!=null &&
              this.cosAccfeeOvwPrd.equals(other.getCosAccfeeOvwPrd()))) &&
            ((this.cosAccfeeOvwType==null && other.getCosAccfeeOvwType()==null) || 
             (this.cosAccfeeOvwType!=null &&
              this.cosAccfeeOvwType.equals(other.getCosAccfeeOvwType()))) &&
            ((this.cosActivationDate==null && other.getCosActivationDate()==null) || 
             (this.cosActivationDate!=null &&
              this.cosActivationDate.equals(other.getCosActivationDate()))) &&
            ((this.cosPendingStatus==null && other.getCosPendingStatus()==null) || 
             (this.cosPendingStatus!=null &&
              this.cosPendingStatus.equals(other.getCosPendingStatus()))) &&
            ((this.cosPendingStatusDate==null && other.getCosPendingStatusDate()==null) || 
             (this.cosPendingStatusDate!=null &&
              this.cosPendingStatusDate.equals(other.getCosPendingStatusDate()))) &&
            ((this.cosQuantity==null && other.getCosQuantity()==null) || 
             (this.cosQuantity!=null &&
              this.cosQuantity.equals(other.getCosQuantity()))) &&
            ((this.cosStatus==null && other.getCosStatus()==null) || 
             (this.cosStatus!=null &&
              this.cosStatus.equals(other.getCosStatus()))) &&
            ((this.cosSubfeeOvw==null && other.getCosSubfeeOvw()==null) || 
             (this.cosSubfeeOvw!=null &&
              this.cosSubfeeOvw.equals(other.getCosSubfeeOvw()))) &&
            ((this.cosSubfeeOvwType==null && other.getCosSubfeeOvwType()==null) || 
             (this.cosSubfeeOvwType!=null &&
              this.cosSubfeeOvwType.equals(other.getCosSubfeeOvwType()))) &&
            ((this.cosTemplId==null && other.getCosTemplId()==null) || 
             (this.cosTemplId!=null &&
              this.cosTemplId.equals(other.getCosTemplId()))) &&
            ((this.cosTrialEndDate==null && other.getCosTrialEndDate()==null) || 
             (this.cosTrialEndDate!=null &&
              this.cosTrialEndDate.equals(other.getCosTrialEndDate()))) &&
            ((this.csPaymentConditionUsgInd==null && other.getCsPaymentConditionUsgInd()==null) || 
             (this.csPaymentConditionUsgInd!=null &&
              this.csPaymentConditionUsgInd.equals(other.getCsPaymentConditionUsgInd()))) &&
            ((this.csPrepaidTpId==null && other.getCsPrepaidTpId()==null) || 
             (this.csPrepaidTpId!=null &&
              this.csPrepaidTpId.equals(other.getCsPrepaidTpId()))) &&
            ((this.csPrepaidTpIdPub==null && other.getCsPrepaidTpIdPub()==null) || 
             (this.csPrepaidTpIdPub!=null &&
              this.csPrepaidTpIdPub.equals(other.getCsPrepaidTpIdPub()))) &&
            ((this.cugAction==null && other.getCugAction()==null) || 
             (this.cugAction!=null &&
              this.cugAction.equals(other.getCugAction()))) &&
            ((this.cugMemberships==null && other.getCugMemberships()==null) || 
             (this.cugMemberships!=null &&
              java.util.Arrays.equals(this.cugMemberships, other.getCugMemberships()))) &&
            ((this.directoryNumbers==null && other.getDirectoryNumbers()==null) || 
             (this.directoryNumbers!=null &&
              java.util.Arrays.equals(this.directoryNumbers, other.getDirectoryNumbers()))) &&
            ((this.extServiceId==null && other.getExtServiceId()==null) || 
             (this.extServiceId!=null &&
              this.extServiceId.equals(other.getExtServiceId()))) &&
            ((this.extServiceIdPub==null && other.getExtServiceIdPub()==null) || 
             (this.extServiceIdPub!=null &&
              this.extServiceIdPub.equals(other.getExtServiceIdPub()))) &&
            this.isNewService == other.isIsNewService() &&
            ((this.opAssistedAction==null && other.getOpAssistedAction()==null) || 
             (this.opAssistedAction!=null &&
              this.opAssistedAction.equals(other.getOpAssistedAction()))) &&
            ((this.paramValues==null && other.getParamValues()==null) || 
             (this.paramValues!=null &&
              java.util.Arrays.equals(this.paramValues, other.getParamValues()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              java.util.Arrays.equals(this.ports, other.getPorts()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.snDes==null && other.getSnDes()==null) || 
             (this.snDes!=null &&
              this.snDes.equals(other.getSnDes()))) &&
            ((this.sncode==null && other.getSncode()==null) || 
             (this.sncode!=null &&
              this.sncode.equals(other.getSncode()))) &&
            ((this.sncodePub==null && other.getSncodePub()==null) || 
             (this.sncodePub!=null &&
              this.sncodePub.equals(other.getSncodePub()))) &&
            ((this.spDes==null && other.getSpDes()==null) || 
             (this.spDes!=null &&
              this.spDes.equals(other.getSpDes()))) &&
            ((this.spcode==null && other.getSpcode()==null) || 
             (this.spcode!=null &&
              this.spcode.equals(other.getSpcode()))) &&
            ((this.spcodePub==null && other.getSpcodePub()==null) || 
             (this.spcodePub!=null &&
              this.spcodePub.equals(other.getSpcodePub()))) &&
            ((this.userReason==null && other.getUserReason()==null) || 
             (this.userReason!=null &&
              this.userReason.equals(other.getUserReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdvanceAccessOvw() != null) {
            _hashCode += getAdvanceAccessOvw().hashCode();
        }
        if (getAdvanceAccessOvwPrd() != null) {
            _hashCode += getAdvanceAccessOvwPrd().hashCode();
        }
        if (getAdvanceAccessOvwType() != null) {
            _hashCode += getAdvanceAccessOvwType().hashCode();
        }
        if (getBsgConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBsgConfiguration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBsgConfiguration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCosAccfeeOvw() != null) {
            _hashCode += getCosAccfeeOvw().hashCode();
        }
        if (getCosAccfeeOvwPrd() != null) {
            _hashCode += getCosAccfeeOvwPrd().hashCode();
        }
        if (getCosAccfeeOvwType() != null) {
            _hashCode += getCosAccfeeOvwType().hashCode();
        }
        if (getCosActivationDate() != null) {
            _hashCode += getCosActivationDate().hashCode();
        }
        if (getCosPendingStatus() != null) {
            _hashCode += getCosPendingStatus().hashCode();
        }
        if (getCosPendingStatusDate() != null) {
            _hashCode += getCosPendingStatusDate().hashCode();
        }
        if (getCosQuantity() != null) {
            _hashCode += getCosQuantity().hashCode();
        }
        if (getCosStatus() != null) {
            _hashCode += getCosStatus().hashCode();
        }
        if (getCosSubfeeOvw() != null) {
            _hashCode += getCosSubfeeOvw().hashCode();
        }
        if (getCosSubfeeOvwType() != null) {
            _hashCode += getCosSubfeeOvwType().hashCode();
        }
        if (getCosTemplId() != null) {
            _hashCode += getCosTemplId().hashCode();
        }
        if (getCosTrialEndDate() != null) {
            _hashCode += getCosTrialEndDate().hashCode();
        }
        if (getCsPaymentConditionUsgInd() != null) {
            _hashCode += getCsPaymentConditionUsgInd().hashCode();
        }
        if (getCsPrepaidTpId() != null) {
            _hashCode += getCsPrepaidTpId().hashCode();
        }
        if (getCsPrepaidTpIdPub() != null) {
            _hashCode += getCsPrepaidTpIdPub().hashCode();
        }
        if (getCugAction() != null) {
            _hashCode += getCugAction().hashCode();
        }
        if (getCugMemberships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCugMemberships());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCugMemberships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectoryNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectoryNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirectoryNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtServiceId() != null) {
            _hashCode += getExtServiceId().hashCode();
        }
        if (getExtServiceIdPub() != null) {
            _hashCode += getExtServiceIdPub().hashCode();
        }
        _hashCode += (isIsNewService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOpAssistedAction() != null) {
            _hashCode += getOpAssistedAction().hashCode();
        }
        if (getParamValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPorts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPorts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPorts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getSnDes() != null) {
            _hashCode += getSnDes().hashCode();
        }
        if (getSncode() != null) {
            _hashCode += getSncode().hashCode();
        }
        if (getSncodePub() != null) {
            _hashCode += getSncodePub().hashCode();
        }
        if (getSpDes() != null) {
            _hashCode += getSpDes().hashCode();
        }
        if (getSpcode() != null) {
            _hashCode += getSpcode().hashCode();
        }
        if (getSpcodePub() != null) {
            _hashCode += getSpcodePub().hashCode();
        }
        if (getUserReason() != null) {
            _hashCode += getUserReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvwPrd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvwPrd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bsgConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BsgConfiguration"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvwPrd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvwPrd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosActivationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosPendingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosPendingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosPendingStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosPendingStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosSubfeeOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosSubfeeOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosSubfeeOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosSubfeeOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosTemplId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosTemplId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosTrialEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosTrialEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPaymentConditionUsgInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPaymentConditionUsgInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPrepaidTpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPrepaidTpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPrepaidTpIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPrepaidTpIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugMemberships");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugMemberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CugMembership"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "directoryNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirectoryNumber"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extServiceIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extServiceIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isNewService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opAssistedAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "opAssistedAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "paramValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ParamValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Port"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "profileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sncodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
