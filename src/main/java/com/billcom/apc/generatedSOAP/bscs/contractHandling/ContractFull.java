/**
 * ContractFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class ContractFull  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.Contract  implements java.io.Serializable {
    private java.lang.Long altRpcode;

    private java.lang.String altRpcodePub;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean coActivated;

    private java.lang.Long coLastReason;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean coSignedDate;

    private java.lang.Integer coStatus;

    private java.lang.Long coStmedDealerId;

    private java.lang.String coStmedDealerIdPub;

    private java.lang.String coStmedno;

    private java.lang.Long contractTypeId;

    private java.lang.Long csId;

    private java.lang.String csIdPub;

    private java.lang.String description;

    private java.lang.String pin;

    private java.lang.String pin2;

    private java.lang.String puk;

    private java.lang.String puk2;

    private java.lang.String rpDes;

    private java.lang.String rpDesc;

    private java.lang.Long rpcode;

    private java.lang.String rpcodePub;

    private java.lang.Long sccode;

    private java.lang.String sccodePub;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean smModdate;

    private java.lang.Long submId;

    private java.lang.String submIdPub;

    public ContractFull() {
    }

    public ContractFull(
           java.lang.Long coId,
           java.lang.String coIdPub,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[] services,
           java.lang.Long altRpcode,
           java.lang.String altRpcodePub,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean coActivated,
           java.lang.Long coLastReason,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean coSignedDate,
           java.lang.Integer coStatus,
           java.lang.Long coStmedDealerId,
           java.lang.String coStmedDealerIdPub,
           java.lang.String coStmedno,
           java.lang.Long contractTypeId,
           java.lang.Long csId,
           java.lang.String csIdPub,
           java.lang.String description,
           java.lang.String pin,
           java.lang.String pin2,
           java.lang.String puk,
           java.lang.String puk2,
           java.lang.String rpDes,
           java.lang.String rpDesc,
           java.lang.Long rpcode,
           java.lang.String rpcodePub,
           java.lang.Long sccode,
           java.lang.String sccodePub,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean smModdate,
           java.lang.Long submId,
           java.lang.String submIdPub) {
        super(
            coId,
            coIdPub,
            services);
        this.altRpcode = altRpcode;
        this.altRpcodePub = altRpcodePub;
        this.coActivated = coActivated;
        this.coLastReason = coLastReason;
        this.coSignedDate = coSignedDate;
        this.coStatus = coStatus;
        this.coStmedDealerId = coStmedDealerId;
        this.coStmedDealerIdPub = coStmedDealerIdPub;
        this.coStmedno = coStmedno;
        this.contractTypeId = contractTypeId;
        this.csId = csId;
        this.csIdPub = csIdPub;
        this.description = description;
        this.pin = pin;
        this.pin2 = pin2;
        this.puk = puk;
        this.puk2 = puk2;
        this.rpDes = rpDes;
        this.rpDesc = rpDesc;
        this.rpcode = rpcode;
        this.rpcodePub = rpcodePub;
        this.sccode = sccode;
        this.sccodePub = sccodePub;
        this.smModdate = smModdate;
        this.submId = submId;
        this.submIdPub = submIdPub;
    }


    /**
     * Gets the altRpcode value for this ContractFull.
     * 
     * @return altRpcode
     */
    public java.lang.Long getAltRpcode() {
        return altRpcode;
    }


    /**
     * Sets the altRpcode value for this ContractFull.
     * 
     * @param altRpcode
     */
    public void setAltRpcode(java.lang.Long altRpcode) {
        this.altRpcode = altRpcode;
    }


    /**
     * Gets the altRpcodePub value for this ContractFull.
     * 
     * @return altRpcodePub
     */
    public java.lang.String getAltRpcodePub() {
        return altRpcodePub;
    }


    /**
     * Sets the altRpcodePub value for this ContractFull.
     * 
     * @param altRpcodePub
     */
    public void setAltRpcodePub(java.lang.String altRpcodePub) {
        this.altRpcodePub = altRpcodePub;
    }


    /**
     * Gets the coActivated value for this ContractFull.
     * 
     * @return coActivated
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean getCoActivated() {
        return coActivated;
    }


    /**
     * Sets the coActivated value for this ContractFull.
     * 
     * @param coActivated
     */
    public void setCoActivated(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean coActivated) {
        this.coActivated = coActivated;
    }


    /**
     * Gets the coLastReason value for this ContractFull.
     * 
     * @return coLastReason
     */
    public java.lang.Long getCoLastReason() {
        return coLastReason;
    }


    /**
     * Sets the coLastReason value for this ContractFull.
     * 
     * @param coLastReason
     */
    public void setCoLastReason(java.lang.Long coLastReason) {
        this.coLastReason = coLastReason;
    }


    /**
     * Gets the coSignedDate value for this ContractFull.
     * 
     * @return coSignedDate
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean getCoSignedDate() {
        return coSignedDate;
    }


    /**
     * Sets the coSignedDate value for this ContractFull.
     * 
     * @param coSignedDate
     */
    public void setCoSignedDate(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean coSignedDate) {
        this.coSignedDate = coSignedDate;
    }


    /**
     * Gets the coStatus value for this ContractFull.
     * 
     * @return coStatus
     */
    public java.lang.Integer getCoStatus() {
        return coStatus;
    }


    /**
     * Sets the coStatus value for this ContractFull.
     * 
     * @param coStatus
     */
    public void setCoStatus(java.lang.Integer coStatus) {
        this.coStatus = coStatus;
    }


    /**
     * Gets the coStmedDealerId value for this ContractFull.
     * 
     * @return coStmedDealerId
     */
    public java.lang.Long getCoStmedDealerId() {
        return coStmedDealerId;
    }


    /**
     * Sets the coStmedDealerId value for this ContractFull.
     * 
     * @param coStmedDealerId
     */
    public void setCoStmedDealerId(java.lang.Long coStmedDealerId) {
        this.coStmedDealerId = coStmedDealerId;
    }


    /**
     * Gets the coStmedDealerIdPub value for this ContractFull.
     * 
     * @return coStmedDealerIdPub
     */
    public java.lang.String getCoStmedDealerIdPub() {
        return coStmedDealerIdPub;
    }


    /**
     * Sets the coStmedDealerIdPub value for this ContractFull.
     * 
     * @param coStmedDealerIdPub
     */
    public void setCoStmedDealerIdPub(java.lang.String coStmedDealerIdPub) {
        this.coStmedDealerIdPub = coStmedDealerIdPub;
    }


    /**
     * Gets the coStmedno value for this ContractFull.
     * 
     * @return coStmedno
     */
    public java.lang.String getCoStmedno() {
        return coStmedno;
    }


    /**
     * Sets the coStmedno value for this ContractFull.
     * 
     * @param coStmedno
     */
    public void setCoStmedno(java.lang.String coStmedno) {
        this.coStmedno = coStmedno;
    }


    /**
     * Gets the contractTypeId value for this ContractFull.
     * 
     * @return contractTypeId
     */
    public java.lang.Long getContractTypeId() {
        return contractTypeId;
    }


    /**
     * Sets the contractTypeId value for this ContractFull.
     * 
     * @param contractTypeId
     */
    public void setContractTypeId(java.lang.Long contractTypeId) {
        this.contractTypeId = contractTypeId;
    }


    /**
     * Gets the csId value for this ContractFull.
     * 
     * @return csId
     */
    public java.lang.Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this ContractFull.
     * 
     * @param csId
     */
    public void setCsId(java.lang.Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the csIdPub value for this ContractFull.
     * 
     * @return csIdPub
     */
    public java.lang.String getCsIdPub() {
        return csIdPub;
    }


    /**
     * Sets the csIdPub value for this ContractFull.
     * 
     * @param csIdPub
     */
    public void setCsIdPub(java.lang.String csIdPub) {
        this.csIdPub = csIdPub;
    }


    /**
     * Gets the description value for this ContractFull.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ContractFull.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the pin value for this ContractFull.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ContractFull.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the pin2 value for this ContractFull.
     * 
     * @return pin2
     */
    public java.lang.String getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this ContractFull.
     * 
     * @param pin2
     */
    public void setPin2(java.lang.String pin2) {
        this.pin2 = pin2;
    }


    /**
     * Gets the puk value for this ContractFull.
     * 
     * @return puk
     */
    public java.lang.String getPuk() {
        return puk;
    }


    /**
     * Sets the puk value for this ContractFull.
     * 
     * @param puk
     */
    public void setPuk(java.lang.String puk) {
        this.puk = puk;
    }


    /**
     * Gets the puk2 value for this ContractFull.
     * 
     * @return puk2
     */
    public java.lang.String getPuk2() {
        return puk2;
    }


    /**
     * Sets the puk2 value for this ContractFull.
     * 
     * @param puk2
     */
    public void setPuk2(java.lang.String puk2) {
        this.puk2 = puk2;
    }


    /**
     * Gets the rpDes value for this ContractFull.
     * 
     * @return rpDes
     */
    public java.lang.String getRpDes() {
        return rpDes;
    }


    /**
     * Sets the rpDes value for this ContractFull.
     * 
     * @param rpDes
     */
    public void setRpDes(java.lang.String rpDes) {
        this.rpDes = rpDes;
    }


    /**
     * Gets the rpDesc value for this ContractFull.
     * 
     * @return rpDesc
     */
    public java.lang.String getRpDesc() {
        return rpDesc;
    }


    /**
     * Sets the rpDesc value for this ContractFull.
     * 
     * @param rpDesc
     */
    public void setRpDesc(java.lang.String rpDesc) {
        this.rpDesc = rpDesc;
    }


    /**
     * Gets the rpcode value for this ContractFull.
     * 
     * @return rpcode
     */
    public java.lang.Long getRpcode() {
        return rpcode;
    }


    /**
     * Sets the rpcode value for this ContractFull.
     * 
     * @param rpcode
     */
    public void setRpcode(java.lang.Long rpcode) {
        this.rpcode = rpcode;
    }


    /**
     * Gets the rpcodePub value for this ContractFull.
     * 
     * @return rpcodePub
     */
    public java.lang.String getRpcodePub() {
        return rpcodePub;
    }


    /**
     * Sets the rpcodePub value for this ContractFull.
     * 
     * @param rpcodePub
     */
    public void setRpcodePub(java.lang.String rpcodePub) {
        this.rpcodePub = rpcodePub;
    }


    /**
     * Gets the sccode value for this ContractFull.
     * 
     * @return sccode
     */
    public java.lang.Long getSccode() {
        return sccode;
    }


    /**
     * Sets the sccode value for this ContractFull.
     * 
     * @param sccode
     */
    public void setSccode(java.lang.Long sccode) {
        this.sccode = sccode;
    }


    /**
     * Gets the sccodePub value for this ContractFull.
     * 
     * @return sccodePub
     */
    public java.lang.String getSccodePub() {
        return sccodePub;
    }


    /**
     * Sets the sccodePub value for this ContractFull.
     * 
     * @param sccodePub
     */
    public void setSccodePub(java.lang.String sccodePub) {
        this.sccodePub = sccodePub;
    }


    /**
     * Gets the smModdate value for this ContractFull.
     * 
     * @return smModdate
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean getSmModdate() {
        return smModdate;
    }


    /**
     * Sets the smModdate value for this ContractFull.
     * 
     * @param smModdate
     */
    public void setSmModdate(com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean smModdate) {
        this.smModdate = smModdate;
    }


    /**
     * Gets the submId value for this ContractFull.
     * 
     * @return submId
     */
    public java.lang.Long getSubmId() {
        return submId;
    }


    /**
     * Sets the submId value for this ContractFull.
     * 
     * @param submId
     */
    public void setSubmId(java.lang.Long submId) {
        this.submId = submId;
    }


    /**
     * Gets the submIdPub value for this ContractFull.
     * 
     * @return submIdPub
     */
    public java.lang.String getSubmIdPub() {
        return submIdPub;
    }


    /**
     * Sets the submIdPub value for this ContractFull.
     * 
     * @param submIdPub
     */
    public void setSubmIdPub(java.lang.String submIdPub) {
        this.submIdPub = submIdPub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractFull)) return false;
        ContractFull other = (ContractFull) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.altRpcode==null && other.getAltRpcode()==null) || 
             (this.altRpcode!=null &&
              this.altRpcode.equals(other.getAltRpcode()))) &&
            ((this.altRpcodePub==null && other.getAltRpcodePub()==null) || 
             (this.altRpcodePub!=null &&
              this.altRpcodePub.equals(other.getAltRpcodePub()))) &&
            ((this.coActivated==null && other.getCoActivated()==null) || 
             (this.coActivated!=null &&
              this.coActivated.equals(other.getCoActivated()))) &&
            ((this.coLastReason==null && other.getCoLastReason()==null) || 
             (this.coLastReason!=null &&
              this.coLastReason.equals(other.getCoLastReason()))) &&
            ((this.coSignedDate==null && other.getCoSignedDate()==null) || 
             (this.coSignedDate!=null &&
              this.coSignedDate.equals(other.getCoSignedDate()))) &&
            ((this.coStatus==null && other.getCoStatus()==null) || 
             (this.coStatus!=null &&
              this.coStatus.equals(other.getCoStatus()))) &&
            ((this.coStmedDealerId==null && other.getCoStmedDealerId()==null) || 
             (this.coStmedDealerId!=null &&
              this.coStmedDealerId.equals(other.getCoStmedDealerId()))) &&
            ((this.coStmedDealerIdPub==null && other.getCoStmedDealerIdPub()==null) || 
             (this.coStmedDealerIdPub!=null &&
              this.coStmedDealerIdPub.equals(other.getCoStmedDealerIdPub()))) &&
            ((this.coStmedno==null && other.getCoStmedno()==null) || 
             (this.coStmedno!=null &&
              this.coStmedno.equals(other.getCoStmedno()))) &&
            ((this.contractTypeId==null && other.getContractTypeId()==null) || 
             (this.contractTypeId!=null &&
              this.contractTypeId.equals(other.getContractTypeId()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.csIdPub==null && other.getCsIdPub()==null) || 
             (this.csIdPub!=null &&
              this.csIdPub.equals(other.getCsIdPub()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2()))) &&
            ((this.puk==null && other.getPuk()==null) || 
             (this.puk!=null &&
              this.puk.equals(other.getPuk()))) &&
            ((this.puk2==null && other.getPuk2()==null) || 
             (this.puk2!=null &&
              this.puk2.equals(other.getPuk2()))) &&
            ((this.rpDes==null && other.getRpDes()==null) || 
             (this.rpDes!=null &&
              this.rpDes.equals(other.getRpDes()))) &&
            ((this.rpDesc==null && other.getRpDesc()==null) || 
             (this.rpDesc!=null &&
              this.rpDesc.equals(other.getRpDesc()))) &&
            ((this.rpcode==null && other.getRpcode()==null) || 
             (this.rpcode!=null &&
              this.rpcode.equals(other.getRpcode()))) &&
            ((this.rpcodePub==null && other.getRpcodePub()==null) || 
             (this.rpcodePub!=null &&
              this.rpcodePub.equals(other.getRpcodePub()))) &&
            ((this.sccode==null && other.getSccode()==null) || 
             (this.sccode!=null &&
              this.sccode.equals(other.getSccode()))) &&
            ((this.sccodePub==null && other.getSccodePub()==null) || 
             (this.sccodePub!=null &&
              this.sccodePub.equals(other.getSccodePub()))) &&
            ((this.smModdate==null && other.getSmModdate()==null) || 
             (this.smModdate!=null &&
              this.smModdate.equals(other.getSmModdate()))) &&
            ((this.submId==null && other.getSubmId()==null) || 
             (this.submId!=null &&
              this.submId.equals(other.getSubmId()))) &&
            ((this.submIdPub==null && other.getSubmIdPub()==null) || 
             (this.submIdPub!=null &&
              this.submIdPub.equals(other.getSubmIdPub())));
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
        if (getAltRpcode() != null) {
            _hashCode += getAltRpcode().hashCode();
        }
        if (getAltRpcodePub() != null) {
            _hashCode += getAltRpcodePub().hashCode();
        }
        if (getCoActivated() != null) {
            _hashCode += getCoActivated().hashCode();
        }
        if (getCoLastReason() != null) {
            _hashCode += getCoLastReason().hashCode();
        }
        if (getCoSignedDate() != null) {
            _hashCode += getCoSignedDate().hashCode();
        }
        if (getCoStatus() != null) {
            _hashCode += getCoStatus().hashCode();
        }
        if (getCoStmedDealerId() != null) {
            _hashCode += getCoStmedDealerId().hashCode();
        }
        if (getCoStmedDealerIdPub() != null) {
            _hashCode += getCoStmedDealerIdPub().hashCode();
        }
        if (getCoStmedno() != null) {
            _hashCode += getCoStmedno().hashCode();
        }
        if (getContractTypeId() != null) {
            _hashCode += getContractTypeId().hashCode();
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getCsIdPub() != null) {
            _hashCode += getCsIdPub().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        if (getPuk() != null) {
            _hashCode += getPuk().hashCode();
        }
        if (getPuk2() != null) {
            _hashCode += getPuk2().hashCode();
        }
        if (getRpDes() != null) {
            _hashCode += getRpDes().hashCode();
        }
        if (getRpDesc() != null) {
            _hashCode += getRpDesc().hashCode();
        }
        if (getRpcode() != null) {
            _hashCode += getRpcode().hashCode();
        }
        if (getRpcodePub() != null) {
            _hashCode += getRpcodePub().hashCode();
        }
        if (getSccode() != null) {
            _hashCode += getSccode().hashCode();
        }
        if (getSccodePub() != null) {
            _hashCode += getSccodePub().hashCode();
        }
        if (getSmModdate() != null) {
            _hashCode += getSmModdate().hashCode();
        }
        if (getSubmId() != null) {
            _hashCode += getSubmId().hashCode();
        }
        if (getSubmIdPub() != null) {
            _hashCode += getSubmIdPub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractFull"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altRpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "altRpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altRpcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "altRpcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateTimeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coLastReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coLastReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coSignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coSignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedDealerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedDealerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedDealerIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedDealerIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "pin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "puk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "puk2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sccodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smModdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "smModdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateTimeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "submId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "submIdPub"));
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
