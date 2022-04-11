/**
 * CommitmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.grhHandling;

public class CommitmentRequest  implements java.io.Serializable {
    private java.lang.Long commitmentDuration;

    private java.lang.String commitmentEntityDescription;

    private java.lang.Long commitmentEntityId;

    private com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType commitmentEntityType;

    private java.lang.Integer commitmentEntityVersion;

    private java.lang.Double commitmentShift;

    private java.lang.String commitmentShiftUnit;

    private java.util.Calendar entryDate;

    private java.util.Calendar lastModDate;

    private java.lang.Double packAmountGross;

    private java.lang.Double packAmountNet;

    private java.lang.String packEndDate_BaselineRule;

    private java.lang.String packStartDate_BaselineRule;

    private java.lang.Integer priority;

    private java.lang.Long renewalDerogationInterval;

    private java.lang.Long requestId;

    private java.lang.Double subventionAmountGross;

    private java.lang.Double subventionAmountNet;

    private java.lang.String subventionFlag;

    public CommitmentRequest() {
    }

    public CommitmentRequest(
           java.lang.Long commitmentDuration,
           java.lang.String commitmentEntityDescription,
           java.lang.Long commitmentEntityId,
           com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType commitmentEntityType,
           java.lang.Integer commitmentEntityVersion,
           java.lang.Double commitmentShift,
           java.lang.String commitmentShiftUnit,
           java.util.Calendar entryDate,
           java.util.Calendar lastModDate,
           java.lang.Double packAmountGross,
           java.lang.Double packAmountNet,
           java.lang.String packEndDate_BaselineRule,
           java.lang.String packStartDate_BaselineRule,
           java.lang.Integer priority,
           java.lang.Long renewalDerogationInterval,
           java.lang.Long requestId,
           java.lang.Double subventionAmountGross,
           java.lang.Double subventionAmountNet,
           java.lang.String subventionFlag) {
           this.commitmentDuration = commitmentDuration;
           this.commitmentEntityDescription = commitmentEntityDescription;
           this.commitmentEntityId = commitmentEntityId;
           this.commitmentEntityType = commitmentEntityType;
           this.commitmentEntityVersion = commitmentEntityVersion;
           this.commitmentShift = commitmentShift;
           this.commitmentShiftUnit = commitmentShiftUnit;
           this.entryDate = entryDate;
           this.lastModDate = lastModDate;
           this.packAmountGross = packAmountGross;
           this.packAmountNet = packAmountNet;
           this.packEndDate_BaselineRule = packEndDate_BaselineRule;
           this.packStartDate_BaselineRule = packStartDate_BaselineRule;
           this.priority = priority;
           this.renewalDerogationInterval = renewalDerogationInterval;
           this.requestId = requestId;
           this.subventionAmountGross = subventionAmountGross;
           this.subventionAmountNet = subventionAmountNet;
           this.subventionFlag = subventionFlag;
    }


    /**
     * Gets the commitmentDuration value for this CommitmentRequest.
     * 
     * @return commitmentDuration
     */
    public java.lang.Long getCommitmentDuration() {
        return commitmentDuration;
    }


    /**
     * Sets the commitmentDuration value for this CommitmentRequest.
     * 
     * @param commitmentDuration
     */
    public void setCommitmentDuration(java.lang.Long commitmentDuration) {
        this.commitmentDuration = commitmentDuration;
    }


    /**
     * Gets the commitmentEntityDescription value for this CommitmentRequest.
     * 
     * @return commitmentEntityDescription
     */
    public java.lang.String getCommitmentEntityDescription() {
        return commitmentEntityDescription;
    }


    /**
     * Sets the commitmentEntityDescription value for this CommitmentRequest.
     * 
     * @param commitmentEntityDescription
     */
    public void setCommitmentEntityDescription(java.lang.String commitmentEntityDescription) {
        this.commitmentEntityDescription = commitmentEntityDescription;
    }


    /**
     * Gets the commitmentEntityId value for this CommitmentRequest.
     * 
     * @return commitmentEntityId
     */
    public java.lang.Long getCommitmentEntityId() {
        return commitmentEntityId;
    }


    /**
     * Sets the commitmentEntityId value for this CommitmentRequest.
     * 
     * @param commitmentEntityId
     */
    public void setCommitmentEntityId(java.lang.Long commitmentEntityId) {
        this.commitmentEntityId = commitmentEntityId;
    }


    /**
     * Gets the commitmentEntityType value for this CommitmentRequest.
     * 
     * @return commitmentEntityType
     */
    public com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType getCommitmentEntityType() {
        return commitmentEntityType;
    }


    /**
     * Sets the commitmentEntityType value for this CommitmentRequest.
     * 
     * @param commitmentEntityType
     */
    public void setCommitmentEntityType(com.billcom.apc.generatedSOAP.bscs.grhHandling.CommitmentEntityType commitmentEntityType) {
        this.commitmentEntityType = commitmentEntityType;
    }


    /**
     * Gets the commitmentEntityVersion value for this CommitmentRequest.
     * 
     * @return commitmentEntityVersion
     */
    public java.lang.Integer getCommitmentEntityVersion() {
        return commitmentEntityVersion;
    }


    /**
     * Sets the commitmentEntityVersion value for this CommitmentRequest.
     * 
     * @param commitmentEntityVersion
     */
    public void setCommitmentEntityVersion(java.lang.Integer commitmentEntityVersion) {
        this.commitmentEntityVersion = commitmentEntityVersion;
    }


    /**
     * Gets the commitmentShift value for this CommitmentRequest.
     * 
     * @return commitmentShift
     */
    public java.lang.Double getCommitmentShift() {
        return commitmentShift;
    }


    /**
     * Sets the commitmentShift value for this CommitmentRequest.
     * 
     * @param commitmentShift
     */
    public void setCommitmentShift(java.lang.Double commitmentShift) {
        this.commitmentShift = commitmentShift;
    }


    /**
     * Gets the commitmentShiftUnit value for this CommitmentRequest.
     * 
     * @return commitmentShiftUnit
     */
    public java.lang.String getCommitmentShiftUnit() {
        return commitmentShiftUnit;
    }


    /**
     * Sets the commitmentShiftUnit value for this CommitmentRequest.
     * 
     * @param commitmentShiftUnit
     */
    public void setCommitmentShiftUnit(java.lang.String commitmentShiftUnit) {
        this.commitmentShiftUnit = commitmentShiftUnit;
    }


    /**
     * Gets the entryDate value for this CommitmentRequest.
     * 
     * @return entryDate
     */
    public java.util.Calendar getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this CommitmentRequest.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Calendar entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the lastModDate value for this CommitmentRequest.
     * 
     * @return lastModDate
     */
    public java.util.Calendar getLastModDate() {
        return lastModDate;
    }


    /**
     * Sets the lastModDate value for this CommitmentRequest.
     * 
     * @param lastModDate
     */
    public void setLastModDate(java.util.Calendar lastModDate) {
        this.lastModDate = lastModDate;
    }


    /**
     * Gets the packAmountGross value for this CommitmentRequest.
     * 
     * @return packAmountGross
     */
    public java.lang.Double getPackAmountGross() {
        return packAmountGross;
    }


    /**
     * Sets the packAmountGross value for this CommitmentRequest.
     * 
     * @param packAmountGross
     */
    public void setPackAmountGross(java.lang.Double packAmountGross) {
        this.packAmountGross = packAmountGross;
    }


    /**
     * Gets the packAmountNet value for this CommitmentRequest.
     * 
     * @return packAmountNet
     */
    public java.lang.Double getPackAmountNet() {
        return packAmountNet;
    }


    /**
     * Sets the packAmountNet value for this CommitmentRequest.
     * 
     * @param packAmountNet
     */
    public void setPackAmountNet(java.lang.Double packAmountNet) {
        this.packAmountNet = packAmountNet;
    }


    /**
     * Gets the packEndDate_BaselineRule value for this CommitmentRequest.
     * 
     * @return packEndDate_BaselineRule
     */
    public java.lang.String getPackEndDate_BaselineRule() {
        return packEndDate_BaselineRule;
    }


    /**
     * Sets the packEndDate_BaselineRule value for this CommitmentRequest.
     * 
     * @param packEndDate_BaselineRule
     */
    public void setPackEndDate_BaselineRule(java.lang.String packEndDate_BaselineRule) {
        this.packEndDate_BaselineRule = packEndDate_BaselineRule;
    }


    /**
     * Gets the packStartDate_BaselineRule value for this CommitmentRequest.
     * 
     * @return packStartDate_BaselineRule
     */
    public java.lang.String getPackStartDate_BaselineRule() {
        return packStartDate_BaselineRule;
    }


    /**
     * Sets the packStartDate_BaselineRule value for this CommitmentRequest.
     * 
     * @param packStartDate_BaselineRule
     */
    public void setPackStartDate_BaselineRule(java.lang.String packStartDate_BaselineRule) {
        this.packStartDate_BaselineRule = packStartDate_BaselineRule;
    }


    /**
     * Gets the priority value for this CommitmentRequest.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CommitmentRequest.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the renewalDerogationInterval value for this CommitmentRequest.
     * 
     * @return renewalDerogationInterval
     */
    public java.lang.Long getRenewalDerogationInterval() {
        return renewalDerogationInterval;
    }


    /**
     * Sets the renewalDerogationInterval value for this CommitmentRequest.
     * 
     * @param renewalDerogationInterval
     */
    public void setRenewalDerogationInterval(java.lang.Long renewalDerogationInterval) {
        this.renewalDerogationInterval = renewalDerogationInterval;
    }


    /**
     * Gets the requestId value for this CommitmentRequest.
     * 
     * @return requestId
     */
    public java.lang.Long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this CommitmentRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.Long requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the subventionAmountGross value for this CommitmentRequest.
     * 
     * @return subventionAmountGross
     */
    public java.lang.Double getSubventionAmountGross() {
        return subventionAmountGross;
    }


    /**
     * Sets the subventionAmountGross value for this CommitmentRequest.
     * 
     * @param subventionAmountGross
     */
    public void setSubventionAmountGross(java.lang.Double subventionAmountGross) {
        this.subventionAmountGross = subventionAmountGross;
    }


    /**
     * Gets the subventionAmountNet value for this CommitmentRequest.
     * 
     * @return subventionAmountNet
     */
    public java.lang.Double getSubventionAmountNet() {
        return subventionAmountNet;
    }


    /**
     * Sets the subventionAmountNet value for this CommitmentRequest.
     * 
     * @param subventionAmountNet
     */
    public void setSubventionAmountNet(java.lang.Double subventionAmountNet) {
        this.subventionAmountNet = subventionAmountNet;
    }


    /**
     * Gets the subventionFlag value for this CommitmentRequest.
     * 
     * @return subventionFlag
     */
    public java.lang.String getSubventionFlag() {
        return subventionFlag;
    }


    /**
     * Sets the subventionFlag value for this CommitmentRequest.
     * 
     * @param subventionFlag
     */
    public void setSubventionFlag(java.lang.String subventionFlag) {
        this.subventionFlag = subventionFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommitmentRequest)) return false;
        CommitmentRequest other = (CommitmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commitmentDuration==null && other.getCommitmentDuration()==null) || 
             (this.commitmentDuration!=null &&
              this.commitmentDuration.equals(other.getCommitmentDuration()))) &&
            ((this.commitmentEntityDescription==null && other.getCommitmentEntityDescription()==null) || 
             (this.commitmentEntityDescription!=null &&
              this.commitmentEntityDescription.equals(other.getCommitmentEntityDescription()))) &&
            ((this.commitmentEntityId==null && other.getCommitmentEntityId()==null) || 
             (this.commitmentEntityId!=null &&
              this.commitmentEntityId.equals(other.getCommitmentEntityId()))) &&
            ((this.commitmentEntityType==null && other.getCommitmentEntityType()==null) || 
             (this.commitmentEntityType!=null &&
              this.commitmentEntityType.equals(other.getCommitmentEntityType()))) &&
            ((this.commitmentEntityVersion==null && other.getCommitmentEntityVersion()==null) || 
             (this.commitmentEntityVersion!=null &&
              this.commitmentEntityVersion.equals(other.getCommitmentEntityVersion()))) &&
            ((this.commitmentShift==null && other.getCommitmentShift()==null) || 
             (this.commitmentShift!=null &&
              this.commitmentShift.equals(other.getCommitmentShift()))) &&
            ((this.commitmentShiftUnit==null && other.getCommitmentShiftUnit()==null) || 
             (this.commitmentShiftUnit!=null &&
              this.commitmentShiftUnit.equals(other.getCommitmentShiftUnit()))) &&
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.lastModDate==null && other.getLastModDate()==null) || 
             (this.lastModDate!=null &&
              this.lastModDate.equals(other.getLastModDate()))) &&
            ((this.packAmountGross==null && other.getPackAmountGross()==null) || 
             (this.packAmountGross!=null &&
              this.packAmountGross.equals(other.getPackAmountGross()))) &&
            ((this.packAmountNet==null && other.getPackAmountNet()==null) || 
             (this.packAmountNet!=null &&
              this.packAmountNet.equals(other.getPackAmountNet()))) &&
            ((this.packEndDate_BaselineRule==null && other.getPackEndDate_BaselineRule()==null) || 
             (this.packEndDate_BaselineRule!=null &&
              this.packEndDate_BaselineRule.equals(other.getPackEndDate_BaselineRule()))) &&
            ((this.packStartDate_BaselineRule==null && other.getPackStartDate_BaselineRule()==null) || 
             (this.packStartDate_BaselineRule!=null &&
              this.packStartDate_BaselineRule.equals(other.getPackStartDate_BaselineRule()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.renewalDerogationInterval==null && other.getRenewalDerogationInterval()==null) || 
             (this.renewalDerogationInterval!=null &&
              this.renewalDerogationInterval.equals(other.getRenewalDerogationInterval()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.subventionAmountGross==null && other.getSubventionAmountGross()==null) || 
             (this.subventionAmountGross!=null &&
              this.subventionAmountGross.equals(other.getSubventionAmountGross()))) &&
            ((this.subventionAmountNet==null && other.getSubventionAmountNet()==null) || 
             (this.subventionAmountNet!=null &&
              this.subventionAmountNet.equals(other.getSubventionAmountNet()))) &&
            ((this.subventionFlag==null && other.getSubventionFlag()==null) || 
             (this.subventionFlag!=null &&
              this.subventionFlag.equals(other.getSubventionFlag())));
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
        if (getCommitmentDuration() != null) {
            _hashCode += getCommitmentDuration().hashCode();
        }
        if (getCommitmentEntityDescription() != null) {
            _hashCode += getCommitmentEntityDescription().hashCode();
        }
        if (getCommitmentEntityId() != null) {
            _hashCode += getCommitmentEntityId().hashCode();
        }
        if (getCommitmentEntityType() != null) {
            _hashCode += getCommitmentEntityType().hashCode();
        }
        if (getCommitmentEntityVersion() != null) {
            _hashCode += getCommitmentEntityVersion().hashCode();
        }
        if (getCommitmentShift() != null) {
            _hashCode += getCommitmentShift().hashCode();
        }
        if (getCommitmentShiftUnit() != null) {
            _hashCode += getCommitmentShiftUnit().hashCode();
        }
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getLastModDate() != null) {
            _hashCode += getLastModDate().hashCode();
        }
        if (getPackAmountGross() != null) {
            _hashCode += getPackAmountGross().hashCode();
        }
        if (getPackAmountNet() != null) {
            _hashCode += getPackAmountNet().hashCode();
        }
        if (getPackEndDate_BaselineRule() != null) {
            _hashCode += getPackEndDate_BaselineRule().hashCode();
        }
        if (getPackStartDate_BaselineRule() != null) {
            _hashCode += getPackStartDate_BaselineRule().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRenewalDerogationInterval() != null) {
            _hashCode += getRenewalDerogationInterval().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getSubventionAmountGross() != null) {
            _hashCode += getSubventionAmountGross().hashCode();
        }
        if (getSubventionAmountNet() != null) {
            _hashCode += getSubventionAmountNet().hashCode();
        }
        if (getSubventionFlag() != null) {
            _hashCode += getSubventionFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommitmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentEntityDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentEntityDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CommitmentEntityType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentEntityVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentEntityVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentShift");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentShift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentShiftUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "commitmentShiftUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "entryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "lastModDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packAmountGross");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "packAmountGross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packAmountNet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "packAmountNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packEndDate_BaselineRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "packEndDate_BaselineRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packStartDate_BaselineRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "packStartDate_BaselineRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalDerogationInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "renewalDerogationInterval"));
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
        elemField.setFieldName("subventionAmountGross");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "subventionAmountGross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subventionAmountNet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "subventionAmountNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subventionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "subventionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
