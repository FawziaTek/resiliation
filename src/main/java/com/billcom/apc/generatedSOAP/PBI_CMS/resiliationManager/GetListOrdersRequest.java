
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour getListOrdersRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getListOrdersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="finPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hasRight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ressource" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListOrdersRequest", propOrder = {
    "coCode",
    "custId",
    "debPeriod",
    "finPeriod",
    "hasRight",
    "ressource",
    "status",
    "tmcode",
    "user"
})
public class GetListOrdersRequest {

    protected String coCode;
    protected String custId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar debPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finPeriod;
    protected Boolean hasRight;
    protected Long ressource;
    protected Integer status;
    protected String tmcode;
    protected String user;

    /**
     * Obtient la valeur de la propriété coCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoCode() {
        return coCode;
    }

    /**
     * Définit la valeur de la propriété coCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoCode(String value) {
        this.coCode = value;
    }

    /**
     * Obtient la valeur de la propriété custId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Définit la valeur de la propriété custId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Obtient la valeur de la propriété debPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebPeriod() {
        return debPeriod;
    }

    /**
     * Définit la valeur de la propriété debPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebPeriod(XMLGregorianCalendar value) {
        this.debPeriod = value;
    }

    /**
     * Obtient la valeur de la propriété finPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinPeriod() {
        return finPeriod;
    }

    /**
     * Définit la valeur de la propriété finPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinPeriod(XMLGregorianCalendar value) {
        this.finPeriod = value;
    }

    /**
     * Obtient la valeur de la propriété hasRight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRight() {
        return hasRight;
    }

    /**
     * Définit la valeur de la propriété hasRight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRight(Boolean value) {
        this.hasRight = value;
    }

    /**
     * Obtient la valeur de la propriété ressource.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRessource() {
        return ressource;
    }

    /**
     * Définit la valeur de la propriété ressource.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRessource(Long value) {
        this.ressource = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété tmcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmcode() {
        return tmcode;
    }

    /**
     * Définit la valeur de la propriété tmcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmcode(String value) {
        this.tmcode = value;
    }

    /**
     * Obtient la valeur de la propriété user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Définit la valeur de la propriété user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
