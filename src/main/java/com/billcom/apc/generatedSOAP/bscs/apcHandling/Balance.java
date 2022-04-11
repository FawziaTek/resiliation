/**
 * Balance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class Balance  implements java.io.Serializable {
    private java.lang.Double actualValue;

    private java.lang.String balanceDescription;

    private java.lang.Integer balanceId;

    private java.lang.String balanceType;

    private java.lang.String unit;

    private float unitPrice;

    public Balance() {
    }

    public Balance(
           java.lang.Double actualValue,
           java.lang.String balanceDescription,
           java.lang.Integer balanceId,
           java.lang.String balanceType,
           java.lang.String unit,
           float unitPrice) {
           this.actualValue = actualValue;
           this.balanceDescription = balanceDescription;
           this.balanceId = balanceId;
           this.balanceType = balanceType;
           this.unit = unit;
           this.unitPrice = unitPrice;
    }


    /**
     * Gets the actualValue value for this Balance.
     * 
     * @return actualValue
     */
    public java.lang.Double getActualValue() {
        return actualValue;
    }


    /**
     * Sets the actualValue value for this Balance.
     * 
     * @param actualValue
     */
    public void setActualValue(java.lang.Double actualValue) {
        this.actualValue = actualValue;
    }


    /**
     * Gets the balanceDescription value for this Balance.
     * 
     * @return balanceDescription
     */
    public java.lang.String getBalanceDescription() {
        return balanceDescription;
    }


    /**
     * Sets the balanceDescription value for this Balance.
     * 
     * @param balanceDescription
     */
    public void setBalanceDescription(java.lang.String balanceDescription) {
        this.balanceDescription = balanceDescription;
    }


    /**
     * Gets the balanceId value for this Balance.
     * 
     * @return balanceId
     */
    public java.lang.Integer getBalanceId() {
        return balanceId;
    }


    /**
     * Sets the balanceId value for this Balance.
     * 
     * @param balanceId
     */
    public void setBalanceId(java.lang.Integer balanceId) {
        this.balanceId = balanceId;
    }


    /**
     * Gets the balanceType value for this Balance.
     * 
     * @return balanceType
     */
    public java.lang.String getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this Balance.
     * 
     * @param balanceType
     */
    public void setBalanceType(java.lang.String balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the unit value for this Balance.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Balance.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the unitPrice value for this Balance.
     * 
     * @return unitPrice
     */
    public float getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this Balance.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Balance)) return false;
        Balance other = (Balance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualValue==null && other.getActualValue()==null) || 
             (this.actualValue!=null &&
              this.actualValue.equals(other.getActualValue()))) &&
            ((this.balanceDescription==null && other.getBalanceDescription()==null) || 
             (this.balanceDescription!=null &&
              this.balanceDescription.equals(other.getBalanceDescription()))) &&
            ((this.balanceId==null && other.getBalanceId()==null) || 
             (this.balanceId!=null &&
              this.balanceId.equals(other.getBalanceId()))) &&
            ((this.balanceType==null && other.getBalanceType()==null) || 
             (this.balanceType!=null &&
              this.balanceType.equals(other.getBalanceType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            this.unitPrice == other.getUnitPrice();
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
        if (getActualValue() != null) {
            _hashCode += getActualValue().hashCode();
        }
        if (getBalanceDescription() != null) {
            _hashCode += getBalanceDescription().hashCode();
        }
        if (getBalanceId() != null) {
            _hashCode += getBalanceId().hashCode();
        }
        if (getBalanceType() != null) {
            _hashCode += getBalanceType().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        _hashCode += new Float(getUnitPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Balance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "actualValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balanceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
