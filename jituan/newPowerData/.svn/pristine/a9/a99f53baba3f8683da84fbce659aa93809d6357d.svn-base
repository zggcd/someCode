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
 * Class Dimensions.
 * 
 * @version $Revision$ $Date$
 */
public class Dimensions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ά�ȶ���
     */
    private java.util.Vector _dimensionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dimensions() {
        super();
        _dimensionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Dimensions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimension
     * 
     * @param vDimension
     */
    public void addDimension(com.ccssoft.rsas.common.xmlparser.Dimension vDimension)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionList.addElement(vDimension);
    } //-- void addDimension(com.regaltec.rsas.common.xmlparser.Dimension) 

    /**
     * Method addDimension
     * 
     * @param index
     * @param vDimension
     */
    public void addDimension(int index, com.ccssoft.rsas.common.xmlparser.Dimension vDimension)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionList.insertElementAt(vDimension, index);
    } //-- void addDimension(int, com.regaltec.rsas.common.xmlparser.Dimension) 

    /**
     * Method enumerateDimension
     */
    public java.util.Enumeration enumerateDimension()
    {
        return _dimensionList.elements();
    } //-- java.util.Enumeration enumerateDimension() 

    /**
     * Method getDimension
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Dimension getDimension(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Dimension) _dimensionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Dimension getDimension(int) 

    /**
     * Method getDimension
     */
    public com.ccssoft.rsas.common.xmlparser.Dimension[] getDimension()
    {
        int size = _dimensionList.size();
        com.ccssoft.rsas.common.xmlparser.Dimension[] mArray = new com.ccssoft.rsas.common.xmlparser.Dimension[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Dimension) _dimensionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Dimension[] getDimension() 

    /**
     * Method getDimensionCount
     */
    public int getDimensionCount()
    {
        return _dimensionList.size();
    } //-- int getDimensionCount() 

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
     * Method removeAllDimension
     */
    public void removeAllDimension()
    {
        _dimensionList.removeAllElements();
    } //-- void removeAllDimension() 

    /**
     * Method removeDimension
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Dimension removeDimension(int index)
    {
        java.lang.Object obj = _dimensionList.elementAt(index);
        _dimensionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Dimension) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Dimension removeDimension(int) 

    /**
     * Method setDimension
     * 
     * @param index
     * @param vDimension
     */
    public void setDimension(int index, com.ccssoft.rsas.common.xmlparser.Dimension vDimension)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimensionList.setElementAt(vDimension, index);
    } //-- void setDimension(int, com.regaltec.rsas.common.xmlparser.Dimension) 

    /**
     * Method setDimension
     * 
     * @param dimensionArray
     */
    public void setDimension(com.ccssoft.rsas.common.xmlparser.Dimension[] dimensionArray)
    {
        //-- copy array
        _dimensionList.removeAllElements();
        for (int i = 0; i < dimensionArray.length; i++) {
            _dimensionList.addElement(dimensionArray[i]);
        }
    } //-- void setDimension(com.regaltec.rsas.common.xmlparser.Dimension) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Dimensions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Dimensions.class, reader);
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
