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
 * ϵ�м���
 * 
 * @version $Revision$ $Date$
 */
public class SeriesList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ͼ��ϵ��
     */
    private java.util.Vector _seriesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SeriesList() {
        super();
        _seriesList = new Vector();
    } //-- com.regaltec.rsas.common.saschart.SeriesList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSeries
     * 
     * @param vSeries
     */
    public void addSeries(com.ccssoft.rsas.common.saschart.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesList.addElement(vSeries);
    } //-- void addSeries(com.regaltec.rsas.common.saschart.Series) 

    /**
     * Method addSeries
     * 
     * @param index
     * @param vSeries
     */
    public void addSeries(int index, com.ccssoft.rsas.common.saschart.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesList.insertElementAt(vSeries, index);
    } //-- void addSeries(int, com.regaltec.rsas.common.saschart.Series) 

    /**
     * Method enumerateSeries
     */
    public java.util.Enumeration enumerateSeries()
    {
        return _seriesList.elements();
    } //-- java.util.Enumeration enumerateSeries() 

    /**
     * Method getSeries
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.saschart.Series getSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.saschart.Series) _seriesList.elementAt(index);
    } //-- com.regaltec.rsas.common.saschart.Series getSeries(int) 

    /**
     * Method getSeries
     */
    public com.ccssoft.rsas.common.saschart.Series[] getSeries()
    {
        int size = _seriesList.size();
        com.ccssoft.rsas.common.saschart.Series[] mArray = new com.ccssoft.rsas.common.saschart.Series[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.saschart.Series) _seriesList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.saschart.Series[] getSeries() 

    /**
     * Method getSeriesCount
     */
    public int getSeriesCount()
    {
        return _seriesList.size();
    } //-- int getSeriesCount() 

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
     * Method removeAllSeries
     */
    public void removeAllSeries()
    {
        _seriesList.removeAllElements();
    } //-- void removeAllSeries() 

    /**
     * Method removeSeries
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.saschart.Series removeSeries(int index)
    {
        java.lang.Object obj = _seriesList.elementAt(index);
        _seriesList.removeElementAt(index);
        return (com.ccssoft.rsas.common.saschart.Series) obj;
    } //-- com.regaltec.rsas.common.saschart.Series removeSeries(int) 

    /**
     * Method setSeries
     * 
     * @param index
     * @param vSeries
     */
    public void setSeries(int index, com.ccssoft.rsas.common.saschart.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _seriesList.setElementAt(vSeries, index);
    } //-- void setSeries(int, com.regaltec.rsas.common.saschart.Series) 

    /**
     * Method setSeries
     * 
     * @param seriesArray
     */
    public void setSeries(com.ccssoft.rsas.common.saschart.Series[] seriesArray)
    {
        //-- copy array
        _seriesList.removeAllElements();
        for (int i = 0; i < seriesArray.length; i++) {
            _seriesList.addElement(seriesArray[i]);
        }
    } //-- void setSeries(com.regaltec.rsas.common.saschart.Series) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.SeriesList) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.SeriesList.class, reader);
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
