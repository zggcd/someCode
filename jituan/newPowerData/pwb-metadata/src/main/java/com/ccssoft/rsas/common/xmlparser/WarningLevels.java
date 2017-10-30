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
 * Ԥ��
 * 
 * @version $Revision$ $Date$
 */
public class WarningLevels implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���漶������
     */
    private java.util.Vector _warningLevelList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WarningLevels() {
        super();
        _warningLevelList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevels()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addWarningLevel
     * 
     * @param vWarningLevel
     */
    public void addWarningLevel(com.ccssoft.rsas.common.xmlparser.WarningLevel vWarningLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        _warningLevelList.addElement(vWarningLevel);
    } //-- void addWarningLevel(com.regaltec.rsas.common.xmlparser.WarningLevel) 

    /**
     * Method addWarningLevel
     * 
     * @param index
     * @param vWarningLevel
     */
    public void addWarningLevel(int index, com.ccssoft.rsas.common.xmlparser.WarningLevel vWarningLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        _warningLevelList.insertElementAt(vWarningLevel, index);
    } //-- void addWarningLevel(int, com.regaltec.rsas.common.xmlparser.WarningLevel) 

    /**
     * Method enumerateWarningLevel
     */
    public java.util.Enumeration enumerateWarningLevel()
    {
        return _warningLevelList.elements();
    } //-- java.util.Enumeration enumerateWarningLevel() 

    /**
     * Method getWarningLevel
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WarningLevel getWarningLevel(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _warningLevelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.WarningLevel) _warningLevelList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevel getWarningLevel(int) 

    /**
     * Method getWarningLevel
     */
    public com.ccssoft.rsas.common.xmlparser.WarningLevel[] getWarningLevel()
    {
        int size = _warningLevelList.size();
        com.ccssoft.rsas.common.xmlparser.WarningLevel[] mArray = new com.ccssoft.rsas.common.xmlparser.WarningLevel[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.WarningLevel) _warningLevelList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevel[] getWarningLevel() 

    /**
     * Method getWarningLevelCount
     */
    public int getWarningLevelCount()
    {
        return _warningLevelList.size();
    } //-- int getWarningLevelCount() 

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
     * Method removeAllWarningLevel
     */
    public void removeAllWarningLevel()
    {
        _warningLevelList.removeAllElements();
    } //-- void removeAllWarningLevel() 

    /**
     * Method removeWarningLevel
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WarningLevel removeWarningLevel(int index)
    {
        java.lang.Object obj = _warningLevelList.elementAt(index);
        _warningLevelList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.WarningLevel) obj;
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevel removeWarningLevel(int) 

    /**
     * Method setWarningLevel
     * 
     * @param index
     * @param vWarningLevel
     */
    public void setWarningLevel(int index, com.ccssoft.rsas.common.xmlparser.WarningLevel vWarningLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _warningLevelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _warningLevelList.setElementAt(vWarningLevel, index);
    } //-- void setWarningLevel(int, com.regaltec.rsas.common.xmlparser.WarningLevel) 

    /**
     * Method setWarningLevel
     * 
     * @param warningLevelArray
     */
    public void setWarningLevel(com.ccssoft.rsas.common.xmlparser.WarningLevel[] warningLevelArray)
    {
        //-- copy array
        _warningLevelList.removeAllElements();
        for (int i = 0; i < warningLevelArray.length; i++) {
            _warningLevelList.addElement(warningLevelArray[i]);
        }
    } //-- void setWarningLevel(com.regaltec.rsas.common.xmlparser.WarningLevel) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.WarningLevels) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.WarningLevels.class, reader);
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
