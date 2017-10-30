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
 * ���ݺ˶��ֶμ�������󼯺�
 * 
 * @version $Revision$ $Date$
 */
public class CheckFields implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݺ˶��ֶμ��������
     */
    private java.util.Vector _checkFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckFields() {
        super();
        _checkFieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.CheckFields()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCheckField
     * 
     * @param vCheckField
     */
    public void addCheckField(com.ccssoft.rsas.common.xmlparser.CheckField vCheckField)
        throws java.lang.IndexOutOfBoundsException
    {
        _checkFieldList.addElement(vCheckField);
    } //-- void addCheckField(com.regaltec.rsas.common.xmlparser.CheckField) 

    /**
     * Method addCheckField
     * 
     * @param index
     * @param vCheckField
     */
    public void addCheckField(int index, com.ccssoft.rsas.common.xmlparser.CheckField vCheckField)
        throws java.lang.IndexOutOfBoundsException
    {
        _checkFieldList.insertElementAt(vCheckField, index);
    } //-- void addCheckField(int, com.regaltec.rsas.common.xmlparser.CheckField) 

    /**
     * Method enumerateCheckField
     */
    public java.util.Enumeration enumerateCheckField()
    {
        return _checkFieldList.elements();
    } //-- java.util.Enumeration enumerateCheckField() 

    /**
     * Method getCheckField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CheckField getCheckField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _checkFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.CheckField) _checkFieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.CheckField getCheckField(int) 

    /**
     * Method getCheckField
     */
    public com.ccssoft.rsas.common.xmlparser.CheckField[] getCheckField()
    {
        int size = _checkFieldList.size();
        com.ccssoft.rsas.common.xmlparser.CheckField[] mArray = new com.ccssoft.rsas.common.xmlparser.CheckField[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.CheckField) _checkFieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.CheckField[] getCheckField() 

    /**
     * Method getCheckFieldCount
     */
    public int getCheckFieldCount()
    {
        return _checkFieldList.size();
    } //-- int getCheckFieldCount() 

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
     * Method removeAllCheckField
     */
    public void removeAllCheckField()
    {
        _checkFieldList.removeAllElements();
    } //-- void removeAllCheckField() 

    /**
     * Method removeCheckField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CheckField removeCheckField(int index)
    {
        java.lang.Object obj = _checkFieldList.elementAt(index);
        _checkFieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.CheckField) obj;
    } //-- com.regaltec.rsas.common.xmlparser.CheckField removeCheckField(int) 

    /**
     * Method setCheckField
     * 
     * @param index
     * @param vCheckField
     */
    public void setCheckField(int index, com.ccssoft.rsas.common.xmlparser.CheckField vCheckField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _checkFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _checkFieldList.setElementAt(vCheckField, index);
    } //-- void setCheckField(int, com.regaltec.rsas.common.xmlparser.CheckField) 

    /**
     * Method setCheckField
     * 
     * @param checkFieldArray
     */
    public void setCheckField(com.ccssoft.rsas.common.xmlparser.CheckField[] checkFieldArray)
    {
        //-- copy array
        _checkFieldList.removeAllElements();
        for (int i = 0; i < checkFieldArray.length; i++) {
            _checkFieldList.addElement(checkFieldArray[i]);
        }
    } //-- void setCheckField(com.regaltec.rsas.common.xmlparser.CheckField) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.CheckFields) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CheckFields.class, reader);
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
