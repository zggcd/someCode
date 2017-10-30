/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart;

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
 * ��ļ�����ǰ6��Ԫ��Ϊϵͳ�̶�Ҫ�������ᣬ�ֱ�Ϊ���ҡ��ϡ��¡�����ȡ�����ȵ��ᣬ�ӵ�7��Ԫ�ؿ�ʼΪ�Զ�����
 * 
 * @version $Revision$ $Date$
 */
public class Axises implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ͼ���е���
     */
    private java.util.Vector _axisList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Axises() {
        super();
        _axisList = new Vector();
    } //-- com.regaltec.rsas.common.saschart.Axises()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAxis
     * 
     * @param vAxis
     */
    public void addAxis(com.ccssoft.rsas.common.saschart.Axis vAxis)
        throws java.lang.IndexOutOfBoundsException
    {
        _axisList.addElement(vAxis);
    } //-- void addAxis(com.regaltec.rsas.common.saschart.Axis) 

    /**
     * Method addAxis
     * 
     * @param index
     * @param vAxis
     */
    public void addAxis(int index, com.ccssoft.rsas.common.saschart.Axis vAxis)
        throws java.lang.IndexOutOfBoundsException
    {
        _axisList.insertElementAt(vAxis, index);
    } //-- void addAxis(int, com.regaltec.rsas.common.saschart.Axis) 

    /**
     * Method enumerateAxis
     */
    public java.util.Enumeration enumerateAxis()
    {
        return _axisList.elements();
    } //-- java.util.Enumeration enumerateAxis() 

    /**
     * Method getAxis
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.saschart.Axis getAxis(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _axisList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.saschart.Axis) _axisList.elementAt(index);
    } //-- com.regaltec.rsas.common.saschart.Axis getAxis(int) 

    /**
     * Method getAxis
     */
    public com.ccssoft.rsas.common.saschart.Axis[] getAxis()
    {
        int size = _axisList.size();
        com.ccssoft.rsas.common.saschart.Axis[] mArray = new com.ccssoft.rsas.common.saschart.Axis[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.saschart.Axis) _axisList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.saschart.Axis[] getAxis() 

    /**
     * Method getAxisCount
     */
    public int getAxisCount()
    {
        return _axisList.size();
    } //-- int getAxisCount() 

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
     * Method removeAllAxis
     */
    public void removeAllAxis()
    {
        _axisList.removeAllElements();
    } //-- void removeAllAxis() 

    /**
     * Method removeAxis
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.saschart.Axis removeAxis(int index)
    {
        java.lang.Object obj = _axisList.elementAt(index);
        _axisList.removeElementAt(index);
        return (com.ccssoft.rsas.common.saschart.Axis) obj;
    } //-- com.regaltec.rsas.common.saschart.Axis removeAxis(int) 

    /**
     * Method setAxis
     * 
     * @param index
     * @param vAxis
     */
    public void setAxis(int index, com.ccssoft.rsas.common.saschart.Axis vAxis)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _axisList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _axisList.setElementAt(vAxis, index);
    } //-- void setAxis(int, com.regaltec.rsas.common.saschart.Axis) 

    /**
     * Method setAxis
     * 
     * @param axisArray
     */
    public void setAxis(com.ccssoft.rsas.common.saschart.Axis[] axisArray)
    {
        //-- copy array
        _axisList.removeAllElements();
        for (int i = 0; i < axisArray.length; i++) {
            _axisList.addElement(axisArray[i]);
        }
    } //-- void setAxis(com.regaltec.rsas.common.saschart.Axis) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.Axises) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.Axises.class, reader);
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
