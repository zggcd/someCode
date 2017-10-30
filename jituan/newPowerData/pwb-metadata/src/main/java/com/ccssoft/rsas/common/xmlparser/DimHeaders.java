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
 * Class DimHeaders.
 * 
 * @version $Revision$ $Date$
 */
public class DimHeaders implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dimHeaderList
     */
    private java.util.Vector _dimHeaderList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimHeaders() {
        super();
        _dimHeaderList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimHeaders()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimHeader
     * 
     * @param vDimHeader
     */
    public void addDimHeader(com.ccssoft.rsas.common.xmlparser.DimHeader vDimHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimHeaderList.addElement(vDimHeader);
    } //-- void addDimHeader(com.regaltec.rsas.common.xmlparser.DimHeader) 

    /**
     * Method addDimHeader
     * 
     * @param index
     * @param vDimHeader
     */
    public void addDimHeader(int index, com.ccssoft.rsas.common.xmlparser.DimHeader vDimHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimHeaderList.insertElementAt(vDimHeader, index);
    } //-- void addDimHeader(int, com.regaltec.rsas.common.xmlparser.DimHeader) 

    /**
     * Method enumerateDimHeader
     */
    public java.util.Enumeration enumerateDimHeader()
    {
        return _dimHeaderList.elements();
    } //-- java.util.Enumeration enumerateDimHeader() 

    /**
     * Method getDimHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimHeader getDimHeader(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimHeader) _dimHeaderList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimHeader getDimHeader(int) 

    /**
     * Method getDimHeader
     */
    public com.ccssoft.rsas.common.xmlparser.DimHeader[] getDimHeader()
    {
        int size = _dimHeaderList.size();
        com.ccssoft.rsas.common.xmlparser.DimHeader[] mArray = new com.ccssoft.rsas.common.xmlparser.DimHeader[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimHeader) _dimHeaderList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimHeader[] getDimHeader() 

    /**
     * Method getDimHeaderCount
     */
    public int getDimHeaderCount()
    {
        return _dimHeaderList.size();
    } //-- int getDimHeaderCount() 

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
     * Method removeAllDimHeader
     */
    public void removeAllDimHeader()
    {
        _dimHeaderList.removeAllElements();
    } //-- void removeAllDimHeader() 

    /**
     * Method removeDimHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimHeader removeDimHeader(int index)
    {
        java.lang.Object obj = _dimHeaderList.elementAt(index);
        _dimHeaderList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimHeader) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimHeader removeDimHeader(int) 

    /**
     * Method setDimHeader
     * 
     * @param index
     * @param vDimHeader
     */
    public void setDimHeader(int index, com.ccssoft.rsas.common.xmlparser.DimHeader vDimHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimHeaderList.setElementAt(vDimHeader, index);
    } //-- void setDimHeader(int, com.regaltec.rsas.common.xmlparser.DimHeader) 

    /**
     * Method setDimHeader
     * 
     * @param dimHeaderArray
     */
    public void setDimHeader(com.ccssoft.rsas.common.xmlparser.DimHeader[] dimHeaderArray)
    {
        //-- copy array
        _dimHeaderList.removeAllElements();
        for (int i = 0; i < dimHeaderArray.length; i++) {
            _dimHeaderList.addElement(dimHeaderArray[i]);
        }
    } //-- void setDimHeader(com.regaltec.rsas.common.xmlparser.DimHeader) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimHeaders) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimHeaders.class, reader);
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
