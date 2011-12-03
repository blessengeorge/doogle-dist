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
 * <p>Java class for CommandRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Register" type="{http://www.doogle.project.csc573.csc.ncsu.edu}RegisterType"/>
 *         &lt;element name="Login" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LoginType"/>
 *         &lt;element name="Logout" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LogoutType"/>
 *         &lt;element name="ForgotPWD" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ForgotPasswdType"/>
 *         &lt;element name="Search" type="{http://www.doogle.project.csc573.csc.ncsu.edu}SearchType"/>
 *         &lt;element name="Publish" type="{http://www.doogle.project.csc573.csc.ncsu.edu}PublishType"/>
 *         &lt;element name="ChangePassword" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ChangePasswordType"/>
 *         &lt;element name="Join" type="{http://www.doogle.project.csc573.csc.ncsu.edu}JoinType"/>
 *         &lt;element name="Leave" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LeaveType"/>
 *         &lt;element name="Put" type="{http://www.doogle.project.csc573.csc.ncsu.edu}PutType"/>
 *         &lt;element name="Get" type="{http://www.doogle.project.csc573.csc.ncsu.edu}GetType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandRequestType", propOrder = {
    "register",
    "login",
    "logout",
    "forgotPWD",
    "search",
    "publish",
    "changePassword",
    "join",
    "leave",
    "put",
    "get"
})
public class CommandRequestType {

    @XmlElement(name = "Register")
    protected RegisterType register;
    @XmlElement(name = "Login")
    protected LoginType login;
    @XmlElement(name = "Logout")
    protected LogoutType logout;
    @XmlElement(name = "ForgotPWD")
    protected ForgotPasswdType forgotPWD;
    @XmlElement(name = "Search")
    protected SearchType search;
    @XmlElement(name = "Publish")
    protected PublishType publish;
    @XmlElement(name = "ChangePassword")
    protected ChangePasswordType changePassword;
    @XmlElement(name = "Join")
    protected JoinType join;
    @XmlElement(name = "Leave")
    protected LeaveType leave;
    @XmlElement(name = "Put")
    protected PutType put;
    @XmlElement(name = "Get")
    protected GetType get;

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterType }
     *     
     */
    public RegisterType getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterType }
     *     
     */
    public void setRegister(RegisterType value) {
        this.register = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link LoginType }
     *     
     */
    public LoginType getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginType }
     *     
     */
    public void setLogin(LoginType value) {
        this.login = value;
    }

    /**
     * Gets the value of the logout property.
     * 
     * @return
     *     possible object is
     *     {@link LogoutType }
     *     
     */
    public LogoutType getLogout() {
        return logout;
    }

    /**
     * Sets the value of the logout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoutType }
     *     
     */
    public void setLogout(LogoutType value) {
        this.logout = value;
    }

    /**
     * Gets the value of the forgotPWD property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPasswdType }
     *     
     */
    public ForgotPasswdType getForgotPWD() {
        return forgotPWD;
    }

    /**
     * Sets the value of the forgotPWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPasswdType }
     *     
     */
    public void setForgotPWD(ForgotPasswdType value) {
        this.forgotPWD = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearch(SearchType value) {
        this.search = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link PublishType }
     *     
     */
    public PublishType getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishType }
     *     
     */
    public void setPublish(PublishType value) {
        this.publish = value;
    }

    /**
     * Gets the value of the changePassword property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordType }
     *     
     */
    public ChangePasswordType getChangePassword() {
        return changePassword;
    }

    /**
     * Sets the value of the changePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordType }
     *     
     */
    public void setChangePassword(ChangePasswordType value) {
        this.changePassword = value;
    }

    /**
     * Gets the value of the join property.
     * 
     * @return
     *     possible object is
     *     {@link JoinType }
     *     
     */
    public JoinType getJoin() {
        return join;
    }

    /**
     * Sets the value of the join property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinType }
     *     
     */
    public void setJoin(JoinType value) {
        this.join = value;
    }

    /**
     * Gets the value of the leave property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveType }
     *     
     */
    public LeaveType getLeave() {
        return leave;
    }

    /**
     * Sets the value of the leave property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveType }
     *     
     */
    public void setLeave(LeaveType value) {
        this.leave = value;
    }

    /**
     * Gets the value of the put property.
     * 
     * @return
     *     possible object is
     *     {@link PutType }
     *     
     */
    public PutType getPut() {
        return put;
    }

    /**
     * Sets the value of the put property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutType }
     *     
     */
    public void setPut(PutType value) {
        this.put = value;
    }

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link GetType }
     *     
     */
    public GetType getGet() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetType }
     *     
     */
    public void setGet(GetType value) {
        this.get = value;
    }

}
