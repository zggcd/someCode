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
 * �ϱ����ݱ���ֶμ���
 * 
 * @version $Revision$ $Date$
 */
public class ReportFields implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ϱ����ݱ���ֶ�
     */
    private java.util.Vector _reportFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportFields() {
        super();
        _reportFieldList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportFields()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportField
     * 
     * @param vReportField
     */
    public void addReportField(com.ccssoft.rsas.common.xmlparser.ReportField vReportField)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportFieldList.addElement(vReportField);
    } //-- void addReportField(com.regaltec.rsas.common.xmlparser.ReportField) 

    /**
     * Method addReportField
     * 
     * @param index
     * @param vReportField
     */
    public void addReportField(int index, com.ccssoft.rsas.common.xmlparser.ReportField vReportField)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportFieldList.insertElementAt(vReportField, index);
    } //-- void addReportField(int, com.regaltec.rsas.common.xmlparser.ReportField) 

    /**
     * Method enumerateReportField
     */
    public java.util.Enumeration enumerateReportField()
    {
        return _reportFieldList.elements();
    } //-- java.util.Enumeration enumerateReportField() 

    /**
     * Method getReportField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportField getReportField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportField) _reportFieldList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportField getReportField(int) 

    /**
     * Method getReportField
     */
    public com.ccssoft.rsas.common.xmlparser.ReportField[] getReportField()
    {
        int size = _reportFieldList.size();
        com.ccssoft.rsas.common.xmlparser.ReportField[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportField[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportField) _reportFieldList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportField[] getReportField() 

    /**
     * Method getReportFieldCount
     */
    public int getReportFieldCount()
    {
        return _reportFieldList.size();
    } //-- int getReportFieldCount() 

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
     * Method removeAllReportField
     */
    public void removeAllReportField()
    {
        _reportFieldList.removeAllElements();
    } //-- void removeAllReportField() 

    /**
     * Method removeReportField
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportField removeReportField(int index)
    {
        java.lang.Object obj = _reportFieldList.elementAt(index);
        _reportFieldList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportField) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportField removeReportField(int) 

    /**
     * Method setReportField
     * 
     * @param index
     * @param vReportField
     */
    public void setReportField(int index, com.ccssoft.rsas.common.xmlparser.ReportField vReportField)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportFieldList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportFieldList.setElementAt(vReportField, index);
    } //-- void setReportField(int, com.regaltec.rsas.common.xmlparser.ReportField) 

    /**
     * Method setReportField
     * 
     * @param reportFieldArray
     */
    public void setReportField(com.ccssoft.rsas.common.xmlparser.ReportField[] reportFieldArray)
    {
        //-- copy array
        _reportFieldList.removeAllElements();
        for (int i = 0; i < reportFieldArray.length; i++) {
            _reportFieldList.addElement(reportFieldArray[i]);
        }
    } //-- void setReportField(com.regaltec.rsas.common.xmlparser.ReportField) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportFields) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportFields.class, reader);
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
