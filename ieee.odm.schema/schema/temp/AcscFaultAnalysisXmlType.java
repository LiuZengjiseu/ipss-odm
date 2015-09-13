//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         	Data structure for defining an Acsc analysis for the study case
 * 		
 * 
 * <p>Java class for AcscFaultAnalysisXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcscFaultAnalysisXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BaseAnalysisTypeXmlType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.interpss.org/Schema/odm/2008}acscFault"/>
 *         &lt;element name="preFaultBusVoltage" type="{http://www.ieee.org/odm/Schema/2008}PreFaultBusVoltageEnumType" minOccurs="0"/>
 *         &lt;element name="multiFactor" type="{http://www.ieee.org/odm/Schema/2008}FactorXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcscFaultAnalysisXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "acscFault",
    "preFaultBusVoltage",
    "multiFactor"
})
public class AcscFaultAnalysisXmlType
    extends BaseAnalysisTypeXmlType
{

    @XmlElementRef(name = "acscFault", namespace = "http://www.interpss.org/Schema/odm/2008", type = JAXBElement.class)
    protected JAXBElement<? extends AcscBaseFaultXmlType> acscFault;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected PreFaultBusVoltageEnumType preFaultBusVoltage;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected FactorXmlType multiFactor;

    /**
     * 
     *         					the field should be substitude with acscBusFault or acscBranchFault
     * 						
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcscBusFaultXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcscBranchFaultXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcscBaseFaultXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends AcscBaseFaultXmlType> getAcscFault() {
        return acscFault;
    }

    /**
     * 
     *         					the field should be substitude with acscBusFault or acscBranchFault
     * 						
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcscBusFaultXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcscBranchFaultXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcscBaseFaultXmlType }{@code >}
     *     
     */
    public void setAcscFault(JAXBElement<? extends AcscBaseFaultXmlType> value) {
        this.acscFault = ((JAXBElement<? extends AcscBaseFaultXmlType> ) value);
    }

    /**
     * Gets the value of the preFaultBusVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link PreFaultBusVoltageEnumType }
     *     
     */
    public PreFaultBusVoltageEnumType getPreFaultBusVoltage() {
        return preFaultBusVoltage;
    }

    /**
     * Sets the value of the preFaultBusVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreFaultBusVoltageEnumType }
     *     
     */
    public void setPreFaultBusVoltage(PreFaultBusVoltageEnumType value) {
        this.preFaultBusVoltage = value;
    }

    /**
     * Gets the value of the multiFactor property.
     * 
     * @return
     *     possible object is
     *     {@link FactorXmlType }
     *     
     */
    public FactorXmlType getMultiFactor() {
        return multiFactor;
    }

    /**
     * Sets the value of the multiFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorXmlType }
     *     
     */
    public void setMultiFactor(FactorXmlType value) {
        this.multiFactor = value;
    }

}
