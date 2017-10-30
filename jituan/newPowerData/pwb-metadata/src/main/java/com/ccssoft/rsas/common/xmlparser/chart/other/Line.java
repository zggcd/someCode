/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.other;

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
 * Class Line.
 * 
 * @version $Revision$ $Date$
 */
public class Line implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * vtConst:Ԥ��ֱֵ�Ӵ�startValueȡ��
     * vtMeas:Ԥ��ֵ����measureItemId���Ӳ�ѯ�л�ȡ��
     */
    private java.lang.String _valueType;

    /**
     * ����ֵ������Ԥ��ֵ
     */
    private double _startValue;

    /**
     * keeps track of state for field: _startValue
     */
    private boolean _has_startValue;

    /**
     * ����ID
     * �ܶ�ʱ��Ԥ��ֵ������Դ������
     * �������ID��Ϊ��ʱstartValueֵ�����ݼ���ȡ��
     */
    private java.lang.Object _measureItemId;

    /**
     * ������ɫ
     */
    private java.lang.String _color;

    /**
     * ��������
     */
    private java.lang.String _displayvalue;

    /**
     * ���������Ƿ���ʾ���ұ�
     */
    private byte _valueOnRight;

    /**
     * keeps track of state for field: _valueOnRight
     */
    private boolean _has_valueOnRight;


      //----------------/
     //- Constructors -/
    //----------------/

    public Line() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Line()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteStartValue
     */
    public void deleteStartValue()
    {
        this._has_startValue= false;
    } //-- void deleteStartValue() 

    /**
     * Method deleteValueOnRight
     */
    public void deleteValueOnRight()
    {
        this._has_valueOnRight= false;
    } //-- void deleteValueOnRight() 

    /**
     * Returns the value of field 'color'. The field 'color' has
     * the following description: ������ɫ
     * 
     * @return the value of field 'color'.
     */
    public java.lang.String getColor()
    {
        return this._color;
    } //-- java.lang.String getColor() 

    /**
     * Returns the value of field 'displayvalue'. The field
     * 'displayvalue' has the following description: ��������
     * 
     * @return the value of field 'displayvalue'.
     */
    public java.lang.String getDisplayvalue()
    {
        return this._displayvalue;
    } //-- java.lang.String getDisplayvalue() 

    /**
     * Returns the value of field 'measureItemId'. The field
     * 'measureItemId' has the following description: ����ID
     * �ܶ�ʱ��Ԥ��ֵ������Դ������
     * �������ID��Ϊ��ʱstartValueֵ�����ݼ���ȡ��
     * 
     * @return the value of field 'measureItemId'.
     */
    public java.lang.Object getMeasureItemId()
    {
        return this._measureItemId;
    } //-- java.lang.Object getMeasureItemId() 

    /**
     * Returns the value of field 'startValue'. The field
     * 'startValue' has the following description: ����ֵ������Ԥ��ֵ
     * 
     * @return the value of field 'startValue'.
     */
    public double getStartValue()
    {
        return this._startValue;
    } //-- double getStartValue() 

    /**
     * Returns the value of field 'valueOnRight'. The field
     * 'valueOnRight' has the following description: ���������Ƿ���ʾ���ұ�
     * 
     * @return the value of field 'valueOnRight'.
     */
    public byte getValueOnRight()
    {
        return this._valueOnRight;
    } //-- byte getValueOnRight() 

    /**
     * Returns the value of field 'valueType'. The field
     * 'valueType' has the following description:
     * vtConst:Ԥ��ֱֵ�Ӵ�startValueȡ��
     * vtMeas:Ԥ��ֵ����measureItemId���Ӳ�ѯ�л�ȡ��
     * 
     * @return the value of field 'valueType'.
     */
    public java.lang.String getValueType()
    {
        return this._valueType;
    } //-- java.lang.String getValueType() 

    /**
     * Method hasStartValue
     */
    public boolean hasStartValue()
    {
        return this._has_startValue;
    } //-- boolean hasStartValue() 

    /**
     * Method hasValueOnRight
     */
    public boolean hasValueOnRight()
    {
        return this._has_valueOnRight;
    } //-- boolean hasValueOnRight() 

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
     * Sets the value of field 'color'. The field 'color' has the
     * following description: ������ɫ
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(java.lang.String color)
    {
        this._color = color;
    } //-- void setColor(java.lang.String) 

    /**
     * Sets the value of field 'displayvalue'. The field
     * 'displayvalue' has the following description: ��������
     * 
     * @param displayvalue the value of field 'displayvalue'.
     */
    public void setDisplayvalue(java.lang.String displayvalue)
    {
        this._displayvalue = displayvalue;
    } //-- void setDisplayvalue(java.lang.String) 

    /**
     * Sets the value of field 'measureItemId'. The field
     * 'measureItemId' has the following description: ����ID
     * �ܶ�ʱ��Ԥ��ֵ������Դ������
     * �������ID��Ϊ��ʱstartValueֵ�����ݼ���ȡ��
     * 
     * @param measureItemId the value of field 'measureItemId'.
     */
    public void setMeasureItemId(java.lang.Object measureItemId)
    {
        this._measureItemId = measureItemId;
    } //-- void setMeasureItemId(java.lang.Object) 

    /**
     * Sets the value of field 'startValue'. The field 'startValue'
     * has the following description: ����ֵ������Ԥ��ֵ
     * 
     * @param startValue the value of field 'startValue'.
     */
    public void setStartValue(double startValue)
    {
        this._startValue = startValue;
        this._has_startValue = true;
    } //-- void setStartValue(double) 

    /**
     * Sets the value of field 'valueOnRight'. The field
     * 'valueOnRight' has the following description: ���������Ƿ���ʾ���ұ�
     * 
     * @param valueOnRight the value of field 'valueOnRight'.
     */
    public void setValueOnRight(byte valueOnRight)
    {
        this._valueOnRight = valueOnRight;
        this._has_valueOnRight = true;
    } //-- void setValueOnRight(byte) 

    /**
     * Sets the value of field 'valueType'. The field 'valueType'
     * has the following description: vtConst:Ԥ��ֱֵ�Ӵ�startValueȡ��
     * vtMeas:Ԥ��ֵ����measureItemId���Ӳ�ѯ�л�ȡ��
     * 
     * @param valueType the value of field 'valueType'.
     */
    public void setValueType(java.lang.String valueType)
    {
        this._valueType = valueType;
    } //-- void setValueType(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Line) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.other.Line.class, reader);
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
