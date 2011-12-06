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
 * <p>Java class for CommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RegisterResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}RegisterResponseType"/>
 *         &lt;element name="LoginResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LoginResponseType"/>
 *         &lt;element name="LogoutResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LogoutResponseType"/>
 *         &lt;element name="ForgotPWDResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ForgotPWDResponseType"/>
 *         &lt;element name="SearchResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}SearchResponseType"/>
 *         &lt;element name="PublishResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}PublishResponseType"/>
 *         &lt;element name="ChangePasswordResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ChangePasswordResponseType"/>
 *         &lt;element name="JoinResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}JoinResponseType"/>
 *         &lt;element name="LeaveResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LeaveResponseType"/>
 *         &lt;element name="GetResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}GetResponseType"/>
 *         &lt;element name="PutResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}PutResponseType"/>
 *         &lt;element name="InvalidResponse" type="{http://www.doogle.project.csc573.csc.ncsu.edu}InvalidResponseType"/>
 *         &lt;element name="ACK" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ACKType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandResponseType", propOrder = {
    "registerResponse",
    "loginResponse",
    "logoutResponse",
    "forgotPWDResponse",
    "searchResponse",
    "publishResponse",
    "changePasswordResponse",
    "joinResponse",
    "leaveResponse",
    "getResponse",
    "putResponse",
    "invalidResponse",
    "ack"
})
public class CommandResponseType {

    @XmlElement(name = "RegisterResponse")
    protected RegisterResponseType registerResponse;
    @XmlElement(name = "LoginResponse")
    protected LoginResponseType loginResponse;
    @XmlElement(name = "LogoutResponse")
    protected LogoutResponseType logoutResponse;
    @XmlElement(name = "ForgotPWDResponse")
    protected ForgotPWDResponseType forgotPWDResponse;
    @XmlElement(name = "SearchResponse")
    protected SearchResponseType searchResponse;
    @XmlElement(name = "PublishResponse")
    protected PublishResponseType publishResponse;
    @XmlElement(name = "ChangePasswordResponse")
    protected ChangePasswordResponseType changePasswordResponse;
    @XmlElement(name = "JoinResponse")
    protected JoinResponseType joinResponse;
    @XmlElement(name = "LeaveResponse")
    protected LeaveResponseType leaveResponse;
    @XmlElement(name = "GetResponse")
    protected GetResponseType getResponse;
    @XmlElement(name = "PutResponse")
    protected PutResponseType putResponse;
    @XmlElement(name = "InvalidResponse")
    protected InvalidResponseType invalidResponse;
    @XmlElement(name = "ACK")
    protected ACKType ack;

    /**
     * Gets the value of the registerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterResponseType }
     *     
     */
    public RegisterResponseType getRegisterResponse() {
        return registerResponse;
    }

    /**
     * Sets the value of the registerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterResponseType }
     *     
     */
    public void setRegisterResponse(RegisterResponseType value) {
        this.registerResponse = value;
    }

    /**
     * Gets the value of the loginResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponseType }
     *     
     */
    public LoginResponseType getLoginResponse() {
        return loginResponse;
    }

    /**
     * Sets the value of the loginResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponseType }
     *     
     */
    public void setLoginResponse(LoginResponseType value) {
        this.loginResponse = value;
    }

    /**
     * Gets the value of the logoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LogoutResponseType }
     *     
     */
    public LogoutResponseType getLogoutResponse() {
        return logoutResponse;
    }

    /**
     * Sets the value of the logoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoutResponseType }
     *     
     */
    public void setLogoutResponse(LogoutResponseType value) {
        this.logoutResponse = value;
    }

    /**
     * Gets the value of the forgotPWDResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPWDResponseType }
     *     
     */
    public ForgotPWDResponseType getForgotPWDResponse() {
        return forgotPWDResponse;
    }

    /**
     * Sets the value of the forgotPWDResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPWDResponseType }
     *     
     */
    public void setForgotPWDResponse(ForgotPWDResponseType value) {
        this.forgotPWDResponse = value;
    }

    /**
     * Gets the value of the searchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResponseType }
     *     
     */
    public SearchResponseType getSearchResponse() {
        return searchResponse;
    }

    /**
     * Sets the value of the searchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponseType }
     *     
     */
    public void setSearchResponse(SearchResponseType value) {
        this.searchResponse = value;
    }

    /**
     * Gets the value of the publishResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PublishResponseType }
     *     
     */
    public PublishResponseType getPublishResponse() {
        return publishResponse;
    }

    /**
     * Sets the value of the publishResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishResponseType }
     *     
     */
    public void setPublishResponse(PublishResponseType value) {
        this.publishResponse = value;
    }

    /**
     * Gets the value of the changePasswordResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordResponseType }
     *     
     */
    public ChangePasswordResponseType getChangePasswordResponse() {
        return changePasswordResponse;
    }

    /**
     * Sets the value of the changePasswordResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordResponseType }
     *     
     */
    public void setChangePasswordResponse(ChangePasswordResponseType value) {
        this.changePasswordResponse = value;
    }

    /**
     * Gets the value of the joinResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JoinResponseType }
     *     
     */
    public JoinResponseType getJoinResponse() {
        return joinResponse;
    }

    /**
     * Sets the value of the joinResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinResponseType }
     *     
     */
    public void setJoinResponse(JoinResponseType value) {
        this.joinResponse = value;
    }

    /**
     * Gets the value of the leaveResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveResponseType }
     *     
     */
    public LeaveResponseType getLeaveResponse() {
        return leaveResponse;
    }

    /**
     * Sets the value of the leaveResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveResponseType }
     *     
     */
    public void setLeaveResponse(LeaveResponseType value) {
        this.leaveResponse = value;
    }

    /**
     * Gets the value of the getResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseType }
     *     
     */
    public GetResponseType getGetResponse() {
        return getResponse;
    }

    /**
     * Sets the value of the getResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseType }
     *     
     */
    public void setGetResponse(GetResponseType value) {
        this.getResponse = value;
    }

    /**
     * Gets the value of the putResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PutResponseType }
     *     
     */
    public PutResponseType getPutResponse() {
        return putResponse;
    }

    /**
     * Sets the value of the putResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutResponseType }
     *     
     */
    public void setPutResponse(PutResponseType value) {
        this.putResponse = value;
    }

    /**
     * Gets the value of the invalidResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidResponseType }
     *     
     */
    public InvalidResponseType getInvalidResponse() {
        return invalidResponse;
    }

    /**
     * Sets the value of the invalidResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidResponseType }
     *     
     */
    public void setInvalidResponse(InvalidResponseType value) {
        this.invalidResponse = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link ACKType }
     *     
     */
    public ACKType getACK() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACKType }
     *     
     */
    public void setACK(ACKType value) {
        this.ack = value;
    }

}
