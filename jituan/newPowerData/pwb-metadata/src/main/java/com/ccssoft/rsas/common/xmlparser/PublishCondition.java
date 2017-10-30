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

import com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType;

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
 * Class PublishCondition.
 * 
 * @version $Revision$ $Date$
 */
public class PublishCondition implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _startRow
     */
    private short _startRow;

    /**
     * keeps track of state for field: _startRow
     */
    private boolean _has_startRow;

    /**
     * Field _startCol
     */
    private short _startCol;

    /**
     * keeps track of state for field: _startCol
     */
    private boolean _has_startCol;

    /**
     * Field _endRow
     */
    private short _endRow;

    /**
     * keeps track of state for field: _endRow
     */
    private boolean _has_endRow;

    /**
     * Field _endCol
     */
    private short _endCol;

    /**
     * keeps track of state for field: _endCol
     */
    private boolean _has_endCol;

    /**
     * �������ʱ����֮�����ĵ�Ԫ�����
     */
    private byte _intervalCell;

    /**
     * keeps track of state for field: _intervalCell
     */
    private boolean _has_intervalCell;

    /**
     * ��ǰ���������еĿ�ȣ����ðٷֱȵ���ʽ��¼��
     */
    private int _columnWidth;

    /**
     * keeps track of state for field: _columnWidth
     */
    private boolean _has_columnWidth;

    /**
     * ������ǩ��ռ�ĵ�Ԫ����
     */
    private short _labCellCount;

    /**
     * keeps track of state for field: _labCellCount
     */
    private boolean _has_labCellCount;

    /**
     * �ؼ��ڵ�Ԫ���е����
     */
    private short _controlOrder;

    /**
     * keeps track of state for field: _controlOrder
     */
    private boolean _has_controlOrder;

    /**
     * Field _isMultiSelect
     */
    private byte _isMultiSelect;

    /**
     * keeps track of state for field: _isMultiSelect
     */
    private boolean _has_isMultiSelect;

    /**
     * �Ƿ��ѡ����
     */
    private byte _prerequisite;

    /**
     * keeps track of state for field: _prerequisite
     */
    private boolean _has_prerequisite;

    /**
     * �Ƿ�������
     */
    private byte _isCommonUse;

    /**
     * keeps track of state for field: _isCommonUse
     */
    private boolean _has_isCommonUse;

    /**
     * ��ѯ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType _searchKind;

    /**
     * ��ǰָ�����ɵ�����
     */
    private com.ccssoft.rsas.common.xmlparser.Conditions _conditions;

    /**
     * Field _bindParamList
     */
    private com.ccssoft.rsas.common.xmlparser.BindParamList _bindParamList;

    /**
     * ��������ÿ��ɸѡ�������Ƿ��ѡ����ѡ��Ĭ��ֵ����Ҫ�����������
     */
    private com.ccssoft.rsas.common.xmlparser.ConditionDetails _conditionDetails;


      //----------------/
     //- Constructors -/
    //----------------/

    public PublishCondition() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.PublishCondition()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteColumnWidth
     */
    public void deleteColumnWidth()
    {
        this._has_columnWidth= false;
    } //-- void deleteColumnWidth() 

    /**
     * Method deleteControlOrder
     */
    public void deleteControlOrder()
    {
        this._has_controlOrder= false;
    } //-- void deleteControlOrder() 

    /**
     * Method deleteEndCol
     */
    public void deleteEndCol()
    {
        this._has_endCol= false;
    } //-- void deleteEndCol() 

    /**
     * Method deleteEndRow
     */
    public void deleteEndRow()
    {
        this._has_endRow= false;
    } //-- void deleteEndRow() 

    /**
     * Method deleteIntervalCell
     */
    public void deleteIntervalCell()
    {
        this._has_intervalCell= false;
    } //-- void deleteIntervalCell() 

    /**
     * Method deleteIsCommonUse
     */
    public void deleteIsCommonUse()
    {
        this._has_isCommonUse= false;
    } //-- void deleteIsCommonUse() 

    /**
     * Method deleteIsMultiSelect
     */
    public void deleteIsMultiSelect()
    {
        this._has_isMultiSelect= false;
    } //-- void deleteIsMultiSelect() 

    /**
     * Method deleteLabCellCount
     */
    public void deleteLabCellCount()
    {
        this._has_labCellCount= false;
    } //-- void deleteLabCellCount() 

    /**
     * Method deletePrerequisite
     */
    public void deletePrerequisite()
    {
        this._has_prerequisite= false;
    } //-- void deletePrerequisite() 

    /**
     * Method deleteStartCol
     */
    public void deleteStartCol()
    {
        this._has_startCol= false;
    } //-- void deleteStartCol() 

    /**
     * Method deleteStartRow
     */
    public void deleteStartRow()
    {
        this._has_startRow= false;
    } //-- void deleteStartRow() 

    /**
     * Returns the value of field 'bindParamList'.
     * 
     * @return the value of field 'bindParamList'.
     */
    public com.ccssoft.rsas.common.xmlparser.BindParamList getBindParamList()
    {
        return this._bindParamList;
    } //-- com.regaltec.rsas.common.xmlparser.BindParamList getBindParamList() 

    /**
     * Returns the value of field 'columnWidth'. The field
     * 'columnWidth' has the following description:
     * ��ǰ���������еĿ�ȣ����ðٷֱȵ���ʽ��¼��
     * 
     * @return the value of field 'columnWidth'.
     */
    public int getColumnWidth()
    {
        return this._columnWidth;
    } //-- int getColumnWidth() 

    /**
     * Returns the value of field 'conditionDetails'. The field
     * 'conditionDetails' has the following description:
     * ��������ÿ��ɸѡ�������Ƿ��ѡ����ѡ��Ĭ��ֵ����Ҫ�����������
     * 
     * @return the value of field 'conditionDetails'.
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionDetails getConditionDetails()
    {
        return this._conditionDetails;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionDetails getConditionDetails() 

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
     * Returns the value of field 'controlOrder'. The field
     * 'controlOrder' has the following description: �ؼ��ڵ�Ԫ���е����
     * 
     * @return the value of field 'controlOrder'.
     */
    public short getControlOrder()
    {
        return this._controlOrder;
    } //-- short getControlOrder() 

    /**
     * Returns the value of field 'endCol'.
     * 
     * @return the value of field 'endCol'.
     */
    public short getEndCol()
    {
        return this._endCol;
    } //-- short getEndCol() 

    /**
     * Returns the value of field 'endRow'.
     * 
     * @return the value of field 'endRow'.
     */
    public short getEndRow()
    {
        return this._endRow;
    } //-- short getEndRow() 

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
     * Returns the value of field 'intervalCell'. The field
     * 'intervalCell' has the following description:
     * �������ʱ����֮�����ĵ�Ԫ�����
     * 
     * @return the value of field 'intervalCell'.
     */
    public byte getIntervalCell()
    {
        return this._intervalCell;
    } //-- byte getIntervalCell() 

    /**
     * Returns the value of field 'isCommonUse'. The field
     * 'isCommonUse' has the following description: �Ƿ�������
     * 
     * @return the value of field 'isCommonUse'.
     */
    public byte getIsCommonUse()
    {
        return this._isCommonUse;
    } //-- byte getIsCommonUse() 

    /**
     * Returns the value of field 'isMultiSelect'.
     * 
     * @return the value of field 'isMultiSelect'.
     */
    public byte getIsMultiSelect()
    {
        return this._isMultiSelect;
    } //-- byte getIsMultiSelect() 

    /**
     * Returns the value of field 'labCellCount'. The field
     * 'labCellCount' has the following description: ������ǩ��ռ�ĵ�Ԫ����
     * 
     * @return the value of field 'labCellCount'.
     */
    public short getLabCellCount()
    {
        return this._labCellCount;
    } //-- short getLabCellCount() 

    /**
     * Returns the value of field 'prerequisite'. The field
     * 'prerequisite' has the following description: �Ƿ��ѡ����
     * 
     * @return the value of field 'prerequisite'.
     */
    public byte getPrerequisite()
    {
        return this._prerequisite;
    } //-- byte getPrerequisite() 

    /**
     * Returns the value of field 'searchKind'. The field
     * 'searchKind' has the following description: ��ѯ��ʽ
     * 
     * @return the value of field 'searchKind'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType getSearchKind()
    {
        return this._searchKind;
    } //-- com.regaltec.rsas.common.xmlparser.types.DisplayListSearchKindType getSearchKind() 

    /**
     * Returns the value of field 'startCol'.
     * 
     * @return the value of field 'startCol'.
     */
    public short getStartCol()
    {
        return this._startCol;
    } //-- short getStartCol() 

    /**
     * Returns the value of field 'startRow'.
     * 
     * @return the value of field 'startRow'.
     */
    public short getStartRow()
    {
        return this._startRow;
    } //-- short getStartRow() 

    /**
     * Method hasColumnWidth
     */
    public boolean hasColumnWidth()
    {
        return this._has_columnWidth;
    } //-- boolean hasColumnWidth() 

    /**
     * Method hasControlOrder
     */
    public boolean hasControlOrder()
    {
        return this._has_controlOrder;
    } //-- boolean hasControlOrder() 

    /**
     * Method hasEndCol
     */
    public boolean hasEndCol()
    {
        return this._has_endCol;
    } //-- boolean hasEndCol() 

    /**
     * Method hasEndRow
     */
    public boolean hasEndRow()
    {
        return this._has_endRow;
    } //-- boolean hasEndRow() 

    /**
     * Method hasIntervalCell
     */
    public boolean hasIntervalCell()
    {
        return this._has_intervalCell;
    } //-- boolean hasIntervalCell() 

    /**
     * Method hasIsCommonUse
     */
    public boolean hasIsCommonUse()
    {
        return this._has_isCommonUse;
    } //-- boolean hasIsCommonUse() 

    /**
     * Method hasIsMultiSelect
     */
    public boolean hasIsMultiSelect()
    {
        return this._has_isMultiSelect;
    } //-- boolean hasIsMultiSelect() 

    /**
     * Method hasLabCellCount
     */
    public boolean hasLabCellCount()
    {
        return this._has_labCellCount;
    } //-- boolean hasLabCellCount() 

    /**
     * Method hasPrerequisite
     */
    public boolean hasPrerequisite()
    {
        return this._has_prerequisite;
    } //-- boolean hasPrerequisite() 

    /**
     * Method hasStartCol
     */
    public boolean hasStartCol()
    {
        return this._has_startCol;
    } //-- boolean hasStartCol() 

    /**
     * Method hasStartRow
     */
    public boolean hasStartRow()
    {
        return this._has_startRow;
    } //-- boolean hasStartRow() 

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
     * Sets the value of field 'bindParamList'.
     * 
     * @param bindParamList the value of field 'bindParamList'.
     */
    public void setBindParamList(com.ccssoft.rsas.common.xmlparser.BindParamList bindParamList)
    {
        this._bindParamList = bindParamList;
    } //-- void setBindParamList(com.regaltec.rsas.common.xmlparser.BindParamList) 

    /**
     * Sets the value of field 'columnWidth'. The field
     * 'columnWidth' has the following description:
     * ��ǰ���������еĿ�ȣ����ðٷֱȵ���ʽ��¼��
     * 
     * @param columnWidth the value of field 'columnWidth'.
     */
    public void setColumnWidth(int columnWidth)
    {
        this._columnWidth = columnWidth;
        this._has_columnWidth = true;
    } //-- void setColumnWidth(int) 

    /**
     * Sets the value of field 'conditionDetails'. The field
     * 'conditionDetails' has the following description:
     * ��������ÿ��ɸѡ�������Ƿ��ѡ����ѡ��Ĭ��ֵ����Ҫ�����������
     * 
     * @param conditionDetails the value of field 'conditionDetails'
     */
    public void setConditionDetails(com.ccssoft.rsas.common.xmlparser.ConditionDetails conditionDetails)
    {
        this._conditionDetails = conditionDetails;
    } //-- void setConditionDetails(com.regaltec.rsas.common.xmlparser.ConditionDetails) 

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
     * Sets the value of field 'controlOrder'. The field
     * 'controlOrder' has the following description: �ؼ��ڵ�Ԫ���е����
     * 
     * @param controlOrder the value of field 'controlOrder'.
     */
    public void setControlOrder(short controlOrder)
    {
        this._controlOrder = controlOrder;
        this._has_controlOrder = true;
    } //-- void setControlOrder(short) 

    /**
     * Sets the value of field 'endCol'.
     * 
     * @param endCol the value of field 'endCol'.
     */
    public void setEndCol(short endCol)
    {
        this._endCol = endCol;
        this._has_endCol = true;
    } //-- void setEndCol(short) 

    /**
     * Sets the value of field 'endRow'.
     * 
     * @param endRow the value of field 'endRow'.
     */
    public void setEndRow(short endRow)
    {
        this._endRow = endRow;
        this._has_endRow = true;
    } //-- void setEndRow(short) 

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
     * Sets the value of field 'intervalCell'. The field
     * 'intervalCell' has the following description:
     * �������ʱ����֮�����ĵ�Ԫ�����
     * 
     * @param intervalCell the value of field 'intervalCell'.
     */
    public void setIntervalCell(byte intervalCell)
    {
        this._intervalCell = intervalCell;
        this._has_intervalCell = true;
    } //-- void setIntervalCell(byte) 

    /**
     * Sets the value of field 'isCommonUse'. The field
     * 'isCommonUse' has the following description: �Ƿ�������
     * 
     * @param isCommonUse the value of field 'isCommonUse'.
     */
    public void setIsCommonUse(byte isCommonUse)
    {
        this._isCommonUse = isCommonUse;
        this._has_isCommonUse = true;
    } //-- void setIsCommonUse(byte) 

    /**
     * Sets the value of field 'isMultiSelect'.
     * 
     * @param isMultiSelect the value of field 'isMultiSelect'.
     */
    public void setIsMultiSelect(byte isMultiSelect)
    {
        this._isMultiSelect = isMultiSelect;
        this._has_isMultiSelect = true;
    } //-- void setIsMultiSelect(byte) 

    /**
     * Sets the value of field 'labCellCount'. The field
     * 'labCellCount' has the following description: ������ǩ��ռ�ĵ�Ԫ����
     * 
     * @param labCellCount the value of field 'labCellCount'.
     */
    public void setLabCellCount(short labCellCount)
    {
        this._labCellCount = labCellCount;
        this._has_labCellCount = true;
    } //-- void setLabCellCount(short) 

    /**
     * Sets the value of field 'prerequisite'. The field
     * 'prerequisite' has the following description: �Ƿ��ѡ����
     * 
     * @param prerequisite the value of field 'prerequisite'.
     */
    public void setPrerequisite(byte prerequisite)
    {
        this._prerequisite = prerequisite;
        this._has_prerequisite = true;
    } //-- void setPrerequisite(byte) 

    /**
     * Sets the value of field 'searchKind'. The field 'searchKind'
     * has the following description: ��ѯ��ʽ
     * 
     * @param searchKind the value of field 'searchKind'.
     */
    public void setSearchKind(com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType searchKind)
    {
        this._searchKind = searchKind;
    } //-- void setSearchKind(com.regaltec.rsas.common.xmlparser.types.DisplayListSearchKindType) 

    /**
     * Sets the value of field 'startCol'.
     * 
     * @param startCol the value of field 'startCol'.
     */
    public void setStartCol(short startCol)
    {
        this._startCol = startCol;
        this._has_startCol = true;
    } //-- void setStartCol(short) 

    /**
     * Sets the value of field 'startRow'.
     * 
     * @param startRow the value of field 'startRow'.
     */
    public void setStartRow(short startRow)
    {
        this._startRow = startRow;
        this._has_startRow = true;
    } //-- void setStartRow(short) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PublishCondition) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PublishCondition.class, reader);
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
