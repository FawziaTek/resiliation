
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ChangeRatePlanResiliationResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeRatePlanResiliationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://alu.services.ws.lhs.com}OperationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRatePlanResiliationResponse", namespace = "http://alu.services.ws.lhs.com", propOrder = {
    "finished"
})
public class ChangeRatePlanResiliationResponse
    extends OperationResponse
{

    @XmlElement(namespace = "http://alu.services.ws.lhs.com")
    protected boolean finished;

    /**
     * Obtient la valeur de la propri�t� finished.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * D�finit la valeur de la propri�t� finished.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

}
