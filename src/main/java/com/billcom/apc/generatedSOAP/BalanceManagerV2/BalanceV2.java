
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour BalanceV2 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BalanceV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descriptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="isShown" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="remainingAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="serviceProviderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceV2", propOrder = {
    "description",
    "descriptionCode",
    "endDate",
    "expirationDate",
    "isShown",
    "priority",
    "remainingAmount",
    "serviceProviderName",
    "startDate",
    "unit",
    "usedAmount"
})
public class BalanceV2 implements Serializable{

    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String descriptionCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isShown;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer priority;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long remainingAmount;
    @XmlElement(required = true, nillable = true)
    protected String serviceProviderName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    protected String unit;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long usedAmount;

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propri�t� descriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * D�finit la valeur de la propri�t� descriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionCode(String value) {
        this.descriptionCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * D�finit la valeur de la propri�t� endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * D�finit la valeur de la propri�t� expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� isShown.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShown() {
        return isShown;
    }

    /**
     * D�finit la valeur de la propri�t� isShown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShown(Boolean value) {
        this.isShown = value;
    }

    /**
     * Obtient la valeur de la propri�t� priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * D�finit la valeur de la propri�t� priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Obtient la valeur de la propri�t� remainingAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * D�finit la valeur de la propri�t� remainingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingAmount(Long value) {
        this.remainingAmount = value;
    }

    /**
     * Obtient la valeur de la propri�t� serviceProviderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * D�finit la valeur de la propri�t� serviceProviderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderName(String value) {
        this.serviceProviderName = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * D�finit la valeur de la propri�t� unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Obtient la valeur de la propri�t� usedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedAmount() {
        return usedAmount;
    }

    /**
     * D�finit la valeur de la propri�t� usedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedAmount(Long value) {
        this.usedAmount = value;
    }

}
