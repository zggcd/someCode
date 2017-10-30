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
 * Class PublicConditions.
 * 
 * @version $Revision$ $Date$
 */
public class PublicConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _publicConditionList
     */
    private java.util.Vector _publicConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PublicConditions() {
        super();
        _publicConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PublicConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPublicCondition
     * 
     * @param vPublicCondition
     */
    public void addPublicCondition(com.ccssoft.rsas.common.xmlparser.PublicCondition vPublicCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _publicConditionList.addElement(vPublicCondition);
    } //-- void addPublicCondition(com.regaltec.rsas.common.xmlparser.PublicCondition) 

    /**
     * Method addPublicCondition
     * 
     * @param index
     * @param vPublicCondition
     */
    public void addPublicCondition(int index, com.ccssoft.rsas.common.xmlparser.PublicCondition vPublicCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _publicConditionList.insertElementAt(vPublicCondition, index);
    } //-- void addPublicCondition(int, com.regaltec.rsas.common.xmlparser.PublicCondition) 

    /**
     * Method enumeratePublicCondition
     */
    public java.util.Enumeration enumeratePublicCondition()
    {
        return _publicConditionList.elements();
    } //-- java.util.Enumeration enumeratePublicCondition() 

    /**
     * Method getPublicCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PublicCondition getPublicCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _publicConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PublicCondition) _publicConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PublicCondition getPublicCondition(int) 

    /**
     * Method getPublicCondition
     */
    public com.ccssoft.rsas.common.xmlparser.PublicCondition[] getPublicCondition()
    {
        int size = _publicConditionList.size();
        com.ccssoft.rsas.common.xmlparser.PublicCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.PublicCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PublicCondition) _publicConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PublicCondition[] getPublicCondition() 

    /**
     * Method getPublicConditionCount
     */
    public int getPublicConditionCount()
    {
        return _publicConditionList.size();
    } //-- int getPublicConditionCount() 

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
     * Method removeAllPublicCondition
     */
    public void removeAllPublicCondition()
    {
        _publicConditionList.removeAllElements();
    } //-- void removeAllPublicCondition() 

    /**
     * Method removePublicCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PublicCondition removePublicCondition(int index)
    {
        java.lang.Object obj = _publicConditionList.elementAt(index);
        _publicConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PublicCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PublicCondition removePublicCondition(int) 

    /**
     * Method setPublicCondition
     * 
     * @param index
     * @param vPublicCondition
     */
    public void setPublicCondition(int index, com.ccssoft.rsas.common.xmlparser.PublicCondition vPublicCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _publicConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _publicConditionList.setElementAt(vPublicCondition, index);
    } //-- void setPublicCondition(int, com.regaltec.rsas.common.xmlparser.PublicCondition) 

    /**
     * Method setPublicCondition
     * 
     * @param publicConditionArray
     */
    public void setPublicCondition(com.ccssoft.rsas.common.xmlparser.PublicCondition[] publicConditionArray)
    {
        //-- copy array
        _publicConditionList.removeAllElements();
        for (int i = 0; i < publicConditionArray.length; i++) {
            _publicConditionList.addElement(publicConditionArray[i]);
        }
    } //-- void setPublicCondition(com.regaltec.rsas.common.xmlparser.PublicCondition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PublicConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PublicConditions.class, reader);
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
