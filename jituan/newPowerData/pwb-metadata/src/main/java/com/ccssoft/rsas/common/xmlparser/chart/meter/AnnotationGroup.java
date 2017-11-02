/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.meter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType;

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
 * Class AnnotationGroup.
 * 
 * @version $Revision$ $Date$
 */
public class AnnotationGroup implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ߵ���Χ�������.Բ�����Σ�
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType _type;

    /**
     * �Ǳ�����Χ��װ�ε�����
     * Բ��װ�εĿ�ʼλ����ͼ��Ĵ�СΪ�����ε����ģ����������ơ������Σ�xPos,yPos��Ϊ0
     */
    private int _xPos;

    /**
     * keeps track of state for field: _xPos
     */
    private boolean _has_xPos;

    /**
     * Field _yPos
     */
    private int _yPos;

    /**
     * keeps track of state for field: _yPos
     */
    private boolean _has_yPos;

    /**
     * Field _items
     */
    private java.util.Vector _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public AnnotationGroup() {
        super();
        _items = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroup()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAnnotationGroupItem
     * 
     * @param vAnnotationGroupItem
     */
    public void addAnnotationGroupItem(com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem vAnnotationGroupItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _items.addElement(vAnnotationGroupItem);
    } //-- void addAnnotationGroupItem(com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) 

    /**
     * Method addAnnotationGroupItem
     * 
     * @param index
     * @param vAnnotationGroupItem
     */
    public void addAnnotationGroupItem(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem vAnnotationGroupItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _items.insertElementAt(vAnnotationGroupItem, index);
    } //-- void addAnnotationGroupItem(int, com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) 

    /**
     * Method deleteXPos
     */
    public void deleteXPos()
    {
        this._has_xPos= false;
    } //-- void deleteXPos() 

    /**
     * Method deleteYPos
     */
    public void deleteYPos()
    {
        this._has_yPos= false;
    } //-- void deleteYPos() 

    /**
     * Method enumerateAnnotationGroupItem
     */
    public java.util.Enumeration enumerateAnnotationGroupItem()
    {
        return _items.elements();
    } //-- java.util.Enumeration enumerateAnnotationGroupItem() 

    /**
     * Method getAnnotationGroupItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem getAnnotationGroupItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _items.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) _items.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem getAnnotationGroupItem(int) 

    /**
     * Method getAnnotationGroupItem
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem[] getAnnotationGroupItem()
    {
        int size = _items.size();
        com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) _items.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem[] getAnnotationGroupItem() 

    /**
     * Method getAnnotationGroupItemCount
     */
    public int getAnnotationGroupItemCount()
    {
        return _items.size();
    } //-- int getAnnotationGroupItemCount() 

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: ��ߵ���Χ�������.Բ�����Σ�
     * 
     * 
     * @return the value of field 'type'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType getType()
    {
        return this._type;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType getType() 

    /**
     * Returns the value of field 'xPos'. The field 'xPos' has the
     * following description: �Ǳ�����Χ��װ�ε�����
     * Բ��װ�εĿ�ʼλ����ͼ��Ĵ�СΪ�����ε����ģ����������ơ������Σ�xPos,yPos��Ϊ0
     * 
     * @return the value of field 'xPos'.
     */
    public int getXPos()
    {
        return this._xPos;
    } //-- int getXPos() 

    /**
     * Returns the value of field 'yPos'.
     * 
     * @return the value of field 'yPos'.
     */
    public int getYPos()
    {
        return this._yPos;
    } //-- int getYPos() 

    /**
     * Method hasXPos
     */
    public boolean hasXPos()
    {
        return this._has_xPos;
    } //-- boolean hasXPos() 

    /**
     * Method hasYPos
     */
    public boolean hasYPos()
    {
        return this._has_yPos;
    } //-- boolean hasYPos() 

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
     * Method removeAllAnnotationGroupItem
     */
    public void removeAllAnnotationGroupItem()
    {
        _items.removeAllElements();
    } //-- void removeAllAnnotationGroupItem() 

    /**
     * Method removeAnnotationGroupItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem removeAnnotationGroupItem(int index)
    {
        java.lang.Object obj = _items.elementAt(index);
        _items.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem removeAnnotationGroupItem(int) 

    /**
     * Method setAnnotationGroupItem
     * 
     * @param index
     * @param vAnnotationGroupItem
     */
    public void setAnnotationGroupItem(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem vAnnotationGroupItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _items.size())) {
            throw new IndexOutOfBoundsException();
        }
        _items.setElementAt(vAnnotationGroupItem, index);
    } //-- void setAnnotationGroupItem(int, com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) 

    /**
     * Method setAnnotationGroupItem
     * 
     * @param annotationGroupItemArray
     */
    public void setAnnotationGroupItem(com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroupItem[] annotationGroupItemArray)
    {
        //-- copy array
        _items.removeAllElements();
        for (int i = 0; i < annotationGroupItemArray.length; i++) {
            _items.addElement(annotationGroupItemArray[i]);
        }
    } //-- void setAnnotationGroupItem(com.regaltec.rsas.common.xmlparser.chart.meter.AnnotationGroupItem) 

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: ��ߵ���Χ�������.Բ�����Σ�
     * 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType type)
    {
        this._type = type;
    } //-- void setType(com.regaltec.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType) 

    /**
     * Sets the value of field 'xPos'. The field 'xPos' has the
     * following description: �Ǳ�����Χ��װ�ε�����
     * Բ��װ�εĿ�ʼλ����ͼ��Ĵ�СΪ�����ε����ģ����������ơ������Σ�xPos,yPos��Ϊ0
     * 
     * @param xPos the value of field 'xPos'.
     */
    public void setXPos(int xPos)
    {
        this._xPos = xPos;
        this._has_xPos = true;
    } //-- void setXPos(int) 

    /**
     * Sets the value of field 'yPos'.
     * 
     * @param yPos the value of field 'yPos'.
     */
    public void setYPos(int yPos)
    {
        this._yPos = yPos;
        this._has_yPos = true;
    } //-- void setYPos(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroup) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.AnnotationGroup.class, reader);
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