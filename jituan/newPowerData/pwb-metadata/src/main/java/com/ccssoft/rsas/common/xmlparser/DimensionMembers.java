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
 * Class DimensionMembers.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionMembers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ά��Ա����
     */
    private java.util.Vector _dimensionMemberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimensionMembers() {
        super();
        _dimensionMemberList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimensionMembers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimensionMember
     * 
     * @param vDimensionMember
     */
    public void addDimensionMember(com.ccssoft.rsas.common.xmlparser.DimensionMember vDimensionMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionMemberList.addElement(vDimensionMember);
    } //-- void addDimensionMember(com.regaltec.rsas.common.xmlparser.DimensionMember) 

    /**
     * Method addDimensionMember
     * 
     * @param index
     * @param vDimensionMember
     */
    public void addDimensionMember(int index, com.ccssoft.rsas.common.xmlparser.DimensionMember vDimensionMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionMemberList.insertElementAt(vDimensionMember, index);
    } //-- void addDimensionMember(int, com.regaltec.rsas.common.xmlparser.DimensionMember) 

    /**
     * Method enumerateDimensionMember
     */
    public java.util.Enumeration enumerateDimensionMember()
    {
        return _dimensionMemberList.elements();
    } //-- java.util.Enumeration enumerateDimensionMember() 

    /**
     * Method getDimensionMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionMember getDimensionMember(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimensionMember) _dimensionMemberList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimensionMember getDimensionMember(int) 

    /**
     * Method getDimensionMember
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionMember[] getDimensionMember()
    {
        int size = _dimensionMemberList.size();
        com.ccssoft.rsas.common.xmlparser.DimensionMember[] mArray = new com.ccssoft.rsas.common.xmlparser.DimensionMember[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimensionMember) _dimensionMemberList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimensionMember[] getDimensionMember() 

    /**
     * Method getDimensionMemberCount
     */
    public int getDimensionMemberCount()
    {
        return _dimensionMemberList.size();
    } //-- int getDimensionMemberCount() 

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
     * Method removeAllDimensionMember
     */
    public void removeAllDimensionMember()
    {
        _dimensionMemberList.removeAllElements();
    } //-- void removeAllDimensionMember() 

    /**
     * Method removeDimensionMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionMember removeDimensionMember(int index)
    {
        java.lang.Object obj = _dimensionMemberList.elementAt(index);
        _dimensionMemberList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimensionMember) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimensionMember removeDimensionMember(int) 

    /**
     * Method setDimensionMember
     * 
     * @param index
     * @param vDimensionMember
     */
    public void setDimensionMember(int index, com.ccssoft.rsas.common.xmlparser.DimensionMember vDimensionMember)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimensionMemberList.setElementAt(vDimensionMember, index);
    } //-- void setDimensionMember(int, com.regaltec.rsas.common.xmlparser.DimensionMember) 

    /**
     * Method setDimensionMember
     * 
     * @param dimensionMemberArray
     */
    public void setDimensionMember(com.ccssoft.rsas.common.xmlparser.DimensionMember[] dimensionMemberArray)
    {
        //-- copy array
        _dimensionMemberList.removeAllElements();
        for (int i = 0; i < dimensionMemberArray.length; i++) {
            _dimensionMemberList.addElement(dimensionMemberArray[i]);
        }
    } //-- void setDimensionMember(com.regaltec.rsas.common.xmlparser.DimensionMember) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimensionMembers) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimensionMembers.class, reader);
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
