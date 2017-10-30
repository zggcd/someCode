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

import com.ccssoft.rsas.common.xmlparser.types.FilterDataTypeType;
import com.ccssoft.rsas.common.xmlparser.types.FilterLeftFilterTypeType;
import com.ccssoft.rsas.common.xmlparser.types.FilterOperSymbolType;
import com.ccssoft.rsas.common.xmlparser.types.FilterRightFilterTypeType;

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
 * ����������
 * 
 * @version $Revision$ $Date$
 */
public class Filter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataType
     */
    private com.ccssoft.rsas.common.xmlparser.types.FilterDataTypeType _dataType;

    /**
     * ��ʱfltHaving�� leftOper�������ԱID;������ΪfltRuleʱ���Ҳ���������ҲΪfltRule
     */
    private com.ccssoft.rsas.common.xmlparser.types.FilterLeftFilterTypeType _leftFilterType;

    /**
     * Field _leftOwner
     */
    private java.lang.String _leftOwner;

    /**
     * Field _leftOper
     */
    private java.lang.String _leftOper;

    /**
     * Field _leftDesc
     */
    private java.lang.String _leftDesc;

    /**
     * Field _leftFuncParams
     */
    private java.lang.String _leftFuncParams;

    /**
     * Field _operSymbol
     */
    private com.ccssoft.rsas.common.xmlparser.types.FilterOperSymbolType _operSymbol;

    /**
     * Field _rightFilterType
     */
    private com.ccssoft.rsas.common.xmlparser.types.FilterRightFilterTypeType _rightFilterType;

    /**
     * Field _rightOwner
     */
    private java.lang.String _rightOwner;

    /**
     * Field _rightOper
     */
    private java.lang.String _rightOper;

    /**
     * Field _rightDesc
     */
    private java.lang.String _rightDesc;

    /**
     * Field _rightFuncParams
     */
    private java.lang.String _rightFuncParams;

    /**
     * ʵ��ʹ�õı��ʽ
     */
    private java.lang.String _expression;

    /**
     * ���ʽ������
     */
    private java.lang.String _expressDesc;

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
     * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
     */
    private java.util.Vector _SQLFunctionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Filter() {
        super();
        _SQLFunctionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Filter()


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
        if (!(_SQLFunctionList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
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
        if (!(_SQLFunctionList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
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
     * Returns the value of field 'dataType'.
     * 
     * @return the value of field 'dataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FilterDataTypeType getDataType()
    {
        return this._dataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FilterDataTypeType getDataType() 

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
     * Returns the value of field 'expressDesc'. The field
     * 'expressDesc' has the following description: ���ʽ������
     * 
     * @return the value of field 'expressDesc'.
     */
    public java.lang.String getExpressDesc()
    {
        return this._expressDesc;
    } //-- java.lang.String getExpressDesc() 

    /**
     * Returns the value of field 'expression'. The field
     * 'expression' has the following description: ʵ��ʹ�õı��ʽ
     * 
     * @return the value of field 'expression'.
     */
    public java.lang.String getExpression()
    {
        return this._expression;
    } //-- java.lang.String getExpression() 

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
     * Returns the value of field 'leftDesc'.
     * 
     * @return the value of field 'leftDesc'.
     */
    public java.lang.String getLeftDesc()
    {
        return this._leftDesc;
    } //-- java.lang.String getLeftDesc() 

    /**
     * Returns the value of field 'leftFilterType'. The field
     * 'leftFilterType' has the following description: ��ʱfltHaving��
     * leftOper�������ԱID;������ΪfltRuleʱ���Ҳ���������ҲΪfltRule
     * 
     * @return the value of field 'leftFilterType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FilterLeftFilterTypeType getLeftFilterType()
    {
        return this._leftFilterType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FilterLeftFilterTypeType getLeftFilterType() 

    /**
     * Returns the value of field 'leftFuncParams'.
     * 
     * @return the value of field 'leftFuncParams'.
     */
    public java.lang.String getLeftFuncParams()
    {
        return this._leftFuncParams;
    } //-- java.lang.String getLeftFuncParams() 

    /**
     * Returns the value of field 'leftOper'.
     * 
     * @return the value of field 'leftOper'.
     */
    public java.lang.String getLeftOper()
    {
        return this._leftOper;
    } //-- java.lang.String getLeftOper() 

    /**
     * Returns the value of field 'leftOwner'.
     * 
     * @return the value of field 'leftOwner'.
     */
    public java.lang.String getLeftOwner()
    {
        return this._leftOwner;
    } //-- java.lang.String getLeftOwner() 

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
     * Returns the value of field 'operSymbol'.
     * 
     * @return the value of field 'operSymbol'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FilterOperSymbolType getOperSymbol()
    {
        return this._operSymbol;
    } //-- com.regaltec.rsas.common.xmlparser.types.FilterOperSymbolType getOperSymbol() 

    /**
     * Returns the value of field 'rightDesc'.
     * 
     * @return the value of field 'rightDesc'.
     */
    public java.lang.String getRightDesc()
    {
        return this._rightDesc;
    } //-- java.lang.String getRightDesc() 

    /**
     * Returns the value of field 'rightFilterType'.
     * 
     * @return the value of field 'rightFilterType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FilterRightFilterTypeType getRightFilterType()
    {
        return this._rightFilterType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FilterRightFilterTypeType getRightFilterType() 

    /**
     * Returns the value of field 'rightFuncParams'.
     * 
     * @return the value of field 'rightFuncParams'.
     */
    public java.lang.String getRightFuncParams()
    {
        return this._rightFuncParams;
    } //-- java.lang.String getRightFuncParams() 

    /**
     * Returns the value of field 'rightOper'.
     * 
     * @return the value of field 'rightOper'.
     */
    public java.lang.String getRightOper()
    {
        return this._rightOper;
    } //-- java.lang.String getRightOper() 

    /**
     * Returns the value of field 'rightOwner'.
     * 
     * @return the value of field 'rightOwner'.
     */
    public java.lang.String getRightOwner()
    {
        return this._rightOwner;
    } //-- java.lang.String getRightOwner() 

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
     * Sets the value of field 'dataType'.
     * 
     * @param dataType the value of field 'dataType'.
     */
    public void setDataType(com.ccssoft.rsas.common.xmlparser.types.FilterDataTypeType dataType)
    {
        this._dataType = dataType;
    } //-- void setDataType(com.regaltec.rsas.common.xmlparser.types.FilterDataTypeType) 

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
     * Sets the value of field 'expressDesc'. The field
     * 'expressDesc' has the following description: ���ʽ������
     * 
     * @param expressDesc the value of field 'expressDesc'.
     */
    public void setExpressDesc(java.lang.String expressDesc)
    {
        this._expressDesc = expressDesc;
    } //-- void setExpressDesc(java.lang.String) 

    /**
     * Sets the value of field 'expression'. The field 'expression'
     * has the following description: ʵ��ʹ�õı��ʽ
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(java.lang.String expression)
    {
        this._expression = expression;
    } //-- void setExpression(java.lang.String) 

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
     * Sets the value of field 'leftDesc'.
     * 
     * @param leftDesc the value of field 'leftDesc'.
     */
    public void setLeftDesc(java.lang.String leftDesc)
    {
        this._leftDesc = leftDesc;
    } //-- void setLeftDesc(java.lang.String) 

    /**
     * Sets the value of field 'leftFilterType'. The field
     * 'leftFilterType' has the following description: ��ʱfltHaving��
     * leftOper�������ԱID;������ΪfltRuleʱ���Ҳ���������ҲΪfltRule
     * 
     * @param leftFilterType the value of field 'leftFilterType'.
     */
    public void setLeftFilterType(com.ccssoft.rsas.common.xmlparser.types.FilterLeftFilterTypeType leftFilterType)
    {
        this._leftFilterType = leftFilterType;
    } //-- void setLeftFilterType(com.regaltec.rsas.common.xmlparser.types.FilterLeftFilterTypeType) 

    /**
     * Sets the value of field 'leftFuncParams'.
     * 
     * @param leftFuncParams the value of field 'leftFuncParams'.
     */
    public void setLeftFuncParams(java.lang.String leftFuncParams)
    {
        this._leftFuncParams = leftFuncParams;
    } //-- void setLeftFuncParams(java.lang.String) 

    /**
     * Sets the value of field 'leftOper'.
     * 
     * @param leftOper the value of field 'leftOper'.
     */
    public void setLeftOper(java.lang.String leftOper)
    {
        this._leftOper = leftOper;
    } //-- void setLeftOper(java.lang.String) 

    /**
     * Sets the value of field 'leftOwner'.
     * 
     * @param leftOwner the value of field 'leftOwner'.
     */
    public void setLeftOwner(java.lang.String leftOwner)
    {
        this._leftOwner = leftOwner;
    } //-- void setLeftOwner(java.lang.String) 

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
     * Sets the value of field 'operSymbol'.
     * 
     * @param operSymbol the value of field 'operSymbol'.
     */
    public void setOperSymbol(com.ccssoft.rsas.common.xmlparser.types.FilterOperSymbolType operSymbol)
    {
        this._operSymbol = operSymbol;
    } //-- void setOperSymbol(com.regaltec.rsas.common.xmlparser.types.FilterOperSymbolType) 

    /**
     * Sets the value of field 'rightDesc'.
     * 
     * @param rightDesc the value of field 'rightDesc'.
     */
    public void setRightDesc(java.lang.String rightDesc)
    {
        this._rightDesc = rightDesc;
    } //-- void setRightDesc(java.lang.String) 

    /**
     * Sets the value of field 'rightFilterType'.
     * 
     * @param rightFilterType the value of field 'rightFilterType'.
     */
    public void setRightFilterType(com.ccssoft.rsas.common.xmlparser.types.FilterRightFilterTypeType rightFilterType)
    {
        this._rightFilterType = rightFilterType;
    } //-- void setRightFilterType(com.regaltec.rsas.common.xmlparser.types.FilterRightFilterTypeType) 

    /**
     * Sets the value of field 'rightFuncParams'.
     * 
     * @param rightFuncParams the value of field 'rightFuncParams'.
     */
    public void setRightFuncParams(java.lang.String rightFuncParams)
    {
        this._rightFuncParams = rightFuncParams;
    } //-- void setRightFuncParams(java.lang.String) 

    /**
     * Sets the value of field 'rightOper'.
     * 
     * @param rightOper the value of field 'rightOper'.
     */
    public void setRightOper(java.lang.String rightOper)
    {
        this._rightOper = rightOper;
    } //-- void setRightOper(java.lang.String) 

    /**
     * Sets the value of field 'rightOwner'.
     * 
     * @param rightOwner the value of field 'rightOwner'.
     */
    public void setRightOwner(java.lang.String rightOwner)
    {
        this._rightOwner = rightOwner;
    } //-- void setRightOwner(java.lang.String) 

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
        if (!(index < 2)) {
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
        return (com.ccssoft.rsas.common.xmlparser.Filter) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Filter.class, reader);
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
