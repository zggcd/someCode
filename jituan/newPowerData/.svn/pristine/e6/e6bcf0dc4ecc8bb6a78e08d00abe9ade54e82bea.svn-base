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
 * Class DataInputFields.
 * 
 * @version $Revision$ $Date$
 */
public class DataInputFields implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���������ֶ�
     */
    private java.util.Vector _dataInputFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataInputFields() {
        super();
        _dataInputFieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DataInputFields()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataInputField
     * 
     * @param vDataInputField
     */
    public void addDataInputField(com.ccssoft.rsas.common.xmlparser.DataInputField vDataInputField)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataInputFieldList.addElement(vDataInputField);
    } //-- void addDataInputField(com.regaltec.rsas.common.xmlparser.DataInputField) 

    /**
     * Method addDataInputField
     * 
     * @param index
     * @param vDataInputField
     */
    public void addDataInputField(int index, com.ccssoft.rsas.common.xmlparser.DataInputField vDataInputField)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataInputFieldList.insertElementAt(vDataInputField, index);
    } //-- void addDataInputField(int, com.regaltec.rsas.common.xmlparser.DataInputField) 

    /**
     * Method enumerateDataInputField
     */
    public java.util.Enumeration enumerateDataInputField()
    {
        return _dataInputFieldList.elements();
    } //-- java.util.Enumeration enumerateDataInputField() 

    /**
     * Method getDataInputField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputField getDataInputField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataInputFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DataInputField) _dataInputFieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DataInputField getDataInputField(int) 

    /**
     * Method getDataInputField
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputField[] getDataInputField()
    {
        int size = _dataInputFieldList.size();
        com.ccssoft.rsas.common.xmlparser.DataInputField[] mArray = new com.ccssoft.rsas.common.xmlparser.DataInputField[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DataInputField) _dataInputFieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DataInputField[] getDataInputField() 

    /**
     * Method getDataInputFieldCount
     */
    public int getDataInputFieldCount()
    {
        return _dataInputFieldList.size();
    } //-- int getDataInputFieldCount() 

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
     * Method removeAllDataInputField
     */
    public void removeAllDataInputField()
    {
        _dataInputFieldList.removeAllElements();
    } //-- void removeAllDataInputField() 

    /**
     * Method removeDataInputField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputField removeDataInputField(int index)
    {
        java.lang.Object obj = _dataInputFieldList.elementAt(index);
        _dataInputFieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DataInputField) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DataInputField removeDataInputField(int) 

    /**
     * Method setDataInputField
     * 
     * @param index
     * @param vDataInputField
     */
    public void setDataInputField(int index, com.ccssoft.rsas.common.xmlparser.DataInputField vDataInputField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataInputFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataInputFieldList.setElementAt(vDataInputField, index);
    } //-- void setDataInputField(int, com.regaltec.rsas.common.xmlparser.DataInputField) 

    /**
     * Method setDataInputField
     * 
     * @param dataInputFieldArray
     */
    public void setDataInputField(com.ccssoft.rsas.common.xmlparser.DataInputField[] dataInputFieldArray)
    {
        //-- copy array
        _dataInputFieldList.removeAllElements();
        for (int i = 0; i < dataInputFieldArray.length; i++) {
            _dataInputFieldList.addElement(dataInputFieldArray[i]);
        }
    } //-- void setDataInputField(com.regaltec.rsas.common.xmlparser.DataInputField) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataInputFields) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataInputFields.class, reader);
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
