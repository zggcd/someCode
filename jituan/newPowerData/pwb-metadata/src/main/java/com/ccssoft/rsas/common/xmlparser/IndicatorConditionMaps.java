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
 * ��ָ��ȡֵΪ�����洢����ʱ��Ҫ�����乫��������Ӧ�Ĵ�ֵ����ӳ��
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorConditionMaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _indicatorConditionMapList
     */
    private java.util.Vector _indicatorConditionMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IndicatorConditionMaps() {
        super();
        _indicatorConditionMapList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorConditionMaps()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIndicatorConditionMap
     * 
     * @param vIndicatorConditionMap
     */
    public void addIndicatorConditionMap(com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap vIndicatorConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorConditionMapList.addElement(vIndicatorConditionMap);
    } //-- void addIndicatorConditionMap(com.regaltec.rsas.common.xmlparser.IndicatorConditionMap) 

    /**
     * Method addIndicatorConditionMap
     * 
     * @param index
     * @param vIndicatorConditionMap
     */
    public void addIndicatorConditionMap(int index, com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap vIndicatorConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _indicatorConditionMapList.insertElementAt(vIndicatorConditionMap, index);
    } //-- void addIndicatorConditionMap(int, com.regaltec.rsas.common.xmlparser.IndicatorConditionMap) 

    /**
     * Method enumerateIndicatorConditionMap
     */
    public java.util.Enumeration enumerateIndicatorConditionMap()
    {
        return _indicatorConditionMapList.elements();
    } //-- java.util.Enumeration enumerateIndicatorConditionMap() 

    /**
     * Method getIndicatorConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap getIndicatorConditionMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorConditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap) _indicatorConditionMapList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorConditionMap getIndicatorConditionMap(int) 

    /**
     * Method getIndicatorConditionMap
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap[] getIndicatorConditionMap()
    {
        int size = _indicatorConditionMapList.size();
        com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap[] mArray = new com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap) _indicatorConditionMapList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorConditionMap[] getIndicatorConditionMap() 

    /**
     * Method getIndicatorConditionMapCount
     */
    public int getIndicatorConditionMapCount()
    {
        return _indicatorConditionMapList.size();
    } //-- int getIndicatorConditionMapCount() 

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
     * Method removeAllIndicatorConditionMap
     */
    public void removeAllIndicatorConditionMap()
    {
        _indicatorConditionMapList.removeAllElements();
    } //-- void removeAllIndicatorConditionMap() 

    /**
     * Method removeIndicatorConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap removeIndicatorConditionMap(int index)
    {
        java.lang.Object obj = _indicatorConditionMapList.elementAt(index);
        _indicatorConditionMapList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap) obj;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorConditionMap removeIndicatorConditionMap(int) 

    /**
     * Method setIndicatorConditionMap
     * 
     * @param index
     * @param vIndicatorConditionMap
     */
    public void setIndicatorConditionMap(int index, com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap vIndicatorConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _indicatorConditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _indicatorConditionMapList.setElementAt(vIndicatorConditionMap, index);
    } //-- void setIndicatorConditionMap(int, com.regaltec.rsas.common.xmlparser.IndicatorConditionMap) 

    /**
     * Method setIndicatorConditionMap
     * 
     * @param indicatorConditionMapArray
     */
    public void setIndicatorConditionMap(com.ccssoft.rsas.common.xmlparser.IndicatorConditionMap[] indicatorConditionMapArray)
    {
        //-- copy array
        _indicatorConditionMapList.removeAllElements();
        for (int i = 0; i < indicatorConditionMapArray.length; i++) {
            _indicatorConditionMapList.addElement(indicatorConditionMapArray[i]);
        }
    } //-- void setIndicatorConditionMap(com.regaltec.rsas.common.xmlparser.IndicatorConditionMap) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.IndicatorConditionMaps) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.IndicatorConditionMaps.class, reader);
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
