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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class TrendLines.
 * 
 * @version $Revision$ $Date$
 */
public class TrendLines implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _lineList
     */
    private java.util.Vector _lineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TrendLines() {
        super();
        _lineList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.TrendLines()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLine
     * 
     * @param vLine
     */
    public void addLine(com.ccssoft.rsas.common.xmlparser.chart.other.Line vLine)
        throws java.lang.IndexOutOfBoundsException
    {
        _lineList.addElement(vLine);
    } //-- void addLine(com.regaltec.rsas.common.xmlparser.chart.other.Line) 

    /**
     * Method addLine
     * 
     * @param index
     * @param vLine
     */
    public void addLine(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Line vLine)
        throws java.lang.IndexOutOfBoundsException
    {
        _lineList.insertElementAt(vLine, index);
    } //-- void addLine(int, com.regaltec.rsas.common.xmlparser.chart.other.Line) 

    /**
     * Method enumerateLine
     */
    public java.util.Enumeration enumerateLine()
    {
        return _lineList.elements();
    } //-- java.util.Enumeration enumerateLine() 

    /**
     * Method getLine
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Line getLine(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _lineList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Line) _lineList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Line getLine(int) 

    /**
     * Method getLine
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Line[] getLine()
    {
        int size = _lineList.size();
        com.ccssoft.rsas.common.xmlparser.chart.other.Line[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.other.Line[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.other.Line) _lineList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Line[] getLine() 

    /**
     * Method getLineCount
     */
    public int getLineCount()
    {
        return _lineList.size();
    } //-- int getLineCount() 

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
     * Method removeAllLine
     */
    public void removeAllLine()
    {
        _lineList.removeAllElements();
    } //-- void removeAllLine() 

    /**
     * Method removeLine
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Line removeLine(int index)
    {
        java.lang.Object obj = _lineList.elementAt(index);
        _lineList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Line) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Line removeLine(int) 

    /**
     * Method setLine
     * 
     * @param index
     * @param vLine
     */
    public void setLine(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Line vLine)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _lineList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _lineList.setElementAt(vLine, index);
    } //-- void setLine(int, com.regaltec.rsas.common.xmlparser.chart.other.Line) 

    /**
     * Method setLine
     * 
     * @param lineArray
     */
    public void setLine(com.ccssoft.rsas.common.xmlparser.chart.other.Line[] lineArray)
    {
        //-- copy array
        _lineList.removeAllElements();
        for (int i = 0; i < lineArray.length; i++) {
            _lineList.addElement(lineArray[i]);
        }
    } //-- void setLine(com.regaltec.rsas.common.xmlparser.chart.other.Line) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.other.TrendLines) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.other.TrendLines.class, reader);
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
