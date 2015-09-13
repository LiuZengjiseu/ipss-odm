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
 * <p>Java class for UCTEExchangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UCTEExchangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchangePower" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UCTEExchangeXmlType", propOrder = {
    "fromIsoId",
    "toIsoId",
    "exchangePower",
    "comment"
})
public class UCTEExchangeXmlType {

    @XmlElement(required = true)
    protected String fromIsoId;
    @XmlElement(required = true)
    protected String toIsoId;
    @XmlElement(required = true)
    protected PowerXmlType exchangePower;
    protected String comment;

    /**
     * Gets the value of the fromIsoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromIsoId() {
        return fromIsoId;
    }

    /**
     * Sets the value of the fromIsoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromIsoId(String value) {
        this.fromIsoId = value;
    }

    /**
     * Gets the value of the toIsoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToIsoId() {
        return toIsoId;
    }

    /**
     * Sets the value of the toIsoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToIsoId(String value) {
        this.toIsoId = value;
    }

    /**
     * Gets the value of the exchangePower property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getExchangePower() {
        return exchangePower;
    }

    /**
     * Sets the value of the exchangePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setExchangePower(PowerXmlType value) {
        this.exchangePower = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
