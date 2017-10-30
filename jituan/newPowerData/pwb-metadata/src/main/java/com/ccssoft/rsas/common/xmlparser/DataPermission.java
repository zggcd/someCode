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

import com.ccssoft.rsas.common.xmlparser.types.DataPermissionValueDataTypeType;

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
 * ����Ȩ�޷���
 * 
 * @version $Revision$ $Date$
 */
public class DataPermission implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataAuthorityDivID
     */
    private java.lang.Object _dataAuthorityDivID;

    /**
     * Field _valueDataType
     */
    private com.ccssoft.rsas.common.xmlparser.types.DataPermissionValueDataTypeType _valueDataType;

    /**
     * Field _dataPermissionValueList
     */
    private java.util.Vector _dataPermissionValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataPermission() {
        super();
        _dataPermissionValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DataPermission()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataPermissionValue
     * 
     * @param vDataPermissionValue
     */
    public void addDataPermissionValue(java.lang.String vDataPermissionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataPermissionValueList.addElement(vDataPermissionValue);
    } //-- void addDataPermissionValue(java.lang.String) 

    /**
     * Method addDataPermissionValue
     * 
     * @param index
     * @param vDataPermissionValue
     */
    public void addDataPermissionValue(int index, java.lang.String vDataPermissionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataPermissionValueList.insertElementAt(vDataPermissionValue, index);
    } //-- void addDataPermissionValue(int, java.lang.String) 

    /**
     * Method enumerateDataPermissionValue
     */
    public java.util.Enumeration enumerateDataPermissionValue()
    {
        return _dataPermissionValueList.elements();
    } //-- java.util.Enumeration enumerateDataPermissionValue() 

    /**
     * Returns the value of field 'dataAuthorityDivID'.
     * 
     * @return the value of field 'dataAuthorityDivID'.
     */
    public java.lang.Object getDataAuthorityDivID()
    {
        return this._dataAuthorityDivID;
    } //-- java.lang.Object getDataAuthorityDivID() 

    /**
     * Method getDataPermissionValue
     * 
     * @param index
     */
    public java.lang.String getDataPermissionValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataPermissionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_dataPermissionValueList.elementAt(index);
    } //-- java.lang.String getDataPermissionValue(int) 

    /**
     * Method getDataPermissionValue
     */
    public java.lang.String[] getDataPermissionValue()
    {
        int size = _dataPermissionValueList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_dataPermissionValueList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getDataPermissionValue() 

    /**
     * Method getDataPermissionValueCount
     */
    public int getDataPermissionValueCount()
    {
        return _dataPermissionValueList.size();
    } //-- int getDataPermissionValueCount() 

    /**
     * Returns the value of field 'valueDataType'.
     * 
     * @return the value of field 'valueDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DataPermissionValueDataTypeType getValueDataType()
    {
        return this._valueDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataPermissionValueDataTypeType getValueDataType() 

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
     * Method removeAllDataPermissionValue
     */
    public void removeAllDataPermissionValue()
    {
        _dataPermissionValueList.removeAllElements();
    } //-- void removeAllDataPermissionValue() 

    /**
     * Method removeDataPermissionValue
     * 
     * @param index
     */
    public java.lang.String removeDataPermissionValue(int index)
    {
        java.lang.Object obj = _dataPermissionValueList.elementAt(index);
        _dataPermissionValueList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeDataPermissionValue(int) 

    /**
     * Sets the value of field 'dataAuthorityDivID'.
     * 
     * @param dataAuthorityDivID the value of field
     * 'dataAuthorityDivID'.
     */
    public void setDataAuthorityDivID(java.lang.Object dataAuthorityDivID)
    {
        this._dataAuthorityDivID = dataAuthorityDivID;
    } //-- void setDataAuthorityDivID(java.lang.Object) 

    /**
     * Method setDataPermissionValue
     * 
     * @param index
     * @param vDataPermissionValue
     */
    public void setDataPermissionValue(int index, java.lang.String vDataPermissionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataPermissionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataPermissionValueList.setElementAt(vDataPermissionValue, index);
    } //-- void setDataPermissionValue(int, java.lang.String) 

    /**
     * Method setDataPermissionValue
     * 
     * @param dataPermissionValueArray
     */
    public void setDataPermissionValue(java.lang.String[] dataPermissionValueArray)
    {
        //-- copy array
        _dataPermissionValueList.removeAllElements();
        for (int i = 0; i < dataPermissionValueArray.length; i++) {
            _dataPermissionValueList.addElement(dataPermissionValueArray[i]);
        }
    } //-- void setDataPermissionValue(java.lang.String) 

    /**
     * Sets the value of field 'valueDataType'.
     * 
     * @param valueDataType the value of field 'valueDataType'.
     */
    public void setValueDataType(com.ccssoft.rsas.common.xmlparser.types.DataPermissionValueDataTypeType valueDataType)
    {
        this._valueDataType = valueDataType;
    } //-- void setValueDataType(com.regaltec.rsas.common.xmlparser.types.DataPermissionValueDataTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataPermission) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataPermission.class, reader);
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
