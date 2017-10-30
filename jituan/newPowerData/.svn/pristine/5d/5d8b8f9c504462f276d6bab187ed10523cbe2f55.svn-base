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
 * Class MeasureTable.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureTable implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _factTableName
     */
    private java.lang.String _factTableName;

    /**
     * Field _factTableCaption
     */
    private java.lang.String _factTableCaption;

    /**
     * Field _linkID
     */
    private java.lang.String _linkID;

    /**
     * ��������
     */
    private java.util.Vector _measureList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasureTable() {
        super();
        _measureList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MeasureTable()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMeasure
     * 
     * @param vMeasure
     */
    public void addMeasure(com.ccssoft.rsas.common.xmlparser.Measure vMeasure)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureList.addElement(vMeasure);
    } //-- void addMeasure(com.regaltec.rsas.common.xmlparser.Measure) 

    /**
     * Method addMeasure
     * 
     * @param index
     * @param vMeasure
     */
    public void addMeasure(int index, com.ccssoft.rsas.common.xmlparser.Measure vMeasure)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureList.insertElementAt(vMeasure, index);
    } //-- void addMeasure(int, com.regaltec.rsas.common.xmlparser.Measure) 

    /**
     * Method enumerateMeasure
     */
    public java.util.Enumeration enumerateMeasure()
    {
        return _measureList.elements();
    } //-- java.util.Enumeration enumerateMeasure() 

    /**
     * Returns the value of field 'factTableCaption'.
     * 
     * @return the value of field 'factTableCaption'.
     */
    public java.lang.String getFactTableCaption()
    {
        return this._factTableCaption;
    } //-- java.lang.String getFactTableCaption() 

    /**
     * Returns the value of field 'factTableName'.
     * 
     * @return the value of field 'factTableName'.
     */
    public java.lang.String getFactTableName()
    {
        return this._factTableName;
    } //-- java.lang.String getFactTableName() 

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
     * Method getMeasure
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Measure getMeasure(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Measure) _measureList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Measure getMeasure(int) 

    /**
     * Method getMeasure
     */
    public com.ccssoft.rsas.common.xmlparser.Measure[] getMeasure()
    {
        int size = _measureList.size();
        com.ccssoft.rsas.common.xmlparser.Measure[] mArray = new com.ccssoft.rsas.common.xmlparser.Measure[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Measure) _measureList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Measure[] getMeasure() 

    /**
     * Method getMeasureCount
     */
    public int getMeasureCount()
    {
        return _measureList.size();
    } //-- int getMeasureCount() 

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
     * Method removeAllMeasure
     */
    public void removeAllMeasure()
    {
        _measureList.removeAllElements();
    } //-- void removeAllMeasure() 

    /**
     * Method removeMeasure
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Measure removeMeasure(int index)
    {
        java.lang.Object obj = _measureList.elementAt(index);
        _measureList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Measure) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Measure removeMeasure(int) 

    /**
     * Sets the value of field 'factTableCaption'.
     * 
     * @param factTableCaption the value of field 'factTableCaption'
     */
    public void setFactTableCaption(java.lang.String factTableCaption)
    {
        this._factTableCaption = factTableCaption;
    } //-- void setFactTableCaption(java.lang.String) 

    /**
     * Sets the value of field 'factTableName'.
     * 
     * @param factTableName the value of field 'factTableName'.
     */
    public void setFactTableName(java.lang.String factTableName)
    {
        this._factTableName = factTableName;
    } //-- void setFactTableName(java.lang.String) 

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
     * Method setMeasure
     * 
     * @param index
     * @param vMeasure
     */
    public void setMeasure(int index, com.ccssoft.rsas.common.xmlparser.Measure vMeasure)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _measureList.setElementAt(vMeasure, index);
    } //-- void setMeasure(int, com.regaltec.rsas.common.xmlparser.Measure) 

    /**
     * Method setMeasure
     * 
     * @param measureArray
     */
    public void setMeasure(com.ccssoft.rsas.common.xmlparser.Measure[] measureArray)
    {
        //-- copy array
        _measureList.removeAllElements();
        for (int i = 0; i < measureArray.length; i++) {
            _measureList.addElement(measureArray[i]);
        }
    } //-- void setMeasure(com.regaltec.rsas.common.xmlparser.Measure) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MeasureTable) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MeasureTable.class, reader);
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
