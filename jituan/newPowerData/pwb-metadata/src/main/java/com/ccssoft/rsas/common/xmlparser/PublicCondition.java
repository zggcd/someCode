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
 * Class PublicCondition.
 * 
 * @version $Revision$ $Date$
 */
public class PublicCondition implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ָ����������ֵ����ӳ���ϵ
     */
    private int _conditionMapOrd;

    /**
     * keeps track of state for field: _conditionMapOrd
     */
    private boolean _has_conditionMapOrd;

    /**
     * ����ɸѡ��������
     */
    private java.util.Vector _conditionList;

    /**
     * Field _conditionSetValue
     */
    private com.ccssoft.rsas.common.xmlparser.ConditionSetValue _conditionSetValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public PublicCondition() {
        super();
        _conditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PublicCondition()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCondition
     * 
     * @param vCondition
     */
    public void addCondition(com.ccssoft.rsas.common.xmlparser.Condition vCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionList.addElement(vCondition);
    } //-- void addCondition(com.regaltec.rsas.common.xmlparser.Condition) 

    /**
     * Method addCondition
     * 
     * @param index
     * @param vCondition
     */
    public void addCondition(int index, com.ccssoft.rsas.common.xmlparser.Condition vCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionList.insertElementAt(vCondition, index);
    } //-- void addCondition(int, com.regaltec.rsas.common.xmlparser.Condition) 

    /**
     * Method deleteConditionMapOrd
     */
    public void deleteConditionMapOrd()
    {
        this._has_conditionMapOrd= false;
    } //-- void deleteConditionMapOrd() 

    /**
     * Method enumerateCondition
     */
    public java.util.Enumeration enumerateCondition()
    {
        return _conditionList.elements();
    } //-- java.util.Enumeration enumerateCondition() 

    /**
     * Method getCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Condition getCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Condition) _conditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Condition getCondition(int) 

    /**
     * Method getCondition
     */
    public com.ccssoft.rsas.common.xmlparser.Condition[] getCondition()
    {
        int size = _conditionList.size();
        com.ccssoft.rsas.common.xmlparser.Condition[] mArray = new com.ccssoft.rsas.common.xmlparser.Condition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Condition) _conditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Condition[] getCondition() 

    /**
     * Method getConditionCount
     */
    public int getConditionCount()
    {
        return _conditionList.size();
    } //-- int getConditionCount() 

    /**
     * Returns the value of field 'conditionMapOrd'. The field
     * 'conditionMapOrd' has the following description:
     * ָ����������ֵ����ӳ���ϵ
     * 
     * @return the value of field 'conditionMapOrd'.
     */
    public int getConditionMapOrd()
    {
        return this._conditionMapOrd;
    } //-- int getConditionMapOrd() 

    /**
     * Returns the value of field 'conditionSetValue'.
     * 
     * @return the value of field 'conditionSetValue'.
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue getConditionSetValue()
    {
        return this._conditionSetValue;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue getConditionSetValue() 

    /**
     * Method hasConditionMapOrd
     */
    public boolean hasConditionMapOrd()
    {
        return this._has_conditionMapOrd;
    } //-- boolean hasConditionMapOrd() 

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
     * Method removeAllCondition
     */
    public void removeAllCondition()
    {
        _conditionList.removeAllElements();
    } //-- void removeAllCondition() 

    /**
     * Method removeCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Condition removeCondition(int index)
    {
        java.lang.Object obj = _conditionList.elementAt(index);
        _conditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Condition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Condition removeCondition(int) 

    /**
     * Method setCondition
     * 
     * @param index
     * @param vCondition
     */
    public void setCondition(int index, com.ccssoft.rsas.common.xmlparser.Condition vCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionList.setElementAt(vCondition, index);
    } //-- void setCondition(int, com.regaltec.rsas.common.xmlparser.Condition) 

    /**
     * Method setCondition
     * 
     * @param conditionArray
     */
    public void setCondition(com.ccssoft.rsas.common.xmlparser.Condition[] conditionArray)
    {
        //-- copy array
        _conditionList.removeAllElements();
        for (int i = 0; i < conditionArray.length; i++) {
            _conditionList.addElement(conditionArray[i]);
        }
    } //-- void setCondition(com.regaltec.rsas.common.xmlparser.Condition) 

    /**
     * Sets the value of field 'conditionMapOrd'. The field
     * 'conditionMapOrd' has the following description:
     * ָ����������ֵ����ӳ���ϵ
     * 
     * @param conditionMapOrd the value of field 'conditionMapOrd'.
     */
    public void setConditionMapOrd(int conditionMapOrd)
    {
        this._conditionMapOrd = conditionMapOrd;
        this._has_conditionMapOrd = true;
    } //-- void setConditionMapOrd(int) 

    /**
     * Sets the value of field 'conditionSetValue'.
     * 
     * @param conditionSetValue the value of field
     * 'conditionSetValue'.
     */
    public void setConditionSetValue(com.ccssoft.rsas.common.xmlparser.ConditionSetValue conditionSetValue)
    {
        this._conditionSetValue = conditionSetValue;
    } //-- void setConditionSetValue(com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PublicCondition) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PublicCondition.class, reader);
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
