
package com.billcom.apc.ws.manager;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour migrationBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="migrationBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="migComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldCoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldCoid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="remarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rpcodeInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rpcodeTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrationBean", propOrder = {
    "coCode",
    "coId",
    "csId",
    "custCode",
    "dateEnd",
    "dateStart",
    "desInit",
    "desTarget",
    "dueDate",
    "migComment",
    "msisdn",
    "oldCoCode",
    "oldCoid",
    "orderId",
    "remarque",
    "rpcodeInit",
    "rpcodeTarget",
    "status",
    "task",
    "userGroup",
    "userId"
})
public class MigrationBean {

    protected String coCode;
    protected String coId;
    protected String csId;
    protected String custCode;
    protected String dateEnd;
    protected String dateStart;
    protected String desInit;
    protected String desTarget;
    protected String dueDate;
    protected String migComment;
    protected String msisdn;
    protected String oldCoCode;
    protected String oldCoid;
    protected BigInteger orderId;
    protected String remarque;
    protected String rpcodeInit;
    protected String rpcodeTarget;
    protected int status;
    protected String task;
    protected String userGroup;
    protected String userId;

    /**
     * Obtient la valeur de la propriété coCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoCode() {
        return coCode;
    }

    /**
     * Définit la valeur de la propriété coCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoCode(String value) {
        this.coCode = value;
    }

    /**
     * Obtient la valeur de la propriété coId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoId() {
        return coId;
    }

    /**
     * Définit la valeur de la propriété coId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoId(String value) {
        this.coId = value;
    }

    /**
     * Obtient la valeur de la propriété csId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsId() {
        return csId;
    }

    /**
     * Définit la valeur de la propriété csId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsId(String value) {
        this.csId = value;
    }

    /**
     * Obtient la valeur de la propriété custCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * Définit la valeur de la propriété custCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCode(String value) {
        this.custCode = value;
    }

    /**
     * Obtient la valeur de la propriété dateEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Définit la valeur de la propriété dateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnd(String value) {
        this.dateEnd = value;
    }

    /**
     * Obtient la valeur de la propriété dateStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Définit la valeur de la propriété dateStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateStart(String value) {
        this.dateStart = value;
    }

    /**
     * Obtient la valeur de la propriété desInit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesInit() {
        return desInit;
    }

    /**
     * Définit la valeur de la propriété desInit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesInit(String value) {
        this.desInit = value;
    }

    /**
     * Obtient la valeur de la propriété desTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTarget() {
        return desTarget;
    }

    /**
     * Définit la valeur de la propriété desTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTarget(String value) {
        this.desTarget = value;
    }

    /**
     * Obtient la valeur de la propriété dueDate.
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
     * Définit la valeur de la propriété dueDate.
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
     * Obtient la valeur de la propriété migComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigComment() {
        return migComment;
    }

    /**
     * Définit la valeur de la propriété migComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigComment(String value) {
        this.migComment = value;
    }

    /**
     * Obtient la valeur de la propriété msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Définit la valeur de la propriété msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Obtient la valeur de la propriété oldCoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCoCode() {
        return oldCoCode;
    }

    /**
     * Définit la valeur de la propriété oldCoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCoCode(String value) {
        this.oldCoCode = value;
    }

    /**
     * Obtient la valeur de la propriété oldCoid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCoid() {
        return oldCoid;
    }

    /**
     * Définit la valeur de la propriété oldCoid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCoid(String value) {
        this.oldCoid = value;
    }

    /**
     * Obtient la valeur de la propriété orderId.
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
     * Définit la valeur de la propriété orderId.
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
     * Obtient la valeur de la propriété remarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * Définit la valeur de la propriété remarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarque(String value) {
        this.remarque = value;
    }

    /**
     * Obtient la valeur de la propriété rpcodeInit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpcodeInit() {
        return rpcodeInit;
    }

    /**
     * Définit la valeur de la propriété rpcodeInit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpcodeInit(String value) {
        this.rpcodeInit = value;
    }

    /**
     * Obtient la valeur de la propriété rpcodeTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpcodeTarget() {
        return rpcodeTarget;
    }

    /**
     * Définit la valeur de la propriété rpcodeTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpcodeTarget(String value) {
        this.rpcodeTarget = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Définit la valeur de la propriété task.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Obtient la valeur de la propriété userGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * Définit la valeur de la propriété userGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroup(String value) {
        this.userGroup = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
