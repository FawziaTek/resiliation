
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetListContractsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetListContractsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://alu.services.ws.lhs.com}OperationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beans" type="{http://alu.services.ws.lhs.com}ArrayOfResultResiliationBean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListContractsResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "beans"
})
public class GetListContractsResponse
    extends OperationResponse
{

    @XmlElement(namespace = "http://alu.services.ws.lhs.com", required = true, nillable = true)
    protected ArrayOfResultResiliationBean beans;

    /**
     * Obtient la valeur de la propriété beans.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultResiliationBean }
     *     
     */
    public ArrayOfResultResiliationBean getBeans() {
        return beans;
    }

    /**
     * Définit la valeur de la propriété beans.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultResiliationBean }
     *     
     */
    public void setBeans(ArrayOfResultResiliationBean value) {
        this.beans = value;
    }

}
