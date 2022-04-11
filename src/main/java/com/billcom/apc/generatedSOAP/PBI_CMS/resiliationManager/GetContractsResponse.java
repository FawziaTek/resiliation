
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getContractsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getContractsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beans" type="{http://manager.ws.resiliation.billcom.com/}contractResiliationBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://manager.ws.resiliation.billcom.com/}operationResponseResiliation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContractsResponse", propOrder = {
    "beans",
    "response"
})
public class GetContractsResponse {

    @XmlElement(nillable = true)
    protected List<ContractResiliationBean> beans;
    protected OperationResponseResiliation response;

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
     * {@link ContractResiliationBean }
     * 
     * 
     */
    public List<ContractResiliationBean> getBeans() {
        if (beans == null) {
            beans = new ArrayList<ContractResiliationBean>();
        }
        return this.beans;
    }

    /**
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseResiliation }
     *     
     */
    public OperationResponseResiliation getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseResiliation }
     *     
     */
    public void setResponse(OperationResponseResiliation value) {
        this.response = value;
    }

}
