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
 * Class ProcedureParams.
 * 
 * @version $Revision$ $Date$
 */
public class ProcedureParams implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _procedureParamList
     */
    private java.util.Vector _procedureParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcedureParams() {
        super();
        _procedureParamList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParams()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addProcedureParam
     * 
     * @param vProcedureParam
     */
    public void addProcedureParam(com.ccssoft.rsas.common.xmlparser.ProcedureParam vProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _procedureParamList.addElement(vProcedureParam);
    } //-- void addProcedureParam(com.regaltec.rsas.common.xmlparser.ProcedureParam) 

    /**
     * Method addProcedureParam
     * 
     * @param index
     * @param vProcedureParam
     */
    public void addProcedureParam(int index, com.ccssoft.rsas.common.xmlparser.ProcedureParam vProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _procedureParamList.insertElementAt(vProcedureParam, index);
    } //-- void addProcedureParam(int, com.regaltec.rsas.common.xmlparser.ProcedureParam) 

    /**
     * Method enumerateProcedureParam
     */
    public java.util.Enumeration enumerateProcedureParam()
    {
        return _procedureParamList.elements();
    } //-- java.util.Enumeration enumerateProcedureParam() 

    /**
     * Method getProcedureParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ProcedureParam getProcedureParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _procedureParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ProcedureParam) _procedureParamList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParam getProcedureParam(int) 

    /**
     * Method getProcedureParam
     */
    public com.ccssoft.rsas.common.xmlparser.ProcedureParam[] getProcedureParam()
    {
        int size = _procedureParamList.size();
        com.ccssoft.rsas.common.xmlparser.ProcedureParam[] mArray = new com.ccssoft.rsas.common.xmlparser.ProcedureParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ProcedureParam) _procedureParamList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParam[] getProcedureParam() 

    /**
     * Method getProcedureParamCount
     */
    public int getProcedureParamCount()
    {
        return _procedureParamList.size();
    } //-- int getProcedureParamCount() 

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
     * Method removeAllProcedureParam
     */
    public void removeAllProcedureParam()
    {
        _procedureParamList.removeAllElements();
    } //-- void removeAllProcedureParam() 

    /**
     * Method removeProcedureParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ProcedureParam removeProcedureParam(int index)
    {
        java.lang.Object obj = _procedureParamList.elementAt(index);
        _procedureParamList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ProcedureParam) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParam removeProcedureParam(int) 

    /**
     * Method setProcedureParam
     * 
     * @param index
     * @param vProcedureParam
     */
    public void setProcedureParam(int index, com.ccssoft.rsas.common.xmlparser.ProcedureParam vProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _procedureParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _procedureParamList.setElementAt(vProcedureParam, index);
    } //-- void setProcedureParam(int, com.regaltec.rsas.common.xmlparser.ProcedureParam) 

    /**
     * Method setProcedureParam
     * 
     * @param procedureParamArray
     */
    public void setProcedureParam(com.ccssoft.rsas.common.xmlparser.ProcedureParam[] procedureParamArray)
    {
        //-- copy array
        _procedureParamList.removeAllElements();
        for (int i = 0; i < procedureParamArray.length; i++) {
            _procedureParamList.addElement(procedureParamArray[i]);
        }
    } //-- void setProcedureParam(com.regaltec.rsas.common.xmlparser.ProcedureParam) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ProcedureParams) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ProcedureParams.class, reader);
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
