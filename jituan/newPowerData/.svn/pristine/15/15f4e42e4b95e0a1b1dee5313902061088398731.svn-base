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

import com.ccssoft.rsas.common.xmlparser.types.DimHeaderAreaType;

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
 * Class DimHeader.
 * 
 * @version $Revision$ $Date$
 */
public class DimHeader implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _caption
     */
    private java.lang.String _caption;

    /**
     * Field _area
     */
    private com.ccssoft.rsas.common.xmlparser.types.DimHeaderAreaType _area;

    /**
     * Field _dimMemberList
     */
    private java.util.Vector _dimMemberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimHeader() {
        super();
        _dimMemberList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimHeader()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimMember
     * 
     * @param vDimMember
     */
    public void addDimMember(com.ccssoft.rsas.common.xmlparser.DimMember vDimMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimMemberList.addElement(vDimMember);
    } //-- void addDimMember(com.regaltec.rsas.common.xmlparser.DimMember) 

    /**
     * Method addDimMember
     * 
     * @param index
     * @param vDimMember
     */
    public void addDimMember(int index, com.ccssoft.rsas.common.xmlparser.DimMember vDimMember)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimMemberList.insertElementAt(vDimMember, index);
    } //-- void addDimMember(int, com.regaltec.rsas.common.xmlparser.DimMember) 

    /**
     * Method enumerateDimMember
     */
    public java.util.Enumeration enumerateDimMember()
    {
        return _dimMemberList.elements();
    } //-- java.util.Enumeration enumerateDimMember() 

    /**
     * Returns the value of field 'area'.
     * 
     * @return the value of field 'area'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DimHeaderAreaType getArea()
    {
        return this._area;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimHeaderAreaType getArea() 

    /**
     * Returns the value of field 'caption'.
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Method getDimMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimMember getDimMember(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimMember) _dimMemberList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimMember getDimMember(int) 

    /**
     * Method getDimMember
     */
    public com.ccssoft.rsas.common.xmlparser.DimMember[] getDimMember()
    {
        int size = _dimMemberList.size();
        com.ccssoft.rsas.common.xmlparser.DimMember[] mArray = new com.ccssoft.rsas.common.xmlparser.DimMember[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimMember) _dimMemberList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimMember[] getDimMember() 

    /**
     * Method getDimMemberCount
     */
    public int getDimMemberCount()
    {
        return _dimMemberList.size();
    } //-- int getDimMemberCount() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

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
     * Method removeAllDimMember
     */
    public void removeAllDimMember()
    {
        _dimMemberList.removeAllElements();
    } //-- void removeAllDimMember() 

    /**
     * Method removeDimMember
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimMember removeDimMember(int index)
    {
        java.lang.Object obj = _dimMemberList.elementAt(index);
        _dimMemberList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimMember) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimMember removeDimMember(int) 

    /**
     * Sets the value of field 'area'.
     * 
     * @param area the value of field 'area'.
     */
    public void setArea(com.ccssoft.rsas.common.xmlparser.types.DimHeaderAreaType area)
    {
        this._area = area;
    } //-- void setArea(com.regaltec.rsas.common.xmlparser.types.DimHeaderAreaType) 

    /**
     * Sets the value of field 'caption'.
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Method setDimMember
     * 
     * @param index
     * @param vDimMember
     */
    public void setDimMember(int index, com.ccssoft.rsas.common.xmlparser.DimMember vDimMember)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimMemberList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimMemberList.setElementAt(vDimMember, index);
    } //-- void setDimMember(int, com.regaltec.rsas.common.xmlparser.DimMember) 

    /**
     * Method setDimMember
     * 
     * @param dimMemberArray
     */
    public void setDimMember(com.ccssoft.rsas.common.xmlparser.DimMember[] dimMemberArray)
    {
        //-- copy array
        _dimMemberList.removeAllElements();
        for (int i = 0; i < dimMemberArray.length; i++) {
            _dimMemberList.addElement(dimMemberArray[i]);
        }
    } //-- void setDimMember(com.regaltec.rsas.common.xmlparser.DimMember) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimHeader) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimHeader.class, reader);
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
