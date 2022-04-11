
package com.billcom.apc.ws.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour detailsOrderBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailsOrderBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taskDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tasktype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailsOrderBean", propOrder = {
    "taskDate",
    "taskId",
    "taskName",
    "tasktype"
})
public class DetailsOrderBean {

    protected String taskDate;
    protected String taskId;
    protected String taskName;
    protected String tasktype;

    /**
     * Obtient la valeur de la propriété taskDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDate() {
        return taskDate;
    }

    /**
     * Définit la valeur de la propriété taskDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDate(String value) {
        this.taskDate = value;
    }

    /**
     * Obtient la valeur de la propriété taskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Définit la valeur de la propriété taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Obtient la valeur de la propriété taskName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Définit la valeur de la propriété taskName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Obtient la valeur de la propriété tasktype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasktype() {
        return tasktype;
    }

    /**
     * Définit la valeur de la propriété tasktype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasktype(String value) {
        this.tasktype = value;
    }

}
