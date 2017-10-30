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
 * Class CommandMaps.
 * 
 * @version $Revision$ $Date$
 */
public class CommandMaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _commandMapList
     */
    private java.util.Vector _commandMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommandMaps() {
        super();
        _commandMapList = new Vector();
    } //-- com.regaltec.rsas.common.config.configparser.CommandMaps()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCommandMap
     * 
     * @param vCommandMap
     */
    public void addCommandMap(com.ccssoft.rsas.common.config.configparser.CommandMap vCommandMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _commandMapList.addElement(vCommandMap);
    } //-- void addCommandMap(com.regaltec.rsas.common.config.configparser.CommandMap) 

    /**
     * Method addCommandMap
     * 
     * @param index
     * @param vCommandMap
     */
    public void addCommandMap(int index, com.ccssoft.rsas.common.config.configparser.CommandMap vCommandMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _commandMapList.insertElementAt(vCommandMap, index);
    } //-- void addCommandMap(int, com.regaltec.rsas.common.config.configparser.CommandMap) 

    /**
     * Method enumerateCommandMap
     */
    public java.util.Enumeration enumerateCommandMap()
    {
        return _commandMapList.elements();
    } //-- java.util.Enumeration enumerateCommandMap() 

    /**
     * Method getCommandMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.CommandMap getCommandMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commandMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.config.configparser.CommandMap) _commandMapList.elementAt(index);
    } //-- com.regaltec.rsas.common.config.configparser.CommandMap getCommandMap(int) 

    /**
     * Method getCommandMap
     */
    public com.ccssoft.rsas.common.config.configparser.CommandMap[] getCommandMap()
    {
        int size = _commandMapList.size();
        com.ccssoft.rsas.common.config.configparser.CommandMap[] mArray = new com.ccssoft.rsas.common.config.configparser.CommandMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.config.configparser.CommandMap) _commandMapList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.config.configparser.CommandMap[] getCommandMap() 

    /**
     * Method getCommandMapCount
     */
    public int getCommandMapCount()
    {
        return _commandMapList.size();
    } //-- int getCommandMapCount() 

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
     * Method removeAllCommandMap
     */
    public void removeAllCommandMap()
    {
        _commandMapList.removeAllElements();
    } //-- void removeAllCommandMap() 

    /**
     * Method removeCommandMap
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.CommandMap removeCommandMap(int index)
    {
        java.lang.Object obj = _commandMapList.elementAt(index);
        _commandMapList.removeElementAt(index);
        return (com.ccssoft.rsas.common.config.configparser.CommandMap) obj;
    } //-- com.regaltec.rsas.common.config.configparser.CommandMap removeCommandMap(int) 

    /**
     * Method setCommandMap
     * 
     * @param index
     * @param vCommandMap
     */
    public void setCommandMap(int index, com.ccssoft.rsas.common.config.configparser.CommandMap vCommandMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commandMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _commandMapList.setElementAt(vCommandMap, index);
    } //-- void setCommandMap(int, com.regaltec.rsas.common.config.configparser.CommandMap) 

    /**
     * Method setCommandMap
     * 
     * @param commandMapArray
     */
    public void setCommandMap(com.ccssoft.rsas.common.config.configparser.CommandMap[] commandMapArray)
    {
        //-- copy array
        _commandMapList.removeAllElements();
        for (int i = 0; i < commandMapArray.length; i++) {
            _commandMapList.addElement(commandMapArray[i]);
        }
    } //-- void setCommandMap(com.regaltec.rsas.common.config.configparser.CommandMap) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.CommandMaps) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.CommandMaps.class, reader);
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
