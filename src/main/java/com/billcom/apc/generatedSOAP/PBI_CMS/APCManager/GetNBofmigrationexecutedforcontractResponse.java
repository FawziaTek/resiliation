
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getNBofmigrationexecutedforcontractResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getNBofmigrationexecutedforcontractResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://manager.ws.apc.billcom.com/}nbreMigrationExecutedResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNBofmigrationexecutedforcontractResponse", propOrder = {
    "_return"
})
public class GetNBofmigrationexecutedforcontractResponse {

    @XmlElement(name = "return")
    protected NbreMigrationExecutedResponse _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link NbreMigrationExecutedResponse }
     *     
     */
    public NbreMigrationExecutedResponse getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link NbreMigrationExecutedResponse }
     *     
     */
    public void setReturn(NbreMigrationExecutedResponse value) {
        this._return = value;
    }

}
