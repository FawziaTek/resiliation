/**
 * ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead;

public class ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut  extends com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.BaseSOIBean  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ComLhsWsBeansV2Contract_service_parameters_readNumParamsBeanOut[] numParams;

    private java.lang.Long sncode;

    private java.lang.String sncodePub;

    public ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut() {
    }

    public ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut(
           com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ComLhsWsBeansV2Contract_service_parameters_readNumParamsBeanOut[] numParams,
           java.lang.Long sncode,
           java.lang.String sncodePub) {
        this.numParams = numParams;
        this.sncode = sncode;
        this.sncodePub = sncodePub;
    }


    /**
     * Gets the numParams value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @return numParams
     */
    public com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ComLhsWsBeansV2Contract_service_parameters_readNumParamsBeanOut[] getNumParams() {
        return numParams;
    }


    /**
     * Sets the numParams value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @param numParams
     */
    public void setNumParams(com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ComLhsWsBeansV2Contract_service_parameters_readNumParamsBeanOut[] numParams) {
        this.numParams = numParams;
    }


    /**
     * Gets the sncode value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @return sncode
     */
    public java.lang.Long getSncode() {
        return sncode;
    }


    /**
     * Sets the sncode value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @param sncode
     */
    public void setSncode(java.lang.Long sncode) {
        this.sncode = sncode;
    }


    /**
     * Gets the sncodePub value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @return sncodePub
     */
    public java.lang.String getSncodePub() {
        return sncodePub;
    }


    /**
     * Sets the sncodePub value for this ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.
     * 
     * @param sncodePub
     */
    public void setSncodePub(java.lang.String sncodePub) {
        this.sncodePub = sncodePub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut)) return false;
        ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut other = (ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numParams==null && other.getNumParams()==null) || 
             (this.numParams!=null &&
              java.util.Arrays.equals(this.numParams, other.getNumParams()))) &&
            ((this.sncode==null && other.getSncode()==null) || 
             (this.sncode!=null &&
              this.sncode.equals(other.getSncode()))) &&
            ((this.sncodePub==null && other.getSncodePub()==null) || 
             (this.sncodePub!=null &&
              this.sncodePub.equals(other.getSncodePub())));
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
        if (getNumParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSncode() != null) {
            _hashCode += getSncode().hashCode();
        }
        if (getSncodePub() != null) {
            _hashCode += getSncodePub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_service_parameters_readIntServicesBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_service_parameters_read.IntServicesBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "numParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_service_parameters_read.NumParamsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "sncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "sncodePub"));
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
