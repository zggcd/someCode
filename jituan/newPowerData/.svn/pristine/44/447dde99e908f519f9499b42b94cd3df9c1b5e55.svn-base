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
 * Class MIDPubCondition.
 * 
 * @version $Revision$ $Date$
 */
public class MIDPubCondition implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _pubConditionID
     */
    private java.lang.String _pubConditionID;

    /**
     * �Ƿ���
     */
    private byte _ISMIDShow;

    /**
     * keeps track of state for field: _ISMIDShow
     */
    private boolean _has_ISMIDShow;

    /**
     * �Ƿ����������
     */
    private java.lang.Object _ISCaptionCondition;

    /**
     * ��ǰָ�����ɵ�����
     */
    private com.ccssoft.rsas.common.xmlparser.Conditions _conditions;

    /**
     * Field _conditionSetValueList
     */
    private java.util.Vector _conditionSetValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDPubCondition() {
        super();
        _conditionSetValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubCondition()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionSetValue
     * 
     * @param vConditionSetValue
     */
    public void addConditionSetValue(com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionSetValueList.addElement(vConditionSetValue);
    } //-- void addConditionSetValue(com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method addConditionSetValue
     * 
     * @param index
     * @param vConditionSetValue
     */
    public void addConditionSetValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionSetValueList.insertElementAt(vConditionSetValue, index);
    } //-- void addConditionSetValue(int, com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method deleteISMIDShow
     */
    public void deleteISMIDShow()
    {
        this._has_ISMIDShow= false;
    } //-- void deleteISMIDShow() 

    /**
     * Method enumerateConditionSetValue
     */
    public java.util.Enumeration enumerateConditionSetValue()
    {
        return _conditionSetValueList.elements();
    } //-- java.util.Enumeration enumerateConditionSetValue() 

    /**
     * Method getConditionSetValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue getConditionSetValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionSetValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) _conditionSetValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue getConditionSetValue(int) 

    /**
     * Method getConditionSetValue
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] getConditionSetValue()
    {
        int size = _conditionSetValueList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionSetValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) _conditionSetValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue[] getConditionSetValue() 

    /**
     * Method getConditionSetValueCount
     */
    public int getConditionSetValueCount()
    {
        return _conditionSetValueList.size();
    } //-- int getConditionSetValueCount() 

    /**
     * Returns the value of field 'conditions'. The field
     * 'conditions' has the following description: ��ǰָ�����ɵ�����
     * 
     * @return the value of field 'conditions'.
     */
    public com.ccssoft.rsas.common.xmlparser.Conditions getConditions()
    {
        return this._conditions;
    } //-- com.regaltec.rsas.common.xmlparser.Conditions getConditions() 

    /**
     * Returns the value of field 'ISCaptionCondition'. The field
     * 'ISCaptionCondition' has the following description: �Ƿ����������
     * 
     * @return the value of field 'ISCaptionCondition'.
     */
    public java.lang.Object getISCaptionCondition()
    {
        return this._ISCaptionCondition;
    } //-- java.lang.Object getISCaptionCondition() 

    /**
     * Returns the value of field 'ISMIDShow'. The field
     * 'ISMIDShow' has the following description: �Ƿ���
     * 
     * @return the value of field 'ISMIDShow'.
     */
    public byte getISMIDShow()
    {
        return this._ISMIDShow;
    } //-- byte getISMIDShow() 

    /**
     * Returns the value of field 'pubConditionID'.
     * 
     * @return the value of field 'pubConditionID'.
     */
    public java.lang.String getPubConditionID()
    {
        return this._pubConditionID;
    } //-- java.lang.String getPubConditionID() 

    /**
     * Method hasISMIDShow
     */
    public boolean hasISMIDShow()
    {
        return this._has_ISMIDShow;
    } //-- boolean hasISMIDShow() 

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
     * Method removeAllConditionSetValue
     */
    public void removeAllConditionSetValue()
    {
        _conditionSetValueList.removeAllElements();
    } //-- void removeAllConditionSetValue() 

    /**
     * Method removeConditionSetValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue removeConditionSetValue(int index)
    {
        java.lang.Object obj = _conditionSetValueList.elementAt(index);
        _conditionSetValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue removeConditionSetValue(int) 

    /**
     * Method setConditionSetValue
     * 
     * @param index
     * @param vConditionSetValue
     */
    public void setConditionSetValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionSetValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionSetValueList.setElementAt(vConditionSetValue, index);
    } //-- void setConditionSetValue(int, com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method setConditionSetValue
     * 
     * @param conditionSetValueArray
     */
    public void setConditionSetValue(com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] conditionSetValueArray)
    {
        //-- copy array
        _conditionSetValueList.removeAllElements();
        for (int i = 0; i < conditionSetValueArray.length; i++) {
            _conditionSetValueList.addElement(conditionSetValueArray[i]);
        }
    } //-- void setConditionSetValue(com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Sets the value of field 'conditions'. The field 'conditions'
     * has the following description: ��ǰָ�����ɵ�����
     * 
     * @param conditions the value of field 'conditions'.
     */
    public void setConditions(com.ccssoft.rsas.common.xmlparser.Conditions conditions)
    {
        this._conditions = conditions;
    } //-- void setConditions(com.regaltec.rsas.common.xmlparser.Conditions) 

    /**
     * Sets the value of field 'ISCaptionCondition'. The field
     * 'ISCaptionCondition' has the following description: �Ƿ����������
     * 
     * @param ISCaptionCondition the value of field
     * 'ISCaptionCondition'.
     */
    public void setISCaptionCondition(java.lang.Object ISCaptionCondition)
    {
        this._ISCaptionCondition = ISCaptionCondition;
    } //-- void setISCaptionCondition(java.lang.Object) 

    /**
     * Sets the value of field 'ISMIDShow'. The field 'ISMIDShow'
     * has the following description: �Ƿ���
     * 
     * @param ISMIDShow the value of field 'ISMIDShow'.
     */
    public void setISMIDShow(byte ISMIDShow)
    {
        this._ISMIDShow = ISMIDShow;
        this._has_ISMIDShow = true;
    } //-- void setISMIDShow(byte) 

    /**
     * Sets the value of field 'pubConditionID'.
     * 
     * @param pubConditionID the value of field 'pubConditionID'.
     */
    public void setPubConditionID(java.lang.String pubConditionID)
    {
        this._pubConditionID = pubConditionID;
    } //-- void setPubConditionID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDPubCondition) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDPubCondition.class, reader);
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
