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
 * <p>Java class for RatingChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingChangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="change" type="{http://www.ieee.org/odm/Schema/2008}DoubleValueChangeXmlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingChangeXmlType", propOrder = {
    "ratingName",
    "change"
})
public class RatingChangeXmlType {

    @XmlElement(required = true)
    protected String ratingName;
    @XmlElement(required = true)
    protected DoubleValueChangeXmlType change;

    /**
     * Gets the value of the ratingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingName() {
        return ratingName;
    }

    /**
     * Sets the value of the ratingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingName(String value) {
        this.ratingName = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleValueChangeXmlType }
     *     
     */
    public DoubleValueChangeXmlType getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleValueChangeXmlType }
     *     
     */
    public void setChange(DoubleValueChangeXmlType value) {
        this.change = value;
    }

}
