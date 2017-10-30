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

import com.ccssoft.rsas.common.xmlparser.types.WarningLevelColorAreaType;

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
 * ���漶������
 * 
 * @version $Revision$ $Date$
 */
public class WarningLevel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ǰ���漶�������ʾ����ɫ
     */
    private long _warningColor;

    /**
     * keeps track of state for field: _warningColor
     */
    private boolean _has_warningColor;

    /**
     * ��ɫ�������а�������ǰ���塢��ǰ���ӱ�������ǰ�������Լ���ǰ�б���
     */
    private com.ccssoft.rsas.common.xmlparser.types.WarningLevelColorAreaType _colorArea;

    /**
     * ���漶��
     */
    private int _warningClass;

    /**
     * keeps track of state for field: _warningClass
     */
    private boolean _has_warningClass;

    /**
     * Field _isShowImage
     */
    private short _isShowImage;

    /**
     * keeps track of state for field: _isShowImage
     */
    private boolean _has_isShowImage;

    /**
     * Field _imageFile
     */
    private java.lang.String _imageFile;

    /**
     * Field _imageName
     */
    private java.lang.String _imageName;

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

    /**
     * ���淧ֵ��ά�����
     */
    private com.ccssoft.rsas.common.xmlparser.WarningCombos _warningCombos;


      //----------------/
     //- Constructors -/
    //----------------/

    public WarningLevel() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevel()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsShowImage
     */
    public void deleteIsShowImage()
    {
        this._has_isShowImage= false;
    } //-- void deleteIsShowImage() 

    /**
     * Method deleteWarningClass
     */
    public void deleteWarningClass()
    {
        this._has_warningClass= false;
    } //-- void deleteWarningClass() 

    /**
     * Method deleteWarningColor
     */
    public void deleteWarningColor()
    {
        this._has_warningColor= false;
    } //-- void deleteWarningColor() 

    /**
     * Returns the value of field 'colorArea'. The field
     * 'colorArea' has the following description:
     * ��ɫ�������а�������ǰ���塢��ǰ���ӱ�������ǰ�������Լ���ǰ�б���
     * 
     * @return the value of field 'colorArea'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.WarningLevelColorAreaType getColorArea()
    {
        return this._colorArea;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningLevelColorAreaType getColorArea() 

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
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'imageFile'.
     * 
     * @return the value of field 'imageFile'.
     */
    public java.lang.String getImageFile()
    {
        return this._imageFile;
    } //-- java.lang.String getImageFile() 

    /**
     * Returns the value of field 'imageName'.
     * 
     * @return the value of field 'imageName'.
     */
    public java.lang.String getImageName()
    {
        return this._imageName;
    } //-- java.lang.String getImageName() 

    /**
     * Returns the value of field 'isShowImage'.
     * 
     * @return the value of field 'isShowImage'.
     */
    public short getIsShowImage()
    {
        return this._isShowImage;
    } //-- short getIsShowImage() 

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
     * Returns the value of field 'warningClass'. The field
     * 'warningClass' has the following description: ���漶��
     * 
     * @return the value of field 'warningClass'.
     */
    public int getWarningClass()
    {
        return this._warningClass;
    } //-- int getWarningClass() 

    /**
     * Returns the value of field 'warningColor'. The field
     * 'warningColor' has the following description: ��ǰ���漶�������ʾ����ɫ
     * 
     * @return the value of field 'warningColor'.
     */
    public long getWarningColor()
    {
        return this._warningColor;
    } //-- long getWarningColor() 

    /**
     * Returns the value of field 'warningCombos'. The field
     * 'warningCombos' has the following description: ���淧ֵ��ά�����
     * 
     * @return the value of field 'warningCombos'.
     */
    public com.ccssoft.rsas.common.xmlparser.WarningCombos getWarningCombos()
    {
        return this._warningCombos;
    } //-- com.regaltec.rsas.common.xmlparser.WarningCombos getWarningCombos() 

    /**
     * Method hasIsShowImage
     */
    public boolean hasIsShowImage()
    {
        return this._has_isShowImage;
    } //-- boolean hasIsShowImage() 

    /**
     * Method hasWarningClass
     */
    public boolean hasWarningClass()
    {
        return this._has_warningClass;
    } //-- boolean hasWarningClass() 

    /**
     * Method hasWarningColor
     */
    public boolean hasWarningColor()
    {
        return this._has_warningColor;
    } //-- boolean hasWarningColor() 

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
     * Sets the value of field 'colorArea'. The field 'colorArea'
     * has the following description:
     * ��ɫ�������а�������ǰ���塢��ǰ���ӱ�������ǰ�������Լ���ǰ�б���
     * 
     * @param colorArea the value of field 'colorArea'.
     */
    public void setColorArea(com.ccssoft.rsas.common.xmlparser.types.WarningLevelColorAreaType colorArea)
    {
        this._colorArea = colorArea;
    } //-- void setColorArea(com.regaltec.rsas.common.xmlparser.types.WarningLevelColorAreaType) 

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
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'imageFile'.
     * 
     * @param imageFile the value of field 'imageFile'.
     */
    public void setImageFile(java.lang.String imageFile)
    {
        this._imageFile = imageFile;
    } //-- void setImageFile(java.lang.String) 

    /**
     * Sets the value of field 'imageName'.
     * 
     * @param imageName the value of field 'imageName'.
     */
    public void setImageName(java.lang.String imageName)
    {
        this._imageName = imageName;
    } //-- void setImageName(java.lang.String) 

    /**
     * Sets the value of field 'isShowImage'.
     * 
     * @param isShowImage the value of field 'isShowImage'.
     */
    public void setIsShowImage(short isShowImage)
    {
        this._isShowImage = isShowImage;
        this._has_isShowImage = true;
    } //-- void setIsShowImage(short) 

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
     * Sets the value of field 'warningClass'. The field
     * 'warningClass' has the following description: ���漶��
     * 
     * @param warningClass the value of field 'warningClass'.
     */
    public void setWarningClass(int warningClass)
    {
        this._warningClass = warningClass;
        this._has_warningClass = true;
    } //-- void setWarningClass(int) 

    /**
     * Sets the value of field 'warningColor'. The field
     * 'warningColor' has the following description: ��ǰ���漶�������ʾ����ɫ
     * 
     * @param warningColor the value of field 'warningColor'.
     */
    public void setWarningColor(long warningColor)
    {
        this._warningColor = warningColor;
        this._has_warningColor = true;
    } //-- void setWarningColor(long) 

    /**
     * Sets the value of field 'warningCombos'. The field
     * 'warningCombos' has the following description: ���淧ֵ��ά�����
     * 
     * @param warningCombos the value of field 'warningCombos'.
     */
    public void setWarningCombos(com.ccssoft.rsas.common.xmlparser.WarningCombos warningCombos)
    {
        this._warningCombos = warningCombos;
    } //-- void setWarningCombos(com.regaltec.rsas.common.xmlparser.WarningCombos) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.WarningLevel) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.WarningLevel.class, reader);
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
