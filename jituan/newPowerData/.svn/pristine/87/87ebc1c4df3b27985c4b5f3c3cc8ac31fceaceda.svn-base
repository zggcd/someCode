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
 * Class MIDCategorys.
 * 
 * @version $Revision$ $Date$
 */
public class MIDCategorys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ƶ��ն�Ŀ¼
     */
    private java.util.Vector _MIDCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDCategorys() {
        super();
        _MIDCategoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategorys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDCategory
     * 
     * @param vMIDCategory
     */
    public void addMIDCategory(com.ccssoft.rsas.common.xmlparser.MIDCategory vMIDCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDCategoryList.addElement(vMIDCategory);
    } //-- void addMIDCategory(com.regaltec.rsas.common.xmlparser.MIDCategory) 

    /**
     * Method addMIDCategory
     * 
     * @param index
     * @param vMIDCategory
     */
    public void addMIDCategory(int index, com.ccssoft.rsas.common.xmlparser.MIDCategory vMIDCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDCategoryList.insertElementAt(vMIDCategory, index);
    } //-- void addMIDCategory(int, com.regaltec.rsas.common.xmlparser.MIDCategory) 

    /**
     * Method enumerateMIDCategory
     */
    public java.util.Enumeration enumerateMIDCategory()
    {
        return _MIDCategoryList.elements();
    } //-- java.util.Enumeration enumerateMIDCategory() 

    /**
     * Method getMIDCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDCategory getMIDCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDCategory) _MIDCategoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategory getMIDCategory(int) 

    /**
     * Method getMIDCategory
     */
    public com.ccssoft.rsas.common.xmlparser.MIDCategory[] getMIDCategory()
    {
        int size = _MIDCategoryList.size();
        com.ccssoft.rsas.common.xmlparser.MIDCategory[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDCategory[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDCategory) _MIDCategoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategory[] getMIDCategory() 

    /**
     * Method getMIDCategoryCount
     */
    public int getMIDCategoryCount()
    {
        return _MIDCategoryList.size();
    } //-- int getMIDCategoryCount() 

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
     * Method removeAllMIDCategory
     */
    public void removeAllMIDCategory()
    {
        _MIDCategoryList.removeAllElements();
    } //-- void removeAllMIDCategory() 

    /**
     * Method removeMIDCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDCategory removeMIDCategory(int index)
    {
        java.lang.Object obj = _MIDCategoryList.elementAt(index);
        _MIDCategoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDCategory) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategory removeMIDCategory(int) 

    /**
     * Method setMIDCategory
     * 
     * @param index
     * @param vMIDCategory
     */
    public void setMIDCategory(int index, com.ccssoft.rsas.common.xmlparser.MIDCategory vMIDCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDCategoryList.setElementAt(vMIDCategory, index);
    } //-- void setMIDCategory(int, com.regaltec.rsas.common.xmlparser.MIDCategory) 

    /**
     * Method setMIDCategory
     * 
     * @param MIDCategoryArray
     */
    public void setMIDCategory(com.ccssoft.rsas.common.xmlparser.MIDCategory[] MIDCategoryArray)
    {
        //-- copy array
        _MIDCategoryList.removeAllElements();
        for (int i = 0; i < MIDCategoryArray.length; i++) {
            _MIDCategoryList.addElement(MIDCategoryArray[i]);
        }
    } //-- void setMIDCategory(com.regaltec.rsas.common.xmlparser.MIDCategory) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDCategorys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDCategorys.class, reader);
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
