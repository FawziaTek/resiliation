
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ContractBean complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContractBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateFinEng" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offreAct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subm_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "ContractBean", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "coCode",
    "coId",
    "contractStatus",
    "dateFinEng",
    "msisdn",
    "offreAct",
    "sccode",
    "submId",
    "tmcode"
})
public class ContractBean {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String coCode;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long coId;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String contractStatus;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEng;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String offreAct;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Integer.class, nillable = true)
    protected Integer sccode;
    @XmlElement(name = "subm_id", namespace = "http://alu.services.ws.lhs.com", required = true, type = Integer.class, nillable = true)
    protected Integer submId;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long tmcode;

    /**
     * Obtient la valeur de la propri�t� coCode.
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
     * D�finit la valeur de la propri�t� coCode.
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
     * Obtient la valeur de la propri�t� contractStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * D�finit la valeur de la propri�t� contractStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFinEng.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinEng() {
        return dateFinEng;
    }

    /**
     * D�finit la valeur de la propri�t� dateFinEng.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinEng(XMLGregorianCalendar value) {
        this.dateFinEng = value;
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
     * Obtient la valeur de la propri�t� offreAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffreAct() {
        return offreAct;
    }

    /**
     * D�finit la valeur de la propri�t� offreAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffreAct(String value) {
        this.offreAct = value;
    }

    /**
     * Obtient la valeur de la propri�t� sccode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSccode() {
        return sccode;
    }

    /**
     * D�finit la valeur de la propri�t� sccode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSccode(Integer value) {
        this.sccode = value;
    }

    /**
     * Obtient la valeur de la propri�t� submId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubmId() {
        return submId;
    }

    /**
     * D�finit la valeur de la propri�t� submId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubmId(Integer value) {
        this.submId = value;
    }

    /**
     * Obtient la valeur de la propri�t� tmcode.
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
     * D�finit la valeur de la propri�t� tmcode.
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
