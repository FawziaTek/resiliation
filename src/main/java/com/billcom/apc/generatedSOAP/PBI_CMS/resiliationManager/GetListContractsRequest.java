
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour GetListContractsRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetListContractsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractIdentification" type="{http://alu.services.ws.lhs.com}ContractIdentificationBean"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateFinEngDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dateFinEngFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="isTotale" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListContractsRequest", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "contractIdentification",
    "customerId",
    "dateFinEngDebut",
    "dateFinEngFin",
    "isTotale"
})
public class GetListContractsRequest {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ContractIdentificationBean contractIdentification;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long customerId;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEngDebut;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEngFin;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean isTotale;

    /**
     * Obtient la valeur de la propriété contractIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ContractIdentificationBean }
     *     
     */
    public ContractIdentificationBean getContractIdentification() {
        return contractIdentification;
    }

    /**
     * Définit la valeur de la propriété contractIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractIdentificationBean }
     *     
     */
    public void setContractIdentification(ContractIdentificationBean value) {
        this.contractIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété customerId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Définit la valeur de la propriété customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinEngDebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinEngDebut() {
        return dateFinEngDebut;
    }

    /**
     * Définit la valeur de la propriété dateFinEngDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinEngDebut(XMLGregorianCalendar value) {
        this.dateFinEngDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinEngFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinEngFin() {
        return dateFinEngFin;
    }

    /**
     * Définit la valeur de la propriété dateFinEngFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinEngFin(XMLGregorianCalendar value) {
        this.dateFinEngFin = value;
    }

    /**
     * Obtient la valeur de la propriété isTotale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTotale() {
        return isTotale;
    }

    /**
     * Définit la valeur de la propriété isTotale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTotale(Boolean value) {
        this.isTotale = value;
    }

}
