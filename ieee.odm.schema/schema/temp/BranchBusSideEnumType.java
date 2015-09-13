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
 * <p>Java class for BranchBusSideEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BranchBusSideEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FromSide"/>
 *     &lt;enumeration value="ToSide"/>
 *     &lt;enumeration value="TertiarySide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum BranchBusSideEnumType {

    @XmlEnumValue("FromSide")
    FROM_SIDE("FromSide"),
    @XmlEnumValue("ToSide")
    TO_SIDE("ToSide"),
    @XmlEnumValue("TertiarySide")
    TERTIARY_SIDE("TertiarySide");
    private final String value;

    BranchBusSideEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BranchBusSideEnumType fromValue(String v) {
        for (BranchBusSideEnumType c: BranchBusSideEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
