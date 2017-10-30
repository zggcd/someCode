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
 * Class Fields.
 * 
 * @version $Revision$ $Date$
 */
public class Fields implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _SQL
     */
    private java.lang.String _SQL;

    /**
     * Field _linkID
     */
    private java.lang.String _linkID;

    /**
     * �����ʹ�õ����ݱ���
     */
    private java.util.Vector _fieldTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fields() {
        super();
        _fieldTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Fields()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addFieldTable
     * 
     * @param vFieldTable
     */
    public void addFieldTable(com.ccssoft.rsas.common.xmlparser.FieldTable vFieldTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldTableList.addElement(vFieldTable);
    } //-- void addFieldTable(com.regaltec.rsas.common.xmlparser.FieldTable) 

    /**
     * Method addFieldTable
     * 
     * @param index
     * @param vFieldTable
     */
    public void addFieldTable(int index, com.ccssoft.rsas.common.xmlparser.FieldTable vFieldTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldTableList.insertElementAt(vFieldTable, index);
    } //-- void addFieldTable(int, com.regaltec.rsas.common.xmlparser.FieldTable) 

    /**
     * Method enumerateFieldTable
     */
    public java.util.Enumeration enumerateFieldTable()
    {
        return _fieldTableList.elements();
    } //-- java.util.Enumeration enumerateFieldTable() 

    /**
     * Method getFieldTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FieldTable getFieldTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fieldTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.FieldTable) _fieldTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.FieldTable getFieldTable(int) 

    /**
     * Method getFieldTable
     */
    public com.ccssoft.rsas.common.xmlparser.FieldTable[] getFieldTable()
    {
        int size = _fieldTableList.size();
        com.ccssoft.rsas.common.xmlparser.FieldTable[] mArray = new com.ccssoft.rsas.common.xmlparser.FieldTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.FieldTable) _fieldTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.FieldTable[] getFieldTable() 

    /**
     * Method getFieldTableCount
     */
    public int getFieldTableCount()
    {
        return _fieldTableList.size();
    } //-- int getFieldTableCount() 

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
     * Returns the value of field 'SQL'.
     * 
     * @return the value of field 'SQL'.
     */
    public java.lang.String getSQL()
    {
        return this._SQL;
    } //-- java.lang.String getSQL() 

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
     * Method removeAllFieldTable
     */
    public void removeAllFieldTable()
    {
        _fieldTableList.removeAllElements();
    } //-- void removeAllFieldTable() 

    /**
     * Method removeFieldTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FieldTable removeFieldTable(int index)
    {
        java.lang.Object obj = _fieldTableList.elementAt(index);
        _fieldTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.FieldTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.FieldTable removeFieldTable(int) 

    /**
     * Method setFieldTable
     * 
     * @param index
     * @param vFieldTable
     */
    public void setFieldTable(int index, com.ccssoft.rsas.common.xmlparser.FieldTable vFieldTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fieldTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _fieldTableList.setElementAt(vFieldTable, index);
    } //-- void setFieldTable(int, com.regaltec.rsas.common.xmlparser.FieldTable) 

    /**
     * Method setFieldTable
     * 
     * @param fieldTableArray
     */
    public void setFieldTable(com.ccssoft.rsas.common.xmlparser.FieldTable[] fieldTableArray)
    {
        //-- copy array
        _fieldTableList.removeAllElements();
        for (int i = 0; i < fieldTableArray.length; i++) {
            _fieldTableList.addElement(fieldTableArray[i]);
        }
    } //-- void setFieldTable(com.regaltec.rsas.common.xmlparser.FieldTable) 

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
     * Sets the value of field 'SQL'.
     * 
     * @param SQL the value of field 'SQL'.
     */
    public void setSQL(java.lang.String SQL)
    {
        this._SQL = SQL;
    } //-- void setSQL(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Fields) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Fields.class, reader);
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
