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
 * HTML �ƶ���������ָ�꼯��
 * 
 * @version $Revision$ $Date$
 */
public class MIDPubIndicators implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * HTML �ƶ���������ָ��
     */
    private java.util.Vector _MIDPubIndicatorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDPubIndicators() {
        super();
        _MIDPubIndicatorList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubIndicators()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDPubIndicator
     * 
     * @param vMIDPubIndicator
     */
    public void addMIDPubIndicator(com.ccssoft.rsas.common.xmlparser.MIDPubIndicator vMIDPubIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDPubIndicatorList.addElement(vMIDPubIndicator);
    } //-- void addMIDPubIndicator(com.regaltec.rsas.common.xmlparser.MIDPubIndicator) 

    /**
     * Method addMIDPubIndicator
     * 
     * @param index
     * @param vMIDPubIndicator
     */
    public void addMIDPubIndicator(int index, com.ccssoft.rsas.common.xmlparser.MIDPubIndicator vMIDPubIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDPubIndicatorList.insertElementAt(vMIDPubIndicator, index);
    } //-- void addMIDPubIndicator(int, com.regaltec.rsas.common.xmlparser.MIDPubIndicator) 

    /**
     * Method enumerateMIDPubIndicator
     */
    public java.util.Enumeration enumerateMIDPubIndicator()
    {
        return _MIDPubIndicatorList.elements();
    } //-- java.util.Enumeration enumerateMIDPubIndicator() 

    /**
     * Method getMIDPubIndicator
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubIndicator getMIDPubIndicator(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDPubIndicatorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDPubIndicator) _MIDPubIndicatorList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubIndicator getMIDPubIndicator(int) 

    /**
     * Method getMIDPubIndicator
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubIndicator[] getMIDPubIndicator()
    {
        int size = _MIDPubIndicatorList.size();
        com.ccssoft.rsas.common.xmlparser.MIDPubIndicator[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDPubIndicator[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDPubIndicator) _MIDPubIndicatorList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubIndicator[] getMIDPubIndicator() 

    /**
     * Method getMIDPubIndicatorCount
     */
    public int getMIDPubIndicatorCount()
    {
        return _MIDPubIndicatorList.size();
    } //-- int getMIDPubIndicatorCount() 

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
     * Method removeAllMIDPubIndicator
     */
    public void removeAllMIDPubIndicator()
    {
        _MIDPubIndicatorList.removeAllElements();
    } //-- void removeAllMIDPubIndicator() 

    /**
     * Method removeMIDPubIndicator
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubIndicator removeMIDPubIndicator(int index)
    {
        java.lang.Object obj = _MIDPubIndicatorList.elementAt(index);
        _MIDPubIndicatorList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDPubIndicator) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubIndicator removeMIDPubIndicator(int) 

    /**
     * Method setMIDPubIndicator
     * 
     * @param index
     * @param vMIDPubIndicator
     */
    public void setMIDPubIndicator(int index, com.ccssoft.rsas.common.xmlparser.MIDPubIndicator vMIDPubIndicator)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDPubIndicatorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDPubIndicatorList.setElementAt(vMIDPubIndicator, index);
    } //-- void setMIDPubIndicator(int, com.regaltec.rsas.common.xmlparser.MIDPubIndicator) 

    /**
     * Method setMIDPubIndicator
     * 
     * @param MIDPubIndicatorArray
     */
    public void setMIDPubIndicator(com.ccssoft.rsas.common.xmlparser.MIDPubIndicator[] MIDPubIndicatorArray)
    {
        //-- copy array
        _MIDPubIndicatorList.removeAllElements();
        for (int i = 0; i < MIDPubIndicatorArray.length; i++) {
            _MIDPubIndicatorList.addElement(MIDPubIndicatorArray[i]);
        }
    } //-- void setMIDPubIndicator(com.regaltec.rsas.common.xmlparser.MIDPubIndicator) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDPubIndicators) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDPubIndicators.class, reader);
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
