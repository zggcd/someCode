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
 * Class ReportDefines.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDefines implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportDefineList
     */
    private java.util.Vector _reportDefineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportDefines() {
        super();
        _reportDefineList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportDefines()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportDefine
     * 
     * @param vReportDefine
     */
    public void addReportDefine(com.ccssoft.rsas.common.xmlparser.ReportDefine vReportDefine)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportDefineList.addElement(vReportDefine);
    } //-- void addReportDefine(com.regaltec.rsas.common.xmlparser.ReportDefine) 

    /**
     * Method addReportDefine
     * 
     * @param index
     * @param vReportDefine
     */
    public void addReportDefine(int index, com.ccssoft.rsas.common.xmlparser.ReportDefine vReportDefine)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportDefineList.insertElementAt(vReportDefine, index);
    } //-- void addReportDefine(int, com.regaltec.rsas.common.xmlparser.ReportDefine) 

    /**
     * Method enumerateReportDefine
     */
    public java.util.Enumeration enumerateReportDefine()
    {
        return _reportDefineList.elements();
    } //-- java.util.Enumeration enumerateReportDefine() 

    /**
     * Method getReportDefine
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDefine getReportDefine(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportDefineList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportDefine) _reportDefineList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportDefine getReportDefine(int) 

    /**
     * Method getReportDefine
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDefine[] getReportDefine()
    {
        int size = _reportDefineList.size();
        com.ccssoft.rsas.common.xmlparser.ReportDefine[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportDefine[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportDefine) _reportDefineList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDefine[] getReportDefine() 

    /**
     * Method getReportDefineCount
     */
    public int getReportDefineCount()
    {
        return _reportDefineList.size();
    } //-- int getReportDefineCount() 

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
     * Method removeAllReportDefine
     */
    public void removeAllReportDefine()
    {
        _reportDefineList.removeAllElements();
    } //-- void removeAllReportDefine() 

    /**
     * Method removeReportDefine
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDefine removeReportDefine(int index)
    {
        java.lang.Object obj = _reportDefineList.elementAt(index);
        _reportDefineList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportDefine) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDefine removeReportDefine(int) 

    /**
     * Method setReportDefine
     * 
     * @param index
     * @param vReportDefine
     */
    public void setReportDefine(int index, com.ccssoft.rsas.common.xmlparser.ReportDefine vReportDefine)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportDefineList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportDefineList.setElementAt(vReportDefine, index);
    } //-- void setReportDefine(int, com.regaltec.rsas.common.xmlparser.ReportDefine) 

    /**
     * Method setReportDefine
     * 
     * @param reportDefineArray
     */
    public void setReportDefine(com.ccssoft.rsas.common.xmlparser.ReportDefine[] reportDefineArray)
    {
        //-- copy array
        _reportDefineList.removeAllElements();
        for (int i = 0; i < reportDefineArray.length; i++) {
            _reportDefineList.addElement(reportDefineArray[i]);
        }
    } //-- void setReportDefine(com.regaltec.rsas.common.xmlparser.ReportDefine) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportDefines) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportDefines.class, reader);
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
