
package com.billcom.apc.ws.manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getEligibleContractForMigrationResponseBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getEligibleContractForMigrationResponseBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coIdList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rpCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleContractForMigrationResponseBean", propOrder = {
    "coIdList",
    "des",
    "numBer",
    "rpCode",
    "type",
    "value"
})
public class GetEligibleContractForMigrationResponseBean {

    @XmlElement(nillable = true)
    protected List<Long> coIdList;
    protected String des;
    protected int numBer;
    protected long rpCode;
    protected String type;
    protected String value;

    /**
     * Gets the value of the coIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCoIdList() {
        if (coIdList == null) {
            coIdList = new ArrayList<Long>();
        }
        return this.coIdList;
    }

    /**
     * Obtient la valeur de la propriété des.
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
     * Définit la valeur de la propriété des.
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
     * Obtient la valeur de la propriété numBer.
     * 
     */
    public int getNumBer() {
        return numBer;
    }

    /**
     * Définit la valeur de la propriété numBer.
     * 
     */
    public void setNumBer(int value) {
        this.numBer = value;
    }

    /**
     * Obtient la valeur de la propriété rpCode.
     * 
     */
    public long getRpCode() {
        return rpCode;
    }

    /**
     * Définit la valeur de la propriété rpCode.
     * 
     */
    public void setRpCode(long value) {
        this.rpCode = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
