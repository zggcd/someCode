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
 * Class Charts.
 * 
 * @version $Revision$ $Date$
 */
public class Charts implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _chartList
     */
    private java.util.Vector _chartList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Charts() {
        super();
        _chartList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Charts()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addChart
     * 
     * @param vChart
     */
    public void addChart(com.ccssoft.rsas.common.xmlparser.Chart vChart)
        throws java.lang.IndexOutOfBoundsException
    {
        _chartList.addElement(vChart);
    } //-- void addChart(com.regaltec.rsas.common.xmlparser.Chart) 

    /**
     * Method addChart
     * 
     * @param index
     * @param vChart
     */
    public void addChart(int index, com.ccssoft.rsas.common.xmlparser.Chart vChart)
        throws java.lang.IndexOutOfBoundsException
    {
        _chartList.insertElementAt(vChart, index);
    } //-- void addChart(int, com.regaltec.rsas.common.xmlparser.Chart) 

    /**
     * Method enumerateChart
     */
    public java.util.Enumeration enumerateChart()
    {
        return _chartList.elements();
    } //-- java.util.Enumeration enumerateChart() 

    /**
     * Method getChart
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Chart getChart(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _chartList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Chart) _chartList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Chart getChart(int) 

    /**
     * Method getChart
     */
    public com.ccssoft.rsas.common.xmlparser.Chart[] getChart()
    {
        int size = _chartList.size();
        com.ccssoft.rsas.common.xmlparser.Chart[] mArray = new com.ccssoft.rsas.common.xmlparser.Chart[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Chart) _chartList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Chart[] getChart() 

    /**
     * Method getChartCount
     */
    public int getChartCount()
    {
        return _chartList.size();
    } //-- int getChartCount() 

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
     * Method removeAllChart
     */
    public void removeAllChart()
    {
        _chartList.removeAllElements();
    } //-- void removeAllChart() 

    /**
     * Method removeChart
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Chart removeChart(int index)
    {
        java.lang.Object obj = _chartList.elementAt(index);
        _chartList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Chart) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Chart removeChart(int) 

    /**
     * Method setChart
     * 
     * @param index
     * @param vChart
     */
    public void setChart(int index, com.ccssoft.rsas.common.xmlparser.Chart vChart)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _chartList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _chartList.setElementAt(vChart, index);
    } //-- void setChart(int, com.regaltec.rsas.common.xmlparser.Chart) 

    /**
     * Method setChart
     * 
     * @param chartArray
     */
    public void setChart(com.ccssoft.rsas.common.xmlparser.Chart[] chartArray)
    {
        //-- copy array
        _chartList.removeAllElements();
        for (int i = 0; i < chartArray.length; i++) {
            _chartList.addElement(chartArray[i]);
        }
    } //-- void setChart(com.regaltec.rsas.common.xmlparser.Chart) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Charts) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Charts.class, reader);
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
