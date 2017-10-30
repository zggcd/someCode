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

import com.ccssoft.rsas.common.xmlparser.types.OperItemObjectTypeType;

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
 * Class Attachment.
 * 
 * @version $Revision$ $Date$
 */
public class Attachment implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;

    /**
     * Field _SQLFunctions
     */
    private com.ccssoft.rsas.common.xmlparser.SQLFunctions _SQLFunctions;

    /**
     * Field _databases
     */
    private com.ccssoft.rsas.common.xmlparser.Databases _databases;

    /**
     * Field _procedures
     */
    private com.ccssoft.rsas.common.xmlparser.Procedures _procedures;

    /**
     * Field _databaseTypes
     */
    private com.ccssoft.rsas.common.xmlparser.DatabaseTypes _databaseTypes;

    /**
     * Field _links
     */
    private com.ccssoft.rsas.common.xmlparser.Links _links;

    /**
     * Field _dimensions
     */
    private com.ccssoft.rsas.common.xmlparser.Dimensions _dimensions;

    /**
     * Field _fields
     */
    private com.ccssoft.rsas.common.xmlparser.Fields _fields;

    /**
     * Field _measures
     */
    private com.ccssoft.rsas.common.xmlparser.Measures _measures;

    /**
     * Field _cubes
     */
    private com.ccssoft.rsas.common.xmlparser.Cubes _cubes;

    /**
     * Field _hierarchys
     */
    private com.ccssoft.rsas.common.xmlparser.Hierarchys _hierarchys;

    /**
     * Field _querys
     */
    private com.ccssoft.rsas.common.xmlparser.Querys _querys;

    /**
     * Field _templates
     */
    private com.ccssoft.rsas.common.xmlparser.Templates _templates;

    /**
     * Field _reports
     */
    private com.ccssoft.rsas.common.xmlparser.Reports _reports;

    /**
     * Field _filters
     */
    private com.ccssoft.rsas.common.xmlparser.Filters _filters;

    /**
     * ��ǰָ�����ɵ�����
     */
    private com.ccssoft.rsas.common.xmlparser.Conditions _conditions;

    /**
     * Field _publishs
     */
    private com.ccssoft.rsas.common.xmlparser.Publishs _publishs;

    /**
     * ����Ԫ���ݿ��޹أ�
     */
    private com.ccssoft.rsas.common.xmlparser.ReportResults _reportResults;

    /**
     * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
     */
    private com.ccssoft.rsas.common.xmlparser.SQLFunction _SQLFunction;

    /**
     * ���ݿ�ϵͳ�е����ݿ�
     */
    private com.ccssoft.rsas.common.xmlparser.Database _database;

    /**
     * ���ݿ�ϵͳ����
     */
    private com.ccssoft.rsas.common.xmlparser.DatabaseType _databaseType;

    /**
     * ����Դ����
     */
    private com.ccssoft.rsas.common.xmlparser.Link _link;

    /**
     * ά�ȶ���
     */
    private com.ccssoft.rsas.common.xmlparser.Dimension _dimension;

    /**
     * �����
     */
    private com.ccssoft.rsas.common.xmlparser.Field _field;

    /**
     * ��������
     */
    private com.ccssoft.rsas.common.xmlparser.Measure _measure;

    /**
     * ��������
     */
    private com.ccssoft.rsas.common.xmlparser.Cube _cube;

    /**
     * ά�Ȼ���Ĳ㼶
     */
    private com.ccssoft.rsas.common.xmlparser.Hierarchy _hierarchy;

    /**
     * ��ѯ����
     */
    private com.ccssoft.rsas.common.xmlparser.Query _query;

    /**
     * ʹ�õı�����ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.Template _template;

    /**
     * �������
     */
    private com.ccssoft.rsas.common.xmlparser.Report _report;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Relation _relation;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Filter _filter;

    /**
     * ����ɸѡ��������
     */
    private com.ccssoft.rsas.common.xmlparser.Condition _condition;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Publish _publish;

    /**
     * ����Ҫ���еĴ洢����
     */
    private com.ccssoft.rsas.common.xmlparser.Procedure _procedure;

    /**
     * ϵͳ������Ϣ
     */
    private com.ccssoft.rsas.common.xmlparser.Information _information;

    /**
     * ά�ȵ����ݽ��
     */
    private com.ccssoft.rsas.common.xmlparser.DimensionResult _dimensionResult;

    /**
     * Field _returnRecords
     */
    private com.ccssoft.rsas.common.xmlparser.ReturnRecords _returnRecords;

    /**
     * ϵͳ���б���
     */
    private com.ccssoft.rsas.common.xmlparser.SystemVariant _systemVariant;

    /**
     * �����ѯ���еĽ������Ԫ���ݿ��޹أ�
     */
    private com.ccssoft.rsas.common.xmlparser.QueryResult _queryResult;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Category _category;

    /**
     * Field _categorys
     */
    private com.ccssoft.rsas.common.xmlparser.Categorys _categorys;

    /**
     * �ⲿӦ��ϵͳ
     */
    private com.ccssoft.rsas.common.xmlparser.Application _application;

    /**
     * Field _applications
     */
    private com.ccssoft.rsas.common.xmlparser.Applications _applications;

    /**
     * Field _dataAuthorityDivs
     */
    private com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs _dataAuthorityDivs;

    /**
     * ����Ȩ������
     */
    private com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv _dataAuthorityDiv;

    /**
     * Field _divDistributers
     */
    private com.ccssoft.rsas.common.xmlparser.DivDistributers _divDistributers;

    /**
     * ����Ȩ�����ӷ��䵽ɸѡ��ӳ�����
     */
    private com.ccssoft.rsas.common.xmlparser.DivDistributer _divDistributer;

    /**
     * Field _taskerGroups
     */
    private com.ccssoft.rsas.common.xmlparser.TaskerGroups _taskerGroups;

    /**
     * �ƻ�������
     */
    private com.ccssoft.rsas.common.xmlparser.TaskerGroup _taskerGroup;

    /**
     * �ƻ�����
     */
    private com.ccssoft.rsas.common.xmlparser.Tasker _tasker;

    /**
     * Field _taskers
     */
    private com.ccssoft.rsas.common.xmlparser.Taskers _taskers;

    /**
     * Field _reportDocList
     */
    private com.ccssoft.rsas.common.xmlparser.ReportDocList _reportDocList;

    /**
     * �����ɱ������
     */
    private com.ccssoft.rsas.common.xmlparser.ReportDoc _reportDoc;

    /**
     * RTPģ���ǩxml�ļ�
     */
    private com.ccssoft.rsas.common.xmlparser.RTFTemplateField _RTFTemplateField;

    /**
     * ����
     */
    private com.ccssoft.rsas.common.xmlparser.Conclusion _conclusion;

    /**
     * Field _conclusions
     */
    private com.ccssoft.rsas.common.xmlparser.Conclusions _conclusions;

    /**
     * ָ��Ŀ¼
     */
    private com.ccssoft.rsas.common.xmlparser.IndicatorCategory _indicatorCategory;

    /**
     * Field _indicatorCategorys
     */
    private com.ccssoft.rsas.common.xmlparser.IndicatorCategorys _indicatorCategorys;

    /**
     * ָ��
     */
    private com.ccssoft.rsas.common.xmlparser.Indicator _indicator;

    /**
     * Field _indicators
     */
    private com.ccssoft.rsas.common.xmlparser.Indicators _indicators;

    /**
     * ����
     */
    private com.ccssoft.rsas.common.xmlparser.Subscription _subscription;

    /**
     * Field _subscriptions
     */
    private com.ccssoft.rsas.common.xmlparser.Subscriptions _subscriptions;

    /**
     * ���ݺ˶Ա���󼯺�
     */
    private com.ccssoft.rsas.common.xmlparser.CheckTables _checkTables;

    /**
     * Field _reportPublish
     */
    private com.ccssoft.rsas.common.xmlparser.ReportPublish _reportPublish;

    /**
     * �ƶ��ն�Ŀ¼
     */
    private com.ccssoft.rsas.common.xmlparser.MIDCategory _MIDCategory;

    /**
     * Field _MIDCategorys
     */
    private com.ccssoft.rsas.common.xmlparser.MIDCategorys _MIDCategorys;

    /**
     * �ƶ�����
     */
    private com.ccssoft.rsas.common.xmlparser.MIDReport _MIDReport;

    /**
     * Field _MIDReports
     */
    private com.ccssoft.rsas.common.xmlparser.MIDReports _MIDReports;

    /**
     * HTML �ƶ�������ҳ��Ŀ
     */
    private com.ccssoft.rsas.common.xmlparser.MIDHomeItem _MIDHomeItem;

    /**
     * HTML �ƶ�������ҳ��Ŀ����
     */
    private com.ccssoft.rsas.common.xmlparser.MIDHomeItems _MIDHomeItems;

    /**
     * HTML �ƶ�����ָ�귢��Ŀ¼
     */
    private com.ccssoft.rsas.common.xmlparser.MIDIndCategory _MIDIndCategory;

    /**
     * HTML �ƶ�����ָ�귢��Ŀ¼����
     */
    private com.ccssoft.rsas.common.xmlparser.MIDIndCategories _MIDIndCategories;

    /**
     * HTML ��Ϣ
     */
    private com.ccssoft.rsas.common.xmlparser.MIDMessage _MIDMessage;

    /**
     * HTML ��Ϣ����
     */
    private com.ccssoft.rsas.common.xmlparser.MIDMessages _MIDMessages;


      //----------------/
     //- Constructors -/
    //----------------/

    public Attachment() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Attachment()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'application'. The field
     * 'application' has the following description: �ⲿӦ��ϵͳ
     * 
     * @return the value of field 'application'.
     */
    public com.ccssoft.rsas.common.xmlparser.Application getApplication()
    {
        return this._application;
    } //-- com.regaltec.rsas.common.xmlparser.Application getApplication() 

    /**
     * Returns the value of field 'applications'.
     * 
     * @return the value of field 'applications'.
     */
    public com.ccssoft.rsas.common.xmlparser.Applications getApplications()
    {
        return this._applications;
    } //-- com.regaltec.rsas.common.xmlparser.Applications getApplications() 

    /**
     * Returns the value of field 'category'. The field 'category'
     * has the following description: ����������
     * 
     * @return the value of field 'category'.
     */
    public com.ccssoft.rsas.common.xmlparser.Category getCategory()
    {
        return this._category;
    } //-- com.regaltec.rsas.common.xmlparser.Category getCategory() 

    /**
     * Returns the value of field 'categorys'.
     * 
     * @return the value of field 'categorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.Categorys getCategorys()
    {
        return this._categorys;
    } //-- com.regaltec.rsas.common.xmlparser.Categorys getCategorys() 

    /**
     * Returns the value of field 'checkTables'. The field
     * 'checkTables' has the following description: ���ݺ˶Ա���󼯺�
     * 
     * @return the value of field 'checkTables'.
     */
    public com.ccssoft.rsas.common.xmlparser.CheckTables getCheckTables()
    {
        return this._checkTables;
    } //-- com.regaltec.rsas.common.xmlparser.CheckTables getCheckTables() 

    /**
     * Returns the value of field 'conclusion'. The field
     * 'conclusion' has the following description: ����
     * 
     * @return the value of field 'conclusion'.
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusion getConclusion()
    {
        return this._conclusion;
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion getConclusion() 

    /**
     * Returns the value of field 'conclusions'.
     * 
     * @return the value of field 'conclusions'.
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusions getConclusions()
    {
        return this._conclusions;
    } //-- com.regaltec.rsas.common.xmlparser.Conclusions getConclusions() 

    /**
     * Returns the value of field 'condition'. The field
     * 'condition' has the following description: ����ɸѡ��������
     * 
     * @return the value of field 'condition'.
     */
    public com.ccssoft.rsas.common.xmlparser.Condition getCondition()
    {
        return this._condition;
    } //-- com.regaltec.rsas.common.xmlparser.Condition getCondition() 

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
     * Returns the value of field 'cube'. The field 'cube' has the
     * following description: ��������
     * 
     * @return the value of field 'cube'.
     */
    public com.ccssoft.rsas.common.xmlparser.Cube getCube()
    {
        return this._cube;
    } //-- com.regaltec.rsas.common.xmlparser.Cube getCube() 

    /**
     * Returns the value of field 'cubes'.
     * 
     * @return the value of field 'cubes'.
     */
    public com.ccssoft.rsas.common.xmlparser.Cubes getCubes()
    {
        return this._cubes;
    } //-- com.regaltec.rsas.common.xmlparser.Cubes getCubes() 

    /**
     * Returns the value of field 'dataAuthorityDiv'. The field
     * 'dataAuthorityDiv' has the following description: ����Ȩ������
     * 
     * @return the value of field 'dataAuthorityDiv'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv()
    {
        return this._dataAuthorityDiv;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv() 

    /**
     * Returns the value of field 'dataAuthorityDivs'.
     * 
     * @return the value of field 'dataAuthorityDivs'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs getDataAuthorityDivs()
    {
        return this._dataAuthorityDivs;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDivs getDataAuthorityDivs() 

    /**
     * Returns the value of field 'database'. The field 'database'
     * has the following description: ���ݿ�ϵͳ�е����ݿ�
     * 
     * @return the value of field 'database'.
     */
    public com.ccssoft.rsas.common.xmlparser.Database getDatabase()
    {
        return this._database;
    } //-- com.regaltec.rsas.common.xmlparser.Database getDatabase() 

    /**
     * Returns the value of field 'databaseType'. The field
     * 'databaseType' has the following description: ���ݿ�ϵͳ����
     * 
     * @return the value of field 'databaseType'.
     */
    public com.ccssoft.rsas.common.xmlparser.DatabaseType getDatabaseType()
    {
        return this._databaseType;
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseType getDatabaseType() 

    /**
     * Returns the value of field 'databaseTypes'.
     * 
     * @return the value of field 'databaseTypes'.
     */
    public com.ccssoft.rsas.common.xmlparser.DatabaseTypes getDatabaseTypes()
    {
        return this._databaseTypes;
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseTypes getDatabaseTypes() 

    /**
     * Returns the value of field 'databases'.
     * 
     * @return the value of field 'databases'.
     */
    public com.ccssoft.rsas.common.xmlparser.Databases getDatabases()
    {
        return this._databases;
    } //-- com.regaltec.rsas.common.xmlparser.Databases getDatabases() 

    /**
     * Returns the value of field 'dimension'. The field
     * 'dimension' has the following description: ά�ȶ���
     * 
     * @return the value of field 'dimension'.
     */
    public com.ccssoft.rsas.common.xmlparser.Dimension getDimension()
    {
        return this._dimension;
    } //-- com.regaltec.rsas.common.xmlparser.Dimension getDimension() 

    /**
     * Returns the value of field 'dimensionResult'. The field
     * 'dimensionResult' has the following description: ά�ȵ����ݽ��
     * 
     * @return the value of field 'dimensionResult'.
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionResult getDimensionResult()
    {
        return this._dimensionResult;
    } //-- com.regaltec.rsas.common.xmlparser.DimensionResult getDimensionResult() 

    /**
     * Returns the value of field 'dimensions'.
     * 
     * @return the value of field 'dimensions'.
     */
    public com.ccssoft.rsas.common.xmlparser.Dimensions getDimensions()
    {
        return this._dimensions;
    } //-- com.regaltec.rsas.common.xmlparser.Dimensions getDimensions() 

    /**
     * Returns the value of field 'divDistributer'. The field
     * 'divDistributer' has the following description:
     * ����Ȩ�����ӷ��䵽ɸѡ��ӳ�����
     * 
     * @return the value of field 'divDistributer'.
     */
    public com.ccssoft.rsas.common.xmlparser.DivDistributer getDivDistributer()
    {
        return this._divDistributer;
    } //-- com.regaltec.rsas.common.xmlparser.DivDistributer getDivDistributer() 

    /**
     * Returns the value of field 'divDistributers'.
     * 
     * @return the value of field 'divDistributers'.
     */
    public com.ccssoft.rsas.common.xmlparser.DivDistributers getDivDistributers()
    {
        return this._divDistributers;
    } //-- com.regaltec.rsas.common.xmlparser.DivDistributers getDivDistributers() 

    /**
     * Returns the value of field 'field'. The field 'field' has
     * the following description: �����
     * 
     * @return the value of field 'field'.
     */
    public com.ccssoft.rsas.common.xmlparser.Field getField()
    {
        return this._field;
    } //-- com.regaltec.rsas.common.xmlparser.Field getField() 

    /**
     * Returns the value of field 'fields'.
     * 
     * @return the value of field 'fields'.
     */
    public com.ccssoft.rsas.common.xmlparser.Fields getFields()
    {
        return this._fields;
    } //-- com.regaltec.rsas.common.xmlparser.Fields getFields() 

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: ����������
     * 
     * @return the value of field 'filter'.
     */
    public com.ccssoft.rsas.common.xmlparser.Filter getFilter()
    {
        return this._filter;
    } //-- com.regaltec.rsas.common.xmlparser.Filter getFilter() 

    /**
     * Returns the value of field 'filters'.
     * 
     * @return the value of field 'filters'.
     */
    public com.ccssoft.rsas.common.xmlparser.Filters getFilters()
    {
        return this._filters;
    } //-- com.regaltec.rsas.common.xmlparser.Filters getFilters() 

    /**
     * Returns the value of field 'hierarchy'. The field
     * 'hierarchy' has the following description: ά�Ȼ���Ĳ㼶
     * 
     * @return the value of field 'hierarchy'.
     */
    public com.ccssoft.rsas.common.xmlparser.Hierarchy getHierarchy()
    {
        return this._hierarchy;
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchy getHierarchy() 

    /**
     * Returns the value of field 'hierarchys'.
     * 
     * @return the value of field 'hierarchys'.
     */
    public com.ccssoft.rsas.common.xmlparser.Hierarchys getHierarchys()
    {
        return this._hierarchys;
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchys getHierarchys() 

    /**
     * Returns the value of field 'indicator'. The field
     * 'indicator' has the following description: ָ��
     * 
     * @return the value of field 'indicator'.
     */
    public com.ccssoft.rsas.common.xmlparser.Indicator getIndicator()
    {
        return this._indicator;
    } //-- com.regaltec.rsas.common.xmlparser.Indicator getIndicator() 

    /**
     * Returns the value of field 'indicatorCategory'. The field
     * 'indicatorCategory' has the following description: ָ��Ŀ¼
     * 
     * @return the value of field 'indicatorCategory'.
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategory getIndicatorCategory()
    {
        return this._indicatorCategory;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategory getIndicatorCategory() 

    /**
     * Returns the value of field 'indicatorCategorys'.
     * 
     * @return the value of field 'indicatorCategorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategorys getIndicatorCategorys()
    {
        return this._indicatorCategorys;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategorys getIndicatorCategorys() 

    /**
     * Returns the value of field 'indicators'.
     * 
     * @return the value of field 'indicators'.
     */
    public com.ccssoft.rsas.common.xmlparser.Indicators getIndicators()
    {
        return this._indicators;
    } //-- com.regaltec.rsas.common.xmlparser.Indicators getIndicators() 

    /**
     * Returns the value of field 'information'. The field
     * 'information' has the following description: ϵͳ������Ϣ
     * 
     * @return the value of field 'information'.
     */
    public com.ccssoft.rsas.common.xmlparser.Information getInformation()
    {
        return this._information;
    } //-- com.regaltec.rsas.common.xmlparser.Information getInformation() 

    /**
     * Returns the value of field 'link'. The field 'link' has the
     * following description: ����Դ����
     * 
     * @return the value of field 'link'.
     */
    public com.ccssoft.rsas.common.xmlparser.Link getLink()
    {
        return this._link;
    } //-- com.regaltec.rsas.common.xmlparser.Link getLink() 

    /**
     * Returns the value of field 'links'.
     * 
     * @return the value of field 'links'.
     */
    public com.ccssoft.rsas.common.xmlparser.Links getLinks()
    {
        return this._links;
    } //-- com.regaltec.rsas.common.xmlparser.Links getLinks() 

    /**
     * Returns the value of field 'MIDCategory'. The field
     * 'MIDCategory' has the following description: �ƶ��ն�Ŀ¼
     * 
     * @return the value of field 'MIDCategory'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDCategory getMIDCategory()
    {
        return this._MIDCategory;
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategory getMIDCategory() 

    /**
     * Returns the value of field 'MIDCategorys'.
     * 
     * @return the value of field 'MIDCategorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDCategorys getMIDCategorys()
    {
        return this._MIDCategorys;
    } //-- com.regaltec.rsas.common.xmlparser.MIDCategorys getMIDCategorys() 

    /**
     * Returns the value of field 'MIDHomeItem'. The field
     * 'MIDHomeItem' has the following description: HTML �ƶ�������ҳ��Ŀ
     * 
     * @return the value of field 'MIDHomeItem'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDHomeItem getMIDHomeItem()
    {
        return this._MIDHomeItem;
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItem getMIDHomeItem() 

    /**
     * Returns the value of field 'MIDHomeItems'. The field
     * 'MIDHomeItems' has the following description: HTML
     * �ƶ�������ҳ��Ŀ����
     * 
     * @return the value of field 'MIDHomeItems'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDHomeItems getMIDHomeItems()
    {
        return this._MIDHomeItems;
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItems getMIDHomeItems() 

    /**
     * Returns the value of field 'MIDIndCategories'. The field
     * 'MIDIndCategories' has the following description: HTML
     * �ƶ�����ָ�귢��Ŀ¼����
     * 
     * @return the value of field 'MIDIndCategories'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDIndCategories getMIDIndCategories()
    {
        return this._MIDIndCategories;
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategories getMIDIndCategories() 

    /**
     * Returns the value of field 'MIDIndCategory'. The field
     * 'MIDIndCategory' has the following description: HTML
     * �ƶ�����ָ�귢��Ŀ¼
     * 
     * @return the value of field 'MIDIndCategory'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDIndCategory getMIDIndCategory()
    {
        return this._MIDIndCategory;
    } //-- com.regaltec.rsas.common.xmlparser.MIDIndCategory getMIDIndCategory() 

    /**
     * Returns the value of field 'MIDMessage'. The field
     * 'MIDMessage' has the following description: HTML ��Ϣ
     * 
     * @return the value of field 'MIDMessage'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDMessage getMIDMessage()
    {
        return this._MIDMessage;
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessage getMIDMessage() 

    /**
     * Returns the value of field 'MIDMessages'. The field
     * 'MIDMessages' has the following description: HTML ��Ϣ����
     * 
     * @return the value of field 'MIDMessages'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDMessages getMIDMessages()
    {
        return this._MIDMessages;
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessages getMIDMessages() 

    /**
     * Returns the value of field 'MIDReport'. The field
     * 'MIDReport' has the following description: �ƶ�����
     * 
     * @return the value of field 'MIDReport'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDReport getMIDReport()
    {
        return this._MIDReport;
    } //-- com.regaltec.rsas.common.xmlparser.MIDReport getMIDReport() 

    /**
     * Returns the value of field 'MIDReports'.
     * 
     * @return the value of field 'MIDReports'.
     */
    public com.ccssoft.rsas.common.xmlparser.MIDReports getMIDReports()
    {
        return this._MIDReports;
    } //-- com.regaltec.rsas.common.xmlparser.MIDReports getMIDReports() 

    /**
     * Returns the value of field 'measure'. The field 'measure'
     * has the following description: ��������
     * 
     * @return the value of field 'measure'.
     */
    public com.ccssoft.rsas.common.xmlparser.Measure getMeasure()
    {
        return this._measure;
    } //-- com.regaltec.rsas.common.xmlparser.Measure getMeasure() 

    /**
     * Returns the value of field 'measures'.
     * 
     * @return the value of field 'measures'.
     */
    public com.ccssoft.rsas.common.xmlparser.Measures getMeasures()
    {
        return this._measures;
    } //-- com.regaltec.rsas.common.xmlparser.Measures getMeasures() 

    /**
     * Returns the value of field 'objectType'. The field
     * 'objectType' has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @return the value of field 'objectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType getObjectType()
    {
        return this._objectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.OperItemObjectTypeType getObjectType() 

    /**
     * Returns the value of field 'procedure'. The field
     * 'procedure' has the following description: ����Ҫ���еĴ洢����
     * 
     * @return the value of field 'procedure'.
     */
    public com.ccssoft.rsas.common.xmlparser.Procedure getProcedure()
    {
        return this._procedure;
    } //-- com.regaltec.rsas.common.xmlparser.Procedure getProcedure() 

    /**
     * Returns the value of field 'procedures'.
     * 
     * @return the value of field 'procedures'.
     */
    public com.ccssoft.rsas.common.xmlparser.Procedures getProcedures()
    {
        return this._procedures;
    } //-- com.regaltec.rsas.common.xmlparser.Procedures getProcedures() 

    /**
     * Returns the value of field 'publish'. The field 'publish'
     * has the following description: ����������
     * 
     * @return the value of field 'publish'.
     */
    public com.ccssoft.rsas.common.xmlparser.Publish getPublish()
    {
        return this._publish;
    } //-- com.regaltec.rsas.common.xmlparser.Publish getPublish() 

    /**
     * Returns the value of field 'publishs'.
     * 
     * @return the value of field 'publishs'.
     */
    public com.ccssoft.rsas.common.xmlparser.Publishs getPublishs()
    {
        return this._publishs;
    } //-- com.regaltec.rsas.common.xmlparser.Publishs getPublishs() 

    /**
     * Returns the value of field 'query'. The field 'query' has
     * the following description: ��ѯ����
     * 
     * @return the value of field 'query'.
     */
    public com.ccssoft.rsas.common.xmlparser.Query getQuery()
    {
        return this._query;
    } //-- com.regaltec.rsas.common.xmlparser.Query getQuery() 

    /**
     * Returns the value of field 'queryResult'. The field
     * 'queryResult' has the following description:
     * �����ѯ���еĽ������Ԫ���ݿ��޹أ�
     * 
     * @return the value of field 'queryResult'.
     */
    public com.ccssoft.rsas.common.xmlparser.QueryResult getQueryResult()
    {
        return this._queryResult;
    } //-- com.regaltec.rsas.common.xmlparser.QueryResult getQueryResult() 

    /**
     * Returns the value of field 'querys'.
     * 
     * @return the value of field 'querys'.
     */
    public com.ccssoft.rsas.common.xmlparser.Querys getQuerys()
    {
        return this._querys;
    } //-- com.regaltec.rsas.common.xmlparser.Querys getQuerys() 

    /**
     * Returns the value of field 'RTFTemplateField'. The field
     * 'RTFTemplateField' has the following description:
     * RTPģ���ǩxml�ļ�
     * 
     * @return the value of field 'RTFTemplateField'.
     */
    public com.ccssoft.rsas.common.xmlparser.RTFTemplateField getRTFTemplateField()
    {
        return this._RTFTemplateField;
    } //-- com.regaltec.rsas.common.xmlparser.RTFTemplateField getRTFTemplateField() 

    /**
     * Returns the value of field 'relation'. The field 'relation'
     * has the following description: ����������
     * 
     * @return the value of field 'relation'.
     */
    public com.ccssoft.rsas.common.xmlparser.Relation getRelation()
    {
        return this._relation;
    } //-- com.regaltec.rsas.common.xmlparser.Relation getRelation() 

    /**
     * Returns the value of field 'report'. The field 'report' has
     * the following description: �������
     * 
     * @return the value of field 'report'.
     */
    public com.ccssoft.rsas.common.xmlparser.Report getReport()
    {
        return this._report;
    } //-- com.regaltec.rsas.common.xmlparser.Report getReport() 

    /**
     * Returns the value of field 'reportDoc'. The field
     * 'reportDoc' has the following description: �����ɱ������
     * 
     * @return the value of field 'reportDoc'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDoc getReportDoc()
    {
        return this._reportDoc;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDoc getReportDoc() 

    /**
     * Returns the value of field 'reportDocList'.
     * 
     * @return the value of field 'reportDocList'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDocList getReportDocList()
    {
        return this._reportDocList;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDocList getReportDocList() 

    /**
     * Returns the value of field 'reportPublish'.
     * 
     * @return the value of field 'reportPublish'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportPublish getReportPublish()
    {
        return this._reportPublish;
    } //-- com.regaltec.rsas.common.xmlparser.ReportPublish getReportPublish() 

    /**
     * Returns the value of field 'reportResults'. The field
     * 'reportResults' has the following description: ����Ԫ���ݿ��޹أ�
     * 
     * @return the value of field 'reportResults'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportResults getReportResults()
    {
        return this._reportResults;
    } //-- com.regaltec.rsas.common.xmlparser.ReportResults getReportResults() 

    /**
     * Returns the value of field 'reports'.
     * 
     * @return the value of field 'reports'.
     */
    public com.ccssoft.rsas.common.xmlparser.Reports getReports()
    {
        return this._reports;
    } //-- com.regaltec.rsas.common.xmlparser.Reports getReports() 

    /**
     * Returns the value of field 'returnRecords'.
     * 
     * @return the value of field 'returnRecords'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReturnRecords getReturnRecords()
    {
        return this._returnRecords;
    } //-- com.regaltec.rsas.common.xmlparser.ReturnRecords getReturnRecords() 

    /**
     * Returns the value of field 'SQLFunction'. The field
     * 'SQLFunction' has the following description:
     * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
     * 
     * @return the value of field 'SQLFunction'.
     */
    public com.ccssoft.rsas.common.xmlparser.SQLFunction getSQLFunction()
    {
        return this._SQLFunction;
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunction getSQLFunction() 

    /**
     * Returns the value of field 'SQLFunctions'.
     * 
     * @return the value of field 'SQLFunctions'.
     */
    public com.ccssoft.rsas.common.xmlparser.SQLFunctions getSQLFunctions()
    {
        return this._SQLFunctions;
    } //-- com.regaltec.rsas.common.xmlparser.SQLFunctions getSQLFunctions() 

    /**
     * Returns the value of field 'subscription'. The field
     * 'subscription' has the following description: ����
     * 
     * @return the value of field 'subscription'.
     */
    public com.ccssoft.rsas.common.xmlparser.Subscription getSubscription()
    {
        return this._subscription;
    } //-- com.regaltec.rsas.common.xmlparser.Subscription getSubscription() 

    /**
     * Returns the value of field 'subscriptions'.
     * 
     * @return the value of field 'subscriptions'.
     */
    public com.ccssoft.rsas.common.xmlparser.Subscriptions getSubscriptions()
    {
        return this._subscriptions;
    } //-- com.regaltec.rsas.common.xmlparser.Subscriptions getSubscriptions() 

    /**
     * Returns the value of field 'systemVariant'. The field
     * 'systemVariant' has the following description: ϵͳ���б���
     * 
     * @return the value of field 'systemVariant'.
     */
    public com.ccssoft.rsas.common.xmlparser.SystemVariant getSystemVariant()
    {
        return this._systemVariant;
    } //-- com.regaltec.rsas.common.xmlparser.SystemVariant getSystemVariant() 

    /**
     * Returns the value of field 'tasker'. The field 'tasker' has
     * the following description: �ƻ�����
     * 
     * @return the value of field 'tasker'.
     */
    public com.ccssoft.rsas.common.xmlparser.Tasker getTasker()
    {
        return this._tasker;
    } //-- com.regaltec.rsas.common.xmlparser.Tasker getTasker() 

    /**
     * Returns the value of field 'taskerGroup'. The field
     * 'taskerGroup' has the following description: �ƻ�������
     * 
     * @return the value of field 'taskerGroup'.
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerGroup getTaskerGroup()
    {
        return this._taskerGroup;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroup getTaskerGroup() 

    /**
     * Returns the value of field 'taskerGroups'.
     * 
     * @return the value of field 'taskerGroups'.
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerGroups getTaskerGroups()
    {
        return this._taskerGroups;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroups getTaskerGroups() 

    /**
     * Returns the value of field 'taskers'.
     * 
     * @return the value of field 'taskers'.
     */
    public com.ccssoft.rsas.common.xmlparser.Taskers getTaskers()
    {
        return this._taskers;
    } //-- com.regaltec.rsas.common.xmlparser.Taskers getTaskers() 

    /**
     * Returns the value of field 'template'. The field 'template'
     * has the following description: ʹ�õı�����ʽ
     * 
     * @return the value of field 'template'.
     */
    public com.ccssoft.rsas.common.xmlparser.Template getTemplate()
    {
        return this._template;
    } //-- com.regaltec.rsas.common.xmlparser.Template getTemplate() 

    /**
     * Returns the value of field 'templates'.
     * 
     * @return the value of field 'templates'.
     */
    public com.ccssoft.rsas.common.xmlparser.Templates getTemplates()
    {
        return this._templates;
    } //-- com.regaltec.rsas.common.xmlparser.Templates getTemplates() 

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
     * Sets the value of field 'application'. The field
     * 'application' has the following description: �ⲿӦ��ϵͳ
     * 
     * @param application the value of field 'application'.
     */
    public void setApplication(com.ccssoft.rsas.common.xmlparser.Application application)
    {
        this._application = application;
    } //-- void setApplication(com.regaltec.rsas.common.xmlparser.Application) 

    /**
     * Sets the value of field 'applications'.
     * 
     * @param applications the value of field 'applications'.
     */
    public void setApplications(com.ccssoft.rsas.common.xmlparser.Applications applications)
    {
        this._applications = applications;
    } //-- void setApplications(com.regaltec.rsas.common.xmlparser.Applications) 

    /**
     * Sets the value of field 'category'. The field 'category' has
     * the following description: ����������
     * 
     * @param category the value of field 'category'.
     */
    public void setCategory(com.ccssoft.rsas.common.xmlparser.Category category)
    {
        this._category = category;
    } //-- void setCategory(com.regaltec.rsas.common.xmlparser.Category) 

    /**
     * Sets the value of field 'categorys'.
     * 
     * @param categorys the value of field 'categorys'.
     */
    public void setCategorys(com.ccssoft.rsas.common.xmlparser.Categorys categorys)
    {
        this._categorys = categorys;
    } //-- void setCategorys(com.regaltec.rsas.common.xmlparser.Categorys) 

    /**
     * Sets the value of field 'checkTables'. The field
     * 'checkTables' has the following description: ���ݺ˶Ա���󼯺�
     * 
     * @param checkTables the value of field 'checkTables'.
     */
    public void setCheckTables(com.ccssoft.rsas.common.xmlparser.CheckTables checkTables)
    {
        this._checkTables = checkTables;
    } //-- void setCheckTables(com.regaltec.rsas.common.xmlparser.CheckTables) 

    /**
     * Sets the value of field 'conclusion'. The field 'conclusion'
     * has the following description: ����
     * 
     * @param conclusion the value of field 'conclusion'.
     */
    public void setConclusion(com.ccssoft.rsas.common.xmlparser.Conclusion conclusion)
    {
        this._conclusion = conclusion;
    } //-- void setConclusion(com.regaltec.rsas.common.xmlparser.Conclusion) 

    /**
     * Sets the value of field 'conclusions'.
     * 
     * @param conclusions the value of field 'conclusions'.
     */
    public void setConclusions(com.ccssoft.rsas.common.xmlparser.Conclusions conclusions)
    {
        this._conclusions = conclusions;
    } //-- void setConclusions(com.regaltec.rsas.common.xmlparser.Conclusions) 

    /**
     * Sets the value of field 'condition'. The field 'condition'
     * has the following description: ����ɸѡ��������
     * 
     * @param condition the value of field 'condition'.
     */
    public void setCondition(com.ccssoft.rsas.common.xmlparser.Condition condition)
    {
        this._condition = condition;
    } //-- void setCondition(com.regaltec.rsas.common.xmlparser.Condition) 

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
     * Sets the value of field 'cube'. The field 'cube' has the
     * following description: ��������
     * 
     * @param cube the value of field 'cube'.
     */
    public void setCube(com.ccssoft.rsas.common.xmlparser.Cube cube)
    {
        this._cube = cube;
    } //-- void setCube(com.regaltec.rsas.common.xmlparser.Cube) 

    /**
     * Sets the value of field 'cubes'.
     * 
     * @param cubes the value of field 'cubes'.
     */
    public void setCubes(com.ccssoft.rsas.common.xmlparser.Cubes cubes)
    {
        this._cubes = cubes;
    } //-- void setCubes(com.regaltec.rsas.common.xmlparser.Cubes) 

    /**
     * Sets the value of field 'dataAuthorityDiv'. The field
     * 'dataAuthorityDiv' has the following description: ����Ȩ������
     * 
     * @param dataAuthorityDiv the value of field 'dataAuthorityDiv'
     */
    public void setDataAuthorityDiv(com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv dataAuthorityDiv)
    {
        this._dataAuthorityDiv = dataAuthorityDiv;
    } //-- void setDataAuthorityDiv(com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

    /**
     * Sets the value of field 'dataAuthorityDivs'.
     * 
     * @param dataAuthorityDivs the value of field
     * 'dataAuthorityDivs'.
     */
    public void setDataAuthorityDivs(com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs dataAuthorityDivs)
    {
        this._dataAuthorityDivs = dataAuthorityDivs;
    } //-- void setDataAuthorityDivs(com.regaltec.rsas.common.xmlparser.DataAuthorityDivs) 

    /**
     * Sets the value of field 'database'. The field 'database' has
     * the following description: ���ݿ�ϵͳ�е����ݿ�
     * 
     * @param database the value of field 'database'.
     */
    public void setDatabase(com.ccssoft.rsas.common.xmlparser.Database database)
    {
        this._database = database;
    } //-- void setDatabase(com.regaltec.rsas.common.xmlparser.Database) 

    /**
     * Sets the value of field 'databaseType'. The field
     * 'databaseType' has the following description: ���ݿ�ϵͳ����
     * 
     * @param databaseType the value of field 'databaseType'.
     */
    public void setDatabaseType(com.ccssoft.rsas.common.xmlparser.DatabaseType databaseType)
    {
        this._databaseType = databaseType;
    } //-- void setDatabaseType(com.regaltec.rsas.common.xmlparser.DatabaseType) 

    /**
     * Sets the value of field 'databaseTypes'.
     * 
     * @param databaseTypes the value of field 'databaseTypes'.
     */
    public void setDatabaseTypes(com.ccssoft.rsas.common.xmlparser.DatabaseTypes databaseTypes)
    {
        this._databaseTypes = databaseTypes;
    } //-- void setDatabaseTypes(com.regaltec.rsas.common.xmlparser.DatabaseTypes) 

    /**
     * Sets the value of field 'databases'.
     * 
     * @param databases the value of field 'databases'.
     */
    public void setDatabases(com.ccssoft.rsas.common.xmlparser.Databases databases)
    {
        this._databases = databases;
    } //-- void setDatabases(com.regaltec.rsas.common.xmlparser.Databases) 

    /**
     * Sets the value of field 'dimension'. The field 'dimension'
     * has the following description: ά�ȶ���
     * 
     * @param dimension the value of field 'dimension'.
     */
    public void setDimension(com.ccssoft.rsas.common.xmlparser.Dimension dimension)
    {
        this._dimension = dimension;
    } //-- void setDimension(com.regaltec.rsas.common.xmlparser.Dimension) 

    /**
     * Sets the value of field 'dimensionResult'. The field
     * 'dimensionResult' has the following description: ά�ȵ����ݽ��
     * 
     * @param dimensionResult the value of field 'dimensionResult'.
     */
    public void setDimensionResult(com.ccssoft.rsas.common.xmlparser.DimensionResult dimensionResult)
    {
        this._dimensionResult = dimensionResult;
    } //-- void setDimensionResult(com.regaltec.rsas.common.xmlparser.DimensionResult) 

    /**
     * Sets the value of field 'dimensions'.
     * 
     * @param dimensions the value of field 'dimensions'.
     */
    public void setDimensions(com.ccssoft.rsas.common.xmlparser.Dimensions dimensions)
    {
        this._dimensions = dimensions;
    } //-- void setDimensions(com.regaltec.rsas.common.xmlparser.Dimensions) 

    /**
     * Sets the value of field 'divDistributer'. The field
     * 'divDistributer' has the following description:
     * ����Ȩ�����ӷ��䵽ɸѡ��ӳ�����
     * 
     * @param divDistributer the value of field 'divDistributer'.
     */
    public void setDivDistributer(com.ccssoft.rsas.common.xmlparser.DivDistributer divDistributer)
    {
        this._divDistributer = divDistributer;
    } //-- void setDivDistributer(com.regaltec.rsas.common.xmlparser.DivDistributer) 

    /**
     * Sets the value of field 'divDistributers'.
     * 
     * @param divDistributers the value of field 'divDistributers'.
     */
    public void setDivDistributers(com.ccssoft.rsas.common.xmlparser.DivDistributers divDistributers)
    {
        this._divDistributers = divDistributers;
    } //-- void setDivDistributers(com.regaltec.rsas.common.xmlparser.DivDistributers) 

    /**
     * Sets the value of field 'field'. The field 'field' has the
     * following description: �����
     * 
     * @param field the value of field 'field'.
     */
    public void setField(com.ccssoft.rsas.common.xmlparser.Field field)
    {
        this._field = field;
    } //-- void setField(com.regaltec.rsas.common.xmlparser.Field) 

    /**
     * Sets the value of field 'fields'.
     * 
     * @param fields the value of field 'fields'.
     */
    public void setFields(com.ccssoft.rsas.common.xmlparser.Fields fields)
    {
        this._fields = fields;
    } //-- void setFields(com.regaltec.rsas.common.xmlparser.Fields) 

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: ����������
     * 
     * @param filter the value of field 'filter'.
     */
    public void setFilter(com.ccssoft.rsas.common.xmlparser.Filter filter)
    {
        this._filter = filter;
    } //-- void setFilter(com.regaltec.rsas.common.xmlparser.Filter) 

    /**
     * Sets the value of field 'filters'.
     * 
     * @param filters the value of field 'filters'.
     */
    public void setFilters(com.ccssoft.rsas.common.xmlparser.Filters filters)
    {
        this._filters = filters;
    } //-- void setFilters(com.regaltec.rsas.common.xmlparser.Filters) 

    /**
     * Sets the value of field 'hierarchy'. The field 'hierarchy'
     * has the following description: ά�Ȼ���Ĳ㼶
     * 
     * @param hierarchy the value of field 'hierarchy'.
     */
    public void setHierarchy(com.ccssoft.rsas.common.xmlparser.Hierarchy hierarchy)
    {
        this._hierarchy = hierarchy;
    } //-- void setHierarchy(com.regaltec.rsas.common.xmlparser.Hierarchy) 

    /**
     * Sets the value of field 'hierarchys'.
     * 
     * @param hierarchys the value of field 'hierarchys'.
     */
    public void setHierarchys(com.ccssoft.rsas.common.xmlparser.Hierarchys hierarchys)
    {
        this._hierarchys = hierarchys;
    } //-- void setHierarchys(com.regaltec.rsas.common.xmlparser.Hierarchys) 

    /**
     * Sets the value of field 'indicator'. The field 'indicator'
     * has the following description: ָ��
     * 
     * @param indicator the value of field 'indicator'.
     */
    public void setIndicator(com.ccssoft.rsas.common.xmlparser.Indicator indicator)
    {
        this._indicator = indicator;
    } //-- void setIndicator(com.regaltec.rsas.common.xmlparser.Indicator) 

    /**
     * Sets the value of field 'indicatorCategory'. The field
     * 'indicatorCategory' has the following description: ָ��Ŀ¼
     * 
     * @param indicatorCategory the value of field
     * 'indicatorCategory'.
     */
    public void setIndicatorCategory(com.ccssoft.rsas.common.xmlparser.IndicatorCategory indicatorCategory)
    {
        this._indicatorCategory = indicatorCategory;
    } //-- void setIndicatorCategory(com.regaltec.rsas.common.xmlparser.IndicatorCategory) 

    /**
     * Sets the value of field 'indicatorCategorys'.
     * 
     * @param indicatorCategorys the value of field
     * 'indicatorCategorys'.
     */
    public void setIndicatorCategorys(com.ccssoft.rsas.common.xmlparser.IndicatorCategorys indicatorCategorys)
    {
        this._indicatorCategorys = indicatorCategorys;
    } //-- void setIndicatorCategorys(com.regaltec.rsas.common.xmlparser.IndicatorCategorys) 

    /**
     * Sets the value of field 'indicators'.
     * 
     * @param indicators the value of field 'indicators'.
     */
    public void setIndicators(com.ccssoft.rsas.common.xmlparser.Indicators indicators)
    {
        this._indicators = indicators;
    } //-- void setIndicators(com.regaltec.rsas.common.xmlparser.Indicators) 

    /**
     * Sets the value of field 'information'. The field
     * 'information' has the following description: ϵͳ������Ϣ
     * 
     * @param information the value of field 'information'.
     */
    public void setInformation(com.ccssoft.rsas.common.xmlparser.Information information)
    {
        this._information = information;
    } //-- void setInformation(com.regaltec.rsas.common.xmlparser.Information) 

    /**
     * Sets the value of field 'link'. The field 'link' has the
     * following description: ����Դ����
     * 
     * @param link the value of field 'link'.
     */
    public void setLink(com.ccssoft.rsas.common.xmlparser.Link link)
    {
        this._link = link;
    } //-- void setLink(com.regaltec.rsas.common.xmlparser.Link) 

    /**
     * Sets the value of field 'links'.
     * 
     * @param links the value of field 'links'.
     */
    public void setLinks(com.ccssoft.rsas.common.xmlparser.Links links)
    {
        this._links = links;
    } //-- void setLinks(com.regaltec.rsas.common.xmlparser.Links) 

    /**
     * Sets the value of field 'MIDCategory'. The field
     * 'MIDCategory' has the following description: �ƶ��ն�Ŀ¼
     * 
     * @param MIDCategory the value of field 'MIDCategory'.
     */
    public void setMIDCategory(com.ccssoft.rsas.common.xmlparser.MIDCategory MIDCategory)
    {
        this._MIDCategory = MIDCategory;
    } //-- void setMIDCategory(com.regaltec.rsas.common.xmlparser.MIDCategory) 

    /**
     * Sets the value of field 'MIDCategorys'.
     * 
     * @param MIDCategorys the value of field 'MIDCategorys'.
     */
    public void setMIDCategorys(com.ccssoft.rsas.common.xmlparser.MIDCategorys MIDCategorys)
    {
        this._MIDCategorys = MIDCategorys;
    } //-- void setMIDCategorys(com.regaltec.rsas.common.xmlparser.MIDCategorys) 

    /**
     * Sets the value of field 'MIDHomeItem'. The field
     * 'MIDHomeItem' has the following description: HTML �ƶ�������ҳ��Ŀ
     * 
     * @param MIDHomeItem the value of field 'MIDHomeItem'.
     */
    public void setMIDHomeItem(com.ccssoft.rsas.common.xmlparser.MIDHomeItem MIDHomeItem)
    {
        this._MIDHomeItem = MIDHomeItem;
    } //-- void setMIDHomeItem(com.regaltec.rsas.common.xmlparser.MIDHomeItem) 

    /**
     * Sets the value of field 'MIDHomeItems'. The field
     * 'MIDHomeItems' has the following description: HTML
     * �ƶ�������ҳ��Ŀ����
     * 
     * @param MIDHomeItems the value of field 'MIDHomeItems'.
     */
    public void setMIDHomeItems(com.ccssoft.rsas.common.xmlparser.MIDHomeItems MIDHomeItems)
    {
        this._MIDHomeItems = MIDHomeItems;
    } //-- void setMIDHomeItems(com.regaltec.rsas.common.xmlparser.MIDHomeItems) 

    /**
     * Sets the value of field 'MIDIndCategories'. The field
     * 'MIDIndCategories' has the following description: HTML
     * �ƶ�����ָ�귢��Ŀ¼����
     * 
     * @param MIDIndCategories the value of field 'MIDIndCategories'
     */
    public void setMIDIndCategories(com.ccssoft.rsas.common.xmlparser.MIDIndCategories MIDIndCategories)
    {
        this._MIDIndCategories = MIDIndCategories;
    } //-- void setMIDIndCategories(com.regaltec.rsas.common.xmlparser.MIDIndCategories) 

    /**
     * Sets the value of field 'MIDIndCategory'. The field
     * 'MIDIndCategory' has the following description: HTML
     * �ƶ�����ָ�귢��Ŀ¼
     * 
     * @param MIDIndCategory the value of field 'MIDIndCategory'.
     */
    public void setMIDIndCategory(com.ccssoft.rsas.common.xmlparser.MIDIndCategory MIDIndCategory)
    {
        this._MIDIndCategory = MIDIndCategory;
    } //-- void setMIDIndCategory(com.regaltec.rsas.common.xmlparser.MIDIndCategory) 

    /**
     * Sets the value of field 'MIDMessage'. The field 'MIDMessage'
     * has the following description: HTML ��Ϣ
     * 
     * @param MIDMessage the value of field 'MIDMessage'.
     */
    public void setMIDMessage(com.ccssoft.rsas.common.xmlparser.MIDMessage MIDMessage)
    {
        this._MIDMessage = MIDMessage;
    } //-- void setMIDMessage(com.regaltec.rsas.common.xmlparser.MIDMessage) 

    /**
     * Sets the value of field 'MIDMessages'. The field
     * 'MIDMessages' has the following description: HTML ��Ϣ����
     * 
     * @param MIDMessages the value of field 'MIDMessages'.
     */
    public void setMIDMessages(com.ccssoft.rsas.common.xmlparser.MIDMessages MIDMessages)
    {
        this._MIDMessages = MIDMessages;
    } //-- void setMIDMessages(com.regaltec.rsas.common.xmlparser.MIDMessages) 

    /**
     * Sets the value of field 'MIDReport'. The field 'MIDReport'
     * has the following description: �ƶ�����
     * 
     * @param MIDReport the value of field 'MIDReport'.
     */
    public void setMIDReport(com.ccssoft.rsas.common.xmlparser.MIDReport MIDReport)
    {
        this._MIDReport = MIDReport;
    } //-- void setMIDReport(com.regaltec.rsas.common.xmlparser.MIDReport) 

    /**
     * Sets the value of field 'MIDReports'.
     * 
     * @param MIDReports the value of field 'MIDReports'.
     */
    public void setMIDReports(com.ccssoft.rsas.common.xmlparser.MIDReports MIDReports)
    {
        this._MIDReports = MIDReports;
    } //-- void setMIDReports(com.regaltec.rsas.common.xmlparser.MIDReports) 

    /**
     * Sets the value of field 'measure'. The field 'measure' has
     * the following description: ��������
     * 
     * @param measure the value of field 'measure'.
     */
    public void setMeasure(com.ccssoft.rsas.common.xmlparser.Measure measure)
    {
        this._measure = measure;
    } //-- void setMeasure(com.regaltec.rsas.common.xmlparser.Measure) 

    /**
     * Sets the value of field 'measures'.
     * 
     * @param measures the value of field 'measures'.
     */
    public void setMeasures(com.ccssoft.rsas.common.xmlparser.Measures measures)
    {
        this._measures = measures;
    } //-- void setMeasures(com.regaltec.rsas.common.xmlparser.Measures) 

    /**
     * Sets the value of field 'objectType'. The field 'objectType'
     * has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @param objectType the value of field 'objectType'.
     */
    public void setObjectType(com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType objectType)
    {
        this._objectType = objectType;
    } //-- void setObjectType(com.regaltec.rsas.common.xmlparser.types.OperItemObjectTypeType) 

    /**
     * Sets the value of field 'procedure'. The field 'procedure'
     * has the following description: ����Ҫ���еĴ洢����
     * 
     * @param procedure the value of field 'procedure'.
     */
    public void setProcedure(com.ccssoft.rsas.common.xmlparser.Procedure procedure)
    {
        this._procedure = procedure;
    } //-- void setProcedure(com.regaltec.rsas.common.xmlparser.Procedure) 

    /**
     * Sets the value of field 'procedures'.
     * 
     * @param procedures the value of field 'procedures'.
     */
    public void setProcedures(com.ccssoft.rsas.common.xmlparser.Procedures procedures)
    {
        this._procedures = procedures;
    } //-- void setProcedures(com.regaltec.rsas.common.xmlparser.Procedures) 

    /**
     * Sets the value of field 'publish'. The field 'publish' has
     * the following description: ����������
     * 
     * @param publish the value of field 'publish'.
     */
    public void setPublish(com.ccssoft.rsas.common.xmlparser.Publish publish)
    {
        this._publish = publish;
    } //-- void setPublish(com.regaltec.rsas.common.xmlparser.Publish) 

    /**
     * Sets the value of field 'publishs'.
     * 
     * @param publishs the value of field 'publishs'.
     */
    public void setPublishs(com.ccssoft.rsas.common.xmlparser.Publishs publishs)
    {
        this._publishs = publishs;
    } //-- void setPublishs(com.regaltec.rsas.common.xmlparser.Publishs) 

    /**
     * Sets the value of field 'query'. The field 'query' has the
     * following description: ��ѯ����
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(com.ccssoft.rsas.common.xmlparser.Query query)
    {
        this._query = query;
    } //-- void setQuery(com.regaltec.rsas.common.xmlparser.Query) 

    /**
     * Sets the value of field 'queryResult'. The field
     * 'queryResult' has the following description:
     * �����ѯ���еĽ������Ԫ���ݿ��޹أ�
     * 
     * @param queryResult the value of field 'queryResult'.
     */
    public void setQueryResult(com.ccssoft.rsas.common.xmlparser.QueryResult queryResult)
    {
        this._queryResult = queryResult;
    } //-- void setQueryResult(com.regaltec.rsas.common.xmlparser.QueryResult) 

    /**
     * Sets the value of field 'querys'.
     * 
     * @param querys the value of field 'querys'.
     */
    public void setQuerys(com.ccssoft.rsas.common.xmlparser.Querys querys)
    {
        this._querys = querys;
    } //-- void setQuerys(com.regaltec.rsas.common.xmlparser.Querys) 

    /**
     * Sets the value of field 'RTFTemplateField'. The field
     * 'RTFTemplateField' has the following description:
     * RTPģ���ǩxml�ļ�
     * 
     * @param RTFTemplateField the value of field 'RTFTemplateField'
     */
    public void setRTFTemplateField(com.ccssoft.rsas.common.xmlparser.RTFTemplateField RTFTemplateField)
    {
        this._RTFTemplateField = RTFTemplateField;
    } //-- void setRTFTemplateField(com.regaltec.rsas.common.xmlparser.RTFTemplateField) 

    /**
     * Sets the value of field 'relation'. The field 'relation' has
     * the following description: ����������
     * 
     * @param relation the value of field 'relation'.
     */
    public void setRelation(com.ccssoft.rsas.common.xmlparser.Relation relation)
    {
        this._relation = relation;
    } //-- void setRelation(com.regaltec.rsas.common.xmlparser.Relation) 

    /**
     * Sets the value of field 'report'. The field 'report' has the
     * following description: �������
     * 
     * @param report the value of field 'report'.
     */
    public void setReport(com.ccssoft.rsas.common.xmlparser.Report report)
    {
        this._report = report;
    } //-- void setReport(com.regaltec.rsas.common.xmlparser.Report) 

    /**
     * Sets the value of field 'reportDoc'. The field 'reportDoc'
     * has the following description: �����ɱ������
     * 
     * @param reportDoc the value of field 'reportDoc'.
     */
    public void setReportDoc(com.ccssoft.rsas.common.xmlparser.ReportDoc reportDoc)
    {
        this._reportDoc = reportDoc;
    } //-- void setReportDoc(com.regaltec.rsas.common.xmlparser.ReportDoc) 

    /**
     * Sets the value of field 'reportDocList'.
     * 
     * @param reportDocList the value of field 'reportDocList'.
     */
    public void setReportDocList(com.ccssoft.rsas.common.xmlparser.ReportDocList reportDocList)
    {
        this._reportDocList = reportDocList;
    } //-- void setReportDocList(com.regaltec.rsas.common.xmlparser.ReportDocList) 

    /**
     * Sets the value of field 'reportPublish'.
     * 
     * @param reportPublish the value of field 'reportPublish'.
     */
    public void setReportPublish(com.ccssoft.rsas.common.xmlparser.ReportPublish reportPublish)
    {
        this._reportPublish = reportPublish;
    } //-- void setReportPublish(com.regaltec.rsas.common.xmlparser.ReportPublish) 

    /**
     * Sets the value of field 'reportResults'. The field
     * 'reportResults' has the following description: ����Ԫ���ݿ��޹أ�
     * 
     * @param reportResults the value of field 'reportResults'.
     */
    public void setReportResults(com.ccssoft.rsas.common.xmlparser.ReportResults reportResults)
    {
        this._reportResults = reportResults;
    } //-- void setReportResults(com.regaltec.rsas.common.xmlparser.ReportResults) 

    /**
     * Sets the value of field 'reports'.
     * 
     * @param reports the value of field 'reports'.
     */
    public void setReports(com.ccssoft.rsas.common.xmlparser.Reports reports)
    {
        this._reports = reports;
    } //-- void setReports(com.regaltec.rsas.common.xmlparser.Reports) 

    /**
     * Sets the value of field 'returnRecords'.
     * 
     * @param returnRecords the value of field 'returnRecords'.
     */
    public void setReturnRecords(com.ccssoft.rsas.common.xmlparser.ReturnRecords returnRecords)
    {
        this._returnRecords = returnRecords;
    } //-- void setReturnRecords(com.regaltec.rsas.common.xmlparser.ReturnRecords) 

    /**
     * Sets the value of field 'SQLFunction'. The field
     * 'SQLFunction' has the following description:
     * ϵͳ�������壨�������ݿ⺯��Ҳͨ���ö����ã�
     * 
     * @param SQLFunction the value of field 'SQLFunction'.
     */
    public void setSQLFunction(com.ccssoft.rsas.common.xmlparser.SQLFunction SQLFunction)
    {
        this._SQLFunction = SQLFunction;
    } //-- void setSQLFunction(com.regaltec.rsas.common.xmlparser.SQLFunction) 

    /**
     * Sets the value of field 'SQLFunctions'.
     * 
     * @param SQLFunctions the value of field 'SQLFunctions'.
     */
    public void setSQLFunctions(com.ccssoft.rsas.common.xmlparser.SQLFunctions SQLFunctions)
    {
        this._SQLFunctions = SQLFunctions;
    } //-- void setSQLFunctions(com.regaltec.rsas.common.xmlparser.SQLFunctions) 

    /**
     * Sets the value of field 'subscription'. The field
     * 'subscription' has the following description: ����
     * 
     * @param subscription the value of field 'subscription'.
     */
    public void setSubscription(com.ccssoft.rsas.common.xmlparser.Subscription subscription)
    {
        this._subscription = subscription;
    } //-- void setSubscription(com.regaltec.rsas.common.xmlparser.Subscription) 

    /**
     * Sets the value of field 'subscriptions'.
     * 
     * @param subscriptions the value of field 'subscriptions'.
     */
    public void setSubscriptions(com.ccssoft.rsas.common.xmlparser.Subscriptions subscriptions)
    {
        this._subscriptions = subscriptions;
    } //-- void setSubscriptions(com.regaltec.rsas.common.xmlparser.Subscriptions) 

    /**
     * Sets the value of field 'systemVariant'. The field
     * 'systemVariant' has the following description: ϵͳ���б���
     * 
     * @param systemVariant the value of field 'systemVariant'.
     */
    public void setSystemVariant(com.ccssoft.rsas.common.xmlparser.SystemVariant systemVariant)
    {
        this._systemVariant = systemVariant;
    } //-- void setSystemVariant(com.regaltec.rsas.common.xmlparser.SystemVariant) 

    /**
     * Sets the value of field 'tasker'. The field 'tasker' has the
     * following description: �ƻ�����
     * 
     * @param tasker the value of field 'tasker'.
     */
    public void setTasker(com.ccssoft.rsas.common.xmlparser.Tasker tasker)
    {
        this._tasker = tasker;
    } //-- void setTasker(com.regaltec.rsas.common.xmlparser.Tasker) 

    /**
     * Sets the value of field 'taskerGroup'. The field
     * 'taskerGroup' has the following description: �ƻ�������
     * 
     * @param taskerGroup the value of field 'taskerGroup'.
     */
    public void setTaskerGroup(com.ccssoft.rsas.common.xmlparser.TaskerGroup taskerGroup)
    {
        this._taskerGroup = taskerGroup;
    } //-- void setTaskerGroup(com.regaltec.rsas.common.xmlparser.TaskerGroup) 

    /**
     * Sets the value of field 'taskerGroups'.
     * 
     * @param taskerGroups the value of field 'taskerGroups'.
     */
    public void setTaskerGroups(com.ccssoft.rsas.common.xmlparser.TaskerGroups taskerGroups)
    {
        this._taskerGroups = taskerGroups;
    } //-- void setTaskerGroups(com.regaltec.rsas.common.xmlparser.TaskerGroups) 

    /**
     * Sets the value of field 'taskers'.
     * 
     * @param taskers the value of field 'taskers'.
     */
    public void setTaskers(com.ccssoft.rsas.common.xmlparser.Taskers taskers)
    {
        this._taskers = taskers;
    } //-- void setTaskers(com.regaltec.rsas.common.xmlparser.Taskers) 

    /**
     * Sets the value of field 'template'. The field 'template' has
     * the following description: ʹ�õı�����ʽ
     * 
     * @param template the value of field 'template'.
     */
    public void setTemplate(com.ccssoft.rsas.common.xmlparser.Template template)
    {
        this._template = template;
    } //-- void setTemplate(com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Sets the value of field 'templates'.
     * 
     * @param templates the value of field 'templates'.
     */
    public void setTemplates(com.ccssoft.rsas.common.xmlparser.Templates templates)
    {
        this._templates = templates;
    } //-- void setTemplates(com.regaltec.rsas.common.xmlparser.Templates) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Attachment) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Attachment.class, reader);
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
