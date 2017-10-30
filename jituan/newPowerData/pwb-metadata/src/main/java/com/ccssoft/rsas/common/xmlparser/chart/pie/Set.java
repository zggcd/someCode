/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.pie;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ͼ�����
 * 
 * @version $Revision$ $Date$
 */
public class Set implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����
     */
    private java.lang.String _label;

    /**
     * ֵ
     */
    private java.lang.String _value;

    /**
     * ��Ƭ
     */
    private byte _isSliced;

    /**
     * keeps track of state for field: _isSliced
     */
    private boolean _has_isSliced;

    /**
     * Field _link
     */
    private java.lang.String _link;


      //----------------/
     //- Constructors -/
    //----------------/

    public Set() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.pie.Set()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsSliced
     */
    public void deleteIsSliced()
    {
        this._has_isSliced= false;
    } //-- void deleteIsSliced() 

    /**
     * Returns the value of field 'isSliced'. The field 'isSliced'
     * has the following description: ��Ƭ
     * 
     * @return the value of field 'isSliced'.
     */
    public byte getIsSliced()
    {
        return this._isSliced;
    } //-- byte getIsSliced() 

    /**
     * Returns the value of field 'label'. The field 'label' has
     * the following description: ����
     * 
     * @return the value of field 'label'.
     */
    public java.lang.String getLabel()
    {
        return this._label;
    } //-- java.lang.String getLabel() 

    /**
     * Returns the value of field 'link'.
     * 
     * @return the value of field 'link'.
     */
    public java.lang.String getLink()
    {
        return this._link;
    } //-- java.lang.String getLink() 

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: ֵ
     * 
     * @return the value of field 'value'.
     */
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue() 

    /**
     * Method hasIsSliced
     */
    public boolean hasIsSliced()
    {
        return this._has_isSliced;
    } //-- boolean hasIsSliced() 

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
     * Sets the value of field 'isSliced'. The field 'isSliced' has
     * the following description: ��Ƭ
     * 
     * @param isSliced the value of field 'isSliced'.
     */
    public void setIsSliced(byte isSliced)
    {
        this._isSliced = isSliced;
        this._has_isSliced = true;
    } //-- void setIsSliced(byte) 

    /**
     * Sets the value of field 'label'. The field 'label' has the
     * following description: ����
     * 
     * @param label the value of field 'label'.
     */
    public void setLabel(java.lang.String label)
    {
        this._label = label;
    } //-- void setLabel(java.lang.String) 

    /**
     * Sets the value of field 'link'.
     * 
     * @param link the value of field 'link'.
     */
    public void setLink(java.lang.String link)
    {
        this._link = link;
    } //-- void setLink(java.lang.String) 

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: ֵ
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(java.lang.String value)
    {
        this._value = value;
    } //-- void setValue(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.pie.Set) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.pie.Set.class, reader);
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
