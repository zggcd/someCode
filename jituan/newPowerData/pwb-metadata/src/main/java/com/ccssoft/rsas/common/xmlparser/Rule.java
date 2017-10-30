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

import com.ccssoft.rsas.common.xmlparser.types.RuleOperSymbolType;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ����
 * 
 * @version $Revision$ $Date$
 */
public class Rule implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _operSymbol
     */
    private com.ccssoft.rsas.common.xmlparser.types.RuleOperSymbolType _operSymbol;

    /**
     * ��׼���ο�ֵ
     */
    private float _referenceValue;

    /**
     * keeps track of state for field: _referenceValue
     */
    private boolean _has_referenceValue;

    /**
     * ÿ����λ��ֵ
     */
    private float _perUnit;

    /**
     * keeps track of state for field: _perUnit
     */
    private boolean _has_perUnit;

    /**
     * ÿ����λ���Ӽ���ֵ
     */
    private float _perScore;

    /**
     * keeps track of state for field: _perScore
     */
    private boolean _has_perScore;

    /**
     * ��С�÷�
     */
    private float _minScore;

    /**
     * keeps track of state for field: _minScore
     */
    private boolean _has_minScore;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rule() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Rule()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteMinScore
     */
    public void deleteMinScore()
    {
        this._has_minScore= false;
    } //-- void deleteMinScore() 

    /**
     * Method deletePerScore
     */
    public void deletePerScore()
    {
        this._has_perScore= false;
    } //-- void deletePerScore() 

    /**
     * Method deletePerUnit
     */
    public void deletePerUnit()
    {
        this._has_perUnit= false;
    } //-- void deletePerUnit() 

    /**
     * Method deleteReferenceValue
     */
    public void deleteReferenceValue()
    {
        this._has_referenceValue= false;
    } //-- void deleteReferenceValue() 

    /**
     * Returns the value of field 'minScore'. The field 'minScore'
     * has the following description: ��С�÷�
     * 
     * @return the value of field 'minScore'.
     */
    public float getMinScore()
    {
        return this._minScore;
    } //-- float getMinScore() 

    /**
     * Returns the value of field 'operSymbol'.
     * 
     * @return the value of field 'operSymbol'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RuleOperSymbolType getOperSymbol()
    {
        return this._operSymbol;
    } //-- com.regaltec.rsas.common.xmlparser.types.RuleOperSymbolType getOperSymbol() 

    /**
     * Returns the value of field 'perScore'. The field 'perScore'
     * has the following description: ÿ����λ���Ӽ���ֵ
     * 
     * @return the value of field 'perScore'.
     */
    public float getPerScore()
    {
        return this._perScore;
    } //-- float getPerScore() 

    /**
     * Returns the value of field 'perUnit'. The field 'perUnit'
     * has the following description: ÿ����λ��ֵ
     * 
     * @return the value of field 'perUnit'.
     */
    public float getPerUnit()
    {
        return this._perUnit;
    } //-- float getPerUnit() 

    /**
     * Returns the value of field 'referenceValue'. The field
     * 'referenceValue' has the following description: ��׼���ο�ֵ
     * 
     * @return the value of field 'referenceValue'.
     */
    public float getReferenceValue()
    {
        return this._referenceValue;
    } //-- float getReferenceValue() 

    /**
     * Method hasMinScore
     */
    public boolean hasMinScore()
    {
        return this._has_minScore;
    } //-- boolean hasMinScore() 

    /**
     * Method hasPerScore
     */
    public boolean hasPerScore()
    {
        return this._has_perScore;
    } //-- boolean hasPerScore() 

    /**
     * Method hasPerUnit
     */
    public boolean hasPerUnit()
    {
        return this._has_perUnit;
    } //-- boolean hasPerUnit() 

    /**
     * Method hasReferenceValue
     */
    public boolean hasReferenceValue()
    {
        return this._has_referenceValue;
    } //-- boolean hasReferenceValue() 

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
     * Sets the value of field 'minScore'. The field 'minScore' has
     * the following description: ��С�÷�
     * 
     * @param minScore the value of field 'minScore'.
     */
    public void setMinScore(float minScore)
    {
        this._minScore = minScore;
        this._has_minScore = true;
    } //-- void setMinScore(float) 

    /**
     * Sets the value of field 'operSymbol'.
     * 
     * @param operSymbol the value of field 'operSymbol'.
     */
    public void setOperSymbol(com.ccssoft.rsas.common.xmlparser.types.RuleOperSymbolType operSymbol)
    {
        this._operSymbol = operSymbol;
    } //-- void setOperSymbol(com.regaltec.rsas.common.xmlparser.types.RuleOperSymbolType) 

    /**
     * Sets the value of field 'perScore'. The field 'perScore' has
     * the following description: ÿ����λ���Ӽ���ֵ
     * 
     * @param perScore the value of field 'perScore'.
     */
    public void setPerScore(float perScore)
    {
        this._perScore = perScore;
        this._has_perScore = true;
    } //-- void setPerScore(float) 

    /**
     * Sets the value of field 'perUnit'. The field 'perUnit' has
     * the following description: ÿ����λ��ֵ
     * 
     * @param perUnit the value of field 'perUnit'.
     */
    public void setPerUnit(float perUnit)
    {
        this._perUnit = perUnit;
        this._has_perUnit = true;
    } //-- void setPerUnit(float) 

    /**
     * Sets the value of field 'referenceValue'. The field
     * 'referenceValue' has the following description: ��׼���ο�ֵ
     * 
     * @param referenceValue the value of field 'referenceValue'.
     */
    public void setReferenceValue(float referenceValue)
    {
        this._referenceValue = referenceValue;
        this._has_referenceValue = true;
    } //-- void setReferenceValue(float) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Rule) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Rule.class, reader);
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
