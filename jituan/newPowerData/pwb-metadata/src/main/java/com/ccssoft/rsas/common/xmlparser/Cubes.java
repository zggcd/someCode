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
 * Class Cubes.
 * 
 * @version $Revision$ $Date$
 */
public class Cubes implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������
     */
    private java.util.Vector _cubeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Cubes() {
        super();
        _cubeList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Cubes()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCube
     * 
     * @param vCube
     */
    public void addCube(com.ccssoft.rsas.common.xmlparser.Cube vCube)
        throws java.lang.IndexOutOfBoundsException
    {
        _cubeList.addElement(vCube);
    } //-- void addCube(com.regaltec.rsas.common.xmlparser.Cube) 

    /**
     * Method addCube
     * 
     * @param index
     * @param vCube
     */
    public void addCube(int index, com.ccssoft.rsas.common.xmlparser.Cube vCube)
        throws java.lang.IndexOutOfBoundsException
    {
        _cubeList.insertElementAt(vCube, index);
    } //-- void addCube(int, com.regaltec.rsas.common.xmlparser.Cube) 

    /**
     * Method enumerateCube
     */
    public java.util.Enumeration enumerateCube()
    {
        return _cubeList.elements();
    } //-- java.util.Enumeration enumerateCube() 

    /**
     * Method getCube
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Cube getCube(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _cubeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Cube) _cubeList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Cube getCube(int) 

    /**
     * Method getCube
     */
    public com.ccssoft.rsas.common.xmlparser.Cube[] getCube()
    {
        int size = _cubeList.size();
        com.ccssoft.rsas.common.xmlparser.Cube[] mArray = new com.ccssoft.rsas.common.xmlparser.Cube[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Cube) _cubeList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Cube[] getCube() 

    /**
     * Method getCubeCount
     */
    public int getCubeCount()
    {
        return _cubeList.size();
    } //-- int getCubeCount() 

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
     * Method removeAllCube
     */
    public void removeAllCube()
    {
        _cubeList.removeAllElements();
    } //-- void removeAllCube() 

    /**
     * Method removeCube
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Cube removeCube(int index)
    {
        java.lang.Object obj = _cubeList.elementAt(index);
        _cubeList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Cube) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Cube removeCube(int) 

    /**
     * Method setCube
     * 
     * @param index
     * @param vCube
     */
    public void setCube(int index, com.ccssoft.rsas.common.xmlparser.Cube vCube)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _cubeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _cubeList.setElementAt(vCube, index);
    } //-- void setCube(int, com.regaltec.rsas.common.xmlparser.Cube) 

    /**
     * Method setCube
     * 
     * @param cubeArray
     */
    public void setCube(com.ccssoft.rsas.common.xmlparser.Cube[] cubeArray)
    {
        //-- copy array
        _cubeList.removeAllElements();
        for (int i = 0; i < cubeArray.length; i++) {
            _cubeList.addElement(cubeArray[i]);
        }
    } //-- void setCube(com.regaltec.rsas.common.xmlparser.Cube) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Cubes) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Cubes.class, reader);
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
