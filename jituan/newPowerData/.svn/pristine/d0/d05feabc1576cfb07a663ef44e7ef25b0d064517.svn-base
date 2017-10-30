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
 * ���ݼ�¼����Ԫ���ݿ��޹أ�
 * 
 * @version $Revision$ $Date$
 */
public class ReturnRecord implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _recordFieldList
     */
    private java.util.Vector _recordFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReturnRecord() {
        super();
        _recordFieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecord()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRecordField
     * 
     * @param vRecordField
     */
    public void addRecordField(com.ccssoft.rsas.common.xmlparser.RecordField vRecordField)
        throws java.lang.IndexOutOfBoundsException
    {
        _recordFieldList.addElement(vRecordField);
    } //-- void addRecordField(com.regaltec.rsas.common.xmlparser.RecordField) 

    /**
     * Method addRecordField
     * 
     * @param index
     * @param vRecordField
     */
    public void addRecordField(int index, com.ccssoft.rsas.common.xmlparser.RecordField vRecordField)
        throws java.lang.IndexOutOfBoundsException
    {
        _recordFieldList.insertElementAt(vRecordField, index);
    } //-- void addRecordField(int, com.regaltec.rsas.common.xmlparser.RecordField) 

    /**
     * Method enumerateRecordField
     */
    public java.util.Enumeration enumerateRecordField()
    {
        return _recordFieldList.elements();
    } //-- java.util.Enumeration enumerateRecordField() 

    /**
     * Method getRecordField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RecordField getRecordField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _recordFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.RecordField) _recordFieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.RecordField getRecordField(int) 

    /**
     * Method getRecordField
     */
    public com.ccssoft.rsas.common.xmlparser.RecordField[] getRecordField()
    {
        int size = _recordFieldList.size();
        com.ccssoft.rsas.common.xmlparser.RecordField[] mArray = new com.ccssoft.rsas.common.xmlparser.RecordField[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.RecordField) _recordFieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.RecordField[] getRecordField() 

    /**
     * Method getRecordFieldCount
     */
    public int getRecordFieldCount()
    {
        return _recordFieldList.size();
    } //-- int getRecordFieldCount() 

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
     * Method removeAllRecordField
     */
    public void removeAllRecordField()
    {
        _recordFieldList.removeAllElements();
    } //-- void removeAllRecordField() 

    /**
     * Method removeRecordField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RecordField removeRecordField(int index)
    {
        java.lang.Object obj = _recordFieldList.elementAt(index);
        _recordFieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.RecordField) obj;
    } //-- com.regaltec.rsas.common.xmlparser.RecordField removeRecordField(int) 

    /**
     * Method setRecordField
     * 
     * @param index
     * @param vRecordField
     */
    public void setRecordField(int index, com.ccssoft.rsas.common.xmlparser.RecordField vRecordField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _recordFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _recordFieldList.setElementAt(vRecordField, index);
    } //-- void setRecordField(int, com.regaltec.rsas.common.xmlparser.RecordField) 

    /**
     * Method setRecordField
     * 
     * @param recordFieldArray
     */
    public void setRecordField(com.ccssoft.rsas.common.xmlparser.RecordField[] recordFieldArray)
    {
        //-- copy array
        _recordFieldList.removeAllElements();
        for (int i = 0; i < recordFieldArray.length; i++) {
            _recordFieldList.addElement(recordFieldArray[i]);
        }
    } //-- void setRecordField(com.regaltec.rsas.common.xmlparser.RecordField) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReturnRecord) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReturnRecord.class, reader);
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
