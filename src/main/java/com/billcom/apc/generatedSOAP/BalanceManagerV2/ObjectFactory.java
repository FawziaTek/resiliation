
package com.billcom.apc.generatedSOAP.BalanceManagerV2;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.billcom.apc.generatedSOAP.BalanceManagerV2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory implements Serializable{

    private final static QName _BuyOptionBeanInput_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "buyOptionBeanInput");
    private final static QName _BuyOptionsReturn_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "buyOptionsReturn");
    private final static QName _TestRefillMainBalanceBeanInput_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "testRefillMainBalanceBeanInput");
    private final static QName _TestRefillMainBalanceReturn_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "testRefillMainBalanceReturn");
    private final static QName _RefillMainBalanceBeanInput_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "refillMainBalanceBeanInput");
    private final static QName _RefillMainBalanceReturn_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "refillMainBalanceReturn");
    private final static QName _GetBalanceAndDateBeanInput_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "getBalanceAndDateBeanInput");
    private final static QName _GetBalanceAndDateReturn_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "getBalanceAndDateReturn");
    private final static QName _TestBuyOptionBeanInput_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "testBuyOptionBeanInput");
    private final static QName _TestBuyOptionReturn_QNAME = new QName("http://v2.manager.ws.lucent.alcatel.com", "testBuyOptionReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.billcom.apc.generatedSOAP.BalanceManagerV2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyOptionBeanInputV2 }
     * 
     */
    public BuyOptionBeanInputV2 createBuyOptionBeanInputV2() {
        return new BuyOptionBeanInputV2();
    }

    /**
     * Create an instance of {@link OperationResponseV2 }
     * 
     */
    public OperationResponseV2 createOperationResponseV2() {
        return new OperationResponseV2();
    }

    /**
     * Create an instance of {@link TestRefillMainBalanceBeanInput }
     * 
     */
    public TestRefillMainBalanceBeanInput createTestRefillMainBalanceBeanInput() {
        return new TestRefillMainBalanceBeanInput();
    }

    /**
     * Create an instance of {@link TestRefillMainBalanceBeanOutput }
     * 
     */
    public TestRefillMainBalanceBeanOutput createTestRefillMainBalanceBeanOutput() {
        return new TestRefillMainBalanceBeanOutput();
    }

    /**
     * Create an instance of {@link RefillMainBalanceBeanInputV2 }
     * 
     */
    public RefillMainBalanceBeanInputV2 createRefillMainBalanceBeanInputV2() {
        return new RefillMainBalanceBeanInputV2();
    }

    /**
     * Create an instance of {@link GetBalanceAndDateBeanInputV2 }
     * 
     */
    public GetBalanceAndDateBeanInputV2 createGetBalanceAndDateBeanInputV2() {
        return new GetBalanceAndDateBeanInputV2();
    }

    /**
     * Create an instance of {@link GetBalanceAndDateBeanOutputV2 }
     * 
     */
    public GetBalanceAndDateBeanOutputV2 createGetBalanceAndDateBeanOutputV2() {
        return new GetBalanceAndDateBeanOutputV2();
    }

    /**
     * Create an instance of {@link TestBuyOptionBeanInput }
     * 
     */
    public TestBuyOptionBeanInput createTestBuyOptionBeanInput() {
        return new TestBuyOptionBeanInput();
    }

    /**
     * Create an instance of {@link TestBuyOptionBeanOutput }
     * 
     */
    public TestBuyOptionBeanOutput createTestBuyOptionBeanOutput() {
        return new TestBuyOptionBeanOutput();
    }

    /**
     * Create an instance of {@link SubscriberV2 }
     * 
     */
    public SubscriberV2 createSubscriberV2() {
        return new SubscriberV2();
    }

    /**
     * Create an instance of {@link BalanceV2 }
     * 
     */
    public BalanceV2 createBalanceV2() {
        return new BalanceV2();
    }

    /**
     * Create an instance of {@link ArrayOfBalanceV2 }
     * 
     */
    public ArrayOfBalanceV2 createArrayOfBalanceV2() {
        return new ArrayOfBalanceV2();
    }

    /**
     * Create an instance of {@link OptionV2 }
     * 
     */
    public OptionV2 createOptionV2() {
        return new OptionV2();
    }

    /**
     * Create an instance of {@link ArrayOfOptionV2 }
     * 
     */
    public ArrayOfOptionV2 createArrayOfOptionV2() {
        return new ArrayOfOptionV2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyOptionBeanInputV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "buyOptionBeanInput")
    public JAXBElement<BuyOptionBeanInputV2> createBuyOptionBeanInput(BuyOptionBeanInputV2 value) {
        return new JAXBElement<BuyOptionBeanInputV2>(_BuyOptionBeanInput_QNAME, BuyOptionBeanInputV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponseV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "buyOptionsReturn")
    public JAXBElement<OperationResponseV2> createBuyOptionsReturn(OperationResponseV2 value) {
        return new JAXBElement<OperationResponseV2>(_BuyOptionsReturn_QNAME, OperationResponseV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRefillMainBalanceBeanInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "testRefillMainBalanceBeanInput")
    public JAXBElement<TestRefillMainBalanceBeanInput> createTestRefillMainBalanceBeanInput(TestRefillMainBalanceBeanInput value) {
        return new JAXBElement<TestRefillMainBalanceBeanInput>(_TestRefillMainBalanceBeanInput_QNAME, TestRefillMainBalanceBeanInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRefillMainBalanceBeanOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "testRefillMainBalanceReturn")
    public JAXBElement<TestRefillMainBalanceBeanOutput> createTestRefillMainBalanceReturn(TestRefillMainBalanceBeanOutput value) {
        return new JAXBElement<TestRefillMainBalanceBeanOutput>(_TestRefillMainBalanceReturn_QNAME, TestRefillMainBalanceBeanOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillMainBalanceBeanInputV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "refillMainBalanceBeanInput")
    public JAXBElement<RefillMainBalanceBeanInputV2> createRefillMainBalanceBeanInput(RefillMainBalanceBeanInputV2 value) {
        return new JAXBElement<RefillMainBalanceBeanInputV2>(_RefillMainBalanceBeanInput_QNAME, RefillMainBalanceBeanInputV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponseV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "refillMainBalanceReturn")
    public JAXBElement<OperationResponseV2> createRefillMainBalanceReturn(OperationResponseV2 value) {
        return new JAXBElement<OperationResponseV2>(_RefillMainBalanceReturn_QNAME, OperationResponseV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceAndDateBeanInputV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "getBalanceAndDateBeanInput")
    public JAXBElement<GetBalanceAndDateBeanInputV2> createGetBalanceAndDateBeanInput(GetBalanceAndDateBeanInputV2 value) {
        return new JAXBElement<GetBalanceAndDateBeanInputV2>(_GetBalanceAndDateBeanInput_QNAME, GetBalanceAndDateBeanInputV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceAndDateBeanOutputV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "getBalanceAndDateReturn")
    public JAXBElement<GetBalanceAndDateBeanOutputV2> createGetBalanceAndDateReturn(GetBalanceAndDateBeanOutputV2 value) {
        return new JAXBElement<GetBalanceAndDateBeanOutputV2>(_GetBalanceAndDateReturn_QNAME, GetBalanceAndDateBeanOutputV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestBuyOptionBeanInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "testBuyOptionBeanInput")
    public JAXBElement<TestBuyOptionBeanInput> createTestBuyOptionBeanInput(TestBuyOptionBeanInput value) {
        return new JAXBElement<TestBuyOptionBeanInput>(_TestBuyOptionBeanInput_QNAME, TestBuyOptionBeanInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestBuyOptionBeanOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.manager.ws.lucent.alcatel.com", name = "testBuyOptionReturn")
    public JAXBElement<TestBuyOptionBeanOutput> createTestBuyOptionReturn(TestBuyOptionBeanOutput value) {
        return new JAXBElement<TestBuyOptionBeanOutput>(_TestBuyOptionReturn_QNAME, TestBuyOptionBeanOutput.class, null, value);
    }

}
