//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabSetPointChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabSetPointChangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refGenBus" type="{http://www.ieee.org/odm/Schema/2008}BusRefXmlType"/>
 *         &lt;element name="controllerType" type="{http://www.interpss.org/Schema/odm/2008}MachineControllerEnumType"/>
 *         &lt;element name="changeValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valueChangeType" type="{http://www.ieee.org/odm/Schema/2008}SetPointChangeEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabSetPointChangeXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "refGenBus",
    "controllerType",
    "changeValue",
    "valueChangeType"
})
public class DStabSetPointChangeXmlType {

    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected BusRefXmlType refGenBus;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected MachineControllerEnumType controllerType;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected double changeValue;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected SetPointChangeEnumType valueChangeType;

    /**
     * Gets the value of the refGenBus property.
     * 
     * @return
     *     possible object is
     *     {@link BusRefXmlType }
     *     
     */
    public BusRefXmlType getRefGenBus() {
        return refGenBus;
    }

    /**
     * Sets the value of the refGenBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusRefXmlType }
     *     
     */
    public void setRefGenBus(BusRefXmlType value) {
        this.refGenBus = value;
    }

    /**
     * Gets the value of the controllerType property.
     * 
     * @return
     *     possible object is
     *     {@link MachineControllerEnumType }
     *     
     */
    public MachineControllerEnumType getControllerType() {
        return controllerType;
    }

    /**
     * Sets the value of the controllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineControllerEnumType }
     *     
     */
    public void setControllerType(MachineControllerEnumType value) {
        this.controllerType = value;
    }

    /**
     * Gets the value of the changeValue property.
     * 
     */
    public double getChangeValue() {
        return changeValue;
    }

    /**
     * Sets the value of the changeValue property.
     * 
     */
    public void setChangeValue(double value) {
        this.changeValue = value;
    }

    /**
     * Gets the value of the valueChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link SetPointChangeEnumType }
     *     
     */
    public SetPointChangeEnumType getValueChangeType() {
        return valueChangeType;
    }

    /**
     * Sets the value of the valueChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPointChangeEnumType }
     *     
     */
    public void setValueChangeType(SetPointChangeEnumType value) {
        this.valueChangeType = value;
    }

}
