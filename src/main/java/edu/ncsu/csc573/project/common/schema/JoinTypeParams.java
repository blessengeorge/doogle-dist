//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.05 at 06:02:01 PM EST 
//


package edu.ncsu.csc573.project.common.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JoinTypeParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinTypeParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peerid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinTypeParams", propOrder = {
    "ipaddress",
    "peerid"
})
public class JoinTypeParams {

    @XmlElement(required = true)
    protected String ipaddress;
    @XmlElement(required = true)
    protected String peerid;

    /**
     * Gets the value of the ipaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * Sets the value of the ipaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddress(String value) {
        this.ipaddress = value;
    }

    /**
     * Gets the value of the peerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerid() {
        return peerid;
    }

    /**
     * Sets the value of the peerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerid(String value) {
        this.peerid = value;
    }

}
