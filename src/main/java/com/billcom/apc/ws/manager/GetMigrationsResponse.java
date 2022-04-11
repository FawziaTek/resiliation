
package com.billcom.apc.ws.manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMigrationsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMigrationsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beans" type="{http://manager.ws.apc.billcom.com/}migrationBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://manager.ws.apc.billcom.com/}operationResponseAPC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMigrationsResponse", propOrder = {
    "beans",
    "response"
})
public class GetMigrationsResponse {

    @XmlElement(nillable = true)
    protected List<MigrationBean> beans;
    protected OperationResponseAPC response;

    /**
     * Gets the value of the beans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MigrationBean }
     * 
     * 
     */
    public List<MigrationBean> getBeans() {
        if (beans == null) {
            beans = new ArrayList<MigrationBean>();
        }
        return this.beans;
    }

    /**
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseAPC }
     *     
     */
    public OperationResponseAPC getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseAPC }
     *     
     */
    public void setResponse(OperationResponseAPC value) {
        this.response = value;
    }

}
