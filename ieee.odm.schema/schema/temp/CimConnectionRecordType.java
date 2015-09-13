//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CimConnectionRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CimConnectionRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}CimRdfRecordType">
 *       &lt;sequence>
 *         &lt;element name="cimSwitches" type="{http://www.ieee.org/odm/Schema/2008}CimSwitchListXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CimConnectionRecordType", propOrder = {
    "cimSwitches"
})
@XmlSeeAlso({
    LoadflowLoadDataXmlType.class,
    LoadflowGenDataXmlType.class,
    BaseBranchXmlType.class
})
public class CimConnectionRecordType
    extends CimRdfRecordType
{

    protected CimSwitchListXmlType cimSwitches;

    /**
     * Gets the value of the cimSwitches property.
     * 
     * @return
     *     possible object is
     *     {@link CimSwitchListXmlType }
     *     
     */
    public CimSwitchListXmlType getCimSwitches() {
        return cimSwitches;
    }

    /**
     * Sets the value of the cimSwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link CimSwitchListXmlType }
     *     
     */
    public void setCimSwitches(CimSwitchListXmlType value) {
        this.cimSwitches = value;
    }

}
