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
 * <p>Java class for PssBPADualInputXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PssBPADualInputXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}PssIEEEDualInputXmlType">
 *       &lt;sequence>
 *         &lt;element name="KrBaseMVA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PssBPADualInputXmlType", propOrder = {
    "krBaseMVA"
})
public class PssBPADualInputXmlType
    extends PssIEEEDualInputXmlType
{

    @XmlElement(name = "KrBaseMVA")
    protected Double krBaseMVA;

    /**
     * Gets the value of the krBaseMVA property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKrBaseMVA() {
        return krBaseMVA;
    }

    /**
     * Sets the value of the krBaseMVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKrBaseMVA(Double value) {
        this.krBaseMVA = value;
    }

}
