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
 * �����ʹ�õ����ݱ���
 * 
 * @version $Revision$ $Date$
 */
public class FieldTable implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tableName
     */
    private java.lang.String _tableName;

    /**
     * Field _caption
     */
    private java.lang.String _caption;

    /**
     * Field _linkID
     */
    private java.lang.String _linkID;

    /**
     * �����
     */
    private java.util.Vector _fieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public FieldTable() {
        super();
        _fieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.FieldTable()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addField
     * 
     * @param vField
     */
    public void addField(com.ccssoft.rsas.common.xmlparser.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldList.addElement(vField);
    } //-- void addField(com.regaltec.rsas.common.xmlparser.Field) 

    /**
     * Method addField
     * 
     * @param index
     * @param vField
     */
    public void addField(int index, com.ccssoft.rsas.common.xmlparser.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldList.insertElementAt(vField, index);
    } //-- void addField(int, com.regaltec.rsas.common.xmlparser.Field) 

    /**
     * Method enumerateField
     */
    public java.util.Enumeration enumerateField()
    {
        return _fieldList.elements();
    } //-- java.util.Enumeration enumerateField() 

    /**
     * Returns the value of field 'caption'.
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Method getField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Field getField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Field) _fieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Field getField(int) 

    /**
     * Method getField
     */
    public com.ccssoft.rsas.common.xmlparser.Field[] getField()
    {
        int size = _fieldList.size();
        com.ccssoft.rsas.common.xmlparser.Field[] mArray = new com.ccssoft.rsas.common.xmlparser.Field[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Field) _fieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Field[] getField() 

    /**
     * Method getFieldCount
     */
    public int getFieldCount()
    {
        return _fieldList.size();
    } //-- int getFieldCount() 

    /**
     * Returns the value of field 'linkID'.
     * 
     * @return the value of field 'linkID'.
     */
    public java.lang.String getLinkID()
    {
        return this._linkID;
    } //-- java.lang.String getLinkID() 

    /**
     * Returns the value of field 'tableName'.
     * 
     * @return the value of field 'tableName'.
     */
    public java.lang.String getTableName()
    {
        return this._tableName;
    } //-- java.lang.String getTableName() 

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
     * Method removeAllField
     */
    public void removeAllField()
    {
        _fieldList.removeAllElements();
    } //-- void removeAllField() 

    /**
     * Method removeField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Field removeField(int index)
    {
        java.lang.Object obj = _fieldList.elementAt(index);
        _fieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Field) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Field removeField(int) 

    /**
     * Sets the value of field 'caption'.
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Method setField
     * 
     * @param index
     * @param vField
     */
    public void setField(int index, com.ccssoft.rsas.common.xmlparser.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _fieldList.setElementAt(vField, index);
    } //-- void setField(int, com.regaltec.rsas.common.xmlparser.Field) 

    /**
     * Method setField
     * 
     * @param fieldArray
     */
    public void setField(com.ccssoft.rsas.common.xmlparser.Field[] fieldArray)
    {
        //-- copy array
        _fieldList.removeAllElements();
        for (int i = 0; i < fieldArray.length; i++) {
            _fieldList.addElement(fieldArray[i]);
        }
    } //-- void setField(com.regaltec.rsas.common.xmlparser.Field) 

    /**
     * Sets the value of field 'linkID'.
     * 
     * @param linkID the value of field 'linkID'.
     */
    public void setLinkID(java.lang.String linkID)
    {
        this._linkID = linkID;
    } //-- void setLinkID(java.lang.String) 

    /**
     * Sets the value of field 'tableName'.
     * 
     * @param tableName the value of field 'tableName'.
     */
    public void setTableName(java.lang.String tableName)
    {
        this._tableName = tableName;
    } //-- void setTableName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.FieldTable) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.FieldTable.class, reader);
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
