/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Users.
 * 
 * @version $Revision$ $Date$
 */
public class Users implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �û�
     */
    private java.util.Vector _userList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Users() {
        super();
        _userList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Users()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addUser
     * 
     * @param vUser
     */
    public void addUser(com.ccssoft.rsas.common.xmlparser.User vUser)
        throws java.lang.IndexOutOfBoundsException
    {
        _userList.addElement(vUser);
    } //-- void addUser(com.regaltec.rsas.common.xmlparser.User) 

    /**
     * Method addUser
     * 
     * @param index
     * @param vUser
     */
    public void addUser(int index, com.ccssoft.rsas.common.xmlparser.User vUser)
        throws java.lang.IndexOutOfBoundsException
    {
        _userList.insertElementAt(vUser, index);
    } //-- void addUser(int, com.regaltec.rsas.common.xmlparser.User) 

    /**
     * Method enumerateUser
     */
    public java.util.Enumeration enumerateUser()
    {
        return _userList.elements();
    } //-- java.util.Enumeration enumerateUser() 

    /**
     * Method getUser
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.User getUser(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _userList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.User) _userList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.User getUser(int) 

    /**
     * Method getUser
     */
    public com.ccssoft.rsas.common.xmlparser.User[] getUser()
    {
        int size = _userList.size();
        com.ccssoft.rsas.common.xmlparser.User[] mArray = new com.ccssoft.rsas.common.xmlparser.User[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.User) _userList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.User[] getUser() 

    /**
     * Method getUserCount
     */
    public int getUserCount()
    {
        return _userList.size();
    } //-- int getUserCount() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllUser
     */
    public void removeAllUser()
    {
        _userList.removeAllElements();
    } //-- void removeAllUser() 

    /**
     * Method removeUser
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.User removeUser(int index)
    {
        java.lang.Object obj = _userList.elementAt(index);
        _userList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.User) obj;
    } //-- com.regaltec.rsas.common.xmlparser.User removeUser(int) 

    /**
     * Method setUser
     * 
     * @param index
     * @param vUser
     */
    public void setUser(int index, com.ccssoft.rsas.common.xmlparser.User vUser)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _userList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _userList.setElementAt(vUser, index);
    } //-- void setUser(int, com.regaltec.rsas.common.xmlparser.User) 

    /**
     * Method setUser
     * 
     * @param userArray
     */
    public void setUser(com.ccssoft.rsas.common.xmlparser.User[] userArray)
    {
        //-- copy array
        _userList.removeAllElements();
        for (int i = 0; i < userArray.length; i++) {
            _userList.addElement(userArray[i]);
        }
    } //-- void setUser(com.regaltec.rsas.common.xmlparser.User) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Users) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Users.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
