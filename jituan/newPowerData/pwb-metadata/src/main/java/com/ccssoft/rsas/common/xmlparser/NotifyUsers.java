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
 * ֪ͨ�û����󼯺�
 * 
 * @version $Revision$ $Date$
 */
public class NotifyUsers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ֪ͨ�û�����
     */
    private java.util.Vector _notifyUserList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NotifyUsers() {
        super();
        _notifyUserList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.NotifyUsers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addNotifyUser
     * 
     * @param vNotifyUser
     */
    public void addNotifyUser(com.ccssoft.rsas.common.xmlparser.NotifyUser vNotifyUser)
        throws java.lang.IndexOutOfBoundsException
    {
        _notifyUserList.addElement(vNotifyUser);
    } //-- void addNotifyUser(com.regaltec.rsas.common.xmlparser.NotifyUser) 

    /**
     * Method addNotifyUser
     * 
     * @param index
     * @param vNotifyUser
     */
    public void addNotifyUser(int index, com.ccssoft.rsas.common.xmlparser.NotifyUser vNotifyUser)
        throws java.lang.IndexOutOfBoundsException
    {
        _notifyUserList.insertElementAt(vNotifyUser, index);
    } //-- void addNotifyUser(int, com.regaltec.rsas.common.xmlparser.NotifyUser) 

    /**
     * Method enumerateNotifyUser
     */
    public java.util.Enumeration enumerateNotifyUser()
    {
        return _notifyUserList.elements();
    } //-- java.util.Enumeration enumerateNotifyUser() 

    /**
     * Method getNotifyUser
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.NotifyUser getNotifyUser(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _notifyUserList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.NotifyUser) _notifyUserList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.NotifyUser getNotifyUser(int) 

    /**
     * Method getNotifyUser
     */
    public com.ccssoft.rsas.common.xmlparser.NotifyUser[] getNotifyUser()
    {
        int size = _notifyUserList.size();
        com.ccssoft.rsas.common.xmlparser.NotifyUser[] mArray = new com.ccssoft.rsas.common.xmlparser.NotifyUser[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.NotifyUser) _notifyUserList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.NotifyUser[] getNotifyUser() 

    /**
     * Method getNotifyUserCount
     */
    public int getNotifyUserCount()
    {
        return _notifyUserList.size();
    } //-- int getNotifyUserCount() 

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
     * Method removeAllNotifyUser
     */
    public void removeAllNotifyUser()
    {
        _notifyUserList.removeAllElements();
    } //-- void removeAllNotifyUser() 

    /**
     * Method removeNotifyUser
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.NotifyUser removeNotifyUser(int index)
    {
        java.lang.Object obj = _notifyUserList.elementAt(index);
        _notifyUserList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.NotifyUser) obj;
    } //-- com.regaltec.rsas.common.xmlparser.NotifyUser removeNotifyUser(int) 

    /**
     * Method setNotifyUser
     * 
     * @param index
     * @param vNotifyUser
     */
    public void setNotifyUser(int index, com.ccssoft.rsas.common.xmlparser.NotifyUser vNotifyUser)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _notifyUserList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _notifyUserList.setElementAt(vNotifyUser, index);
    } //-- void setNotifyUser(int, com.regaltec.rsas.common.xmlparser.NotifyUser) 

    /**
     * Method setNotifyUser
     * 
     * @param notifyUserArray
     */
    public void setNotifyUser(com.ccssoft.rsas.common.xmlparser.NotifyUser[] notifyUserArray)
    {
        //-- copy array
        _notifyUserList.removeAllElements();
        for (int i = 0; i < notifyUserArray.length; i++) {
            _notifyUserList.addElement(notifyUserArray[i]);
        }
    } //-- void setNotifyUser(com.regaltec.rsas.common.xmlparser.NotifyUser) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.NotifyUsers) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.NotifyUsers.class, reader);
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
