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
 * <p>Java class for AggregateGenBusXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateGenBusXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BusRefXmlType">
 *       &lt;sequence>
 *         &lt;element name="allocFactor" type="{http://www.ieee.org/odm/Schema/2008}FactorXmlType"/>
 *         &lt;element name="busType" type="{http://www.interpss.org/Schema/odm/2008}AggregateGenBusEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateGenBusXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "allocFactor",
    "busType"
})
public class AggregateGenBusXmlType
    extends BusRefXmlType
{

    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected FactorXmlType allocFactor;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected AggregateGenBusEnumType busType;

    /**
     * Gets the value of the allocFactor property.
     * 
     * @return
     *     possible object is
     *     {@link FactorXmlType }
     *     
     */
    public FactorXmlType getAllocFactor() {
        return allocFactor;
    }

    /**
     * Sets the value of the allocFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorXmlType }
     *     
     */
    public void setAllocFactor(FactorXmlType value) {
        this.allocFactor = value;
    }

    /**
     * Gets the value of the busType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateGenBusEnumType }
     *     
     */
    public AggregateGenBusEnumType getBusType() {
        return busType;
    }

    /**
     * Sets the value of the busType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateGenBusEnumType }
     *     
     */
    public void setBusType(AggregateGenBusEnumType value) {
        this.busType = value;
    }

}
