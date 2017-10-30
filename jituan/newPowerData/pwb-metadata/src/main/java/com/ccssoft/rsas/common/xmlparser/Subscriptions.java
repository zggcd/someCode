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
 * Class Subscriptions.
 * 
 * @version $Revision$ $Date$
 */
public class Subscriptions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����
     */
    private java.util.Vector _subscriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Subscriptions() {
        super();
        _subscriptionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Subscriptions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSubscription
     * 
     * @param vSubscription
     */
    public void addSubscription(com.ccssoft.rsas.common.xmlparser.Subscription vSubscription)
        throws java.lang.IndexOutOfBoundsException
    {
        _subscriptionList.addElement(vSubscription);
    } //-- void addSubscription(com.regaltec.rsas.common.xmlparser.Subscription) 

    /**
     * Method addSubscription
     * 
     * @param index
     * @param vSubscription
     */
    public void addSubscription(int index, com.ccssoft.rsas.common.xmlparser.Subscription vSubscription)
        throws java.lang.IndexOutOfBoundsException
    {
        _subscriptionList.insertElementAt(vSubscription, index);
    } //-- void addSubscription(int, com.regaltec.rsas.common.xmlparser.Subscription) 

    /**
     * Method enumerateSubscription
     */
    public java.util.Enumeration enumerateSubscription()
    {
        return _subscriptionList.elements();
    } //-- java.util.Enumeration enumerateSubscription() 

    /**
     * Method getSubscription
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Subscription getSubscription(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _subscriptionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Subscription) _subscriptionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Subscription getSubscription(int) 

    /**
     * Method getSubscription
     */
    public com.ccssoft.rsas.common.xmlparser.Subscription[] getSubscription()
    {
        int size = _subscriptionList.size();
        com.ccssoft.rsas.common.xmlparser.Subscription[] mArray = new com.ccssoft.rsas.common.xmlparser.Subscription[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Subscription) _subscriptionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Subscription[] getSubscription() 

    /**
     * Method getSubscriptionCount
     */
    public int getSubscriptionCount()
    {
        return _subscriptionList.size();
    } //-- int getSubscriptionCount() 

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
     * Method removeAllSubscription
     */
    public void removeAllSubscription()
    {
        _subscriptionList.removeAllElements();
    } //-- void removeAllSubscription() 

    /**
     * Method removeSubscription
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Subscription removeSubscription(int index)
    {
        java.lang.Object obj = _subscriptionList.elementAt(index);
        _subscriptionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Subscription) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Subscription removeSubscription(int) 

    /**
     * Method setSubscription
     * 
     * @param index
     * @param vSubscription
     */
    public void setSubscription(int index, com.ccssoft.rsas.common.xmlparser.Subscription vSubscription)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _subscriptionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _subscriptionList.setElementAt(vSubscription, index);
    } //-- void setSubscription(int, com.regaltec.rsas.common.xmlparser.Subscription) 

    /**
     * Method setSubscription
     * 
     * @param subscriptionArray
     */
    public void setSubscription(com.ccssoft.rsas.common.xmlparser.Subscription[] subscriptionArray)
    {
        //-- copy array
        _subscriptionList.removeAllElements();
        for (int i = 0; i < subscriptionArray.length; i++) {
            _subscriptionList.addElement(subscriptionArray[i]);
        }
    } //-- void setSubscription(com.regaltec.rsas.common.xmlparser.Subscription) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Subscriptions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Subscriptions.class, reader);
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
