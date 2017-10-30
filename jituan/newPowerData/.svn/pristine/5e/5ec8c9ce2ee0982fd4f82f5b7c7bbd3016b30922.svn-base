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
 * Class MeasureMembers.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureMembers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ������Ա����
     */
    private java.util.Vector _measureMemberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasureMembers() {
        super();
        _measureMemberList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MeasureMembers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMeasureMember
     * 
     * @param vMeasureMember
     */
    public void addMeasureMember(com.ccssoft.rsas.common.xmlparser.MeasureMember vMeasureMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureMemberList.addElement(vMeasureMember);
    } //-- void addMeasureMember(com.regaltec.rsas.common.xmlparser.MeasureMember) 

    /**
     * Method addMeasureMember
     * 
     * @param index
     * @param vMeasureMember
     */
    public void addMeasureMember(int index, com.ccssoft.rsas.common.xmlparser.MeasureMember vMeasureMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureMemberList.insertElementAt(vMeasureMember, index);
    } //-- void addMeasureMember(int, com.regaltec.rsas.common.xmlparser.MeasureMember) 

    /**
     * Method enumerateMeasureMember
     */
    public java.util.Enumeration enumerateMeasureMember()
    {
        return _measureMemberList.elements();
    } //-- java.util.Enumeration enumerateMeasureMember() 

    /**
     * Method getMeasureMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureMember getMeasureMember(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MeasureMember) _measureMemberList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MeasureMember getMeasureMember(int) 

    /**
     * Method getMeasureMember
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureMember[] getMeasureMember()
    {
        int size = _measureMemberList.size();
        com.ccssoft.rsas.common.xmlparser.MeasureMember[] mArray = new com.ccssoft.rsas.common.xmlparser.MeasureMember[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MeasureMember) _measureMemberList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureMember[] getMeasureMember() 

    /**
     * Method getMeasureMemberCount
     */
    public int getMeasureMemberCount()
    {
        return _measureMemberList.size();
    } //-- int getMeasureMemberCount() 

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
     * Method removeAllMeasureMember
     */
    public void removeAllMeasureMember()
    {
        _measureMemberList.removeAllElements();
    } //-- void removeAllMeasureMember() 

    /**
     * Method removeMeasureMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureMember removeMeasureMember(int index)
    {
        java.lang.Object obj = _measureMemberList.elementAt(index);
        _measureMemberList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MeasureMember) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureMember removeMeasureMember(int) 

    /**
     * Method setMeasureMember
     * 
     * @param index
     * @param vMeasureMember
     */
    public void setMeasureMember(int index, com.ccssoft.rsas.common.xmlparser.MeasureMember vMeasureMember)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _measureMemberList.setElementAt(vMeasureMember, index);
    } //-- void setMeasureMember(int, com.regaltec.rsas.common.xmlparser.MeasureMember) 

    /**
     * Method setMeasureMember
     * 
     * @param measureMemberArray
     */
    public void setMeasureMember(com.ccssoft.rsas.common.xmlparser.MeasureMember[] measureMemberArray)
    {
        //-- copy array
        _measureMemberList.removeAllElements();
        for (int i = 0; i < measureMemberArray.length; i++) {
            _measureMemberList.addElement(measureMemberArray[i]);
        }
    } //-- void setMeasureMember(com.regaltec.rsas.common.xmlparser.MeasureMember) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MeasureMembers) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MeasureMembers.class, reader);
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
