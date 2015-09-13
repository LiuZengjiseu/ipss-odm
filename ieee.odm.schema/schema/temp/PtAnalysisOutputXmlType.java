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
 * <p>Java class for PtAnalysisOutputXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtAnalysisOutputXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="largeGSFPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="branchFlowOutPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="violationThreshhold" type="{http://www.ieee.org/odm/Schema/2008}FactorXmlType" minOccurs="0"/>
 *         &lt;element name="outageShiftedFlowThreshhold" type="{http://www.ieee.org/odm/Schema/2008}ActivePowerXmlType" minOccurs="0"/>
 *         &lt;element name="busVoltageViolation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="busVoltageUpperLimitPU" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="busVoltageLowerLimitPU" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="branchLimitViolation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interfaceLimitViolation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zoneSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="areaSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lfResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lfResultFormat" type="{http://www.interpss.org/Schema/odm/2008}LfResultFormatEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtAnalysisOutputXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "largeGSFPoints",
    "branchFlowOutPoints",
    "violationThreshhold",
    "outageShiftedFlowThreshhold",
    "busVoltageViolation",
    "busVoltageUpperLimitPU",
    "busVoltageLowerLimitPU",
    "branchLimitViolation",
    "interfaceLimitViolation",
    "zoneSummary",
    "areaSummary",
    "lfResult",
    "lfResultFormat"
})
public class PtAnalysisOutputXmlType {

    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected Integer largeGSFPoints;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected Integer branchFlowOutPoints;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected FactorXmlType violationThreshhold;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected ActivePowerXmlType outageShiftedFlowThreshhold;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean busVoltageViolation;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected double busVoltageUpperLimitPU;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected double busVoltageLowerLimitPU;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean branchLimitViolation;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean interfaceLimitViolation;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean zoneSummary;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean areaSummary;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected boolean lfResult;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected LfResultFormatEnumType lfResultFormat;

    /**
     * Gets the value of the largeGSFPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLargeGSFPoints() {
        return largeGSFPoints;
    }

    /**
     * Sets the value of the largeGSFPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLargeGSFPoints(Integer value) {
        this.largeGSFPoints = value;
    }

    /**
     * Gets the value of the branchFlowOutPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBranchFlowOutPoints() {
        return branchFlowOutPoints;
    }

    /**
     * Sets the value of the branchFlowOutPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBranchFlowOutPoints(Integer value) {
        this.branchFlowOutPoints = value;
    }

    /**
     * Gets the value of the violationThreshhold property.
     * 
     * @return
     *     possible object is
     *     {@link FactorXmlType }
     *     
     */
    public FactorXmlType getViolationThreshhold() {
        return violationThreshhold;
    }

    /**
     * Sets the value of the violationThreshhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorXmlType }
     *     
     */
    public void setViolationThreshhold(FactorXmlType value) {
        this.violationThreshhold = value;
    }

    /**
     * Gets the value of the outageShiftedFlowThreshhold property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getOutageShiftedFlowThreshhold() {
        return outageShiftedFlowThreshhold;
    }

    /**
     * Sets the value of the outageShiftedFlowThreshhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setOutageShiftedFlowThreshhold(ActivePowerXmlType value) {
        this.outageShiftedFlowThreshhold = value;
    }

    /**
     * Gets the value of the busVoltageViolation property.
     * 
     */
    public boolean isBusVoltageViolation() {
        return busVoltageViolation;
    }

    /**
     * Sets the value of the busVoltageViolation property.
     * 
     */
    public void setBusVoltageViolation(boolean value) {
        this.busVoltageViolation = value;
    }

    /**
     * Gets the value of the busVoltageUpperLimitPU property.
     * 
     */
    public double getBusVoltageUpperLimitPU() {
        return busVoltageUpperLimitPU;
    }

    /**
     * Sets the value of the busVoltageUpperLimitPU property.
     * 
     */
    public void setBusVoltageUpperLimitPU(double value) {
        this.busVoltageUpperLimitPU = value;
    }

    /**
     * Gets the value of the busVoltageLowerLimitPU property.
     * 
     */
    public double getBusVoltageLowerLimitPU() {
        return busVoltageLowerLimitPU;
    }

    /**
     * Sets the value of the busVoltageLowerLimitPU property.
     * 
     */
    public void setBusVoltageLowerLimitPU(double value) {
        this.busVoltageLowerLimitPU = value;
    }

    /**
     * Gets the value of the branchLimitViolation property.
     * 
     */
    public boolean isBranchLimitViolation() {
        return branchLimitViolation;
    }

    /**
     * Sets the value of the branchLimitViolation property.
     * 
     */
    public void setBranchLimitViolation(boolean value) {
        this.branchLimitViolation = value;
    }

    /**
     * Gets the value of the interfaceLimitViolation property.
     * 
     */
    public boolean isInterfaceLimitViolation() {
        return interfaceLimitViolation;
    }

    /**
     * Sets the value of the interfaceLimitViolation property.
     * 
     */
    public void setInterfaceLimitViolation(boolean value) {
        this.interfaceLimitViolation = value;
    }

    /**
     * Gets the value of the zoneSummary property.
     * 
     */
    public boolean isZoneSummary() {
        return zoneSummary;
    }

    /**
     * Sets the value of the zoneSummary property.
     * 
     */
    public void setZoneSummary(boolean value) {
        this.zoneSummary = value;
    }

    /**
     * Gets the value of the areaSummary property.
     * 
     */
    public boolean isAreaSummary() {
        return areaSummary;
    }

    /**
     * Sets the value of the areaSummary property.
     * 
     */
    public void setAreaSummary(boolean value) {
        this.areaSummary = value;
    }

    /**
     * Gets the value of the lfResult property.
     * 
     */
    public boolean isLfResult() {
        return lfResult;
    }

    /**
     * Sets the value of the lfResult property.
     * 
     */
    public void setLfResult(boolean value) {
        this.lfResult = value;
    }

    /**
     * Gets the value of the lfResultFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LfResultFormatEnumType }
     *     
     */
    public LfResultFormatEnumType getLfResultFormat() {
        return lfResultFormat;
    }

    /**
     * Sets the value of the lfResultFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LfResultFormatEnumType }
     *     
     */
    public void setLfResultFormat(LfResultFormatEnumType value) {
        this.lfResultFormat = value;
    }

}
