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
 * <p>Java class for BaseBranchOverrideXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseBranchOverrideXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BaseOutageOverrideXmlType">
 *       &lt;sequence>
 *         &lt;element name="station" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="equipname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="openCloseStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBranchOverrideXmlType", propOrder = {
    "station",
    "voltage",
    "equipname",
    "openCloseStatus"
})
@XmlSeeAlso({
    BranchOverrideXmlType.class,
    BreakerOverrideXmlType.class
})
public abstract class BaseBranchOverrideXmlType
    extends BaseOutageOverrideXmlType
{

    @XmlElement(required = true)
    protected String station;
    protected Double voltage;
    @XmlElement(required = true)
    protected String equipname;
    protected boolean openCloseStatus;

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVoltage(Double value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the equipname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipname() {
        return equipname;
    }

    /**
     * Sets the value of the equipname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipname(String value) {
        this.equipname = value;
    }

    /**
     * Gets the value of the openCloseStatus property.
     * 
     */
    public boolean isOpenCloseStatus() {
        return openCloseStatus;
    }

    /**
     * Sets the value of the openCloseStatus property.
     * 
     */
    public void setOpenCloseStatus(boolean value) {
        this.openCloseStatus = value;
    }

}
