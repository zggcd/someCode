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

import com.ccssoft.rsas.common.xmlparser.types.DataMapIndexShowTypeType;
import com.ccssoft.rsas.common.xmlparser.types.DataMapSourceShowTypeType;

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
 * ����ӳ������
 * 
 * @version $Revision$ $Date$
 */
public class DataMap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �Ƿ�ʹ��Դ������
     */
    private byte _isSourceIndex;

    /**
     * keeps track of state for field: _isSourceIndex
     */
    private boolean _has_isSourceIndex;

    /**
     * �������ݱ�
     */
    private java.lang.String _indexTable;

    /**
     * �������ݵ�չ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.DataMapIndexShowTypeType _indexShowType;

    /**
     * ����Key�ֶ�
     */
    private java.lang.String _indexKeyField;

    /**
     * ���������ֶ�
     */
    private java.lang.String _indexCaptionField;

    /**
     * �������ֶ�
     */
    private java.lang.String _indexParentField;

    /**
     * ȡ������ֵ���ֶ�
     */
    private java.lang.Object _indexField;

    /**
     * ӳ��Դ��,����ΪSQL�����������������ʹ��sql������select * from tab where field
     * like {condition}||��%��
     */
    private java.lang.String _sourceTable;

    /**
     * ӳ��Դչ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.DataMapSourceShowTypeType _sourceShowType;

    /**
     * ����չ�ֵ�Key�ֶ�
     */
    private java.lang.String _sourceKeyField;

    /**
     * չ���ֶ�
     */
    private java.lang.String _sourceCaptionField;

    /**
     * ����չ�ָ��ֶ�
     */
    private java.lang.String _sourceParentField;

    /**
     * ӳ��Դӳ���ֶΣ����ӳ���ֶ���;�ֿ�
     */
    private java.lang.String _sourceMapField;

    /**
     * �����ӳ���ֶ�
     */
    private java.lang.String _dataInputMapField;

    /**
     * ӳ�����ӳ�����ݱ����
     */
    private java.lang.String _mapDataTable;

    /**
     * ӳ��Դ����д��Ķ�Ӧ�ֶΣ��ֶθ�����SourceFieldһ��
     */
    private java.lang.String _mapSourceField;

    /**
     * ӳ��Ŀ������д��Ķ�Ӧ�ֶΣ��ֶθ�����InputDBMapFieldһ��
     */
    private java.lang.String _mapDataInputField;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataMap() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DataMap()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsSourceIndex
     */
    public void deleteIsSourceIndex()
    {
        this._has_isSourceIndex= false;
    } //-- void deleteIsSourceIndex() 

    /**
     * Returns the value of field 'dataInputMapField'. The field
     * 'dataInputMapField' has the following description: �����ӳ���ֶ�
     * 
     * @return the value of field 'dataInputMapField'.
     */
    public java.lang.String getDataInputMapField()
    {
        return this._dataInputMapField;
    } //-- java.lang.String getDataInputMapField() 

    /**
     * Returns the value of field 'indexCaptionField'. The field
     * 'indexCaptionField' has the following description: ���������ֶ�
     * 
     * @return the value of field 'indexCaptionField'.
     */
    public java.lang.String getIndexCaptionField()
    {
        return this._indexCaptionField;
    } //-- java.lang.String getIndexCaptionField() 

    /**
     * Returns the value of field 'indexField'. The field
     * 'indexField' has the following description: ȡ������ֵ���ֶ�
     * 
     * @return the value of field 'indexField'.
     */
    public java.lang.Object getIndexField()
    {
        return this._indexField;
    } //-- java.lang.Object getIndexField() 

    /**
     * Returns the value of field 'indexKeyField'. The field
     * 'indexKeyField' has the following description: ����Key�ֶ�
     * 
     * @return the value of field 'indexKeyField'.
     */
    public java.lang.String getIndexKeyField()
    {
        return this._indexKeyField;
    } //-- java.lang.String getIndexKeyField() 

    /**
     * Returns the value of field 'indexParentField'. The field
     * 'indexParentField' has the following description: �������ֶ�
     * 
     * @return the value of field 'indexParentField'.
     */
    public java.lang.String getIndexParentField()
    {
        return this._indexParentField;
    } //-- java.lang.String getIndexParentField() 

    /**
     * Returns the value of field 'indexShowType'. The field
     * 'indexShowType' has the following description: �������ݵ�չ������
     * 
     * @return the value of field 'indexShowType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DataMapIndexShowTypeType getIndexShowType()
    {
        return this._indexShowType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataMapIndexShowTypeType getIndexShowType() 

    /**
     * Returns the value of field 'indexTable'. The field
     * 'indexTable' has the following description: �������ݱ�
     * 
     * @return the value of field 'indexTable'.
     */
    public java.lang.String getIndexTable()
    {
        return this._indexTable;
    } //-- java.lang.String getIndexTable() 

    /**
     * Returns the value of field 'isSourceIndex'. The field
     * 'isSourceIndex' has the following description: �Ƿ�ʹ��Դ������
     * 
     * @return the value of field 'isSourceIndex'.
     */
    public byte getIsSourceIndex()
    {
        return this._isSourceIndex;
    } //-- byte getIsSourceIndex() 

    /**
     * Returns the value of field 'mapDataInputField'. The field
     * 'mapDataInputField' has the following description:
     * ӳ��Ŀ������д��Ķ�Ӧ�ֶΣ��ֶθ�����InputDBMapFieldһ��
     * 
     * @return the value of field 'mapDataInputField'.
     */
    public java.lang.String getMapDataInputField()
    {
        return this._mapDataInputField;
    } //-- java.lang.String getMapDataInputField() 

    /**
     * Returns the value of field 'mapDataTable'. The field
     * 'mapDataTable' has the following description: ӳ�����ӳ�����ݱ����
     * 
     * @return the value of field 'mapDataTable'.
     */
    public java.lang.String getMapDataTable()
    {
        return this._mapDataTable;
    } //-- java.lang.String getMapDataTable() 

    /**
     * Returns the value of field 'mapSourceField'. The field
     * 'mapSourceField' has the following description:
     * ӳ��Դ����д��Ķ�Ӧ�ֶΣ��ֶθ�����SourceFieldһ��
     * 
     * @return the value of field 'mapSourceField'.
     */
    public java.lang.String getMapSourceField()
    {
        return this._mapSourceField;
    } //-- java.lang.String getMapSourceField() 

    /**
     * Returns the value of field 'sourceCaptionField'. The field
     * 'sourceCaptionField' has the following description: չ���ֶ�
     * 
     * @return the value of field 'sourceCaptionField'.
     */
    public java.lang.String getSourceCaptionField()
    {
        return this._sourceCaptionField;
    } //-- java.lang.String getSourceCaptionField() 

    /**
     * Returns the value of field 'sourceKeyField'. The field
     * 'sourceKeyField' has the following description: ����չ�ֵ�Key�ֶ�
     * 
     * @return the value of field 'sourceKeyField'.
     */
    public java.lang.String getSourceKeyField()
    {
        return this._sourceKeyField;
    } //-- java.lang.String getSourceKeyField() 

    /**
     * Returns the value of field 'sourceMapField'. The field
     * 'sourceMapField' has the following description:
     * ӳ��Դӳ���ֶΣ����ӳ���ֶ���;�ֿ�
     * 
     * @return the value of field 'sourceMapField'.
     */
    public java.lang.String getSourceMapField()
    {
        return this._sourceMapField;
    } //-- java.lang.String getSourceMapField() 

    /**
     * Returns the value of field 'sourceParentField'. The field
     * 'sourceParentField' has the following description: ����չ�ָ��ֶ�
     * 
     * @return the value of field 'sourceParentField'.
     */
    public java.lang.String getSourceParentField()
    {
        return this._sourceParentField;
    } //-- java.lang.String getSourceParentField() 

    /**
     * Returns the value of field 'sourceShowType'. The field
     * 'sourceShowType' has the following description: ӳ��Դչ������
     * 
     * @return the value of field 'sourceShowType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DataMapSourceShowTypeType getSourceShowType()
    {
        return this._sourceShowType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataMapSourceShowTypeType getSourceShowType() 

    /**
     * Returns the value of field 'sourceTable'. The field
     * 'sourceTable' has the following description:
     * ӳ��Դ��,����ΪSQL�����������������ʹ��sql������select * from tab where field
     * like {condition}||��%��
     * 
     * @return the value of field 'sourceTable'.
     */
    public java.lang.String getSourceTable()
    {
        return this._sourceTable;
    } //-- java.lang.String getSourceTable() 

    /**
     * Method hasIsSourceIndex
     */
    public boolean hasIsSourceIndex()
    {
        return this._has_isSourceIndex;
    } //-- boolean hasIsSourceIndex() 

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
     * Sets the value of field 'dataInputMapField'. The field
     * 'dataInputMapField' has the following description: �����ӳ���ֶ�
     * 
     * @param dataInputMapField the value of field
     * 'dataInputMapField'.
     */
    public void setDataInputMapField(java.lang.String dataInputMapField)
    {
        this._dataInputMapField = dataInputMapField;
    } //-- void setDataInputMapField(java.lang.String) 

    /**
     * Sets the value of field 'indexCaptionField'. The field
     * 'indexCaptionField' has the following description: ���������ֶ�
     * 
     * @param indexCaptionField the value of field
     * 'indexCaptionField'.
     */
    public void setIndexCaptionField(java.lang.String indexCaptionField)
    {
        this._indexCaptionField = indexCaptionField;
    } //-- void setIndexCaptionField(java.lang.String) 

    /**
     * Sets the value of field 'indexField'. The field 'indexField'
     * has the following description: ȡ������ֵ���ֶ�
     * 
     * @param indexField the value of field 'indexField'.
     */
    public void setIndexField(java.lang.Object indexField)
    {
        this._indexField = indexField;
    } //-- void setIndexField(java.lang.Object) 

    /**
     * Sets the value of field 'indexKeyField'. The field
     * 'indexKeyField' has the following description: ����Key�ֶ�
     * 
     * @param indexKeyField the value of field 'indexKeyField'.
     */
    public void setIndexKeyField(java.lang.String indexKeyField)
    {
        this._indexKeyField = indexKeyField;
    } //-- void setIndexKeyField(java.lang.String) 

    /**
     * Sets the value of field 'indexParentField'. The field
     * 'indexParentField' has the following description: �������ֶ�
     * 
     * @param indexParentField the value of field 'indexParentField'
     */
    public void setIndexParentField(java.lang.String indexParentField)
    {
        this._indexParentField = indexParentField;
    } //-- void setIndexParentField(java.lang.String) 

    /**
     * Sets the value of field 'indexShowType'. The field
     * 'indexShowType' has the following description: �������ݵ�չ������
     * 
     * @param indexShowType the value of field 'indexShowType'.
     */
    public void setIndexShowType(com.ccssoft.rsas.common.xmlparser.types.DataMapIndexShowTypeType indexShowType)
    {
        this._indexShowType = indexShowType;
    } //-- void setIndexShowType(com.regaltec.rsas.common.xmlparser.types.DataMapIndexShowTypeType) 

    /**
     * Sets the value of field 'indexTable'. The field 'indexTable'
     * has the following description: �������ݱ�
     * 
     * @param indexTable the value of field 'indexTable'.
     */
    public void setIndexTable(java.lang.String indexTable)
    {
        this._indexTable = indexTable;
    } //-- void setIndexTable(java.lang.String) 

    /**
     * Sets the value of field 'isSourceIndex'. The field
     * 'isSourceIndex' has the following description: �Ƿ�ʹ��Դ������
     * 
     * @param isSourceIndex the value of field 'isSourceIndex'.
     */
    public void setIsSourceIndex(byte isSourceIndex)
    {
        this._isSourceIndex = isSourceIndex;
        this._has_isSourceIndex = true;
    } //-- void setIsSourceIndex(byte) 

    /**
     * Sets the value of field 'mapDataInputField'. The field
     * 'mapDataInputField' has the following description:
     * ӳ��Ŀ������д��Ķ�Ӧ�ֶΣ��ֶθ�����InputDBMapFieldһ��
     * 
     * @param mapDataInputField the value of field
     * 'mapDataInputField'.
     */
    public void setMapDataInputField(java.lang.String mapDataInputField)
    {
        this._mapDataInputField = mapDataInputField;
    } //-- void setMapDataInputField(java.lang.String) 

    /**
     * Sets the value of field 'mapDataTable'. The field
     * 'mapDataTable' has the following description: ӳ�����ӳ�����ݱ����
     * 
     * @param mapDataTable the value of field 'mapDataTable'.
     */
    public void setMapDataTable(java.lang.String mapDataTable)
    {
        this._mapDataTable = mapDataTable;
    } //-- void setMapDataTable(java.lang.String) 

    /**
     * Sets the value of field 'mapSourceField'. The field
     * 'mapSourceField' has the following description:
     * ӳ��Դ����д��Ķ�Ӧ�ֶΣ��ֶθ�����SourceFieldһ��
     * 
     * @param mapSourceField the value of field 'mapSourceField'.
     */
    public void setMapSourceField(java.lang.String mapSourceField)
    {
        this._mapSourceField = mapSourceField;
    } //-- void setMapSourceField(java.lang.String) 

    /**
     * Sets the value of field 'sourceCaptionField'. The field
     * 'sourceCaptionField' has the following description: չ���ֶ�
     * 
     * @param sourceCaptionField the value of field
     * 'sourceCaptionField'.
     */
    public void setSourceCaptionField(java.lang.String sourceCaptionField)
    {
        this._sourceCaptionField = sourceCaptionField;
    } //-- void setSourceCaptionField(java.lang.String) 

    /**
     * Sets the value of field 'sourceKeyField'. The field
     * 'sourceKeyField' has the following description: ����չ�ֵ�Key�ֶ�
     * 
     * @param sourceKeyField the value of field 'sourceKeyField'.
     */
    public void setSourceKeyField(java.lang.String sourceKeyField)
    {
        this._sourceKeyField = sourceKeyField;
    } //-- void setSourceKeyField(java.lang.String) 

    /**
     * Sets the value of field 'sourceMapField'. The field
     * 'sourceMapField' has the following description:
     * ӳ��Դӳ���ֶΣ����ӳ���ֶ���;�ֿ�
     * 
     * @param sourceMapField the value of field 'sourceMapField'.
     */
    public void setSourceMapField(java.lang.String sourceMapField)
    {
        this._sourceMapField = sourceMapField;
    } //-- void setSourceMapField(java.lang.String) 

    /**
     * Sets the value of field 'sourceParentField'. The field
     * 'sourceParentField' has the following description: ����չ�ָ��ֶ�
     * 
     * @param sourceParentField the value of field
     * 'sourceParentField'.
     */
    public void setSourceParentField(java.lang.String sourceParentField)
    {
        this._sourceParentField = sourceParentField;
    } //-- void setSourceParentField(java.lang.String) 

    /**
     * Sets the value of field 'sourceShowType'. The field
     * 'sourceShowType' has the following description: ӳ��Դչ������
     * 
     * @param sourceShowType the value of field 'sourceShowType'.
     */
    public void setSourceShowType(com.ccssoft.rsas.common.xmlparser.types.DataMapSourceShowTypeType sourceShowType)
    {
        this._sourceShowType = sourceShowType;
    } //-- void setSourceShowType(com.regaltec.rsas.common.xmlparser.types.DataMapSourceShowTypeType) 

    /**
     * Sets the value of field 'sourceTable'. The field
     * 'sourceTable' has the following description:
     * ӳ��Դ��,����ΪSQL�����������������ʹ��sql������select * from tab where field
     * like {condition}||��%��
     * 
     * @param sourceTable the value of field 'sourceTable'.
     */
    public void setSourceTable(java.lang.String sourceTable)
    {
        this._sourceTable = sourceTable;
    } //-- void setSourceTable(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataMap) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataMap.class, reader);
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
