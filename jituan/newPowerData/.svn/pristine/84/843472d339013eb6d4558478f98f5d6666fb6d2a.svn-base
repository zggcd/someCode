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
 * Class IndicatorCategorys.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorCategorys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ָ��Ŀ¼
     */
    private java.util.Vector _indicatorCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IndicatorCategorys() {
        super();
        _indicatorCategoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategorys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIndicatorCategory
     * 
     * @param vIndicatorCategory
     */
    public void addIndicatorCategory(com.ccssoft.rsas.common.xmlparser.IndicatorCategory vIndicatorCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorCategoryList.addElement(vIndicatorCategory);
    } //-- void addIndicatorCategory(com.regaltec.rsas.common.xmlparser.IndicatorCategory) 

    /**
     * Method addIndicatorCategory
     * 
     * @param index
     * @param vIndicatorCategory
     */
    public void addIndicatorCategory(int index, com.ccssoft.rsas.common.xmlparser.IndicatorCategory vIndicatorCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorCategoryList.insertElementAt(vIndicatorCategory, index);
    } //-- void addIndicatorCategory(int, com.regaltec.rsas.common.xmlparser.IndicatorCategory) 

    /**
     * Method enumerateIndicatorCategory
     */
    public java.util.Enumeration enumerateIndicatorCategory()
    {
        return _indicatorCategoryList.elements();
    } //-- java.util.Enumeration enumerateIndicatorCategory() 

    /**
     * Method getIndicatorCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategory getIndicatorCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.IndicatorCategory) _indicatorCategoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategory getIndicatorCategory(int) 

    /**
     * Method getIndicatorCategory
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategory[] getIndicatorCategory()
    {
        int size = _indicatorCategoryList.size();
        com.ccssoft.rsas.common.xmlparser.IndicatorCategory[] mArray = new com.ccssoft.rsas.common.xmlparser.IndicatorCategory[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.IndicatorCategory) _indicatorCategoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategory[] getIndicatorCategory() 

    /**
     * Method getIndicatorCategoryCount
     */
    public int getIndicatorCategoryCount()
    {
        return _indicatorCategoryList.size();
    } //-- int getIndicatorCategoryCount() 

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
     * Method removeAllIndicatorCategory
     */
    public void removeAllIndicatorCategory()
    {
        _indicatorCategoryList.removeAllElements();
    } //-- void removeAllIndicatorCategory() 

    /**
     * Method removeIndicatorCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategory removeIndicatorCategory(int index)
    {
        java.lang.Object obj = _indicatorCategoryList.elementAt(index);
        _indicatorCategoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.IndicatorCategory) obj;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategory removeIndicatorCategory(int) 

    /**
     * Method setIndicatorCategory
     * 
     * @param index
     * @param vIndicatorCategory
     */
    public void setIndicatorCategory(int index, com.ccssoft.rsas.common.xmlparser.IndicatorCategory vIndicatorCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _indicatorCategoryList.setElementAt(vIndicatorCategory, index);
    } //-- void setIndicatorCategory(int, com.regaltec.rsas.common.xmlparser.IndicatorCategory) 

    /**
     * Method setIndicatorCategory
     * 
     * @param indicatorCategoryArray
     */
    public void setIndicatorCategory(com.ccssoft.rsas.common.xmlparser.IndicatorCategory[] indicatorCategoryArray)
    {
        //-- copy array
        _indicatorCategoryList.removeAllElements();
        for (int i = 0; i < indicatorCategoryArray.length; i++) {
            _indicatorCategoryList.addElement(indicatorCategoryArray[i]);
        }
    } //-- void setIndicatorCategory(com.regaltec.rsas.common.xmlparser.IndicatorCategory) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.IndicatorCategorys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.IndicatorCategorys.class, reader);
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
