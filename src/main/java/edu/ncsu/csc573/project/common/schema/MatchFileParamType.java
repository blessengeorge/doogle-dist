//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.03 at 03:40:16 PM EST 
//


package edu.ncsu.csc573.project.common.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchFileParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchFileParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.doogle.project.csc573.csc.ncsu.edu}FileParamType">
 *       &lt;sequence>
 *         &lt;element name="MatchFactor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchFileParamType", propOrder = {
    "matchFactor"
})
public class MatchFileParamType
    extends FileParamType
{

    @XmlElement(name = "MatchFactor")
    protected double matchFactor;

    /**
     * Gets the value of the matchFactor property.
     * 
     */
    public double getMatchFactor() {
        return matchFactor;
    }

    /**
     * Sets the value of the matchFactor property.
     * 
     */
    public void setMatchFactor(double value) {
        this.matchFactor = value;
    }

}
