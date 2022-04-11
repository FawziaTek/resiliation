
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FraisAcc complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FraisAcc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeContrat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="montantFA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nbreMoisRestant" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="offreAct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FraisAcc", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "codeContrat",
    "coid",
    "dateDebut",
    "dateFin",
    "montantFA",
    "msisdn",
    "nbreMoisRestant",
    "offreAct",
    "remise",
    "tmcode"
})
public class FraisAcc {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String codeContrat;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long coid;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String dateDebut;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String dateFin;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Double.class, nillable = true)
    protected Double montantFA;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long nbreMoisRestant;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String offreAct;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String remise;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, type = Long.class, nillable = true)
    protected Long tmcode;

    /**
     * Obtient la valeur de la propri�t� codeContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContrat() {
        return codeContrat;
    }

    /**
     * D�finit la valeur de la propri�t� codeContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContrat(String value) {
        this.codeContrat = value;
    }

    /**
     * Obtient la valeur de la propri�t� coid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoid() {
        return coid;
    }

    /**
     * D�finit la valeur de la propri�t� coid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoid(Long value) {
        this.coid = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebut(String value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * D�finit la valeur de la propri�t� dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFin(String value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantFA.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontantFA() {
        return montantFA;
    }

    /**
     * D�finit la valeur de la propri�t� montantFA.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontantFA(Double value) {
        this.montantFA = value;
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
     * Obtient la valeur de la propri�t� nbreMoisRestant.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNbreMoisRestant() {
        return nbreMoisRestant;
    }

    /**
     * D�finit la valeur de la propri�t� nbreMoisRestant.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNbreMoisRestant(Long value) {
        this.nbreMoisRestant = value;
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
     * Obtient la valeur de la propri�t� remise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemise() {
        return remise;
    }

    /**
     * D�finit la valeur de la propri�t� remise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemise(String value) {
        this.remise = value;
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
