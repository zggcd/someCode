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
 * HTML �ƶ�����ָ�귢��Ŀ¼����
 * 
 * @version $Revision$ $Date$
 */
public class MIDIndCategories implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * HTML �ƶ�����ָ�귢��Ŀ¼
     */
    private java.util.Vector _MIDIndCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDIndCategories() {
        super();
        _MIDIndCategoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategories()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDIndCategory
     * 
     * @param vMIDIndCategory
     */
    public void addMIDIndCategory(com.ccssoft.rsas.common.xmlparser.MIDIndCategory vMIDIndCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDIndCategoryList.addElement(vMIDIndCategory);
    } //-- void addMIDIndCategory(com.regaltec.rsas.common.xmlparser.MIDIndCategory) 

    /**
     * Method addMIDIndCategory
     * 
     * @param index
     * @param vMIDIndCategory
     */
    public void addMIDIndCategory(int index, com.ccssoft.rsas.common.xmlparser.MIDIndCategory vMIDIndCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDIndCategoryList.insertElementAt(vMIDIndCategory, index);
    } //-- void addMIDIndCategory(int, com.regaltec.rsas.common.xmlparser.MIDIndCategory) 

    /**
     * Method enumerateMIDIndCategory
     */
    public java.util.Enumeration enumerateMIDIndCategory()
    {
        return _MIDIndCategoryList.elements();
    } //-- java.util.Enumeration enumerateMIDIndCategory() 

    /**
     * Method getMIDIndCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDIndCategory getMIDIndCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDIndCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDIndCategory) _MIDIndCategoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategory getMIDIndCategory(int) 

    /**
     * Method getMIDIndCategory
     */
    public com.ccssoft.rsas.common.xmlparser.MIDIndCategory[] getMIDIndCategory()
    {
        int size = _MIDIndCategoryList.size();
        com.ccssoft.rsas.common.xmlparser.MIDIndCategory[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDIndCategory[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDIndCategory) _MIDIndCategoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategory[] getMIDIndCategory() 

    /**
     * Method getMIDIndCategoryCount
     */
    public int getMIDIndCategoryCount()
    {
        return _MIDIndCategoryList.size();
    } //-- int getMIDIndCategoryCount() 

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
     * Method removeAllMIDIndCategory
     */
    public void removeAllMIDIndCategory()
    {
        _MIDIndCategoryList.removeAllElements();
    } //-- void removeAllMIDIndCategory() 

    /**
     * Method removeMIDIndCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDIndCategory removeMIDIndCategory(int index)
    {
        java.lang.Object obj = _MIDIndCategoryList.elementAt(index);
        _MIDIndCategoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDIndCategory) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategory removeMIDIndCategory(int) 

    /**
     * Method setMIDIndCategory
     * 
     * @param index
     * @param vMIDIndCategory
     */
    public void setMIDIndCategory(int index, com.ccssoft.rsas.common.xmlparser.MIDIndCategory vMIDIndCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDIndCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDIndCategoryList.setElementAt(vMIDIndCategory, index);
    } //-- void setMIDIndCategory(int, com.regaltec.rsas.common.xmlparser.MIDIndCategory) 

    /**
     * Method setMIDIndCategory
     * 
     * @param MIDIndCategoryArray
     */
    public void setMIDIndCategory(com.ccssoft.rsas.common.xmlparser.MIDIndCategory[] MIDIndCategoryArray)
    {
        //-- copy array
        _MIDIndCategoryList.removeAllElements();
        for (int i = 0; i < MIDIndCategoryArray.length; i++) {
            _MIDIndCategoryList.addElement(MIDIndCategoryArray[i]);
        }
    } //-- void setMIDIndCategory(com.regaltec.rsas.common.xmlparser.MIDIndCategory) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDIndCategories) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDIndCategories.class, reader);
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
