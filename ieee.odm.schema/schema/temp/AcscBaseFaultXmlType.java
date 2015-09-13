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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcscBaseFaultXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcscBaseFaultXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultType" type="{http://www.ieee.org/odm/Schema/2008}AcscFaultTypeEnumType"/>
 *         &lt;element name="faultCategory" type="{http://www.ieee.org/odm/Schema/2008}AcscFaultCategoryEnumType"/>
 *         &lt;element name="zLG" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType" minOccurs="0"/>
 *         &lt;element name="zLL" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcscBaseFaultXmlType", propOrder = {
    "faultType",
    "faultCategory",
    "zlg",
    "zll"
})
@XmlSeeAlso({
    AcscBusFaultXmlType.class,
    AcscBranchFaultXmlType.class
})
public abstract class AcscBaseFaultXmlType {

    @XmlElement(required = true)
    protected AcscFaultTypeEnumType faultType;
    @XmlElement(required = true)
    protected AcscFaultCategoryEnumType faultCategory;
    @XmlElement(name = "zLG")
    protected ZXmlType zlg;
    @XmlElement(name = "zLL")
    protected ZXmlType zll;

    /**
     * Gets the value of the faultType property.
     * 
     * @return
     *     possible object is
     *     {@link AcscFaultTypeEnumType }
     *     
     */
    public AcscFaultTypeEnumType getFaultType() {
        return faultType;
    }

    /**
     * Sets the value of the faultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcscFaultTypeEnumType }
     *     
     */
    public void setFaultType(AcscFaultTypeEnumType value) {
        this.faultType = value;
    }

    /**
     * Gets the value of the faultCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AcscFaultCategoryEnumType }
     *     
     */
    public AcscFaultCategoryEnumType getFaultCategory() {
        return faultCategory;
    }

    /**
     * Sets the value of the faultCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcscFaultCategoryEnumType }
     *     
     */
    public void setFaultCategory(AcscFaultCategoryEnumType value) {
        this.faultCategory = value;
    }

    /**
     * Gets the value of the zlg property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getZLG() {
        return zlg;
    }

    /**
     * Sets the value of the zlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setZLG(ZXmlType value) {
        this.zlg = value;
    }

    /**
     * Gets the value of the zll property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getZLL() {
        return zll;
    }

    /**
     * Sets the value of the zll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setZLL(ZXmlType value) {
        this.zll = value;
    }

}
