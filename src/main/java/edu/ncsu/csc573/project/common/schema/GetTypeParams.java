//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.03 at 06:49:53 PM EST 
//


package edu.ncsu.csc573.project.common.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTypeParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTypeParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchdigest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTypeParams", propOrder = {
    "ipaddress",
    "searchdigest",
    "ttl"
})
public class GetTypeParams {

    @XmlElement(required = true)
    protected String ipaddress;
    @XmlElement(required = true)
    protected String searchdigest;
    @XmlElement(required = true)
    protected String ttl;

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
     * Gets the value of the searchdigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchdigest() {
        return searchdigest;
    }

    /**
     * Sets the value of the searchdigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchdigest(String value) {
        this.searchdigest = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtl(String value) {
        this.ttl = value;
    }

}
