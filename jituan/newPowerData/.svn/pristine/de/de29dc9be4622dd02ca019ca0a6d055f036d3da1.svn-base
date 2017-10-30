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
 * Class Querys.
 * 
 * @version $Revision$ $Date$
 */
public class Querys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ѯ����
     */
    private java.util.Vector _queryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Querys() {
        super();
        _queryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Querys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addQuery
     * 
     * @param vQuery
     */
    public void addQuery(com.ccssoft.rsas.common.xmlparser.Query vQuery)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryList.addElement(vQuery);
    } //-- void addQuery(com.regaltec.rsas.common.xmlparser.Query) 

    /**
     * Method addQuery
     * 
     * @param index
     * @param vQuery
     */
    public void addQuery(int index, com.ccssoft.rsas.common.xmlparser.Query vQuery)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryList.insertElementAt(vQuery, index);
    } //-- void addQuery(int, com.regaltec.rsas.common.xmlparser.Query) 

    /**
     * Method enumerateQuery
     */
    public java.util.Enumeration enumerateQuery()
    {
        return _queryList.elements();
    } //-- java.util.Enumeration enumerateQuery() 

    /**
     * Method getQuery
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Query getQuery(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Query) _queryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Query getQuery(int) 

    /**
     * Method getQuery
     */
    public com.ccssoft.rsas.common.xmlparser.Query[] getQuery()
    {
        int size = _queryList.size();
        com.ccssoft.rsas.common.xmlparser.Query[] mArray = new com.ccssoft.rsas.common.xmlparser.Query[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Query) _queryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Query[] getQuery() 

    /**
     * Method getQueryCount
     */
    public int getQueryCount()
    {
        return _queryList.size();
    } //-- int getQueryCount() 

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
     * Method removeAllQuery
     */
    public void removeAllQuery()
    {
        _queryList.removeAllElements();
    } //-- void removeAllQuery() 

    /**
     * Method removeQuery
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Query removeQuery(int index)
    {
        java.lang.Object obj = _queryList.elementAt(index);
        _queryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Query) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Query removeQuery(int) 

    /**
     * Method setQuery
     * 
     * @param index
     * @param vQuery
     */
    public void setQuery(int index, com.ccssoft.rsas.common.xmlparser.Query vQuery)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _queryList.setElementAt(vQuery, index);
    } //-- void setQuery(int, com.regaltec.rsas.common.xmlparser.Query) 

    /**
     * Method setQuery
     * 
     * @param queryArray
     */
    public void setQuery(com.ccssoft.rsas.common.xmlparser.Query[] queryArray)
    {
        //-- copy array
        _queryList.removeAllElements();
        for (int i = 0; i < queryArray.length; i++) {
            _queryList.addElement(queryArray[i]);
        }
    } //-- void setQuery(com.regaltec.rsas.common.xmlparser.Query) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Querys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Querys.class, reader);
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
