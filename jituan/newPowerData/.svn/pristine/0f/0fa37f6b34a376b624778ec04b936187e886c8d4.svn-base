/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.other;

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
 * ��
 * 
 * @version $Revision$ $Date$
 */
public class Categories implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��
     */
    private java.util.Vector _categoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Categories() {
        super();
        _categoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Categories()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCategory
     * 
     * @param vCategory
     */
    public void addCategory(com.ccssoft.rsas.common.xmlparser.chart.other.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _categoryList.addElement(vCategory);
    } //-- void addCategory(com.regaltec.rsas.common.xmlparser.chart.other.Category) 

    /**
     * Method addCategory
     * 
     * @param index
     * @param vCategory
     */
    public void addCategory(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _categoryList.insertElementAt(vCategory, index);
    } //-- void addCategory(int, com.regaltec.rsas.common.xmlparser.chart.other.Category) 

    /**
     * Method enumerateCategory
     */
    public java.util.Enumeration enumerateCategory()
    {
        return _categoryList.elements();
    } //-- java.util.Enumeration enumerateCategory() 

    /**
     * Method getCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Category getCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _categoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Category) _categoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Category getCategory(int) 

    /**
     * Method getCategory
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Category[] getCategory()
    {
        int size = _categoryList.size();
        com.ccssoft.rsas.common.xmlparser.chart.other.Category[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.other.Category[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.other.Category) _categoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Category[] getCategory() 

    /**
     * Method getCategoryCount
     */
    public int getCategoryCount()
    {
        return _categoryList.size();
    } //-- int getCategoryCount() 

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
     * Method removeAllCategory
     */
    public void removeAllCategory()
    {
        _categoryList.removeAllElements();
    } //-- void removeAllCategory() 

    /**
     * Method removeCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Category removeCategory(int index)
    {
        java.lang.Object obj = _categoryList.elementAt(index);
        _categoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Category) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Category removeCategory(int) 

    /**
     * Method setCategory
     * 
     * @param index
     * @param vCategory
     */
    public void setCategory(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Category vCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _categoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _categoryList.setElementAt(vCategory, index);
    } //-- void setCategory(int, com.regaltec.rsas.common.xmlparser.chart.other.Category) 

    /**
     * Method setCategory
     * 
     * @param categoryArray
     */
    public void setCategory(com.ccssoft.rsas.common.xmlparser.chart.other.Category[] categoryArray)
    {
        //-- copy array
        _categoryList.removeAllElements();
        for (int i = 0; i < categoryArray.length; i++) {
            _categoryList.addElement(categoryArray[i]);
        }
    } //-- void setCategory(com.regaltec.rsas.common.xmlparser.chart.other.Category) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Categories) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.other.Categories.class, reader);
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
