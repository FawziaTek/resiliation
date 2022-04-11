
package com.billcom.apc.ws.manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getOrderResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getOrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beans" type="{http://manager.ws.apc.billcom.com/}detailsOrderBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderResponse", propOrder = {
    "beans"
})
public class GetOrderResponse {

    @XmlElement(nillable = true)
    protected List<DetailsOrderBean> beans;

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
     * {@link DetailsOrderBean }
     * 
     * 
     */
    public List<DetailsOrderBean> getBeans() {
        if (beans == null) {
            beans = new ArrayList<DetailsOrderBean>();
        }
        return this.beans;
    }

}
