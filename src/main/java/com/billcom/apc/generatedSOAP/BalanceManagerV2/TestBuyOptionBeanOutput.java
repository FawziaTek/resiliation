
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TestBuyOptionBeanOutput complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TestBuyOptionBeanOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isBuyOptionPossible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationResponse" type="{http://v2.manager.ws.lucent.alcatel.com}OperationResponseV2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestBuyOptionBeanOutput", propOrder = {
    "isBuyOptionPossible",
    "messageCode",
    "operationResponse"
})
public class TestBuyOptionBeanOutput implements Serializable{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isBuyOptionPossible;
    @XmlElement(required = true, nillable = true)
    protected String messageCode;
    @XmlElement(required = true, nillable = true)
    protected OperationResponseV2 operationResponse;

    /**
     * Obtient la valeur de la propriété isBuyOptionPossible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBuyOptionPossible() {
        return isBuyOptionPossible;
    }

    /**
     * Définit la valeur de la propriété isBuyOptionPossible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBuyOptionPossible(Boolean value) {
        this.isBuyOptionPossible = value;
    }

    /**
     * Obtient la valeur de la propriété messageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Définit la valeur de la propriété messageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Obtient la valeur de la propriété operationResponse.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseV2 }
     *     
     */
    public OperationResponseV2 getOperationResponse() {
        return operationResponse;
    }

    /**
     * Définit la valeur de la propriété operationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseV2 }
     *     
     */
    public void setOperationResponse(OperationResponseV2 value) {
        this.operationResponse = value;
    }

}
