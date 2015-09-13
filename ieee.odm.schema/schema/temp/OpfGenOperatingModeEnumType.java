//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for OpfGenOperatingModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpfGenOperatingModeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PVGenerator"/>
 *     &lt;enumeration value="Pumping"/>
 *     &lt;enumeration value="SychronousCompensator"/>
 *     &lt;enumeration value="PQGenerator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum OpfGenOperatingModeEnumType {

    @XmlEnumValue("PVGenerator")
    PV_GENERATOR("PVGenerator"),
    @XmlEnumValue("Pumping")
    PUMPING("Pumping"),
    @XmlEnumValue("SychronousCompensator")
    SYCHRONOUS_COMPENSATOR("SychronousCompensator"),
    @XmlEnumValue("PQGenerator")
    PQ_GENERATOR("PQGenerator");
    private final String value;

    OpfGenOperatingModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpfGenOperatingModeEnumType fromValue(String v) {
        for (OpfGenOperatingModeEnumType c: OpfGenOperatingModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
