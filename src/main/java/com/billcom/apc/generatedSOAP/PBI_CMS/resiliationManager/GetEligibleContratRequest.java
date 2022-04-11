
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour getEligibleContratRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getEligibleContratRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractIdentification" type="{http://alu.services.ws.lhs.com}ContractIdentificationBean" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateFinEngDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateFinEngFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isTotale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nbreOfContract" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleContratRequest", propOrder = {
    "contractIdentification",
    "customerId",
    "dateFinEngDebut",
    "dateFinEngFin",
    "isTotale",
    "nbreOfContract"
})
public class GetEligibleContratRequest {

    protected ContractIdentificationBean contractIdentification;
    protected Long customerId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEngDebut;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEngFin;
    protected Boolean isTotale;
    protected Integer nbreOfContract;

    /**
     * Obtient la valeur de la propri�t� contractIdentification.
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
     * D�finit la valeur de la propri�t� contractIdentification.
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
     * Obtient la valeur de la propri�t� customerId.
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
     * D�finit la valeur de la propri�t� customerId.
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
     * Obtient la valeur de la propri�t� dateFinEngDebut.
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
     * D�finit la valeur de la propri�t� dateFinEngDebut.
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
     * Obtient la valeur de la propri�t� dateFinEngFin.
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
     * D�finit la valeur de la propri�t� dateFinEngFin.
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
     * Obtient la valeur de la propri�t� isTotale.
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
     * D�finit la valeur de la propri�t� isTotale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTotale(Boolean value) {
        this.isTotale = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbreOfContract.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbreOfContract() {
        return nbreOfContract;
    }

    /**
     * D�finit la valeur de la propri�t� nbreOfContract.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbreOfContract(Integer value) {
        this.nbreOfContract = value;
    }

}
