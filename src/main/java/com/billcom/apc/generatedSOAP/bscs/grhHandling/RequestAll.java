/**
 * RequestAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class RequestAll  implements java.io.Serializable {
    private java.lang.Integer bscsTicklerNumber;

    private java.lang.Long coId;

    private java.lang.Integer coNbMonthAdvanceGranted;

    private java.lang.Integer coNbMonthAdvancePaid;

    private java.lang.Integer coNbMonthTrialExtra;

    private java.lang.Integer coNbMonthTrialFree;

    private java.util.Calendar coNewTrialEnd_date;

    private java.util.Calendar coNewTrialStartDate;

    private java.util.Calendar coOldTrialEndDate;

    private java.util.Calendar coOldTrialStartDate;

    private java.lang.Integer coTmCode;

    private java.lang.Long customerId;

    private java.util.Calendar entryDate;

    private java.lang.Long errorCode;

    private java.lang.String errorMessage;

    private java.util.Calendar lastModdate;

    private java.util.Calendar operationReferenceDate;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType operationType;

    private java.lang.Integer priority;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode processingMode;

    private java.lang.Long productBillId;

    private java.lang.Long requestId;

    private java.lang.Long requestPerformDealer;

    private java.lang.String requestPerformUser;

    private java.lang.Long requestPostDealer;

    private java.lang.String requestPostUser;

    private java.lang.Long sourceId;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition statusDefinition;

    public RequestAll() {
    }

    public RequestAll(
           java.lang.Integer bscsTicklerNumber,
           java.lang.Long coId,
           java.lang.Integer coNbMonthAdvanceGranted,
           java.lang.Integer coNbMonthAdvancePaid,
           java.lang.Integer coNbMonthTrialExtra,
           java.lang.Integer coNbMonthTrialFree,
           java.util.Calendar coNewTrialEnd_date,
           java.util.Calendar coNewTrialStartDate,
           java.util.Calendar coOldTrialEndDate,
           java.util.Calendar coOldTrialStartDate,
           java.lang.Integer coTmCode,
           java.lang.Long customerId,
           java.util.Calendar entryDate,
           java.lang.Long errorCode,
           java.lang.String errorMessage,
           java.util.Calendar lastModdate,
           java.util.Calendar operationReferenceDate,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType operationType,
           java.lang.Integer priority,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode processingMode,
           java.lang.Long productBillId,
           java.lang.Long requestId,
           java.lang.Long requestPerformDealer,
           java.lang.String requestPerformUser,
           java.lang.Long requestPostDealer,
           java.lang.String requestPostUser,
           java.lang.Long sourceId,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition statusDefinition) {
           this.bscsTicklerNumber = bscsTicklerNumber;
           this.coId = coId;
           this.coNbMonthAdvanceGranted = coNbMonthAdvanceGranted;
           this.coNbMonthAdvancePaid = coNbMonthAdvancePaid;
           this.coNbMonthTrialExtra = coNbMonthTrialExtra;
           this.coNbMonthTrialFree = coNbMonthTrialFree;
           this.coNewTrialEnd_date = coNewTrialEnd_date;
           this.coNewTrialStartDate = coNewTrialStartDate;
           this.coOldTrialEndDate = coOldTrialEndDate;
           this.coOldTrialStartDate = coOldTrialStartDate;
           this.coTmCode = coTmCode;
           this.customerId = customerId;
           this.entryDate = entryDate;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.lastModdate = lastModdate;
           this.operationReferenceDate = operationReferenceDate;
           this.operationType = operationType;
           this.priority = priority;
           this.processingMode = processingMode;
           this.productBillId = productBillId;
           this.requestId = requestId;
           this.requestPerformDealer = requestPerformDealer;
           this.requestPerformUser = requestPerformUser;
           this.requestPostDealer = requestPostDealer;
           this.requestPostUser = requestPostUser;
           this.sourceId = sourceId;
           this.statusDefinition = statusDefinition;
    }


    /**
     * Gets the bscsTicklerNumber value for this RequestAll.
     * 
     * @return bscsTicklerNumber
     */
    public java.lang.Integer getBscsTicklerNumber() {
        return bscsTicklerNumber;
    }


    /**
     * Sets the bscsTicklerNumber value for this RequestAll.
     * 
     * @param bscsTicklerNumber
     */
    public void setBscsTicklerNumber(java.lang.Integer bscsTicklerNumber) {
        this.bscsTicklerNumber = bscsTicklerNumber;
    }


    /**
     * Gets the coId value for this RequestAll.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this RequestAll.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coNbMonthAdvanceGranted value for this RequestAll.
     * 
     * @return coNbMonthAdvanceGranted
     */
    public java.lang.Integer getCoNbMonthAdvanceGranted() {
        return coNbMonthAdvanceGranted;
    }


    /**
     * Sets the coNbMonthAdvanceGranted value for this RequestAll.
     * 
     * @param coNbMonthAdvanceGranted
     */
    public void setCoNbMonthAdvanceGranted(java.lang.Integer coNbMonthAdvanceGranted) {
        this.coNbMonthAdvanceGranted = coNbMonthAdvanceGranted;
    }


    /**
     * Gets the coNbMonthAdvancePaid value for this RequestAll.
     * 
     * @return coNbMonthAdvancePaid
     */
    public java.lang.Integer getCoNbMonthAdvancePaid() {
        return coNbMonthAdvancePaid;
    }


    /**
     * Sets the coNbMonthAdvancePaid value for this RequestAll.
     * 
     * @param coNbMonthAdvancePaid
     */
    public void setCoNbMonthAdvancePaid(java.lang.Integer coNbMonthAdvancePaid) {
        this.coNbMonthAdvancePaid = coNbMonthAdvancePaid;
    }


    /**
     * Gets the coNbMonthTrialExtra value for this RequestAll.
     * 
     * @return coNbMonthTrialExtra
     */
    public java.lang.Integer getCoNbMonthTrialExtra() {
        return coNbMonthTrialExtra;
    }


    /**
     * Sets the coNbMonthTrialExtra value for this RequestAll.
     * 
     * @param coNbMonthTrialExtra
     */
    public void setCoNbMonthTrialExtra(java.lang.Integer coNbMonthTrialExtra) {
        this.coNbMonthTrialExtra = coNbMonthTrialExtra;
    }


    /**
     * Gets the coNbMonthTrialFree value for this RequestAll.
     * 
     * @return coNbMonthTrialFree
     */
    public java.lang.Integer getCoNbMonthTrialFree() {
        return coNbMonthTrialFree;
    }


    /**
     * Sets the coNbMonthTrialFree value for this RequestAll.
     * 
     * @param coNbMonthTrialFree
     */
    public void setCoNbMonthTrialFree(java.lang.Integer coNbMonthTrialFree) {
        this.coNbMonthTrialFree = coNbMonthTrialFree;
    }


    /**
     * Gets the coNewTrialEnd_date value for this RequestAll.
     * 
     * @return coNewTrialEnd_date
     */
    public java.util.Calendar getCoNewTrialEnd_date() {
        return coNewTrialEnd_date;
    }


    /**
     * Sets the coNewTrialEnd_date value for this RequestAll.
     * 
     * @param coNewTrialEnd_date
     */
    public void setCoNewTrialEnd_date(java.util.Calendar coNewTrialEnd_date) {
        this.coNewTrialEnd_date = coNewTrialEnd_date;
    }


    /**
     * Gets the coNewTrialStartDate value for this RequestAll.
     * 
     * @return coNewTrialStartDate
     */
    public java.util.Calendar getCoNewTrialStartDate() {
        return coNewTrialStartDate;
    }


    /**
     * Sets the coNewTrialStartDate value for this RequestAll.
     * 
     * @param coNewTrialStartDate
     */
    public void setCoNewTrialStartDate(java.util.Calendar coNewTrialStartDate) {
        this.coNewTrialStartDate = coNewTrialStartDate;
    }


    /**
     * Gets the coOldTrialEndDate value for this RequestAll.
     * 
     * @return coOldTrialEndDate
     */
    public java.util.Calendar getCoOldTrialEndDate() {
        return coOldTrialEndDate;
    }


    /**
     * Sets the coOldTrialEndDate value for this RequestAll.
     * 
     * @param coOldTrialEndDate
     */
    public void setCoOldTrialEndDate(java.util.Calendar coOldTrialEndDate) {
        this.coOldTrialEndDate = coOldTrialEndDate;
    }


    /**
     * Gets the coOldTrialStartDate value for this RequestAll.
     * 
     * @return coOldTrialStartDate
     */
    public java.util.Calendar getCoOldTrialStartDate() {
        return coOldTrialStartDate;
    }


    /**
     * Sets the coOldTrialStartDate value for this RequestAll.
     * 
     * @param coOldTrialStartDate
     */
    public void setCoOldTrialStartDate(java.util.Calendar coOldTrialStartDate) {
        this.coOldTrialStartDate = coOldTrialStartDate;
    }


    /**
     * Gets the coTmCode value for this RequestAll.
     * 
     * @return coTmCode
     */
    public java.lang.Integer getCoTmCode() {
        return coTmCode;
    }


    /**
     * Sets the coTmCode value for this RequestAll.
     * 
     * @param coTmCode
     */
    public void setCoTmCode(java.lang.Integer coTmCode) {
        this.coTmCode = coTmCode;
    }


    /**
     * Gets the customerId value for this RequestAll.
     * 
     * @return customerId
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this RequestAll.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the entryDate value for this RequestAll.
     * 
     * @return entryDate
     */
    public java.util.Calendar getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this RequestAll.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Calendar entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the errorCode value for this RequestAll.
     * 
     * @return errorCode
     */
    public java.lang.Long getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this RequestAll.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Long errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this RequestAll.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this RequestAll.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the lastModdate value for this RequestAll.
     * 
     * @return lastModdate
     */
    public java.util.Calendar getLastModdate() {
        return lastModdate;
    }


    /**
     * Sets the lastModdate value for this RequestAll.
     * 
     * @param lastModdate
     */
    public void setLastModdate(java.util.Calendar lastModdate) {
        this.lastModdate = lastModdate;
    }


    /**
     * Gets the operationReferenceDate value for this RequestAll.
     * 
     * @return operationReferenceDate
     */
    public java.util.Calendar getOperationReferenceDate() {
        return operationReferenceDate;
    }


    /**
     * Sets the operationReferenceDate value for this RequestAll.
     * 
     * @param operationReferenceDate
     */
    public void setOperationReferenceDate(java.util.Calendar operationReferenceDate) {
        this.operationReferenceDate = operationReferenceDate;
    }


    /**
     * Gets the operationType value for this RequestAll.
     * 
     * @return operationType
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this RequestAll.
     * 
     * @param operationType
     */
    public void setOperationType(com.billcom.apc.generatedSOAP.bscs.grhHandling.OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the priority value for this RequestAll.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this RequestAll.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the processingMode value for this RequestAll.
     * 
     * @return processingMode
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode getProcessingMode() {
        return processingMode;
    }


    /**
     * Sets the processingMode value for this RequestAll.
     * 
     * @param processingMode
     */
    public void setProcessingMode(com.billcom.apc.generatedSOAP.bscs.grhHandling.ProcessingMode processingMode) {
        this.processingMode = processingMode;
    }


    /**
     * Gets the productBillId value for this RequestAll.
     * 
     * @return productBillId
     */
    public java.lang.Long getProductBillId() {
        return productBillId;
    }


    /**
     * Sets the productBillId value for this RequestAll.
     * 
     * @param productBillId
     */
    public void setProductBillId(java.lang.Long productBillId) {
        this.productBillId = productBillId;
    }


    /**
     * Gets the requestId value for this RequestAll.
     * 
     * @return requestId
     */
    public java.lang.Long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this RequestAll.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.Long requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the requestPerformDealer value for this RequestAll.
     * 
     * @return requestPerformDealer
     */
    public java.lang.Long getRequestPerformDealer() {
        return requestPerformDealer;
    }


    /**
     * Sets the requestPerformDealer value for this RequestAll.
     * 
     * @param requestPerformDealer
     */
    public void setRequestPerformDealer(java.lang.Long requestPerformDealer) {
        this.requestPerformDealer = requestPerformDealer;
    }


    /**
     * Gets the requestPerformUser value for this RequestAll.
     * 
     * @return requestPerformUser
     */
    public java.lang.String getRequestPerformUser() {
        return requestPerformUser;
    }


    /**
     * Sets the requestPerformUser value for this RequestAll.
     * 
     * @param requestPerformUser
     */
    public void setRequestPerformUser(java.lang.String requestPerformUser) {
        this.requestPerformUser = requestPerformUser;
    }


    /**
     * Gets the requestPostDealer value for this RequestAll.
     * 
     * @return requestPostDealer
     */
    public java.lang.Long getRequestPostDealer() {
        return requestPostDealer;
    }


    /**
     * Sets the requestPostDealer value for this RequestAll.
     * 
     * @param requestPostDealer
     */
    public void setRequestPostDealer(java.lang.Long requestPostDealer) {
        this.requestPostDealer = requestPostDealer;
    }


    /**
     * Gets the requestPostUser value for this RequestAll.
     * 
     * @return requestPostUser
     */
    public java.lang.String getRequestPostUser() {
        return requestPostUser;
    }


    /**
     * Sets the requestPostUser value for this RequestAll.
     * 
     * @param requestPostUser
     */
    public void setRequestPostUser(java.lang.String requestPostUser) {
        this.requestPostUser = requestPostUser;
    }


    /**
     * Gets the sourceId value for this RequestAll.
     * 
     * @return sourceId
     */
    public java.lang.Long getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this RequestAll.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.Long sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the statusDefinition value for this RequestAll.
     * 
     * @return statusDefinition
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition getStatusDefinition() {
        return statusDefinition;
    }


    /**
     * Sets the statusDefinition value for this RequestAll.
     * 
     * @param statusDefinition
     */
    public void setStatusDefinition(com.billcom.apc.generatedSOAP.bscs.grhHandling.StatusDefinition statusDefinition) {
        this.statusDefinition = statusDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestAll)) return false;
        RequestAll other = (RequestAll) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bscsTicklerNumber==null && other.getBscsTicklerNumber()==null) || 
             (this.bscsTicklerNumber!=null &&
              this.bscsTicklerNumber.equals(other.getBscsTicklerNumber()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.coNbMonthAdvanceGranted==null && other.getCoNbMonthAdvanceGranted()==null) || 
             (this.coNbMonthAdvanceGranted!=null &&
              this.coNbMonthAdvanceGranted.equals(other.getCoNbMonthAdvanceGranted()))) &&
            ((this.coNbMonthAdvancePaid==null && other.getCoNbMonthAdvancePaid()==null) || 
             (this.coNbMonthAdvancePaid!=null &&
              this.coNbMonthAdvancePaid.equals(other.getCoNbMonthAdvancePaid()))) &&
            ((this.coNbMonthTrialExtra==null && other.getCoNbMonthTrialExtra()==null) || 
             (this.coNbMonthTrialExtra!=null &&
              this.coNbMonthTrialExtra.equals(other.getCoNbMonthTrialExtra()))) &&
            ((this.coNbMonthTrialFree==null && other.getCoNbMonthTrialFree()==null) || 
             (this.coNbMonthTrialFree!=null &&
              this.coNbMonthTrialFree.equals(other.getCoNbMonthTrialFree()))) &&
            ((this.coNewTrialEnd_date==null && other.getCoNewTrialEnd_date()==null) || 
             (this.coNewTrialEnd_date!=null &&
              this.coNewTrialEnd_date.equals(other.getCoNewTrialEnd_date()))) &&
            ((this.coNewTrialStartDate==null && other.getCoNewTrialStartDate()==null) || 
             (this.coNewTrialStartDate!=null &&
              this.coNewTrialStartDate.equals(other.getCoNewTrialStartDate()))) &&
            ((this.coOldTrialEndDate==null && other.getCoOldTrialEndDate()==null) || 
             (this.coOldTrialEndDate!=null &&
              this.coOldTrialEndDate.equals(other.getCoOldTrialEndDate()))) &&
            ((this.coOldTrialStartDate==null && other.getCoOldTrialStartDate()==null) || 
             (this.coOldTrialStartDate!=null &&
              this.coOldTrialStartDate.equals(other.getCoOldTrialStartDate()))) &&
            ((this.coTmCode==null && other.getCoTmCode()==null) || 
             (this.coTmCode!=null &&
              this.coTmCode.equals(other.getCoTmCode()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.lastModdate==null && other.getLastModdate()==null) || 
             (this.lastModdate!=null &&
              this.lastModdate.equals(other.getLastModdate()))) &&
            ((this.operationReferenceDate==null && other.getOperationReferenceDate()==null) || 
             (this.operationReferenceDate!=null &&
              this.operationReferenceDate.equals(other.getOperationReferenceDate()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.processingMode==null && other.getProcessingMode()==null) || 
             (this.processingMode!=null &&
              this.processingMode.equals(other.getProcessingMode()))) &&
            ((this.productBillId==null && other.getProductBillId()==null) || 
             (this.productBillId!=null &&
              this.productBillId.equals(other.getProductBillId()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.requestPerformDealer==null && other.getRequestPerformDealer()==null) || 
             (this.requestPerformDealer!=null &&
              this.requestPerformDealer.equals(other.getRequestPerformDealer()))) &&
            ((this.requestPerformUser==null && other.getRequestPerformUser()==null) || 
             (this.requestPerformUser!=null &&
              this.requestPerformUser.equals(other.getRequestPerformUser()))) &&
            ((this.requestPostDealer==null && other.getRequestPostDealer()==null) || 
             (this.requestPostDealer!=null &&
              this.requestPostDealer.equals(other.getRequestPostDealer()))) &&
            ((this.requestPostUser==null && other.getRequestPostUser()==null) || 
             (this.requestPostUser!=null &&
              this.requestPostUser.equals(other.getRequestPostUser()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.statusDefinition==null && other.getStatusDefinition()==null) || 
             (this.statusDefinition!=null &&
              this.statusDefinition.equals(other.getStatusDefinition())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBscsTicklerNumber() != null) {
            _hashCode += getBscsTicklerNumber().hashCode();
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCoNbMonthAdvanceGranted() != null) {
            _hashCode += getCoNbMonthAdvanceGranted().hashCode();
        }
        if (getCoNbMonthAdvancePaid() != null) {
            _hashCode += getCoNbMonthAdvancePaid().hashCode();
        }
        if (getCoNbMonthTrialExtra() != null) {
            _hashCode += getCoNbMonthTrialExtra().hashCode();
        }
        if (getCoNbMonthTrialFree() != null) {
            _hashCode += getCoNbMonthTrialFree().hashCode();
        }
        if (getCoNewTrialEnd_date() != null) {
            _hashCode += getCoNewTrialEnd_date().hashCode();
        }
        if (getCoNewTrialStartDate() != null) {
            _hashCode += getCoNewTrialStartDate().hashCode();
        }
        if (getCoOldTrialEndDate() != null) {
            _hashCode += getCoOldTrialEndDate().hashCode();
        }
        if (getCoOldTrialStartDate() != null) {
            _hashCode += getCoOldTrialStartDate().hashCode();
        }
        if (getCoTmCode() != null) {
            _hashCode += getCoTmCode().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getLastModdate() != null) {
            _hashCode += getLastModdate().hashCode();
        }
        if (getOperationReferenceDate() != null) {
            _hashCode += getOperationReferenceDate().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProcessingMode() != null) {
            _hashCode += getProcessingMode().hashCode();
        }
        if (getProductBillId() != null) {
            _hashCode += getProductBillId().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getRequestPerformDealer() != null) {
            _hashCode += getRequestPerformDealer().hashCode();
        }
        if (getRequestPerformUser() != null) {
            _hashCode += getRequestPerformUser().hashCode();
        }
        if (getRequestPostDealer() != null) {
            _hashCode += getRequestPostDealer().hashCode();
        }
        if (getRequestPostUser() != null) {
            _hashCode += getRequestPostUser().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getStatusDefinition() != null) {
            _hashCode += getStatusDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestAll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RequestAll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bscsTicklerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bscsTicklerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNbMonthAdvanceGranted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNbMonthAdvanceGranted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNbMonthAdvancePaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNbMonthAdvancePaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNbMonthTrialExtra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNbMonthTrialExtra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNbMonthTrialFree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNbMonthTrialFree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNewTrialEnd_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNewTrialEnd_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNewTrialStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coNewTrialStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coOldTrialEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coOldTrialEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coOldTrialStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coOldTrialStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coTmCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coTmCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "entryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "lastModdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationReferenceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "operationReferenceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "processingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProcessingMode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productBillId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "productBillId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPerformDealer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestPerformDealer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPerformUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestPerformUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPostDealer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestPostDealer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPostUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "requestPostUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "statusDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "StatusDefinition"));
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
