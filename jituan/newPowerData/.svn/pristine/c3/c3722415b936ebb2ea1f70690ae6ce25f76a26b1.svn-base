/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.config.configparser;

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
 * Class ObjectMaps.
 * 
 * @version $Revision$ $Date$
 */
public class ObjectMaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ӳ�䶨��
     */
    private java.util.Vector _objectMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectMaps() {
        super();
        _objectMapList = new Vector();
    } //-- com.regaltec.rsas.common.config.configparser.ObjectMaps()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addObjectMap
     * 
     * @param vObjectMap
     */
    public void addObjectMap(com.ccssoft.rsas.common.config.configparser.ObjectMap vObjectMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _objectMapList.addElement(vObjectMap);
    } //-- void addObjectMap(com.regaltec.rsas.common.config.configparser.ObjectMap) 

    /**
     * Method addObjectMap
     * 
     * @param index
     * @param vObjectMap
     */
    public void addObjectMap(int index, com.ccssoft.rsas.common.config.configparser.ObjectMap vObjectMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _objectMapList.insertElementAt(vObjectMap, index);
    } //-- void addObjectMap(int, com.regaltec.rsas.common.config.configparser.ObjectMap) 

    /**
     * Method enumerateObjectMap
     */
    public java.util.Enumeration enumerateObjectMap()
    {
        return _objectMapList.elements();
    } //-- java.util.Enumeration enumerateObjectMap() 

    /**
     * Method getObjectMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.ObjectMap getObjectMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _objectMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.config.configparser.ObjectMap) _objectMapList.elementAt(index);
    } //-- com.regaltec.rsas.common.config.configparser.ObjectMap getObjectMap(int) 

    /**
     * Method getObjectMap
     */
    public com.ccssoft.rsas.common.config.configparser.ObjectMap[] getObjectMap()
    {
        int size = _objectMapList.size();
        com.ccssoft.rsas.common.config.configparser.ObjectMap[] mArray = new com.ccssoft.rsas.common.config.configparser.ObjectMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.config.configparser.ObjectMap) _objectMapList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.config.configparser.ObjectMap[] getObjectMap() 

    /**
     * Method getObjectMapCount
     */
    public int getObjectMapCount()
    {
        return _objectMapList.size();
    } //-- int getObjectMapCount() 

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
     * Method removeAllObjectMap
     */
    public void removeAllObjectMap()
    {
        _objectMapList.removeAllElements();
    } //-- void removeAllObjectMap() 

    /**
     * Method removeObjectMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.ObjectMap removeObjectMap(int index)
    {
        java.lang.Object obj = _objectMapList.elementAt(index);
        _objectMapList.removeElementAt(index);
        return (com.ccssoft.rsas.common.config.configparser.ObjectMap) obj;
    } //-- com.regaltec.rsas.common.config.configparser.ObjectMap removeObjectMap(int) 

    /**
     * Method setObjectMap
     * 
     * @param index
     * @param vObjectMap
     */
    public void setObjectMap(int index, com.ccssoft.rsas.common.config.configparser.ObjectMap vObjectMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _objectMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _objectMapList.setElementAt(vObjectMap, index);
    } //-- void setObjectMap(int, com.regaltec.rsas.common.config.configparser.ObjectMap) 

    /**
     * Method setObjectMap
     * 
     * @param objectMapArray
     */
    public void setObjectMap(com.ccssoft.rsas.common.config.configparser.ObjectMap[] objectMapArray)
    {
        //-- copy array
        _objectMapList.removeAllElements();
        for (int i = 0; i < objectMapArray.length; i++) {
            _objectMapList.addElement(objectMapArray[i]);
        }
    } //-- void setObjectMap(com.regaltec.rsas.common.config.configparser.ObjectMap) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.ObjectMaps) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.ObjectMaps.class, reader);
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
