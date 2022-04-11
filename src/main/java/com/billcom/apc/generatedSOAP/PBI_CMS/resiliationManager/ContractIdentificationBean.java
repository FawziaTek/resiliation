
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ContractIdentificationBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContractIdentificationBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="statusContract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractIdentificationBean", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "contractCode",
    "msisdn",
    "statusContract",
    "tmcode"
})
public class ContractIdentificationBean {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String contractCode;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long msisdn;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String statusContract;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long tmcode;

    /**
     * Obtient la valeur de la propriété contractCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Définit la valeur de la propriété contractCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Obtient la valeur de la propriété msisdn.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMsisdn() {
        return msisdn;
    }

    /**
     * Définit la valeur de la propriété msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMsisdn(Long value) {
        this.msisdn = value;
    }

    /**
     * Obtient la valeur de la propriété statusContract.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusContract() {
        return statusContract;
    }

    /**
     * Définit la valeur de la propriété statusContract.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusContract(String value) {
        this.statusContract = value;
    }

    /**
     * Obtient la valeur de la propriété tmcode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTmcode() {
        return tmcode;
    }

    /**
     * Définit la valeur de la propriété tmcode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTmcode(Long value) {
        this.tmcode = value;
    }

}
