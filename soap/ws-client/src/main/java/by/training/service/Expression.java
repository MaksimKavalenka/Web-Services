
package by.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operation" type="{http://service.training.by/}operation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expression", propOrder = {
    "number1",
    "number2",
    "operation"
})
public class Expression {

    protected double number1;
    protected double number2;
    @XmlSchemaType(name = "string")
    protected Operation operation;

    /**
     * Gets the value of the number1 property.
     * 
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(double value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     */
    public void setNumber2(double value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

}
