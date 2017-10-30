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
 * Class DimItemRights.
 * 
 * @version $Revision$ $Date$
 */
public class DimItemRights implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �û�ѡȡ��
     */
    private java.util.Vector _dimItemRightList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimItemRights() {
        super();
        _dimItemRightList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimItemRights()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimItemRight
     * 
     * @param vDimItemRight
     */
    public void addDimItemRight(com.ccssoft.rsas.common.xmlparser.DimItemRight vDimItemRight)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemRightList.addElement(vDimItemRight);
    } //-- void addDimItemRight(com.regaltec.rsas.common.xmlparser.DimItemRight) 

    /**
     * Method addDimItemRight
     * 
     * @param index
     * @param vDimItemRight
     */
    public void addDimItemRight(int index, com.ccssoft.rsas.common.xmlparser.DimItemRight vDimItemRight)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemRightList.insertElementAt(vDimItemRight, index);
    } //-- void addDimItemRight(int, com.regaltec.rsas.common.xmlparser.DimItemRight) 

    /**
     * Method enumerateDimItemRight
     */
    public java.util.Enumeration enumerateDimItemRight()
    {
        return _dimItemRightList.elements();
    } //-- java.util.Enumeration enumerateDimItemRight() 

    /**
     * Method getDimItemRight
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemRight getDimItemRight(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemRightList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimItemRight) _dimItemRightList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimItemRight getDimItemRight(int) 

    /**
     * Method getDimItemRight
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemRight[] getDimItemRight()
    {
        int size = _dimItemRightList.size();
        com.ccssoft.rsas.common.xmlparser.DimItemRight[] mArray = new com.ccssoft.rsas.common.xmlparser.DimItemRight[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimItemRight) _dimItemRightList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimItemRight[] getDimItemRight() 

    /**
     * Method getDimItemRightCount
     */
    public int getDimItemRightCount()
    {
        return _dimItemRightList.size();
    } //-- int getDimItemRightCount() 

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
     * Method removeAllDimItemRight
     */
    public void removeAllDimItemRight()
    {
        _dimItemRightList.removeAllElements();
    } //-- void removeAllDimItemRight() 

    /**
     * Method removeDimItemRight
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemRight removeDimItemRight(int index)
    {
        java.lang.Object obj = _dimItemRightList.elementAt(index);
        _dimItemRightList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimItemRight) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimItemRight removeDimItemRight(int) 

    /**
     * Method setDimItemRight
     * 
     * @param index
     * @param vDimItemRight
     */
    public void setDimItemRight(int index, com.ccssoft.rsas.common.xmlparser.DimItemRight vDimItemRight)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemRightList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimItemRightList.setElementAt(vDimItemRight, index);
    } //-- void setDimItemRight(int, com.regaltec.rsas.common.xmlparser.DimItemRight) 

    /**
     * Method setDimItemRight
     * 
     * @param dimItemRightArray
     */
    public void setDimItemRight(com.ccssoft.rsas.common.xmlparser.DimItemRight[] dimItemRightArray)
    {
        //-- copy array
        _dimItemRightList.removeAllElements();
        for (int i = 0; i < dimItemRightArray.length; i++) {
            _dimItemRightList.addElement(dimItemRightArray[i]);
        }
    } //-- void setDimItemRight(com.regaltec.rsas.common.xmlparser.DimItemRight) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimItemRights) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimItemRights.class, reader);
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
