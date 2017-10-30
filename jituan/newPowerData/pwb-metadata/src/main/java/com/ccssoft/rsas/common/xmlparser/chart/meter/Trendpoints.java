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
 * ��λ
 * 
 * @version $Revision$ $Date$
 */
public class Trendpoints implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��λ��
     */
    private java.util.Vector _pointList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Trendpoints() {
        super();
        _pointList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPoint
     * 
     * @param vPoint
     */
    public void addPoint(com.ccssoft.rsas.common.xmlparser.chart.meter.Point vPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        _pointList.addElement(vPoint);
    } //-- void addPoint(com.regaltec.rsas.common.xmlparser.chart.meter.Point) 

    /**
     * Method addPoint
     * 
     * @param index
     * @param vPoint
     */
    public void addPoint(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.Point vPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        _pointList.insertElementAt(vPoint, index);
    } //-- void addPoint(int, com.regaltec.rsas.common.xmlparser.chart.meter.Point) 

    /**
     * Method enumeratePoint
     */
    public java.util.Enumeration enumeratePoint()
    {
        return _pointList.elements();
    } //-- java.util.Enumeration enumeratePoint() 

    /**
     * Method getPoint
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Point getPoint(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pointList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Point) _pointList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Point getPoint(int) 

    /**
     * Method getPoint
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Point[] getPoint()
    {
        int size = _pointList.size();
        com.ccssoft.rsas.common.xmlparser.chart.meter.Point[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.meter.Point[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.meter.Point) _pointList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Point[] getPoint() 

    /**
     * Method getPointCount
     */
    public int getPointCount()
    {
        return _pointList.size();
    } //-- int getPointCount() 

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
     * Method removeAllPoint
     */
    public void removeAllPoint()
    {
        _pointList.removeAllElements();
    } //-- void removeAllPoint() 

    /**
     * Method removePoint
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Point removePoint(int index)
    {
        java.lang.Object obj = _pointList.elementAt(index);
        _pointList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Point) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Point removePoint(int) 

    /**
     * Method setPoint
     * 
     * @param index
     * @param vPoint
     */
    public void setPoint(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.Point vPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pointList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _pointList.setElementAt(vPoint, index);
    } //-- void setPoint(int, com.regaltec.rsas.common.xmlparser.chart.meter.Point) 

    /**
     * Method setPoint
     * 
     * @param pointArray
     */
    public void setPoint(com.ccssoft.rsas.common.xmlparser.chart.meter.Point[] pointArray)
    {
        //-- copy array
        _pointList.removeAllElements();
        for (int i = 0; i < pointArray.length; i++) {
            _pointList.addElement(pointArray[i]);
        }
    } //-- void setPoint(com.regaltec.rsas.common.xmlparser.chart.meter.Point) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints.class, reader);
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
