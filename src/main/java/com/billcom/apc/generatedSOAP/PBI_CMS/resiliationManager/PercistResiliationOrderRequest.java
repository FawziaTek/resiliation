
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour percistResiliationOrderRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="percistResiliationOrderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resiliations" type="{http://manager.ws.resiliation.billcom.com/}resiliationBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percistResiliationOrderRequest", propOrder = {
    "resiliations"
})
public class PercistResiliationOrderRequest {

    @XmlElement(nillable = true)
    protected List<ResiliationBean> resiliations;

    /**
     * Gets the value of the resiliations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resiliations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResiliations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResiliationBean }
     * 
     * 
     */
    public List<ResiliationBean> getResiliations() {
        if (resiliations == null) {
            resiliations = new ArrayList<ResiliationBean>();
        }
        return this.resiliations;
    }

}
