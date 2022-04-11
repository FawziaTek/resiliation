
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour contractResiliationBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contractResiliationBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseCrm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFinEng" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faContrat" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="faTotale" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="isTotale" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="motif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motifClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offreAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="submId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractResiliationBean", propOrder = {
    "caseCrm",
    "coCode",
    "coId",
    "contractStatus",
    "cusCode",
    "cusId",
    "dateFinEng",
    "dueDate",
    "faContrat",
    "faTotale",
    "isTotale",
    "motif",
    "motifClient",
    "msisdn",
    "offreAct",
    "remarque",
    "sccode",
    "submId",
    "tmcode"
})
public class ContractResiliationBean {

    protected String caseCrm;
    protected String coCode;
    protected Long coId;
    protected String contractStatus;
    protected String cusCode;
    protected String cusId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEng;
    protected String dueDate;
    protected float faContrat;
    protected float faTotale;
    protected boolean isTotale;
    protected String motif;
    protected String motifClient;
    protected String msisdn;
    protected String offreAct;
    protected String remarque;
    protected Integer sccode;
    protected Integer submId;
    protected Long tmcode;

    /**
     * Obtient la valeur de la propriété caseCrm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCrm() {
        return caseCrm;
    }

    /**
     * Définit la valeur de la propriété caseCrm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCrm(String value) {
        this.caseCrm = value;
    }

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
     * Obtient la valeur de la propriété coId.
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
     * Définit la valeur de la propriété coId.
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
     * Obtient la valeur de la propriété contractStatus.
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
     * Définit la valeur de la propriété contractStatus.
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
     * Obtient la valeur de la propriété cusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusCode() {
        return cusCode;
    }

    /**
     * Définit la valeur de la propriété cusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusCode(String value) {
        this.cusCode = value;
    }

    /**
     * Obtient la valeur de la propriété cusId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusId() {
        return cusId;
    }

    /**
     * Définit la valeur de la propriété cusId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusId(String value) {
        this.cusId = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinEng.
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
     * Définit la valeur de la propriété dateFinEng.
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
     * Obtient la valeur de la propriété dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Définit la valeur de la propriété dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtient la valeur de la propriété faContrat.
     * 
     */
    public float getFaContrat() {
        return faContrat;
    }

    /**
     * Définit la valeur de la propriété faContrat.
     * 
     */
    public void setFaContrat(float value) {
        this.faContrat = value;
    }

    /**
     * Obtient la valeur de la propriété faTotale.
     * 
     */
    public float getFaTotale() {
        return faTotale;
    }

    /**
     * Définit la valeur de la propriété faTotale.
     * 
     */
    public void setFaTotale(float value) {
        this.faTotale = value;
    }

    /**
     * Obtient la valeur de la propriété isTotale.
     * 
     */
    public boolean isIsTotale() {
        return isTotale;
    }

    /**
     * Définit la valeur de la propriété isTotale.
     * 
     */
    public void setIsTotale(boolean value) {
        this.isTotale = value;
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

    /**
     * Obtient la valeur de la propriété motifClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotifClient() {
        return motifClient;
    }

    /**
     * Définit la valeur de la propriété motifClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotifClient(String value) {
        this.motifClient = value;
    }

    /**
     * Obtient la valeur de la propriété msisdn.
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
     * Définit la valeur de la propriété msisdn.
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
     * Obtient la valeur de la propriété offreAct.
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
     * Définit la valeur de la propriété offreAct.
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
     * Obtient la valeur de la propriété remarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * Définit la valeur de la propriété remarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarque(String value) {
        this.remarque = value;
    }

    /**
     * Obtient la valeur de la propriété sccode.
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
     * Définit la valeur de la propriété sccode.
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
     * Obtient la valeur de la propriété submId.
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
     * Définit la valeur de la propriété submId.
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
