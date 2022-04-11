
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour GetCalculatedFaccTotaleRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetCalculatedFaccTotaleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coIdList" type="{http://alu.services.ws.lhs.com}ArrayOf_xsd_long"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="duDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="motif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCalculatedFaccTotaleRequest", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "coIdList",
    "customerID",
    "duDate",
    "motif"
})
public class GetCalculatedFaccTotaleRequest {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ArrayOfXsdLong coIdList;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long customerID;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar duDate;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String motif;

    /**
     * Obtient la valeur de la propriété coIdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdLong }
     *     
     */
    public ArrayOfXsdLong getCoIdList() {
        return coIdList;
    }

    /**
     * Définit la valeur de la propriété coIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdLong }
     *     
     */
    public void setCoIdList(ArrayOfXsdLong value) {
        this.coIdList = value;
    }

    /**
     * Obtient la valeur de la propriété customerID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerID() {
        return customerID;
    }

    /**
     * Définit la valeur de la propriété customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerID(Long value) {
        this.customerID = value;
    }

    /**
     * Obtient la valeur de la propriété duDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDuDate() {
        return duDate;
    }

    /**
     * Définit la valeur de la propriété duDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDuDate(XMLGregorianCalendar value) {
        this.duDate = value;
    }

    /**
     * Obtient la valeur de la propriété motif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Définit la valeur de la propriété motif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotif(String value) {
        this.motif = value;
    }

}
