/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.gauge;

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
 * ��ɫ�뷶Χֵ�Ĺ�ϵ
 * 
 * @version $Revision$ $Date$
 */
public class ColorRange implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ɫ�뷶Χֵ�Ĺ�ϵ
     */
    private java.util.Vector _colorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ColorRange() {
        super();
        _colorList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.ColorRange()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addColor
     * 
     * @param vColor
     */
    public void addColor(com.ccssoft.rsas.common.xmlparser.chart.gauge.Color vColor)
        throws java.lang.IndexOutOfBoundsException
    {
        _colorList.addElement(vColor);
    } //-- void addColor(com.regaltec.rsas.common.xmlparser.chart.gauge.Color) 

    /**
     * Method addColor
     * 
     * @param index
     * @param vColor
     */
    public void addColor(int index, com.ccssoft.rsas.common.xmlparser.chart.gauge.Color vColor)
        throws java.lang.IndexOutOfBoundsException
    {
        _colorList.insertElementAt(vColor, index);
    } //-- void addColor(int, com.regaltec.rsas.common.xmlparser.chart.gauge.Color) 

    /**
     * Method enumerateColor
     */
    public java.util.Enumeration enumerateColor()
    {
        return _colorList.elements();
    } //-- java.util.Enumeration enumerateColor() 

    /**
     * Method getColor
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.gauge.Color getColor(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _colorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.gauge.Color) _colorList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.Color getColor(int) 

    /**
     * Method getColor
     */
    public com.ccssoft.rsas.common.xmlparser.chart.gauge.Color[] getColor()
    {
        int size = _colorList.size();
        com.ccssoft.rsas.common.xmlparser.chart.gauge.Color[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.gauge.Color[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.gauge.Color) _colorList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.Color[] getColor() 

    /**
     * Method getColorCount
     */
    public int getColorCount()
    {
        return _colorList.size();
    } //-- int getColorCount() 

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
     * Method removeAllColor
     */
    public void removeAllColor()
    {
        _colorList.removeAllElements();
    } //-- void removeAllColor() 

    /**
     * Method removeColor
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.gauge.Color removeColor(int index)
    {
        java.lang.Object obj = _colorList.elementAt(index);
        _colorList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.gauge.Color) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.Color removeColor(int) 

    /**
     * Method setColor
     * 
     * @param index
     * @param vColor
     */
    public void setColor(int index, com.ccssoft.rsas.common.xmlparser.chart.gauge.Color vColor)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _colorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _colorList.setElementAt(vColor, index);
    } //-- void setColor(int, com.regaltec.rsas.common.xmlparser.chart.gauge.Color) 

    /**
     * Method setColor
     * 
     * @param colorArray
     */
    public void setColor(com.ccssoft.rsas.common.xmlparser.chart.gauge.Color[] colorArray)
    {
        //-- copy array
        _colorList.removeAllElements();
        for (int i = 0; i < colorArray.length; i++) {
            _colorList.addElement(colorArray[i]);
        }
    } //-- void setColor(com.regaltec.rsas.common.xmlparser.chart.gauge.Color) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.gauge.ColorRange) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.gauge.ColorRange.class, reader);
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
