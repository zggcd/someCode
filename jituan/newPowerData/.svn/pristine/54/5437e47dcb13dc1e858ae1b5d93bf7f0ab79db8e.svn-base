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
 * �������
 * 
 * @version $Revision$ $Date$
 */
public class QueryOrders implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _queryOrderList
     */
    private java.util.Vector _queryOrderList;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryOrders() {
        super();
        _queryOrderList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.QueryOrders()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addQueryOrder
     * 
     * @param vQueryOrder
     */
    public void addQueryOrder(com.ccssoft.rsas.common.xmlparser.QueryOrder vQueryOrder)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryOrderList.addElement(vQueryOrder);
    } //-- void addQueryOrder(com.regaltec.rsas.common.xmlparser.QueryOrder) 

    /**
     * Method addQueryOrder
     * 
     * @param index
     * @param vQueryOrder
     */
    public void addQueryOrder(int index, com.ccssoft.rsas.common.xmlparser.QueryOrder vQueryOrder)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryOrderList.insertElementAt(vQueryOrder, index);
    } //-- void addQueryOrder(int, com.regaltec.rsas.common.xmlparser.QueryOrder) 

    /**
     * Method enumerateQueryOrder
     */
    public java.util.Enumeration enumerateQueryOrder()
    {
        return _queryOrderList.elements();
    } //-- java.util.Enumeration enumerateQueryOrder() 

    /**
     * Method getQueryOrder
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.QueryOrder getQueryOrder(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryOrderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.QueryOrder) _queryOrderList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.QueryOrder getQueryOrder(int) 

    /**
     * Method getQueryOrder
     */
    public com.ccssoft.rsas.common.xmlparser.QueryOrder[] getQueryOrder()
    {
        int size = _queryOrderList.size();
        com.ccssoft.rsas.common.xmlparser.QueryOrder[] mArray = new com.ccssoft.rsas.common.xmlparser.QueryOrder[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.QueryOrder) _queryOrderList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.QueryOrder[] getQueryOrder() 

    /**
     * Method getQueryOrderCount
     */
    public int getQueryOrderCount()
    {
        return _queryOrderList.size();
    } //-- int getQueryOrderCount() 

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
     * Method removeAllQueryOrder
     */
    public void removeAllQueryOrder()
    {
        _queryOrderList.removeAllElements();
    } //-- void removeAllQueryOrder() 

    /**
     * Method removeQueryOrder
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.QueryOrder removeQueryOrder(int index)
    {
        java.lang.Object obj = _queryOrderList.elementAt(index);
        _queryOrderList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.QueryOrder) obj;
    } //-- com.regaltec.rsas.common.xmlparser.QueryOrder removeQueryOrder(int) 

    /**
     * Method setQueryOrder
     * 
     * @param index
     * @param vQueryOrder
     */
    public void setQueryOrder(int index, com.ccssoft.rsas.common.xmlparser.QueryOrder vQueryOrder)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryOrderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _queryOrderList.setElementAt(vQueryOrder, index);
    } //-- void setQueryOrder(int, com.regaltec.rsas.common.xmlparser.QueryOrder) 

    /**
     * Method setQueryOrder
     * 
     * @param queryOrderArray
     */
    public void setQueryOrder(com.ccssoft.rsas.common.xmlparser.QueryOrder[] queryOrderArray)
    {
        //-- copy array
        _queryOrderList.removeAllElements();
        for (int i = 0; i < queryOrderArray.length; i++) {
            _queryOrderList.addElement(queryOrderArray[i]);
        }
    } //-- void setQueryOrder(com.regaltec.rsas.common.xmlparser.QueryOrder) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.QueryOrders) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.QueryOrders.class, reader);
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
