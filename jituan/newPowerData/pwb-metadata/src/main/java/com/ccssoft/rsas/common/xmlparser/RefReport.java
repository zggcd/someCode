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
 * ���õı������
 * 
 * @version $Revision$ $Date$
 */
public class RefReport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * Field _reportName
     */
    private java.lang.String _reportName;

    /**
     * �������ñ������
     */
    private java.util.Vector _refObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RefReport() {
        super();
        _refObjectList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.RefReport()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRefObject
     * 
     * @param vRefObject
     */
    public void addRefObject(com.ccssoft.rsas.common.xmlparser.RefObject vRefObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _refObjectList.addElement(vRefObject);
    } //-- void addRefObject(com.regaltec.rsas.common.xmlparser.RefObject) 

    /**
     * Method addRefObject
     * 
     * @param index
     * @param vRefObject
     */
    public void addRefObject(int index, com.ccssoft.rsas.common.xmlparser.RefObject vRefObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _refObjectList.insertElementAt(vRefObject, index);
    } //-- void addRefObject(int, com.regaltec.rsas.common.xmlparser.RefObject) 

    /**
     * Method enumerateRefObject
     */
    public java.util.Enumeration enumerateRefObject()
    {
        return _refObjectList.elements();
    } //-- java.util.Enumeration enumerateRefObject() 

    /**
     * Method getRefObject
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RefObject getRefObject(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refObjectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.RefObject) _refObjectList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.RefObject getRefObject(int) 

    /**
     * Method getRefObject
     */
    public com.ccssoft.rsas.common.xmlparser.RefObject[] getRefObject()
    {
        int size = _refObjectList.size();
        com.ccssoft.rsas.common.xmlparser.RefObject[] mArray = new com.ccssoft.rsas.common.xmlparser.RefObject[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.RefObject) _refObjectList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.RefObject[] getRefObject() 

    /**
     * Method getRefObjectCount
     */
    public int getRefObjectCount()
    {
        return _refObjectList.size();
    } //-- int getRefObjectCount() 

    /**
     * Returns the value of field 'reportID'.
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

    /**
     * Returns the value of field 'reportName'.
     * 
     * @return the value of field 'reportName'.
     */
    public java.lang.String getReportName()
    {
        return this._reportName;
    } //-- java.lang.String getReportName() 

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
     * Method removeAllRefObject
     */
    public void removeAllRefObject()
    {
        _refObjectList.removeAllElements();
    } //-- void removeAllRefObject() 

    /**
     * Method removeRefObject
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RefObject removeRefObject(int index)
    {
        java.lang.Object obj = _refObjectList.elementAt(index);
        _refObjectList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.RefObject) obj;
    } //-- com.regaltec.rsas.common.xmlparser.RefObject removeRefObject(int) 

    /**
     * Method setRefObject
     * 
     * @param index
     * @param vRefObject
     */
    public void setRefObject(int index, com.ccssoft.rsas.common.xmlparser.RefObject vRefObject)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refObjectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _refObjectList.setElementAt(vRefObject, index);
    } //-- void setRefObject(int, com.regaltec.rsas.common.xmlparser.RefObject) 

    /**
     * Method setRefObject
     * 
     * @param refObjectArray
     */
    public void setRefObject(com.ccssoft.rsas.common.xmlparser.RefObject[] refObjectArray)
    {
        //-- copy array
        _refObjectList.removeAllElements();
        for (int i = 0; i < refObjectArray.length; i++) {
            _refObjectList.addElement(refObjectArray[i]);
        }
    } //-- void setRefObject(com.regaltec.rsas.common.xmlparser.RefObject) 

    /**
     * Sets the value of field 'reportID'.
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Sets the value of field 'reportName'.
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(java.lang.String reportName)
    {
        this._reportName = reportName;
    } //-- void setReportName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.RefReport) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.RefReport.class, reader);
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
