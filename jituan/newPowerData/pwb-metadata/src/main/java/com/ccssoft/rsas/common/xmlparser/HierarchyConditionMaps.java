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
 * ���ϼ������ȡ�����ñ����ɸѡ�����Ķ�Ӧ��ϵ
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyConditionMaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �㼶�������ɸѡ������Ӧ��ϵ
     */
    private java.util.Vector _hierarchyConditionMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HierarchyConditionMaps() {
        super();
        _hierarchyConditionMapList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConditionMaps()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addHierarchyConditionMap
     * 
     * @param vHierarchyConditionMap
     */
    public void addHierarchyConditionMap(com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap vHierarchyConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyConditionMapList.addElement(vHierarchyConditionMap);
    } //-- void addHierarchyConditionMap(com.regaltec.rsas.common.xmlparser.HierarchyConditionMap) 

    /**
     * Method addHierarchyConditionMap
     * 
     * @param index
     * @param vHierarchyConditionMap
     */
    public void addHierarchyConditionMap(int index, com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap vHierarchyConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyConditionMapList.insertElementAt(vHierarchyConditionMap, index);
    } //-- void addHierarchyConditionMap(int, com.regaltec.rsas.common.xmlparser.HierarchyConditionMap) 

    /**
     * Method enumerateHierarchyConditionMap
     */
    public java.util.Enumeration enumerateHierarchyConditionMap()
    {
        return _hierarchyConditionMapList.elements();
    } //-- java.util.Enumeration enumerateHierarchyConditionMap() 

    /**
     * Method getHierarchyConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap getHierarchyConditionMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyConditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap) _hierarchyConditionMapList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConditionMap getHierarchyConditionMap(int) 

    /**
     * Method getHierarchyConditionMap
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap[] getHierarchyConditionMap()
    {
        int size = _hierarchyConditionMapList.size();
        com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap[] mArray = new com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap) _hierarchyConditionMapList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConditionMap[] getHierarchyConditionMap() 

    /**
     * Method getHierarchyConditionMapCount
     */
    public int getHierarchyConditionMapCount()
    {
        return _hierarchyConditionMapList.size();
    } //-- int getHierarchyConditionMapCount() 

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
     * Method removeAllHierarchyConditionMap
     */
    public void removeAllHierarchyConditionMap()
    {
        _hierarchyConditionMapList.removeAllElements();
    } //-- void removeAllHierarchyConditionMap() 

    /**
     * Method removeHierarchyConditionMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap removeHierarchyConditionMap(int index)
    {
        java.lang.Object obj = _hierarchyConditionMapList.elementAt(index);
        _hierarchyConditionMapList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap) obj;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConditionMap removeHierarchyConditionMap(int) 

    /**
     * Method setHierarchyConditionMap
     * 
     * @param index
     * @param vHierarchyConditionMap
     */
    public void setHierarchyConditionMap(int index, com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap vHierarchyConditionMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyConditionMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _hierarchyConditionMapList.setElementAt(vHierarchyConditionMap, index);
    } //-- void setHierarchyConditionMap(int, com.regaltec.rsas.common.xmlparser.HierarchyConditionMap) 

    /**
     * Method setHierarchyConditionMap
     * 
     * @param hierarchyConditionMapArray
     */
    public void setHierarchyConditionMap(com.ccssoft.rsas.common.xmlparser.HierarchyConditionMap[] hierarchyConditionMapArray)
    {
        //-- copy array
        _hierarchyConditionMapList.removeAllElements();
        for (int i = 0; i < hierarchyConditionMapArray.length; i++) {
            _hierarchyConditionMapList.addElement(hierarchyConditionMapArray[i]);
        }
    } //-- void setHierarchyConditionMap(com.regaltec.rsas.common.xmlparser.HierarchyConditionMap) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.HierarchyConditionMaps) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.HierarchyConditionMaps.class, reader);
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
