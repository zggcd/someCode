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
 * ��(��ѡ��)Ȩ��
 * 
 * @version $Revision$ $Date$
 */
public class DimItemPermission implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * ��ѡ��ID
     */
    private java.util.Vector _dimItemIDList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimItemPermission() {
        super();
        _dimItemIDList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermission()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimItemID
     * 
     * @param vDimItemID
     */
    public void addDimItemID(java.lang.String vDimItemID)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemIDList.addElement(vDimItemID);
    } //-- void addDimItemID(java.lang.String) 

    /**
     * Method addDimItemID
     * 
     * @param index
     * @param vDimItemID
     */
    public void addDimItemID(int index, java.lang.String vDimItemID)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemIDList.insertElementAt(vDimItemID, index);
    } //-- void addDimItemID(int, java.lang.String) 

    /**
     * Method enumerateDimItemID
     */
    public java.util.Enumeration enumerateDimItemID()
    {
        return _dimItemIDList.elements();
    } //-- java.util.Enumeration enumerateDimItemID() 

    /**
     * Method getDimItemID
     * 
     * @param index
     */
    public java.lang.String getDimItemID(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemIDList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_dimItemIDList.elementAt(index);
    } //-- java.lang.String getDimItemID(int) 

    /**
     * Method getDimItemID
     */
    public java.lang.String[] getDimItemID()
    {
        int size = _dimItemIDList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_dimItemIDList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getDimItemID() 

    /**
     * Method getDimItemIDCount
     */
    public int getDimItemIDCount()
    {
        return _dimItemIDList.size();
    } //-- int getDimItemIDCount() 

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
     * Method removeAllDimItemID
     */
    public void removeAllDimItemID()
    {
        _dimItemIDList.removeAllElements();
    } //-- void removeAllDimItemID() 

    /**
     * Method removeDimItemID
     * 
     * @param index
     */
    public java.lang.String removeDimItemID(int index)
    {
        java.lang.Object obj = _dimItemIDList.elementAt(index);
        _dimItemIDList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeDimItemID(int) 

    /**
     * Method setDimItemID
     * 
     * @param index
     * @param vDimItemID
     */
    public void setDimItemID(int index, java.lang.String vDimItemID)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemIDList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimItemIDList.setElementAt(vDimItemID, index);
    } //-- void setDimItemID(int, java.lang.String) 

    /**
     * Method setDimItemID
     * 
     * @param dimItemIDArray
     */
    public void setDimItemID(java.lang.String[] dimItemIDArray)
    {
        //-- copy array
        _dimItemIDList.removeAllElements();
        for (int i = 0; i < dimItemIDArray.length; i++) {
            _dimItemIDList.addElement(dimItemIDArray[i]);
        }
    } //-- void setDimItemID(java.lang.String) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimItemPermission) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimItemPermission.class, reader);
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
