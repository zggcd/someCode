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

import com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType;
import com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncTypeType;

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
 * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
 * 
 * @version $Revision$ $Date$
 */
public class SQLFunction implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _funcExp
     */
    private java.lang.String _funcExp;

    /**
     * Field _funcExcuteExp
     */
    private java.lang.String _funcExcuteExp;

    /**
     * Field _funcCategory
     */
    private com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType _funcCategory;

    /**
     * Field _funcType
     */
    private com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncTypeType _funcType;

    /**
     * Field _funcClass
     */
    private java.lang.String _funcClass;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _parametersList
     */
    private java.util.Vector _parametersList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SQLFunction() {
        super();
        _parametersList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunction()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addParameters
     * 
     * @param vParameters
     */
    public void addParameters(com.ccssoft.rsas.common.xmlparser.Parameters vParameters)
        throws java.lang.IndexOutOfBoundsException
    {
        _parametersList.addElement(vParameters);
    } //-- void addParameters(com.regaltec.rsas.common.xmlparser.Parameters) 

    /**
     * Method addParameters
     * 
     * @param index
     * @param vParameters
     */
    public void addParameters(int index, com.ccssoft.rsas.common.xmlparser.Parameters vParameters)
        throws java.lang.IndexOutOfBoundsException
    {
        _parametersList.insertElementAt(vParameters, index);
    } //-- void addParameters(int, com.regaltec.rsas.common.xmlparser.Parameters) 

    /**
     * Method enumerateParameters
     */
    public java.util.Enumeration enumerateParameters()
    {
        return _parametersList.elements();
    } //-- java.util.Enumeration enumerateParameters() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'funcCategory'.
     * 
     * @return the value of field 'funcCategory'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType getFuncCategory()
    {
        return this._funcCategory;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType getFuncCategory() 

    /**
     * Returns the value of field 'funcClass'.
     * 
     * @return the value of field 'funcClass'.
     */
    public java.lang.String getFuncClass()
    {
        return this._funcClass;
    } //-- java.lang.String getFuncClass() 

    /**
     * Returns the value of field 'funcExcuteExp'.
     * 
     * @return the value of field 'funcExcuteExp'.
     */
    public java.lang.String getFuncExcuteExp()
    {
        return this._funcExcuteExp;
    } //-- java.lang.String getFuncExcuteExp() 

    /**
     * Returns the value of field 'funcExp'.
     * 
     * @return the value of field 'funcExp'.
     */
    public java.lang.String getFuncExp()
    {
        return this._funcExp;
    } //-- java.lang.String getFuncExp() 

    /**
     * Returns the value of field 'funcType'.
     * 
     * @return the value of field 'funcType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncTypeType getFuncType()
    {
        return this._funcType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncTypeType getFuncType() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Method getParameters
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Parameters getParameters(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _parametersList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Parameters) _parametersList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Parameters getParameters(int) 

    /**
     * Method getParameters
     */
    public com.ccssoft.rsas.common.xmlparser.Parameters[] getParameters()
    {
        int size = _parametersList.size();
        com.ccssoft.rsas.common.xmlparser.Parameters[] mArray = new com.ccssoft.rsas.common.xmlparser.Parameters[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Parameters) _parametersList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Parameters[] getParameters() 

    /**
     * Method getParametersCount
     */
    public int getParametersCount()
    {
        return _parametersList.size();
    } //-- int getParametersCount() 

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
     * Method removeAllParameters
     */
    public void removeAllParameters()
    {
        _parametersList.removeAllElements();
    } //-- void removeAllParameters() 

    /**
     * Method removeParameters
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Parameters removeParameters(int index)
    {
        java.lang.Object obj = _parametersList.elementAt(index);
        _parametersList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Parameters) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Parameters removeParameters(int) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'funcCategory'.
     * 
     * @param funcCategory the value of field 'funcCategory'.
     */
    public void setFuncCategory(com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType funcCategory)
    {
        this._funcCategory = funcCategory;
    } //-- void setFuncCategory(com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType) 

    /**
     * Sets the value of field 'funcClass'.
     * 
     * @param funcClass the value of field 'funcClass'.
     */
    public void setFuncClass(java.lang.String funcClass)
    {
        this._funcClass = funcClass;
    } //-- void setFuncClass(java.lang.String) 

    /**
     * Sets the value of field 'funcExcuteExp'.
     * 
     * @param funcExcuteExp the value of field 'funcExcuteExp'.
     */
    public void setFuncExcuteExp(java.lang.String funcExcuteExp)
    {
        this._funcExcuteExp = funcExcuteExp;
    } //-- void setFuncExcuteExp(java.lang.String) 

    /**
     * Sets the value of field 'funcExp'.
     * 
     * @param funcExp the value of field 'funcExp'.
     */
    public void setFuncExp(java.lang.String funcExp)
    {
        this._funcExp = funcExp;
    } //-- void setFuncExp(java.lang.String) 

    /**
     * Sets the value of field 'funcType'.
     * 
     * @param funcType the value of field 'funcType'.
     */
    public void setFuncType(com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncTypeType funcType)
    {
        this._funcType = funcType;
    } //-- void setFuncType(com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncTypeType) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method setParameters
     * 
     * @param index
     * @param vParameters
     */
    public void setParameters(int index, com.ccssoft.rsas.common.xmlparser.Parameters vParameters)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _parametersList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _parametersList.setElementAt(vParameters, index);
    } //-- void setParameters(int, com.regaltec.rsas.common.xmlparser.Parameters) 

    /**
     * Method setParameters
     * 
     * @param parametersArray
     */
    public void setParameters(com.ccssoft.rsas.common.xmlparser.Parameters[] parametersArray)
    {
        //-- copy array
        _parametersList.removeAllElements();
        for (int i = 0; i < parametersArray.length; i++) {
            _parametersList.addElement(parametersArray[i]);
        }
    } //-- void setParameters(com.regaltec.rsas.common.xmlparser.Parameters) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.SQLFunction) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.SQLFunction.class, reader);
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
