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
 * ���淧ֵ��ά�����
 * 
 * @version $Revision$ $Date$
 */
public class WarningCombos implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ĳ��ά�������Ԥ������ϸ������Ϣ
     */
    private java.util.Vector _warningComboList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WarningCombos() {
        super();
        _warningComboList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.WarningCombos()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addWarningCombo
     * 
     * @param vWarningCombo
     */
    public void addWarningCombo(com.ccssoft.rsas.common.xmlparser.WarningCombo vWarningCombo)
        throws java.lang.IndexOutOfBoundsException
    {
        _warningComboList.addElement(vWarningCombo);
    } //-- void addWarningCombo(com.regaltec.rsas.common.xmlparser.WarningCombo) 

    /**
     * Method addWarningCombo
     * 
     * @param index
     * @param vWarningCombo
     */
    public void addWarningCombo(int index, com.ccssoft.rsas.common.xmlparser.WarningCombo vWarningCombo)
        throws java.lang.IndexOutOfBoundsException
    {
        _warningComboList.insertElementAt(vWarningCombo, index);
    } //-- void addWarningCombo(int, com.regaltec.rsas.common.xmlparser.WarningCombo) 

    /**
     * Method enumerateWarningCombo
     */
    public java.util.Enumeration enumerateWarningCombo()
    {
        return _warningComboList.elements();
    } //-- java.util.Enumeration enumerateWarningCombo() 

    /**
     * Method getWarningCombo
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WarningCombo getWarningCombo(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _warningComboList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.WarningCombo) _warningComboList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.WarningCombo getWarningCombo(int) 

    /**
     * Method getWarningCombo
     */
    public com.ccssoft.rsas.common.xmlparser.WarningCombo[] getWarningCombo()
    {
        int size = _warningComboList.size();
        com.ccssoft.rsas.common.xmlparser.WarningCombo[] mArray = new com.ccssoft.rsas.common.xmlparser.WarningCombo[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.WarningCombo) _warningComboList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.WarningCombo[] getWarningCombo() 

    /**
     * Method getWarningComboCount
     */
    public int getWarningComboCount()
    {
        return _warningComboList.size();
    } //-- int getWarningComboCount() 

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
     * Method removeAllWarningCombo
     */
    public void removeAllWarningCombo()
    {
        _warningComboList.removeAllElements();
    } //-- void removeAllWarningCombo() 

    /**
     * Method removeWarningCombo
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WarningCombo removeWarningCombo(int index)
    {
        java.lang.Object obj = _warningComboList.elementAt(index);
        _warningComboList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.WarningCombo) obj;
    } //-- com.regaltec.rsas.common.xmlparser.WarningCombo removeWarningCombo(int) 

    /**
     * Method setWarningCombo
     * 
     * @param index
     * @param vWarningCombo
     */
    public void setWarningCombo(int index, com.ccssoft.rsas.common.xmlparser.WarningCombo vWarningCombo)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _warningComboList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _warningComboList.setElementAt(vWarningCombo, index);
    } //-- void setWarningCombo(int, com.regaltec.rsas.common.xmlparser.WarningCombo) 

    /**
     * Method setWarningCombo
     * 
     * @param warningComboArray
     */
    public void setWarningCombo(com.ccssoft.rsas.common.xmlparser.WarningCombo[] warningComboArray)
    {
        //-- copy array
        _warningComboList.removeAllElements();
        for (int i = 0; i < warningComboArray.length; i++) {
            _warningComboList.addElement(warningComboArray[i]);
        }
    } //-- void setWarningCombo(com.regaltec.rsas.common.xmlparser.WarningCombo) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.WarningCombos) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.WarningCombos.class, reader);
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
