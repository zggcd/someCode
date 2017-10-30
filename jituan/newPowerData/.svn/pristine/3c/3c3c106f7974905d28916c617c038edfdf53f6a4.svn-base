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
 * ��������������ӳ��
 * 
 * @version $Revision$ $Date$
 */
public class ConditionMaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���屨��ʱ����������ӳ��
     */
    private java.util.Vector _conditionMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConditionMaps() {
        super();
        _conditionMapList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ConditionMaps()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionMap
     * 
     * @param vConditionMap
     */
    public void addConditionMap(com.ccssoft.rsas.common.xmlparser.ConditionMap vConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionMapList.addElement(vConditionMap);
    } //-- void addConditionMap(com.regaltec.rsas.common.xmlparser.ConditionMap) 

    /**
     * Method addConditionMap
     * 
     * @param index
     * @param vConditionMap
     */
    public void addConditionMap(int index, com.ccssoft.rsas.common.xmlparser.ConditionMap vConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionMapList.insertElementAt(vConditionMap, index);
    } //-- void addConditionMap(int, com.regaltec.rsas.common.xmlparser.ConditionMap) 

    /**
     * Method enumerateConditionMap
     */
    public java.util.Enumeration enumerateConditionMap()
    {
        return _conditionMapList.elements();
    } //-- java.util.Enumeration enumerateConditionMap() 

    /**
     * Method getConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionMap getConditionMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionMap) _conditionMapList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionMap getConditionMap(int) 

    /**
     * Method getConditionMap
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionMap[] getConditionMap()
    {
        int size = _conditionMapList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionMap[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionMap) _conditionMapList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionMap[] getConditionMap() 

    /**
     * Method getConditionMapCount
     */
    public int getConditionMapCount()
    {
        return _conditionMapList.size();
    } //-- int getConditionMapCount() 

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
     * Method removeAllConditionMap
     */
    public void removeAllConditionMap()
    {
        _conditionMapList.removeAllElements();
    } //-- void removeAllConditionMap() 

    /**
     * Method removeConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionMap removeConditionMap(int index)
    {
        java.lang.Object obj = _conditionMapList.elementAt(index);
        _conditionMapList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionMap) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionMap removeConditionMap(int) 

    /**
     * Method setConditionMap
     * 
     * @param index
     * @param vConditionMap
     */
    public void setConditionMap(int index, com.ccssoft.rsas.common.xmlparser.ConditionMap vConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionMapList.setElementAt(vConditionMap, index);
    } //-- void setConditionMap(int, com.regaltec.rsas.common.xmlparser.ConditionMap) 

    /**
     * Method setConditionMap
     * 
     * @param conditionMapArray
     */
    public void setConditionMap(com.ccssoft.rsas.common.xmlparser.ConditionMap[] conditionMapArray)
    {
        //-- copy array
        _conditionMapList.removeAllElements();
        for (int i = 0; i < conditionMapArray.length; i++) {
            _conditionMapList.addElement(conditionMapArray[i]);
        }
    } //-- void setConditionMap(com.regaltec.rsas.common.xmlparser.ConditionMap) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ConditionMaps) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ConditionMaps.class, reader);
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
