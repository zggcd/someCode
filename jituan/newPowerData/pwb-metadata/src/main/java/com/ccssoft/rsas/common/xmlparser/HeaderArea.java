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

import com.ccssoft.rsas.common.xmlparser.types.DataCellAreaFontCharsetType;

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
 * ���������������ݸ�ʽ
 * 
 * @version $Revision$ $Date$
 */
public class HeaderArea implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ɫ
     */
    private int _backgroundColor;

    /**
     * keeps track of state for field: _backgroundColor
     */
    private boolean _has_backgroundColor;

    /**
     * Field _fontName
     */
    private java.lang.String _fontName;

    /**
     * Field _fontSize
     */
    private int _fontSize;

    /**
     * keeps track of state for field: _fontSize
     */
    private boolean _has_fontSize;

    /**
     * Field _fontColor
     */
    private int _fontColor;

    /**
     * keeps track of state for field: _fontColor
     */
    private boolean _has_fontColor;

    /**
     * ��Ϊ�������� Bold:���� Italic:б�� Underline:�»��� StrikeOut:ɾ����
     */
    private java.lang.String _fontStyle;

    /**
     * Field _fontCharset
     */
    private com.ccssoft.rsas.common.xmlparser.types.DataCellAreaFontCharsetType _fontCharset;

    /**
     * Field _backgroundColorsList
     */
    private java.util.Vector _backgroundColorsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HeaderArea() {
        super();
        _backgroundColorsList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.HeaderArea()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addBackgroundColors
     * 
     * @param vBackgroundColors
     */
    public void addBackgroundColors(com.ccssoft.rsas.common.xmlparser.BackgroundColors vBackgroundColors)
        throws java.lang.IndexOutOfBoundsException
    {
        _backgroundColorsList.addElement(vBackgroundColors);
    } //-- void addBackgroundColors(com.regaltec.rsas.common.xmlparser.BackgroundColors) 

    /**
     * Method addBackgroundColors
     * 
     * @param index
     * @param vBackgroundColors
     */
    public void addBackgroundColors(int index, com.ccssoft.rsas.common.xmlparser.BackgroundColors vBackgroundColors)
        throws java.lang.IndexOutOfBoundsException
    {
        _backgroundColorsList.insertElementAt(vBackgroundColors, index);
    } //-- void addBackgroundColors(int, com.regaltec.rsas.common.xmlparser.BackgroundColors) 

    /**
     * Method deleteBackgroundColor
     */
    public void deleteBackgroundColor()
    {
        this._has_backgroundColor= false;
    } //-- void deleteBackgroundColor() 

    /**
     * Method deleteFontColor
     */
    public void deleteFontColor()
    {
        this._has_fontColor= false;
    } //-- void deleteFontColor() 

    /**
     * Method deleteFontSize
     */
    public void deleteFontSize()
    {
        this._has_fontSize= false;
    } //-- void deleteFontSize() 

    /**
     * Method enumerateBackgroundColors
     */
    public java.util.Enumeration enumerateBackgroundColors()
    {
        return _backgroundColorsList.elements();
    } //-- java.util.Enumeration enumerateBackgroundColors() 

    /**
     * Returns the value of field 'backgroundColor'. The field
     * 'backgroundColor' has the following description: ����ɫ
     * 
     * @return the value of field 'backgroundColor'.
     */
    public int getBackgroundColor()
    {
        return this._backgroundColor;
    } //-- int getBackgroundColor() 

    /**
     * Method getBackgroundColors
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.BackgroundColors getBackgroundColors(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _backgroundColorsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.BackgroundColors) _backgroundColorsList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.BackgroundColors getBackgroundColors(int) 

    /**
     * Method getBackgroundColors
     */
    public com.ccssoft.rsas.common.xmlparser.BackgroundColors[] getBackgroundColors()
    {
        int size = _backgroundColorsList.size();
        com.ccssoft.rsas.common.xmlparser.BackgroundColors[] mArray = new com.ccssoft.rsas.common.xmlparser.BackgroundColors[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.BackgroundColors) _backgroundColorsList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.BackgroundColors[] getBackgroundColors() 

    /**
     * Method getBackgroundColorsCount
     */
    public int getBackgroundColorsCount()
    {
        return _backgroundColorsList.size();
    } //-- int getBackgroundColorsCount() 

    /**
     * Returns the value of field 'fontCharset'.
     * 
     * @return the value of field 'fontCharset'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DataCellAreaFontCharsetType getFontCharset()
    {
        return this._fontCharset;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataCellAreaFontCharsetType getFontCharset() 

    /**
     * Returns the value of field 'fontColor'.
     * 
     * @return the value of field 'fontColor'.
     */
    public int getFontColor()
    {
        return this._fontColor;
    } //-- int getFontColor() 

    /**
     * Returns the value of field 'fontName'.
     * 
     * @return the value of field 'fontName'.
     */
    public java.lang.String getFontName()
    {
        return this._fontName;
    } //-- java.lang.String getFontName() 

    /**
     * Returns the value of field 'fontSize'.
     * 
     * @return the value of field 'fontSize'.
     */
    public int getFontSize()
    {
        return this._fontSize;
    } //-- int getFontSize() 

    /**
     * Returns the value of field 'fontStyle'. The field
     * 'fontStyle' has the following description: ��Ϊ�������� Bold:����
     * Italic:б�� Underline:�»��� StrikeOut:ɾ����
     * 
     * @return the value of field 'fontStyle'.
     */
    public java.lang.String getFontStyle()
    {
        return this._fontStyle;
    } //-- java.lang.String getFontStyle() 

    /**
     * Method hasBackgroundColor
     */
    public boolean hasBackgroundColor()
    {
        return this._has_backgroundColor;
    } //-- boolean hasBackgroundColor() 

    /**
     * Method hasFontColor
     */
    public boolean hasFontColor()
    {
        return this._has_fontColor;
    } //-- boolean hasFontColor() 

    /**
     * Method hasFontSize
     */
    public boolean hasFontSize()
    {
        return this._has_fontSize;
    } //-- boolean hasFontSize() 

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
     * Method removeAllBackgroundColors
     */
    public void removeAllBackgroundColors()
    {
        _backgroundColorsList.removeAllElements();
    } //-- void removeAllBackgroundColors() 

    /**
     * Method removeBackgroundColors
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.BackgroundColors removeBackgroundColors(int index)
    {
        java.lang.Object obj = _backgroundColorsList.elementAt(index);
        _backgroundColorsList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.BackgroundColors) obj;
    } //-- com.regaltec.rsas.common.xmlparser.BackgroundColors removeBackgroundColors(int) 

    /**
     * Sets the value of field 'backgroundColor'. The field
     * 'backgroundColor' has the following description: ����ɫ
     * 
     * @param backgroundColor the value of field 'backgroundColor'.
     */
    public void setBackgroundColor(int backgroundColor)
    {
        this._backgroundColor = backgroundColor;
        this._has_backgroundColor = true;
    } //-- void setBackgroundColor(int) 

    /**
     * Method setBackgroundColors
     * 
     * @param index
     * @param vBackgroundColors
     */
    public void setBackgroundColors(int index, com.ccssoft.rsas.common.xmlparser.BackgroundColors vBackgroundColors)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _backgroundColorsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _backgroundColorsList.setElementAt(vBackgroundColors, index);
    } //-- void setBackgroundColors(int, com.regaltec.rsas.common.xmlparser.BackgroundColors) 

    /**
     * Method setBackgroundColors
     * 
     * @param backgroundColorsArray
     */
    public void setBackgroundColors(com.ccssoft.rsas.common.xmlparser.BackgroundColors[] backgroundColorsArray)
    {
        //-- copy array
        _backgroundColorsList.removeAllElements();
        for (int i = 0; i < backgroundColorsArray.length; i++) {
            _backgroundColorsList.addElement(backgroundColorsArray[i]);
        }
    } //-- void setBackgroundColors(com.regaltec.rsas.common.xmlparser.BackgroundColors) 

    /**
     * Sets the value of field 'fontCharset'.
     * 
     * @param fontCharset the value of field 'fontCharset'.
     */
    public void setFontCharset(com.ccssoft.rsas.common.xmlparser.types.DataCellAreaFontCharsetType fontCharset)
    {
        this._fontCharset = fontCharset;
    } //-- void setFontCharset(com.regaltec.rsas.common.xmlparser.types.DataCellAreaFontCharsetType) 

    /**
     * Sets the value of field 'fontColor'.
     * 
     * @param fontColor the value of field 'fontColor'.
     */
    public void setFontColor(int fontColor)
    {
        this._fontColor = fontColor;
        this._has_fontColor = true;
    } //-- void setFontColor(int) 

    /**
     * Sets the value of field 'fontName'.
     * 
     * @param fontName the value of field 'fontName'.
     */
    public void setFontName(java.lang.String fontName)
    {
        this._fontName = fontName;
    } //-- void setFontName(java.lang.String) 

    /**
     * Sets the value of field 'fontSize'.
     * 
     * @param fontSize the value of field 'fontSize'.
     */
    public void setFontSize(int fontSize)
    {
        this._fontSize = fontSize;
        this._has_fontSize = true;
    } //-- void setFontSize(int) 

    /**
     * Sets the value of field 'fontStyle'. The field 'fontStyle'
     * has the following description: ��Ϊ�������� Bold:���� Italic:б��
     * Underline:�»��� StrikeOut:ɾ����
     * 
     * @param fontStyle the value of field 'fontStyle'.
     */
    public void setFontStyle(java.lang.String fontStyle)
    {
        this._fontStyle = fontStyle;
    } //-- void setFontStyle(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.HeaderArea) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.HeaderArea.class, reader);
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
