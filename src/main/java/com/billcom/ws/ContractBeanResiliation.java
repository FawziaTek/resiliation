/**
 * ContractBeanResiliation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.ws;

public class ContractBeanResiliation  implements java.io.Serializable {
    private java.lang.String coCode;

    private java.lang.Long coId;

    private java.lang.String contractStatus;

    private java.util.Calendar dateFinEng;

    private java.lang.String msisdn;

    private java.lang.String offreAct;

    private java.lang.Integer sccode;

    private java.lang.Integer subm_id;

    private java.lang.Long tmcode;

    public ContractBeanResiliation() {
    }

    public ContractBeanResiliation(
           java.lang.String coCode,
           java.lang.Long coId,
           java.lang.String contractStatus,
           java.util.Calendar dateFinEng,
           java.lang.String msisdn,
           java.lang.String offreAct,
           java.lang.Integer sccode,
           java.lang.Integer subm_id,
           java.lang.Long tmcode) {
           this.coCode = coCode;
           this.coId = coId;
           this.contractStatus = contractStatus;
           this.dateFinEng = dateFinEng;
           this.msisdn = msisdn;
           this.offreAct = offreAct;
           this.sccode = sccode;
           this.subm_id = subm_id;
           this.tmcode = tmcode;
    }


    /**
     * Gets the coCode value for this ContractBeanResiliation.
     * 
     * @return coCode
     */
    public java.lang.String getCoCode() {
        return coCode;
    }


    /**
     * Sets the coCode value for this ContractBeanResiliation.
     * 
     * @param coCode
     */
    public void setCoCode(java.lang.String coCode) {
        this.coCode = coCode;
    }


    /**
     * Gets the coId value for this ContractBeanResiliation.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ContractBeanResiliation.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the contractStatus value for this ContractBeanResiliation.
     * 
     * @return contractStatus
     */
    public java.lang.String getContractStatus() {
        return contractStatus;
    }


    /**
     * Sets the contractStatus value for this ContractBeanResiliation.
     * 
     * @param contractStatus
     */
    public void setContractStatus(java.lang.String contractStatus) {
        this.contractStatus = contractStatus;
    }


    /**
     * Gets the dateFinEng value for this ContractBeanResiliation.
     * 
     * @return dateFinEng
     */
    public java.util.Calendar getDateFinEng() {
        return dateFinEng;
    }


    /**
     * Sets the dateFinEng value for this ContractBeanResiliation.
     * 
     * @param dateFinEng
     */
    public void setDateFinEng(java.util.Calendar dateFinEng) {
        this.dateFinEng = dateFinEng;
    }


    /**
     * Gets the msisdn value for this ContractBeanResiliation.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ContractBeanResiliation.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the offreAct value for this ContractBeanResiliation.
     * 
     * @return offreAct
     */
    public java.lang.String getOffreAct() {
        return offreAct;
    }


    /**
     * Sets the offreAct value for this ContractBeanResiliation.
     * 
     * @param offreAct
     */
    public void setOffreAct(java.lang.String offreAct) {
        this.offreAct = offreAct;
    }


    /**
     * Gets the sccode value for this ContractBeanResiliation.
     * 
     * @return sccode
     */
    public java.lang.Integer getSccode() {
        return sccode;
    }


    /**
     * Sets the sccode value for this ContractBeanResiliation.
     * 
     * @param sccode
     */
    public void setSccode(java.lang.Integer sccode) {
        this.sccode = sccode;
    }


    /**
     * Gets the subm_id value for this ContractBeanResiliation.
     * 
     * @return subm_id
     */
    public java.lang.Integer getSubm_id() {
        return subm_id;
    }


    /**
     * Sets the subm_id value for this ContractBeanResiliation.
     * 
     * @param subm_id
     */
    public void setSubm_id(java.lang.Integer subm_id) {
        this.subm_id = subm_id;
    }


    /**
     * Gets the tmcode value for this ContractBeanResiliation.
     * 
     * @return tmcode
     */
    public java.lang.Long getTmcode() {
        return tmcode;
    }


    /**
     * Sets the tmcode value for this ContractBeanResiliation.
     * 
     * @param tmcode
     */
    public void setTmcode(java.lang.Long tmcode) {
        this.tmcode = tmcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractBeanResiliation)) return false;
        ContractBeanResiliation other = (ContractBeanResiliation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coCode==null && other.getCoCode()==null) || 
             (this.coCode!=null &&
              this.coCode.equals(other.getCoCode()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.contractStatus==null && other.getContractStatus()==null) || 
             (this.contractStatus!=null &&
              this.contractStatus.equals(other.getContractStatus()))) &&
            ((this.dateFinEng==null && other.getDateFinEng()==null) || 
             (this.dateFinEng!=null &&
              this.dateFinEng.equals(other.getDateFinEng()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.offreAct==null && other.getOffreAct()==null) || 
             (this.offreAct!=null &&
              this.offreAct.equals(other.getOffreAct()))) &&
            ((this.sccode==null && other.getSccode()==null) || 
             (this.sccode!=null &&
              this.sccode.equals(other.getSccode()))) &&
            ((this.subm_id==null && other.getSubm_id()==null) || 
             (this.subm_id!=null &&
              this.subm_id.equals(other.getSubm_id()))) &&
            ((this.tmcode==null && other.getTmcode()==null) || 
             (this.tmcode!=null &&
              this.tmcode.equals(other.getTmcode())));
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
        if (getCoCode() != null) {
            _hashCode += getCoCode().hashCode();
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getContractStatus() != null) {
            _hashCode += getContractStatus().hashCode();
        }
        if (getDateFinEng() != null) {
            _hashCode += getDateFinEng().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getOffreAct() != null) {
            _hashCode += getOffreAct().hashCode();
        }
        if (getSccode() != null) {
            _hashCode += getSccode().hashCode();
        }
        if (getSubm_id() != null) {
            _hashCode += getSubm_id().hashCode();
        }
        if (getTmcode() != null) {
            _hashCode += getTmcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractBeanResiliation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.billcom.com/", "contractBeanResiliation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFinEng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFinEng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offreAct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offreAct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subm_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subm_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
