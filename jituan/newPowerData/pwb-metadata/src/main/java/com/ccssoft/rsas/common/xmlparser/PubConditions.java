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
 * ��������
 * 
 * @version $Revision$ $Date$
 */
public class PubConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _pubConditionList
     */
    private java.util.Vector _pubConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PubConditions() {
        super();
        _pubConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PubConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPubCondition
     * 
     * @param vPubCondition
     */
    public void addPubCondition(com.ccssoft.rsas.common.xmlparser.PubCondition vPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _pubConditionList.addElement(vPubCondition);
    } //-- void addPubCondition(com.regaltec.rsas.common.xmlparser.PubCondition) 

    /**
     * Method addPubCondition
     * 
     * @param index
     * @param vPubCondition
     */
    public void addPubCondition(int index, com.ccssoft.rsas.common.xmlparser.PubCondition vPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _pubConditionList.insertElementAt(vPubCondition, index);
    } //-- void addPubCondition(int, com.regaltec.rsas.common.xmlparser.PubCondition) 

    /**
     * Method enumeratePubCondition
     */
    public java.util.Enumeration enumeratePubCondition()
    {
        return _pubConditionList.elements();
    } //-- java.util.Enumeration enumeratePubCondition() 

    /**
     * Method getPubCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PubCondition getPubCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pubConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PubCondition) _pubConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PubCondition getPubCondition(int) 

    /**
     * Method getPubCondition
     */
    public com.ccssoft.rsas.common.xmlparser.PubCondition[] getPubCondition()
    {
        int size = _pubConditionList.size();
        com.ccssoft.rsas.common.xmlparser.PubCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.PubCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PubCondition) _pubConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PubCondition[] getPubCondition() 

    /**
     * Method getPubConditionCount
     */
    public int getPubConditionCount()
    {
        return _pubConditionList.size();
    } //-- int getPubConditionCount() 

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
     * Method removeAllPubCondition
     */
    public void removeAllPubCondition()
    {
        _pubConditionList.removeAllElements();
    } //-- void removeAllPubCondition() 

    /**
     * Method removePubCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PubCondition removePubCondition(int index)
    {
        java.lang.Object obj = _pubConditionList.elementAt(index);
        _pubConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PubCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PubCondition removePubCondition(int) 

    /**
     * Method setPubCondition
     * 
     * @param index
     * @param vPubCondition
     */
    public void setPubCondition(int index, com.ccssoft.rsas.common.xmlparser.PubCondition vPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pubConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _pubConditionList.setElementAt(vPubCondition, index);
    } //-- void setPubCondition(int, com.regaltec.rsas.common.xmlparser.PubCondition) 

    /**
     * Method setPubCondition
     * 
     * @param pubConditionArray
     */
    public void setPubCondition(com.ccssoft.rsas.common.xmlparser.PubCondition[] pubConditionArray)
    {
        //-- copy array
        _pubConditionList.removeAllElements();
        for (int i = 0; i < pubConditionArray.length; i++) {
            _pubConditionList.addElement(pubConditionArray[i]);
        }
    } //-- void setPubCondition(com.regaltec.rsas.common.xmlparser.PubCondition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PubConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PubConditions.class, reader);
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
