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
 * Class MeasureItems.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureItems implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _measureItemList
     */
    private java.util.Vector _measureItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasureItems() {
        super();
        _measureItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MeasureItems()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMeasureItem
     * 
     * @param vMeasureItem
     */
    public void addMeasureItem(com.ccssoft.rsas.common.xmlparser.MeasureItem vMeasureItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureItemList.addElement(vMeasureItem);
    } //-- void addMeasureItem(com.regaltec.rsas.common.xmlparser.MeasureItem) 

    /**
     * Method addMeasureItem
     * 
     * @param index
     * @param vMeasureItem
     */
    public void addMeasureItem(int index, com.ccssoft.rsas.common.xmlparser.MeasureItem vMeasureItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureItemList.insertElementAt(vMeasureItem, index);
    } //-- void addMeasureItem(int, com.regaltec.rsas.common.xmlparser.MeasureItem) 

    /**
     * Method enumerateMeasureItem
     */
    public java.util.Enumeration enumerateMeasureItem()
    {
        return _measureItemList.elements();
    } //-- java.util.Enumeration enumerateMeasureItem() 

    /**
     * Method getMeasureItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureItem getMeasureItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MeasureItem) _measureItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MeasureItem getMeasureItem(int) 

    /**
     * Method getMeasureItem
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureItem[] getMeasureItem()
    {
        int size = _measureItemList.size();
        com.ccssoft.rsas.common.xmlparser.MeasureItem[] mArray = new com.ccssoft.rsas.common.xmlparser.MeasureItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MeasureItem) _measureItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureItem[] getMeasureItem() 

    /**
     * Method getMeasureItemCount
     */
    public int getMeasureItemCount()
    {
        return _measureItemList.size();
    } //-- int getMeasureItemCount() 

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
     * Method removeAllMeasureItem
     */
    public void removeAllMeasureItem()
    {
        _measureItemList.removeAllElements();
    } //-- void removeAllMeasureItem() 

    /**
     * Method removeMeasureItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureItem removeMeasureItem(int index)
    {
        java.lang.Object obj = _measureItemList.elementAt(index);
        _measureItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MeasureItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureItem removeMeasureItem(int) 

    /**
     * Method setMeasureItem
     * 
     * @param index
     * @param vMeasureItem
     */
    public void setMeasureItem(int index, com.ccssoft.rsas.common.xmlparser.MeasureItem vMeasureItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _measureItemList.setElementAt(vMeasureItem, index);
    } //-- void setMeasureItem(int, com.regaltec.rsas.common.xmlparser.MeasureItem) 

    /**
     * Method setMeasureItem
     * 
     * @param measureItemArray
     */
    public void setMeasureItem(com.ccssoft.rsas.common.xmlparser.MeasureItem[] measureItemArray)
    {
        //-- copy array
        _measureItemList.removeAllElements();
        for (int i = 0; i < measureItemArray.length; i++) {
            _measureItemList.addElement(measureItemArray[i]);
        }
    } //-- void setMeasureItem(com.regaltec.rsas.common.xmlparser.MeasureItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MeasureItems) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MeasureItems.class, reader);
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
