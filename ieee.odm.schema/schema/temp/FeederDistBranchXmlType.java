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
 * <p>Java class for FeederDistBranchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeederDistBranchXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}DistBranchXmlType">
 *       &lt;sequence>
 *         &lt;element name="z1" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType"/>
 *         &lt;element name="z0" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType" minOccurs="0"/>
 *         &lt;element name="shuntY" type="{http://www.ieee.org/odm/Schema/2008}YXmlType" minOccurs="0"/>
 *         &lt;element name="shuntY0" type="{http://www.ieee.org/odm/Schema/2008}YXmlType" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.ieee.org/odm/Schema/2008}LengthXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeederDistBranchXmlType", propOrder = {
    "z1",
    "z0",
    "shuntY",
    "shuntY0",
    "length"
})
public class FeederDistBranchXmlType
    extends DistBranchXmlType
{

    @XmlElement(required = true)
    protected ZXmlType z1;
    protected ZXmlType z0;
    protected YXmlType shuntY;
    protected YXmlType shuntY0;
    protected LengthXmlType length;

    /**
     * Gets the value of the z1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getZ1() {
        return z1;
    }

    /**
     * Sets the value of the z1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setZ1(ZXmlType value) {
        this.z1 = value;
    }

    /**
     * Gets the value of the z0 property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getZ0() {
        return z0;
    }

    /**
     * Sets the value of the z0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setZ0(ZXmlType value) {
        this.z0 = value;
    }

    /**
     * Gets the value of the shuntY property.
     * 
     * @return
     *     possible object is
     *     {@link YXmlType }
     *     
     */
    public YXmlType getShuntY() {
        return shuntY;
    }

    /**
     * Sets the value of the shuntY property.
     * 
     * @param value
     *     allowed object is
     *     {@link YXmlType }
     *     
     */
    public void setShuntY(YXmlType value) {
        this.shuntY = value;
    }

    /**
     * Gets the value of the shuntY0 property.
     * 
     * @return
     *     possible object is
     *     {@link YXmlType }
     *     
     */
    public YXmlType getShuntY0() {
        return shuntY0;
    }

    /**
     * Sets the value of the shuntY0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link YXmlType }
     *     
     */
    public void setShuntY0(YXmlType value) {
        this.shuntY0 = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthXmlType }
     *     
     */
    public LengthXmlType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthXmlType }
     *     
     */
    public void setLength(LengthXmlType value) {
        this.length = value;
    }

}
