
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SetOccRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SetOccRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="snCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="spCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="validFrom" type="{http://alu.services.ws.lhs.com}DateBean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOccRequest", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "amount",
    "csId",
    "remark",
    "snCode",
    "spCode",
    "validFrom"
})
public class SetOccRequest {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Double.class, nillable = true)
    protected Double amount;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long csId;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String remark;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long snCode;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long spCode;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected DateBean validFrom;

    /**
     * Obtient la valeur de la propri�t� amount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * D�finit la valeur de la propri�t� amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propri�t� csId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCsId() {
        return csId;
    }

    /**
     * D�finit la valeur de la propri�t� csId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCsId(Long value) {
        this.csId = value;
    }

    /**
     * Obtient la valeur de la propri�t� remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * D�finit la valeur de la propri�t� remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Obtient la valeur de la propri�t� snCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSnCode() {
        return snCode;
    }

    /**
     * D�finit la valeur de la propri�t� snCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSnCode(Long value) {
        this.snCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� spCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpCode() {
        return spCode;
    }

    /**
     * D�finit la valeur de la propri�t� spCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpCode(Long value) {
        this.spCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� validFrom.
     * 
     * @return
     *     possible object is
     *     {@link DateBean }
     *     
     */
    public DateBean getValidFrom() {
        return validFrom;
    }

    /**
     * D�finit la valeur de la propri�t� validFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link DateBean }
     *     
     */
    public void setValidFrom(DateBean value) {
        this.validFrom = value;
    }

}
