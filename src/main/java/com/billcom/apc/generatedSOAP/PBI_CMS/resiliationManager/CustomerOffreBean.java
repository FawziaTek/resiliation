
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CustomerOffreBean complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOffreBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="des" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomberContrats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shdes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOffreBean", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "des",
    "nomberContrats",
    "shdes",
    "tmcode"
})
public class CustomerOffreBean {

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String des;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com")
    protected int nomberContrats;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected String shdes;
    @XmlElement(namespace = "http://alu.services.ws.lhs.com")
    protected int tmcode;

    /**
     * Obtient la valeur de la propri�t� des.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * D�finit la valeur de la propri�t� des.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomberContrats.
     * 
     */
    public int getNomberContrats() {
        return nomberContrats;
    }

    /**
     * D�finit la valeur de la propri�t� nomberContrats.
     * 
     */
    public void setNomberContrats(int value) {
        this.nomberContrats = value;
    }

    /**
     * Obtient la valeur de la propri�t� shdes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdes() {
        return shdes;
    }

    /**
     * D�finit la valeur de la propri�t� shdes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdes(String value) {
        this.shdes = value;
    }

    /**
     * Obtient la valeur de la propri�t� tmcode.
     * 
     */
    public int getTmcode() {
        return tmcode;
    }

    /**
     * D�finit la valeur de la propri�t� tmcode.
     * 
     */
    public void setTmcode(int value) {
        this.tmcode = value;
    }

}
