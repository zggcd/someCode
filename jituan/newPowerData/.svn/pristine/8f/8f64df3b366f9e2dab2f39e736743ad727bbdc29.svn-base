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
 * Class MeasureHeaders.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureHeaders implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _measureHeaderList
     */
    private java.util.Vector _measureHeaderList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasureHeaders() {
        super();
        _measureHeaderList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeaders()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMeasureHeader
     * 
     * @param vMeasureHeader
     */
    public void addMeasureHeader(com.ccssoft.rsas.common.xmlparser.MeasureHeader vMeasureHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureHeaderList.addElement(vMeasureHeader);
    } //-- void addMeasureHeader(com.regaltec.rsas.common.xmlparser.MeasureHeader) 

    /**
     * Method addMeasureHeader
     * 
     * @param index
     * @param vMeasureHeader
     */
    public void addMeasureHeader(int index, com.ccssoft.rsas.common.xmlparser.MeasureHeader vMeasureHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureHeaderList.insertElementAt(vMeasureHeader, index);
    } //-- void addMeasureHeader(int, com.regaltec.rsas.common.xmlparser.MeasureHeader) 

    /**
     * Method enumerateMeasureHeader
     */
    public java.util.Enumeration enumerateMeasureHeader()
    {
        return _measureHeaderList.elements();
    } //-- java.util.Enumeration enumerateMeasureHeader() 

    /**
     * Method getMeasureHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureHeader getMeasureHeader(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MeasureHeader) _measureHeaderList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeader getMeasureHeader(int) 

    /**
     * Method getMeasureHeader
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureHeader[] getMeasureHeader()
    {
        int size = _measureHeaderList.size();
        com.ccssoft.rsas.common.xmlparser.MeasureHeader[] mArray = new com.ccssoft.rsas.common.xmlparser.MeasureHeader[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MeasureHeader) _measureHeaderList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeader[] getMeasureHeader() 

    /**
     * Method getMeasureHeaderCount
     */
    public int getMeasureHeaderCount()
    {
        return _measureHeaderList.size();
    } //-- int getMeasureHeaderCount() 

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
     * Method removeAllMeasureHeader
     */
    public void removeAllMeasureHeader()
    {
        _measureHeaderList.removeAllElements();
    } //-- void removeAllMeasureHeader() 

    /**
     * Method removeMeasureHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureHeader removeMeasureHeader(int index)
    {
        java.lang.Object obj = _measureHeaderList.elementAt(index);
        _measureHeaderList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MeasureHeader) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeader removeMeasureHeader(int) 

    /**
     * Method setMeasureHeader
     * 
     * @param index
     * @param vMeasureHeader
     */
    public void setMeasureHeader(int index, com.ccssoft.rsas.common.xmlparser.MeasureHeader vMeasureHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _measureHeaderList.setElementAt(vMeasureHeader, index);
    } //-- void setMeasureHeader(int, com.regaltec.rsas.common.xmlparser.MeasureHeader) 

    /**
     * Method setMeasureHeader
     * 
     * @param measureHeaderArray
     */
    public void setMeasureHeader(com.ccssoft.rsas.common.xmlparser.MeasureHeader[] measureHeaderArray)
    {
        //-- copy array
        _measureHeaderList.removeAllElements();
        for (int i = 0; i < measureHeaderArray.length; i++) {
            _measureHeaderList.addElement(measureHeaderArray[i]);
        }
    } //-- void setMeasureHeader(com.regaltec.rsas.common.xmlparser.MeasureHeader) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MeasureHeaders) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MeasureHeaders.class, reader);
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
