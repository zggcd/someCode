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
 * Class IndicatorContent.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorContent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ʾ�÷�
     */
    private int _isShowScore;

    /**
     * keeps track of state for field: _isShowScore
     */
    private boolean _has_isShowScore;

    /**
     * ��ʾͬ�Ȼ���
     */
    private int _isShowRatio;

    /**
     * keeps track of state for field: _isShowRatio
     */
    private boolean _has_isShowRatio;

    /**
     * ��ʾ����
     */
    private int _isShowTrend;

    /**
     * keeps track of state for field: _isShowTrend
     */
    private boolean _has_isShowTrend;

    /**
     * Field _indicatorlistList
     */
    private java.util.Vector _indicatorlistList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IndicatorContent() {
        super();
        _indicatorlistList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorContent()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIndicatorlist
     * 
     * @param vIndicatorlist
     */
    public void addIndicatorlist(com.ccssoft.rsas.common.xmlparser.Indicatorlist vIndicatorlist)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorlistList.addElement(vIndicatorlist);
    } //-- void addIndicatorlist(com.regaltec.rsas.common.xmlparser.Indicatorlist) 

    /**
     * Method addIndicatorlist
     * 
     * @param index
     * @param vIndicatorlist
     */
    public void addIndicatorlist(int index, com.ccssoft.rsas.common.xmlparser.Indicatorlist vIndicatorlist)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorlistList.insertElementAt(vIndicatorlist, index);
    } //-- void addIndicatorlist(int, com.regaltec.rsas.common.xmlparser.Indicatorlist) 

    /**
     * Method deleteIsShowRatio
     */
    public void deleteIsShowRatio()
    {
        this._has_isShowRatio= false;
    } //-- void deleteIsShowRatio() 

    /**
     * Method deleteIsShowScore
     */
    public void deleteIsShowScore()
    {
        this._has_isShowScore= false;
    } //-- void deleteIsShowScore() 

    /**
     * Method deleteIsShowTrend
     */
    public void deleteIsShowTrend()
    {
        this._has_isShowTrend= false;
    } //-- void deleteIsShowTrend() 

    /**
     * Method enumerateIndicatorlist
     */
    public java.util.Enumeration enumerateIndicatorlist()
    {
        return _indicatorlistList.elements();
    } //-- java.util.Enumeration enumerateIndicatorlist() 

    /**
     * Method getIndicatorlist
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Indicatorlist getIndicatorlist(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorlistList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Indicatorlist) _indicatorlistList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Indicatorlist getIndicatorlist(int) 

    /**
     * Method getIndicatorlist
     */
    public com.ccssoft.rsas.common.xmlparser.Indicatorlist[] getIndicatorlist()
    {
        int size = _indicatorlistList.size();
        com.ccssoft.rsas.common.xmlparser.Indicatorlist[] mArray = new com.ccssoft.rsas.common.xmlparser.Indicatorlist[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Indicatorlist) _indicatorlistList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Indicatorlist[] getIndicatorlist() 

    /**
     * Method getIndicatorlistCount
     */
    public int getIndicatorlistCount()
    {
        return _indicatorlistList.size();
    } //-- int getIndicatorlistCount() 

    /**
     * Returns the value of field 'isShowRatio'. The field
     * 'isShowRatio' has the following description: ��ʾͬ�Ȼ���
     * 
     * @return the value of field 'isShowRatio'.
     */
    public int getIsShowRatio()
    {
        return this._isShowRatio;
    } //-- int getIsShowRatio() 

    /**
     * Returns the value of field 'isShowScore'. The field
     * 'isShowScore' has the following description: ��ʾ�÷�
     * 
     * @return the value of field 'isShowScore'.
     */
    public int getIsShowScore()
    {
        return this._isShowScore;
    } //-- int getIsShowScore() 

    /**
     * Returns the value of field 'isShowTrend'. The field
     * 'isShowTrend' has the following description: ��ʾ����
     * 
     * @return the value of field 'isShowTrend'.
     */
    public int getIsShowTrend()
    {
        return this._isShowTrend;
    } //-- int getIsShowTrend() 

    /**
     * Method hasIsShowRatio
     */
    public boolean hasIsShowRatio()
    {
        return this._has_isShowRatio;
    } //-- boolean hasIsShowRatio() 

    /**
     * Method hasIsShowScore
     */
    public boolean hasIsShowScore()
    {
        return this._has_isShowScore;
    } //-- boolean hasIsShowScore() 

    /**
     * Method hasIsShowTrend
     */
    public boolean hasIsShowTrend()
    {
        return this._has_isShowTrend;
    } //-- boolean hasIsShowTrend() 

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
     * Method removeAllIndicatorlist
     */
    public void removeAllIndicatorlist()
    {
        _indicatorlistList.removeAllElements();
    } //-- void removeAllIndicatorlist() 

    /**
     * Method removeIndicatorlist
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Indicatorlist removeIndicatorlist(int index)
    {
        java.lang.Object obj = _indicatorlistList.elementAt(index);
        _indicatorlistList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Indicatorlist) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Indicatorlist removeIndicatorlist(int) 

    /**
     * Method setIndicatorlist
     * 
     * @param index
     * @param vIndicatorlist
     */
    public void setIndicatorlist(int index, com.ccssoft.rsas.common.xmlparser.Indicatorlist vIndicatorlist)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorlistList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _indicatorlistList.setElementAt(vIndicatorlist, index);
    } //-- void setIndicatorlist(int, com.regaltec.rsas.common.xmlparser.Indicatorlist) 

    /**
     * Method setIndicatorlist
     * 
     * @param indicatorlistArray
     */
    public void setIndicatorlist(com.ccssoft.rsas.common.xmlparser.Indicatorlist[] indicatorlistArray)
    {
        //-- copy array
        _indicatorlistList.removeAllElements();
        for (int i = 0; i < indicatorlistArray.length; i++) {
            _indicatorlistList.addElement(indicatorlistArray[i]);
        }
    } //-- void setIndicatorlist(com.regaltec.rsas.common.xmlparser.Indicatorlist) 

    /**
     * Sets the value of field 'isShowRatio'. The field
     * 'isShowRatio' has the following description: ��ʾͬ�Ȼ���
     * 
     * @param isShowRatio the value of field 'isShowRatio'.
     */
    public void setIsShowRatio(int isShowRatio)
    {
        this._isShowRatio = isShowRatio;
        this._has_isShowRatio = true;
    } //-- void setIsShowRatio(int) 

    /**
     * Sets the value of field 'isShowScore'. The field
     * 'isShowScore' has the following description: ��ʾ�÷�
     * 
     * @param isShowScore the value of field 'isShowScore'.
     */
    public void setIsShowScore(int isShowScore)
    {
        this._isShowScore = isShowScore;
        this._has_isShowScore = true;
    } //-- void setIsShowScore(int) 

    /**
     * Sets the value of field 'isShowTrend'. The field
     * 'isShowTrend' has the following description: ��ʾ����
     * 
     * @param isShowTrend the value of field 'isShowTrend'.
     */
    public void setIsShowTrend(int isShowTrend)
    {
        this._isShowTrend = isShowTrend;
        this._has_isShowTrend = true;
    } //-- void setIsShowTrend(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.IndicatorContent) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.IndicatorContent.class, reader);
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
