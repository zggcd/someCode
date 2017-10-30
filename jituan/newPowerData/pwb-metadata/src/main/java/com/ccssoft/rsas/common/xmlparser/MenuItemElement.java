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

import com.ccssoft.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType;

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
 * ģ��Ԫ�ض���
 * 
 * @version $Revision$ $Date$
 */
public class MenuItemElement implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Ԫ�ر���
     */
    private java.lang.String _elementCode;

    /**
     * �Ƿ�Ȩ�޿���
     */
    private java.lang.Object _isRightControl;

    /**
     * Ȩ�޿��Ʒ�ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType _rightControlType;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;


      //----------------/
     //- Constructors -/
    //----------------/

    public MenuItemElement() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.MenuItemElement()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'elementCode'. The field
     * 'elementCode' has the following description: Ԫ�ر���
     * 
     * @return the value of field 'elementCode'.
     */
    public java.lang.String getElementCode()
    {
        return this._elementCode;
    } //-- java.lang.String getElementCode() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'isRightControl'. The field
     * 'isRightControl' has the following description: �Ƿ�Ȩ�޿���
     * 
     * @return the value of field 'isRightControl'.
     */
    public java.lang.Object getIsRightControl()
    {
        return this._isRightControl;
    } //-- java.lang.Object getIsRightControl() 

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
     * Returns the value of field 'rightControlType'. The field
     * 'rightControlType' has the following description: Ȩ�޿��Ʒ�ʽ
     * 
     * @return the value of field 'rightControlType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType getRightControlType()
    {
        return this._rightControlType;
    } //-- com.regaltec.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType getRightControlType() 

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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'elementCode'. The field
     * 'elementCode' has the following description: Ԫ�ر���
     * 
     * @param elementCode the value of field 'elementCode'.
     */
    public void setElementCode(java.lang.String elementCode)
    {
        this._elementCode = elementCode;
    } //-- void setElementCode(java.lang.String) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'isRightControl'. The field
     * 'isRightControl' has the following description: �Ƿ�Ȩ�޿���
     * 
     * @param isRightControl the value of field 'isRightControl'.
     */
    public void setIsRightControl(java.lang.Object isRightControl)
    {
        this._isRightControl = isRightControl;
    } //-- void setIsRightControl(java.lang.Object) 

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
     * Sets the value of field 'rightControlType'. The field
     * 'rightControlType' has the following description: Ȩ�޿��Ʒ�ʽ
     * 
     * @param rightControlType the value of field 'rightControlType'
     */
    public void setRightControlType(com.ccssoft.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType rightControlType)
    {
        this._rightControlType = rightControlType;
    } //-- void setRightControlType(com.regaltec.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MenuItemElement) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MenuItemElement.class, reader);
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
