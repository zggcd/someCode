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

import com.ccssoft.rsas.common.xmlparser.chart.meter.types.PointPointTypeType;

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
 * ��λ��
 * 
 * @version $Revision$ $Date$
 */
public class Point implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��λ���ͣ��㣬��Χ������ǵ㣬��ô��value����û��startValue,
     * endValue���ԣ���Χ����ôû��value������startValue, endValue����
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.types.PointPointTypeType _pointType;

    /**
     * ֵ
     */
    private double _value;

    /**
     * keeps track of state for field: _value
     */
    private boolean _has_value;

    /**
     * ��ʼֵ
     */
    private double _startValue;

    /**
     * keeps track of state for field: _startValue
     */
    private boolean _has_startValue;

    /**
     * ����ֵ
     */
    private double _endValue;

    /**
     * keeps track of state for field: _endValue
     */
    private boolean _has_endValue;

    /**
     * ��ʾֵ
     */
    private java.lang.String _displayValue;

    /**
     * ��λ����Ϊ��Χʱ����Ч��
     * �ڲ��뾶������û����ʾ��λ����İ뾶��
     */
    private int _innerRadius;

    /**
     * keeps track of state for field: _innerRadius
     */
    private boolean _has_innerRadius;

    /**
     * �Ƿ���ʾ�߿�
     * ��λ����Ϊ��Χʱ����Ч��
     */
    private byte _showBorder;

    /**
     * keeps track of state for field: _showBorder
     */
    private boolean _has_showBorder;

    /**
     * ͸����
     */
    private int _alpha;

    /**
     * keeps track of state for field: _alpha
     */
    private boolean _has_alpha;


      //----------------/
     //- Constructors -/
    //----------------/

    public Point() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Point()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAlpha
     */
    public void deleteAlpha()
    {
        this._has_alpha= false;
    } //-- void deleteAlpha() 

    /**
     * Method deleteEndValue
     */
    public void deleteEndValue()
    {
        this._has_endValue= false;
    } //-- void deleteEndValue() 

    /**
     * Method deleteInnerRadius
     */
    public void deleteInnerRadius()
    {
        this._has_innerRadius= false;
    } //-- void deleteInnerRadius() 

    /**
     * Method deleteShowBorder
     */
    public void deleteShowBorder()
    {
        this._has_showBorder= false;
    } //-- void deleteShowBorder() 

    /**
     * Method deleteStartValue
     */
    public void deleteStartValue()
    {
        this._has_startValue= false;
    } //-- void deleteStartValue() 

    /**
     * Method deleteValue
     */
    public void deleteValue()
    {
        this._has_value= false;
    } //-- void deleteValue() 

    /**
     * Returns the value of field 'alpha'. The field 'alpha' has
     * the following description: ͸����
     * 
     * @return the value of field 'alpha'.
     */
    public int getAlpha()
    {
        return this._alpha;
    } //-- int getAlpha() 

    /**
     * Returns the value of field 'displayValue'. The field
     * 'displayValue' has the following description: ��ʾֵ
     * 
     * @return the value of field 'displayValue'.
     */
    public java.lang.String getDisplayValue()
    {
        return this._displayValue;
    } //-- java.lang.String getDisplayValue() 

    /**
     * Returns the value of field 'endValue'. The field 'endValue'
     * has the following description: ����ֵ
     * 
     * @return the value of field 'endValue'.
     */
    public double getEndValue()
    {
        return this._endValue;
    } //-- double getEndValue() 

    /**
     * Returns the value of field 'innerRadius'. The field
     * 'innerRadius' has the following description: ��λ����Ϊ��Χʱ����Ч��
     * �ڲ��뾶������û����ʾ��λ����İ뾶��
     * 
     * @return the value of field 'innerRadius'.
     */
    public int getInnerRadius()
    {
        return this._innerRadius;
    } //-- int getInnerRadius() 

    /**
     * Returns the value of field 'pointType'. The field
     * 'pointType' has the following description:
     * ��λ���ͣ��㣬��Χ������ǵ㣬��ô��value����û��startValue,
     * endValue���ԣ���Χ����ôû��value������startValue, endValue����
     * 
     * @return the value of field 'pointType'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.types.PointPointTypeType getPointType()
    {
        return this._pointType;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.types.PointPointTypeType getPointType() 

    /**
     * Returns the value of field 'showBorder'. The field
     * 'showBorder' has the following description: �Ƿ���ʾ�߿�
     * ��λ����Ϊ��Χʱ����Ч��
     * 
     * @return the value of field 'showBorder'.
     */
    public byte getShowBorder()
    {
        return this._showBorder;
    } //-- byte getShowBorder() 

    /**
     * Returns the value of field 'startValue'. The field
     * 'startValue' has the following description: ��ʼֵ
     * 
     * @return the value of field 'startValue'.
     */
    public double getStartValue()
    {
        return this._startValue;
    } //-- double getStartValue() 

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: ֵ
     * 
     * @return the value of field 'value'.
     */
    public double getValue()
    {
        return this._value;
    } //-- double getValue() 

    /**
     * Method hasAlpha
     */
    public boolean hasAlpha()
    {
        return this._has_alpha;
    } //-- boolean hasAlpha() 

    /**
     * Method hasEndValue
     */
    public boolean hasEndValue()
    {
        return this._has_endValue;
    } //-- boolean hasEndValue() 

    /**
     * Method hasInnerRadius
     */
    public boolean hasInnerRadius()
    {
        return this._has_innerRadius;
    } //-- boolean hasInnerRadius() 

    /**
     * Method hasShowBorder
     */
    public boolean hasShowBorder()
    {
        return this._has_showBorder;
    } //-- boolean hasShowBorder() 

    /**
     * Method hasStartValue
     */
    public boolean hasStartValue()
    {
        return this._has_startValue;
    } //-- boolean hasStartValue() 

    /**
     * Method hasValue
     */
    public boolean hasValue()
    {
        return this._has_value;
    } //-- boolean hasValue() 

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
     * Sets the value of field 'alpha'. The field 'alpha' has the
     * following description: ͸����
     * 
     * @param alpha the value of field 'alpha'.
     */
    public void setAlpha(int alpha)
    {
        this._alpha = alpha;
        this._has_alpha = true;
    } //-- void setAlpha(int) 

    /**
     * Sets the value of field 'displayValue'. The field
     * 'displayValue' has the following description: ��ʾֵ
     * 
     * @param displayValue the value of field 'displayValue'.
     */
    public void setDisplayValue(java.lang.String displayValue)
    {
        this._displayValue = displayValue;
    } //-- void setDisplayValue(java.lang.String) 

    /**
     * Sets the value of field 'endValue'. The field 'endValue' has
     * the following description: ����ֵ
     * 
     * @param endValue the value of field 'endValue'.
     */
    public void setEndValue(double endValue)
    {
        this._endValue = endValue;
        this._has_endValue = true;
    } //-- void setEndValue(double) 

    /**
     * Sets the value of field 'innerRadius'. The field
     * 'innerRadius' has the following description: ��λ����Ϊ��Χʱ����Ч��
     * �ڲ��뾶������û����ʾ��λ����İ뾶��
     * 
     * @param innerRadius the value of field 'innerRadius'.
     */
    public void setInnerRadius(int innerRadius)
    {
        this._innerRadius = innerRadius;
        this._has_innerRadius = true;
    } //-- void setInnerRadius(int) 

    /**
     * Sets the value of field 'pointType'. The field 'pointType'
     * has the following description:
     * ��λ���ͣ��㣬��Χ������ǵ㣬��ô��value����û��startValue,
     * endValue���ԣ���Χ����ôû��value������startValue, endValue����
     * 
     * @param pointType the value of field 'pointType'.
     */
    public void setPointType(com.ccssoft.rsas.common.xmlparser.chart.meter.types.PointPointTypeType pointType)
    {
        this._pointType = pointType;
    } //-- void setPointType(com.regaltec.rsas.common.xmlparser.chart.meter.types.PointPointTypeType) 

    /**
     * Sets the value of field 'showBorder'. The field 'showBorder'
     * has the following description: �Ƿ���ʾ�߿�
     * ��λ����Ϊ��Χʱ����Ч��
     * 
     * @param showBorder the value of field 'showBorder'.
     */
    public void setShowBorder(byte showBorder)
    {
        this._showBorder = showBorder;
        this._has_showBorder = true;
    } //-- void setShowBorder(byte) 

    /**
     * Sets the value of field 'startValue'. The field 'startValue'
     * has the following description: ��ʼֵ
     * 
     * @param startValue the value of field 'startValue'.
     */
    public void setStartValue(double startValue)
    {
        this._startValue = startValue;
        this._has_startValue = true;
    } //-- void setStartValue(double) 

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: ֵ
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(double value)
    {
        this._value = value;
        this._has_value = true;
    } //-- void setValue(double) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Point) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Point.class, reader);
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
