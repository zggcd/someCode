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
 * Class ReportDocs.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDocs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �����ɱ������
     */
    private java.util.Vector _reportDocList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportDocs() {
        super();
        _reportDocList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportDocs()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportDoc
     * 
     * @param vReportDoc
     */
    public void addReportDoc(com.ccssoft.rsas.common.xmlparser.ReportDoc vReportDoc)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportDocList.addElement(vReportDoc);
    } //-- void addReportDoc(com.regaltec.rsas.common.xmlparser.ReportDoc) 

    /**
     * Method addReportDoc
     * 
     * @param index
     * @param vReportDoc
     */
    public void addReportDoc(int index, com.ccssoft.rsas.common.xmlparser.ReportDoc vReportDoc)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportDocList.insertElementAt(vReportDoc, index);
    } //-- void addReportDoc(int, com.regaltec.rsas.common.xmlparser.ReportDoc) 

    /**
     * Method enumerateReportDoc
     */
    public java.util.Enumeration enumerateReportDoc()
    {
        return _reportDocList.elements();
    } //-- java.util.Enumeration enumerateReportDoc() 

    /**
     * Method getReportDoc
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDoc getReportDoc(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportDocList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportDoc) _reportDocList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportDoc getReportDoc(int) 

    /**
     * Method getReportDoc
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDoc[] getReportDoc()
    {
        int size = _reportDocList.size();
        com.ccssoft.rsas.common.xmlparser.ReportDoc[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportDoc[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportDoc) _reportDocList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDoc[] getReportDoc() 

    /**
     * Method getReportDocCount
     */
    public int getReportDocCount()
    {
        return _reportDocList.size();
    } //-- int getReportDocCount() 

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
     * Method removeAllReportDoc
     */
    public void removeAllReportDoc()
    {
        _reportDocList.removeAllElements();
    } //-- void removeAllReportDoc() 

    /**
     * Method removeReportDoc
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDoc removeReportDoc(int index)
    {
        java.lang.Object obj = _reportDocList.elementAt(index);
        _reportDocList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportDoc) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDoc removeReportDoc(int) 

    /**
     * Method setReportDoc
     * 
     * @param index
     * @param vReportDoc
     */
    public void setReportDoc(int index, com.ccssoft.rsas.common.xmlparser.ReportDoc vReportDoc)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportDocList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportDocList.setElementAt(vReportDoc, index);
    } //-- void setReportDoc(int, com.regaltec.rsas.common.xmlparser.ReportDoc) 

    /**
     * Method setReportDoc
     * 
     * @param reportDocArray
     */
    public void setReportDoc(com.ccssoft.rsas.common.xmlparser.ReportDoc[] reportDocArray)
    {
        //-- copy array
        _reportDocList.removeAllElements();
        for (int i = 0; i < reportDocArray.length; i++) {
            _reportDocList.addElement(reportDocArray[i]);
        }
    } //-- void setReportDoc(com.regaltec.rsas.common.xmlparser.ReportDoc) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportDocs) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportDocs.class, reader);
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
