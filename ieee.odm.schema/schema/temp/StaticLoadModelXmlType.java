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
 * <p>Java class for StaticLoadModelXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaticLoadModelXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staticLoadType" type="{http://www.ieee.org/odm/Schema/2008}DStabStaticLoadModelEnumType"/>
 *         &lt;element name="switchVolt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="switchDeadZone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticLoadModelXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "staticLoadType",
    "switchVolt",
    "switchDeadZone"
})
public class StaticLoadModelXmlType {

    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected DStabStaticLoadModelEnumType staticLoadType;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected Double switchVolt;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected Double switchDeadZone;

    /**
     * Gets the value of the staticLoadType property.
     * 
     * @return
     *     possible object is
     *     {@link DStabStaticLoadModelEnumType }
     *     
     */
    public DStabStaticLoadModelEnumType getStaticLoadType() {
        return staticLoadType;
    }

    /**
     * Sets the value of the staticLoadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabStaticLoadModelEnumType }
     *     
     */
    public void setStaticLoadType(DStabStaticLoadModelEnumType value) {
        this.staticLoadType = value;
    }

    /**
     * Gets the value of the switchVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSwitchVolt() {
        return switchVolt;
    }

    /**
     * Sets the value of the switchVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSwitchVolt(Double value) {
        this.switchVolt = value;
    }

    /**
     * Gets the value of the switchDeadZone property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSwitchDeadZone() {
        return switchDeadZone;
    }

    /**
     * Sets the value of the switchDeadZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSwitchDeadZone(Double value) {
        this.switchDeadZone = value;
    }

}
