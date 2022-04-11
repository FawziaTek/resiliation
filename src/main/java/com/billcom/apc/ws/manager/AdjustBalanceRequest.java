
package com.billcom.apc.ws.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adjustBalanceRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adjustBalanceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="desSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rpCodeCible" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rpCodeSource" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="valueSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustBalanceRequest", propOrder = {
    "amount",
    "coId",
    "csId",
    "desSource",
    "desTarget",
    "msisdn",
    "rpCodeCible",
    "rpCodeSource",
    "valueSource",
    "valueTarget"
})
public class AdjustBalanceRequest {

    protected Long amount;
    protected Long coId;
    protected Long csId;
    protected String desSource;
    protected String desTarget;
    protected String msisdn;
    protected Long rpCodeCible;
    protected Long rpCodeSource;
    protected String valueSource;
    protected String valueTarget;

    /**
     * Obtient la valeur de la propri�t� amount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * D�finit la valeur de la propri�t� amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propri�t� coId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoId() {
        return coId;
    }

    /**
     * D�finit la valeur de la propri�t� coId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoId(Long value) {
        this.coId = value;
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
     * Obtient la valeur de la propri�t� desSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesSource() {
        return desSource;
    }

    /**
     * D�finit la valeur de la propri�t� desSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesSource(String value) {
        this.desSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� desTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTarget() {
        return desTarget;
    }

    /**
     * D�finit la valeur de la propri�t� desTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTarget(String value) {
        this.desTarget = value;
    }

    /**
     * Obtient la valeur de la propri�t� msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * D�finit la valeur de la propri�t� msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Obtient la valeur de la propri�t� rpCodeCible.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpCodeCible() {
        return rpCodeCible;
    }

    /**
     * D�finit la valeur de la propri�t� rpCodeCible.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpCodeCible(Long value) {
        this.rpCodeCible = value;
    }

    /**
     * Obtient la valeur de la propri�t� rpCodeSource.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpCodeSource() {
        return rpCodeSource;
    }

    /**
     * D�finit la valeur de la propri�t� rpCodeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpCodeSource(Long value) {
        this.rpCodeSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� valueSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueSource() {
        return valueSource;
    }

    /**
     * D�finit la valeur de la propri�t� valueSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueSource(String value) {
        this.valueSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� valueTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTarget() {
        return valueTarget;
    }

    /**
     * D�finit la valeur de la propri�t� valueTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTarget(String value) {
        this.valueTarget = value;
    }

}
