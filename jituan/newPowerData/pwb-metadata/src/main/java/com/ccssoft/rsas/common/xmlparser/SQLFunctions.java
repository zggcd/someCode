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
 * Class SQLFunctions.
 * 
 * @version $Revision$ $Date$
 */
public class SQLFunctions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
     */
    private java.util.Vector _SQLFunctionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SQLFunctions() {
        super();
        _SQLFunctionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunctions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSQLFunction
     * 
     * @param vSQLFunction
     */
    public void addSQLFunction(com.ccssoft.rsas.common.xmlparser.SQLFunction vSQLFunction)
        throws java.lang.IndexOutOfBoundsException
    {
        _SQLFunctionList.addElement(vSQLFunction);
    } //-- void addSQLFunction(com.regaltec.rsas.common.xmlparser.SQLFunction) 

    /**
     * Method addSQLFunction
     * 
     * @param index
     * @param vSQLFunction
     */
    public void addSQLFunction(int index, com.ccssoft.rsas.common.xmlparser.SQLFunction vSQLFunction)
        throws java.lang.IndexOutOfBoundsException
    {
        _SQLFunctionList.insertElementAt(vSQLFunction, index);
    } //-- void addSQLFunction(int, com.regaltec.rsas.common.xmlparser.SQLFunction) 

    /**
     * Method enumerateSQLFunction
     */
    public java.util.Enumeration enumerateSQLFunction()
    {
        return _SQLFunctionList.elements();
    } //-- java.util.Enumeration enumerateSQLFunction() 

    /**
     * Method getSQLFunction
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.SQLFunction getSQLFunction(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _SQLFunctionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.SQLFunction) _SQLFunctionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunction getSQLFunction(int) 

    /**
     * Method getSQLFunction
     */
    public com.ccssoft.rsas.common.xmlparser.SQLFunction[] getSQLFunction()
    {
        int size = _SQLFunctionList.size();
        com.ccssoft.rsas.common.xmlparser.SQLFunction[] mArray = new com.ccssoft.rsas.common.xmlparser.SQLFunction[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.SQLFunction) _SQLFunctionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunction[] getSQLFunction() 

    /**
     * Method getSQLFunctionCount
     */
    public int getSQLFunctionCount()
    {
        return _SQLFunctionList.size();
    } //-- int getSQLFunctionCount() 

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
     * Method removeAllSQLFunction
     */
    public void removeAllSQLFunction()
    {
        _SQLFunctionList.removeAllElements();
    } //-- void removeAllSQLFunction() 

    /**
     * Method removeSQLFunction
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.SQLFunction removeSQLFunction(int index)
    {
        java.lang.Object obj = _SQLFunctionList.elementAt(index);
        _SQLFunctionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.SQLFunction) obj;
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunction removeSQLFunction(int) 

    /**
     * Method setSQLFunction
     * 
     * @param index
     * @param vSQLFunction
     */
    public void setSQLFunction(int index, com.ccssoft.rsas.common.xmlparser.SQLFunction vSQLFunction)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _SQLFunctionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _SQLFunctionList.setElementAt(vSQLFunction, index);
    } //-- void setSQLFunction(int, com.regaltec.rsas.common.xmlparser.SQLFunction) 

    /**
     * Method setSQLFunction
     * 
     * @param SQLFunctionArray
     */
    public void setSQLFunction(com.ccssoft.rsas.common.xmlparser.SQLFunction[] SQLFunctionArray)
    {
        //-- copy array
        _SQLFunctionList.removeAllElements();
        for (int i = 0; i < SQLFunctionArray.length; i++) {
            _SQLFunctionList.addElement(SQLFunctionArray[i]);
        }
    } //-- void setSQLFunction(com.regaltec.rsas.common.xmlparser.SQLFunction) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.SQLFunctions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.SQLFunctions.class, reader);
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
