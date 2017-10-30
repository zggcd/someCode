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
 * Class DBFields.
 * 
 * @version $Revision$ $Date$
 */
public class DBFields implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ��ֶζ������ڽ�ģʱ��ȡ���ݿ���е��ֶ���Ϣ
     */
    private java.util.Vector _DBFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DBFields() {
        super();
        _DBFieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DBFields()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDBField
     * 
     * @param vDBField
     */
    public void addDBField(com.ccssoft.rsas.common.xmlparser.DBField vDBField)
        throws java.lang.IndexOutOfBoundsException
    {
        _DBFieldList.addElement(vDBField);
    } //-- void addDBField(com.regaltec.rsas.common.xmlparser.DBField) 

    /**
     * Method addDBField
     * 
     * @param index
     * @param vDBField
     */
    public void addDBField(int index, com.ccssoft.rsas.common.xmlparser.DBField vDBField)
        throws java.lang.IndexOutOfBoundsException
    {
        _DBFieldList.insertElementAt(vDBField, index);
    } //-- void addDBField(int, com.regaltec.rsas.common.xmlparser.DBField) 

    /**
     * Method enumerateDBField
     */
    public java.util.Enumeration enumerateDBField()
    {
        return _DBFieldList.elements();
    } //-- java.util.Enumeration enumerateDBField() 

    /**
     * Method getDBField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DBField getDBField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _DBFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DBField) _DBFieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DBField getDBField(int) 

    /**
     * Method getDBField
     */
    public com.ccssoft.rsas.common.xmlparser.DBField[] getDBField()
    {
        int size = _DBFieldList.size();
        com.ccssoft.rsas.common.xmlparser.DBField[] mArray = new com.ccssoft.rsas.common.xmlparser.DBField[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DBField) _DBFieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DBField[] getDBField() 

    /**
     * Method getDBFieldCount
     */
    public int getDBFieldCount()
    {
        return _DBFieldList.size();
    } //-- int getDBFieldCount() 

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
     * Method removeAllDBField
     */
    public void removeAllDBField()
    {
        _DBFieldList.removeAllElements();
    } //-- void removeAllDBField() 

    /**
     * Method removeDBField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DBField removeDBField(int index)
    {
        java.lang.Object obj = _DBFieldList.elementAt(index);
        _DBFieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DBField) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DBField removeDBField(int) 

    /**
     * Method setDBField
     * 
     * @param index
     * @param vDBField
     */
    public void setDBField(int index, com.ccssoft.rsas.common.xmlparser.DBField vDBField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _DBFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _DBFieldList.setElementAt(vDBField, index);
    } //-- void setDBField(int, com.regaltec.rsas.common.xmlparser.DBField) 

    /**
     * Method setDBField
     * 
     * @param DBFieldArray
     */
    public void setDBField(com.ccssoft.rsas.common.xmlparser.DBField[] DBFieldArray)
    {
        //-- copy array
        _DBFieldList.removeAllElements();
        for (int i = 0; i < DBFieldArray.length; i++) {
            _DBFieldList.addElement(DBFieldArray[i]);
        }
    } //-- void setDBField(com.regaltec.rsas.common.xmlparser.DBField) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DBFields) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DBFields.class, reader);
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
