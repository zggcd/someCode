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
 * Class Indicators.
 * 
 * @version $Revision$ $Date$
 */
public class Indicators implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ָ��
     */
    private java.util.Vector _indicatorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Indicators() {
        super();
        _indicatorList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Indicators()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIndicator
     * 
     * @param vIndicator
     */
    public void addIndicator(com.ccssoft.rsas.common.xmlparser.Indicator vIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorList.addElement(vIndicator);
    } //-- void addIndicator(com.regaltec.rsas.common.xmlparser.Indicator) 

    /**
     * Method addIndicator
     * 
     * @param index
     * @param vIndicator
     */
    public void addIndicator(int index, com.ccssoft.rsas.common.xmlparser.Indicator vIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorList.insertElementAt(vIndicator, index);
    } //-- void addIndicator(int, com.regaltec.rsas.common.xmlparser.Indicator) 

    /**
     * Method enumerateIndicator
     */
    public java.util.Enumeration enumerateIndicator()
    {
        return _indicatorList.elements();
    } //-- java.util.Enumeration enumerateIndicator() 

    /**
     * Method getIndicator
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Indicator getIndicator(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Indicator) _indicatorList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Indicator getIndicator(int) 

    /**
     * Method getIndicator
     */
    public com.ccssoft.rsas.common.xmlparser.Indicator[] getIndicator()
    {
        int size = _indicatorList.size();
        com.ccssoft.rsas.common.xmlparser.Indicator[] mArray = new com.ccssoft.rsas.common.xmlparser.Indicator[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Indicator) _indicatorList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Indicator[] getIndicator() 

    /**
     * Method getIndicatorCount
     */
    public int getIndicatorCount()
    {
        return _indicatorList.size();
    } //-- int getIndicatorCount() 

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
     * Method removeAllIndicator
     */
    public void removeAllIndicator()
    {
        _indicatorList.removeAllElements();
    } //-- void removeAllIndicator() 

    /**
     * Method removeIndicator
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Indicator removeIndicator(int index)
    {
        java.lang.Object obj = _indicatorList.elementAt(index);
        _indicatorList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Indicator) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Indicator removeIndicator(int) 

    /**
     * Method setIndicator
     * 
     * @param index
     * @param vIndicator
     */
    public void setIndicator(int index, com.ccssoft.rsas.common.xmlparser.Indicator vIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _indicatorList.setElementAt(vIndicator, index);
    } //-- void setIndicator(int, com.regaltec.rsas.common.xmlparser.Indicator) 

    /**
     * Method setIndicator
     * 
     * @param indicatorArray
     */
    public void setIndicator(com.ccssoft.rsas.common.xmlparser.Indicator[] indicatorArray)
    {
        //-- copy array
        _indicatorList.removeAllElements();
        for (int i = 0; i < indicatorArray.length; i++) {
            _indicatorList.addElement(indicatorArray[i]);
        }
    } //-- void setIndicator(com.regaltec.rsas.common.xmlparser.Indicator) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Indicators) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Indicators.class, reader);
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
