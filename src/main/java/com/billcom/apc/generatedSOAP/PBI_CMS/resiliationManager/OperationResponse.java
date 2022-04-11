
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OperationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bscsErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "bscsErrorCode",
    "comment",
    "isSuccessful"
})
@XmlSeeAlso({
    AddFaccResponse.class,
    CalculateAccelerationForResiliationResponse.class,
    ChangeRatePlanResiliationResponse.class,
    CreateContractResResponse.class,
    GetListContractsResponse.class,
    GetCustomerOfferAndStatistiqueResponse.class,
    GetMontantFactureResponse.class,
    GetCalculatedFaccTotaleResponse.class,
    SetOccResponse.class
})
public class OperationResponse {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String bscsErrorCode;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String comment;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean isSuccessful;

    /**
     * Obtient la valeur de la propriété bscsErrorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBscsErrorCode() {
        return bscsErrorCode;
    }

    /**
     * Définit la valeur de la propriété bscsErrorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBscsErrorCode(String value) {
        this.bscsErrorCode = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété isSuccessful.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuccessful() {
        return isSuccessful;
    }

    /**
     * Définit la valeur de la propriété isSuccessful.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuccessful(Boolean value) {
        this.isSuccessful = value;
    }

}
