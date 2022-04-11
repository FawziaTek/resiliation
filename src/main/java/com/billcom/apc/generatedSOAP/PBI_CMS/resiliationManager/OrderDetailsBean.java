
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour orderDetailsBean complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="orderDetailsBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fraisAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="orderIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="taskDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDetailsBean", propOrder = {
    "dueDate",
    "fraisAcc",
    "orderId",
    "orderIdPub",
    "status",
    "task",
    "taskDesc",
    "taskName",
    "typeTask",
    "user"
})
public class OrderDetailsBean {

    protected String dueDate;
    protected String fraisAcc;
    protected BigInteger orderId;
    protected String orderIdPub;
    protected String status;
    protected BigInteger task;
    protected String taskDesc;
    protected String taskName;
    protected String typeTask;
    protected String user;

    /**
     * Obtient la valeur de la propri�t� dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * D�finit la valeur de la propri�t� dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� fraisAcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraisAcc() {
        return fraisAcc;
    }

    /**
     * D�finit la valeur de la propri�t� fraisAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraisAcc(String value) {
        this.fraisAcc = value;
    }

    /**
     * Obtient la valeur de la propri�t� orderId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderId() {
        return orderId;
    }

    /**
     * D�finit la valeur de la propri�t� orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderId(BigInteger value) {
        this.orderId = value;
    }

    /**
     * Obtient la valeur de la propri�t� orderIdPub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdPub() {
        return orderIdPub;
    }

    /**
     * D�finit la valeur de la propri�t� orderIdPub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdPub(String value) {
        this.orderIdPub = value;
    }

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� task.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTask() {
        return task;
    }

    /**
     * D�finit la valeur de la propri�t� task.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTask(BigInteger value) {
        this.task = value;
    }

    /**
     * Obtient la valeur de la propri�t� taskDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * D�finit la valeur de la propri�t� taskDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDesc(String value) {
        this.taskDesc = value;
    }

    /**
     * Obtient la valeur de la propri�t� taskName.
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
     * D�finit la valeur de la propri�t� taskName.
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
     * Obtient la valeur de la propri�t� typeTask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTask() {
        return typeTask;
    }

    /**
     * D�finit la valeur de la propri�t� typeTask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTask(String value) {
        this.typeTask = value;
    }

    /**
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
