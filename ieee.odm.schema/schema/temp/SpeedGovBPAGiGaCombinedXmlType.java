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
 * <p>Java class for SpeedGovBPAGiGaCombinedXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedGovBPAGiGaCombinedXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}SpeedGovModelXmlType">
 *       &lt;sequence>
 *         &lt;element name="regulator" type="{http://www.ieee.org/odm/Schema/2008}SpeedGovBPARegGIModelXmlType"/>
 *         &lt;element name="servo" type="{http://www.ieee.org/odm/Schema/2008}SpeedGovBPAServoGAModelXmlType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedGovBPAGiGaCombinedXmlType", propOrder = {
    "regulator",
    "servo"
})
public class SpeedGovBPAGiGaCombinedXmlType
    extends SpeedGovModelXmlType
{

    @XmlElement(required = true)
    protected SpeedGovBPARegGIModelXmlType regulator;
    @XmlElement(required = true)
    protected SpeedGovBPAServoGAModelXmlType servo;

    /**
     * Gets the value of the regulator property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedGovBPARegGIModelXmlType }
     *     
     */
    public SpeedGovBPARegGIModelXmlType getRegulator() {
        return regulator;
    }

    /**
     * Sets the value of the regulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedGovBPARegGIModelXmlType }
     *     
     */
    public void setRegulator(SpeedGovBPARegGIModelXmlType value) {
        this.regulator = value;
    }

    /**
     * Gets the value of the servo property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedGovBPAServoGAModelXmlType }
     *     
     */
    public SpeedGovBPAServoGAModelXmlType getServo() {
        return servo;
    }

    /**
     * Sets the value of the servo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedGovBPAServoGAModelXmlType }
     *     
     */
    public void setServo(SpeedGovBPAServoGAModelXmlType value) {
        this.servo = value;
    }

}
