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
 * Class Procedures.
 * 
 * @version $Revision$ $Date$
 */
public class Procedures implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ҫ���еĴ洢����
     */
    private java.util.Vector _procedureList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Procedures() {
        super();
        _procedureList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Procedures()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addProcedure
     * 
     * @param vProcedure
     */
    public void addProcedure(com.ccssoft.rsas.common.xmlparser.Procedure vProcedure)
        throws java.lang.IndexOutOfBoundsException
    {
        _procedureList.addElement(vProcedure);
    } //-- void addProcedure(com.regaltec.rsas.common.xmlparser.Procedure) 

    /**
     * Method addProcedure
     * 
     * @param index
     * @param vProcedure
     */
    public void addProcedure(int index, com.ccssoft.rsas.common.xmlparser.Procedure vProcedure)
        throws java.lang.IndexOutOfBoundsException
    {
        _procedureList.insertElementAt(vProcedure, index);
    } //-- void addProcedure(int, com.regaltec.rsas.common.xmlparser.Procedure) 

    /**
     * Method enumerateProcedure
     */
    public java.util.Enumeration enumerateProcedure()
    {
        return _procedureList.elements();
    } //-- java.util.Enumeration enumerateProcedure() 

    /**
     * Method getProcedure
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Procedure getProcedure(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _procedureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Procedure) _procedureList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Procedure getProcedure(int) 

    /**
     * Method getProcedure
     */
    public com.ccssoft.rsas.common.xmlparser.Procedure[] getProcedure()
    {
        int size = _procedureList.size();
        com.ccssoft.rsas.common.xmlparser.Procedure[] mArray = new com.ccssoft.rsas.common.xmlparser.Procedure[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Procedure) _procedureList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Procedure[] getProcedure() 

    /**
     * Method getProcedureCount
     */
    public int getProcedureCount()
    {
        return _procedureList.size();
    } //-- int getProcedureCount() 

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
     * Method removeAllProcedure
     */
    public void removeAllProcedure()
    {
        _procedureList.removeAllElements();
    } //-- void removeAllProcedure() 

    /**
     * Method removeProcedure
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Procedure removeProcedure(int index)
    {
        java.lang.Object obj = _procedureList.elementAt(index);
        _procedureList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Procedure) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Procedure removeProcedure(int) 

    /**
     * Method setProcedure
     * 
     * @param index
     * @param vProcedure
     */
    public void setProcedure(int index, com.ccssoft.rsas.common.xmlparser.Procedure vProcedure)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _procedureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _procedureList.setElementAt(vProcedure, index);
    } //-- void setProcedure(int, com.regaltec.rsas.common.xmlparser.Procedure) 

    /**
     * Method setProcedure
     * 
     * @param procedureArray
     */
    public void setProcedure(com.ccssoft.rsas.common.xmlparser.Procedure[] procedureArray)
    {
        //-- copy array
        _procedureList.removeAllElements();
        for (int i = 0; i < procedureArray.length; i++) {
            _procedureList.addElement(procedureArray[i]);
        }
    } //-- void setProcedure(com.regaltec.rsas.common.xmlparser.Procedure) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Procedures) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Procedures.class, reader);
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
