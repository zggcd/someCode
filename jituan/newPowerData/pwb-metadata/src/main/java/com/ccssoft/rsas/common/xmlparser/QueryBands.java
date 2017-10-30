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
 * Class QueryBands.
 * 
 * @version $Revision$ $Date$
 */
public class QueryBands implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _queryBandList
     */
    private java.util.Vector _queryBandList;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryBands() {
        super();
        _queryBandList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.QueryBands()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addQueryBand
     * 
     * @param vQueryBand
     */
    public void addQueryBand(com.ccssoft.rsas.common.xmlparser.QueryBand vQueryBand)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryBandList.addElement(vQueryBand);
    } //-- void addQueryBand(com.regaltec.rsas.common.xmlparser.QueryBand) 

    /**
     * Method addQueryBand
     * 
     * @param index
     * @param vQueryBand
     */
    public void addQueryBand(int index, com.ccssoft.rsas.common.xmlparser.QueryBand vQueryBand)
        throws java.lang.IndexOutOfBoundsException
    {
        _queryBandList.insertElementAt(vQueryBand, index);
    } //-- void addQueryBand(int, com.regaltec.rsas.common.xmlparser.QueryBand) 

    /**
     * Method enumerateQueryBand
     */
    public java.util.Enumeration enumerateQueryBand()
    {
        return _queryBandList.elements();
    } //-- java.util.Enumeration enumerateQueryBand() 

    /**
     * Method getQueryBand
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.QueryBand getQueryBand(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryBandList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.QueryBand) _queryBandList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.QueryBand getQueryBand(int) 

    /**
     * Method getQueryBand
     */
    public com.ccssoft.rsas.common.xmlparser.QueryBand[] getQueryBand()
    {
        int size = _queryBandList.size();
        com.ccssoft.rsas.common.xmlparser.QueryBand[] mArray = new com.ccssoft.rsas.common.xmlparser.QueryBand[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.QueryBand) _queryBandList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.QueryBand[] getQueryBand() 

    /**
     * Method getQueryBandCount
     */
    public int getQueryBandCount()
    {
        return _queryBandList.size();
    } //-- int getQueryBandCount() 

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
     * Method removeAllQueryBand
     */
    public void removeAllQueryBand()
    {
        _queryBandList.removeAllElements();
    } //-- void removeAllQueryBand() 

    /**
     * Method removeQueryBand
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.QueryBand removeQueryBand(int index)
    {
        java.lang.Object obj = _queryBandList.elementAt(index);
        _queryBandList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.QueryBand) obj;
    } //-- com.regaltec.rsas.common.xmlparser.QueryBand removeQueryBand(int) 

    /**
     * Method setQueryBand
     * 
     * @param index
     * @param vQueryBand
     */
    public void setQueryBand(int index, com.ccssoft.rsas.common.xmlparser.QueryBand vQueryBand)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queryBandList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _queryBandList.setElementAt(vQueryBand, index);
    } //-- void setQueryBand(int, com.regaltec.rsas.common.xmlparser.QueryBand) 

    /**
     * Method setQueryBand
     * 
     * @param queryBandArray
     */
    public void setQueryBand(com.ccssoft.rsas.common.xmlparser.QueryBand[] queryBandArray)
    {
        //-- copy array
        _queryBandList.removeAllElements();
        for (int i = 0; i < queryBandArray.length; i++) {
            _queryBandList.addElement(queryBandArray[i]);
        }
    } //-- void setQueryBand(com.regaltec.rsas.common.xmlparser.QueryBand) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.QueryBands) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.QueryBands.class, reader);
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
