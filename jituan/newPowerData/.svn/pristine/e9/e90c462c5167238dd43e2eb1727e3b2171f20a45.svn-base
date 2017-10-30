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
 * Class ReturnRecords.
 * 
 * @version $Revision$ $Date$
 */
public class ReturnRecords implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��¼����ÿ�еı��⣨����Ӧ��Field�������������һ�£�
     */
    private java.util.Vector _rowHeaderList;

    /**
     * ���ݼ�¼����Ԫ���ݿ��޹أ�
     */
    private java.util.Vector _returnRecordList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReturnRecords() {
        super();
        _rowHeaderList = new Vector();
        _returnRecordList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecords()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReturnRecord
     * 
     * @param vReturnRecord
     */
    public void addReturnRecord(com.ccssoft.rsas.common.xmlparser.ReturnRecord vReturnRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        _returnRecordList.addElement(vReturnRecord);
    } //-- void addReturnRecord(com.regaltec.rsas.common.xmlparser.ReturnRecord) 

    /**
     * Method addReturnRecord
     * 
     * @param index
     * @param vReturnRecord
     */
    public void addReturnRecord(int index, com.ccssoft.rsas.common.xmlparser.ReturnRecord vReturnRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        _returnRecordList.insertElementAt(vReturnRecord, index);
    } //-- void addReturnRecord(int, com.regaltec.rsas.common.xmlparser.ReturnRecord) 

    /**
     * Method addRowHeader
     * 
     * @param vRowHeader
     */
    public void addRowHeader(com.ccssoft.rsas.common.xmlparser.RowHeader vRowHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _rowHeaderList.addElement(vRowHeader);
    } //-- void addRowHeader(com.regaltec.rsas.common.xmlparser.RowHeader) 

    /**
     * Method addRowHeader
     * 
     * @param index
     * @param vRowHeader
     */
    public void addRowHeader(int index, com.ccssoft.rsas.common.xmlparser.RowHeader vRowHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        _rowHeaderList.insertElementAt(vRowHeader, index);
    } //-- void addRowHeader(int, com.regaltec.rsas.common.xmlparser.RowHeader) 

    /**
     * Method enumerateReturnRecord
     */
    public java.util.Enumeration enumerateReturnRecord()
    {
        return _returnRecordList.elements();
    } //-- java.util.Enumeration enumerateReturnRecord() 

    /**
     * Method enumerateRowHeader
     */
    public java.util.Enumeration enumerateRowHeader()
    {
        return _rowHeaderList.elements();
    } //-- java.util.Enumeration enumerateRowHeader() 

    /**
     * Method getReturnRecord
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReturnRecord getReturnRecord(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _returnRecordList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReturnRecord) _returnRecordList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecord getReturnRecord(int) 

    /**
     * Method getReturnRecord
     */
    public com.ccssoft.rsas.common.xmlparser.ReturnRecord[] getReturnRecord()
    {
        int size = _returnRecordList.size();
        com.ccssoft.rsas.common.xmlparser.ReturnRecord[] mArray = new com.ccssoft.rsas.common.xmlparser.ReturnRecord[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReturnRecord) _returnRecordList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecord[] getReturnRecord() 

    /**
     * Method getReturnRecordCount
     */
    public int getReturnRecordCount()
    {
        return _returnRecordList.size();
    } //-- int getReturnRecordCount() 

    /**
     * Method getRowHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RowHeader getRowHeader(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _rowHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.RowHeader) _rowHeaderList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.RowHeader getRowHeader(int) 

    /**
     * Method getRowHeader
     */
    public com.ccssoft.rsas.common.xmlparser.RowHeader[] getRowHeader()
    {
        int size = _rowHeaderList.size();
        com.ccssoft.rsas.common.xmlparser.RowHeader[] mArray = new com.ccssoft.rsas.common.xmlparser.RowHeader[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.RowHeader) _rowHeaderList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.RowHeader[] getRowHeader() 

    /**
     * Method getRowHeaderCount
     */
    public int getRowHeaderCount()
    {
        return _rowHeaderList.size();
    } //-- int getRowHeaderCount() 

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
     * Method removeAllReturnRecord
     */
    public void removeAllReturnRecord()
    {
        _returnRecordList.removeAllElements();
    } //-- void removeAllReturnRecord() 

    /**
     * Method removeAllRowHeader
     */
    public void removeAllRowHeader()
    {
        _rowHeaderList.removeAllElements();
    } //-- void removeAllRowHeader() 

    /**
     * Method removeReturnRecord
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReturnRecord removeReturnRecord(int index)
    {
        java.lang.Object obj = _returnRecordList.elementAt(index);
        _returnRecordList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReturnRecord) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecord removeReturnRecord(int) 

    /**
     * Method removeRowHeader
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RowHeader removeRowHeader(int index)
    {
        java.lang.Object obj = _rowHeaderList.elementAt(index);
        _rowHeaderList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.RowHeader) obj;
    } //-- com.regaltec.rsas.common.xmlparser.RowHeader removeRowHeader(int) 

    /**
     * Method setReturnRecord
     * 
     * @param index
     * @param vReturnRecord
     */
    public void setReturnRecord(int index, com.ccssoft.rsas.common.xmlparser.ReturnRecord vReturnRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _returnRecordList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _returnRecordList.setElementAt(vReturnRecord, index);
    } //-- void setReturnRecord(int, com.regaltec.rsas.common.xmlparser.ReturnRecord) 

    /**
     * Method setReturnRecord
     * 
     * @param returnRecordArray
     */
    public void setReturnRecord(com.ccssoft.rsas.common.xmlparser.ReturnRecord[] returnRecordArray)
    {
        //-- copy array
        _returnRecordList.removeAllElements();
        for (int i = 0; i < returnRecordArray.length; i++) {
            _returnRecordList.addElement(returnRecordArray[i]);
        }
    } //-- void setReturnRecord(com.regaltec.rsas.common.xmlparser.ReturnRecord) 

    /**
     * Method setRowHeader
     * 
     * @param index
     * @param vRowHeader
     */
    public void setRowHeader(int index, com.ccssoft.rsas.common.xmlparser.RowHeader vRowHeader)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _rowHeaderList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _rowHeaderList.setElementAt(vRowHeader, index);
    } //-- void setRowHeader(int, com.regaltec.rsas.common.xmlparser.RowHeader) 

    /**
     * Method setRowHeader
     * 
     * @param rowHeaderArray
     */
    public void setRowHeader(com.ccssoft.rsas.common.xmlparser.RowHeader[] rowHeaderArray)
    {
        //-- copy array
        _rowHeaderList.removeAllElements();
        for (int i = 0; i < rowHeaderArray.length; i++) {
            _rowHeaderList.addElement(rowHeaderArray[i]);
        }
    } //-- void setRowHeader(com.regaltec.rsas.common.xmlparser.RowHeader) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReturnRecords) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReturnRecords.class, reader);
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
