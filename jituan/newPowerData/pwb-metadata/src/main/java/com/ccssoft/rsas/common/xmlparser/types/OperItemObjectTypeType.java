/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OperItemObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class OperItemObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The sasDatabaseType type
     */
    public static final int SASDATABASETYPE_TYPE = 0;

    /**
     * The instance of the sasDatabaseType type
     */
    public static final OperItemObjectTypeType SASDATABASETYPE = new OperItemObjectTypeType(SASDATABASETYPE_TYPE, "sasDatabaseType");

    /**
     * The sasDatabaseTypes type
     */
    public static final int SASDATABASETYPES_TYPE = 1;

    /**
     * The instance of the sasDatabaseTypes type
     */
    public static final OperItemObjectTypeType SASDATABASETYPES = new OperItemObjectTypeType(SASDATABASETYPES_TYPE, "sasDatabaseTypes");

    /**
     * The sasDatabase type
     */
    public static final int SASDATABASE_TYPE = 2;

    /**
     * The instance of the sasDatabase type
     */
    public static final OperItemObjectTypeType SASDATABASE = new OperItemObjectTypeType(SASDATABASE_TYPE, "sasDatabase");

    /**
     * The sasDatabases type
     */
    public static final int SASDATABASES_TYPE = 3;

    /**
     * The instance of the sasDatabases type
     */
    public static final OperItemObjectTypeType SASDATABASES = new OperItemObjectTypeType(SASDATABASES_TYPE, "sasDatabases");

    /**
     * The sasProcedures type
     */
    public static final int SASPROCEDURES_TYPE = 4;

    /**
     * The instance of the sasProcedures type
     */
    public static final OperItemObjectTypeType SASPROCEDURES = new OperItemObjectTypeType(SASPROCEDURES_TYPE, "sasProcedures");

    /**
     * The sasProcedure type
     */
    public static final int SASPROCEDURE_TYPE = 5;

    /**
     * The instance of the sasProcedure type
     */
    public static final OperItemObjectTypeType SASPROCEDURE = new OperItemObjectTypeType(SASPROCEDURE_TYPE, "sasProcedure");

    /**
     * The sasFilter type
     */
    public static final int SASFILTER_TYPE = 6;

    /**
     * The instance of the sasFilter type
     */
    public static final OperItemObjectTypeType SASFILTER = new OperItemObjectTypeType(SASFILTER_TYPE, "sasFilter");

    /**
     * The sasFilters type
     */
    public static final int SASFILTERS_TYPE = 7;

    /**
     * The instance of the sasFilters type
     */
    public static final OperItemObjectTypeType SASFILTERS = new OperItemObjectTypeType(SASFILTERS_TYPE, "sasFilters");

    /**
     * The sasRelation type
     */
    public static final int SASRELATION_TYPE = 8;

    /**
     * The instance of the sasRelation type
     */
    public static final OperItemObjectTypeType SASRELATION = new OperItemObjectTypeType(SASRELATION_TYPE, "sasRelation");

    /**
     * The sasSQLFunction type
     */
    public static final int SASSQLFUNCTION_TYPE = 9;

    /**
     * The instance of the sasSQLFunction type
     */
    public static final OperItemObjectTypeType SASSQLFUNCTION = new OperItemObjectTypeType(SASSQLFUNCTION_TYPE, "sasSQLFunction");

    /**
     * The sasSQLFunctions type
     */
    public static final int SASSQLFUNCTIONS_TYPE = 10;

    /**
     * The instance of the sasSQLFunctions type
     */
    public static final OperItemObjectTypeType SASSQLFUNCTIONS = new OperItemObjectTypeType(SASSQLFUNCTIONS_TYPE, "sasSQLFunctions");

    /**
     * The sasLink type
     */
    public static final int SASLINK_TYPE = 11;

    /**
     * The instance of the sasLink type
     */
    public static final OperItemObjectTypeType SASLINK = new OperItemObjectTypeType(SASLINK_TYPE, "sasLink");

    /**
     * The sasLinks type
     */
    public static final int SASLINKS_TYPE = 12;

    /**
     * The instance of the sasLinks type
     */
    public static final OperItemObjectTypeType SASLINKS = new OperItemObjectTypeType(SASLINKS_TYPE, "sasLinks");

    /**
     * The sasDimension type
     */
    public static final int SASDIMENSION_TYPE = 13;

    /**
     * The instance of the sasDimension type
     */
    public static final OperItemObjectTypeType SASDIMENSION = new OperItemObjectTypeType(SASDIMENSION_TYPE, "sasDimension");

    /**
     * The sasDimensions type
     */
    public static final int SASDIMENSIONS_TYPE = 14;

    /**
     * The instance of the sasDimensions type
     */
    public static final OperItemObjectTypeType SASDIMENSIONS = new OperItemObjectTypeType(SASDIMENSIONS_TYPE, "sasDimensions");

    /**
     * The sasMeasure type
     */
    public static final int SASMEASURE_TYPE = 15;

    /**
     * The instance of the sasMeasure type
     */
    public static final OperItemObjectTypeType SASMEASURE = new OperItemObjectTypeType(SASMEASURE_TYPE, "sasMeasure");

    /**
     * The sasMeasures type
     */
    public static final int SASMEASURES_TYPE = 16;

    /**
     * The instance of the sasMeasures type
     */
    public static final OperItemObjectTypeType SASMEASURES = new OperItemObjectTypeType(SASMEASURES_TYPE, "sasMeasures");

    /**
     * The sasCube type
     */
    public static final int SASCUBE_TYPE = 17;

    /**
     * The instance of the sasCube type
     */
    public static final OperItemObjectTypeType SASCUBE = new OperItemObjectTypeType(SASCUBE_TYPE, "sasCube");

    /**
     * The sasCubes type
     */
    public static final int SASCUBES_TYPE = 18;

    /**
     * The instance of the sasCubes type
     */
    public static final OperItemObjectTypeType SASCUBES = new OperItemObjectTypeType(SASCUBES_TYPE, "sasCubes");

    /**
     * The sasHierarchy type
     */
    public static final int SASHIERARCHY_TYPE = 19;

    /**
     * The instance of the sasHierarchy type
     */
    public static final OperItemObjectTypeType SASHIERARCHY = new OperItemObjectTypeType(SASHIERARCHY_TYPE, "sasHierarchy");

    /**
     * The sasHierarchys type
     */
    public static final int SASHIERARCHYS_TYPE = 20;

    /**
     * The instance of the sasHierarchys type
     */
    public static final OperItemObjectTypeType SASHIERARCHYS = new OperItemObjectTypeType(SASHIERARCHYS_TYPE, "sasHierarchys");

    /**
     * The sasQuery type
     */
    public static final int SASQUERY_TYPE = 21;

    /**
     * The instance of the sasQuery type
     */
    public static final OperItemObjectTypeType SASQUERY = new OperItemObjectTypeType(SASQUERY_TYPE, "sasQuery");

    /**
     * The sasQuerys type
     */
    public static final int SASQUERYS_TYPE = 22;

    /**
     * The instance of the sasQuerys type
     */
    public static final OperItemObjectTypeType SASQUERYS = new OperItemObjectTypeType(SASQUERYS_TYPE, "sasQuerys");

    /**
     * The sasTemplate type
     */
    public static final int SASTEMPLATE_TYPE = 23;

    /**
     * The instance of the sasTemplate type
     */
    public static final OperItemObjectTypeType SASTEMPLATE = new OperItemObjectTypeType(SASTEMPLATE_TYPE, "sasTemplate");

    /**
     * The sasTemplates type
     */
    public static final int SASTEMPLATES_TYPE = 24;

    /**
     * The instance of the sasTemplates type
     */
    public static final OperItemObjectTypeType SASTEMPLATES = new OperItemObjectTypeType(SASTEMPLATES_TYPE, "sasTemplates");

    /**
     * The sasReport type
     */
    public static final int SASREPORT_TYPE = 25;

    /**
     * The instance of the sasReport type
     */
    public static final OperItemObjectTypeType SASREPORT = new OperItemObjectTypeType(SASREPORT_TYPE, "sasReport");

    /**
     * The sasReports type
     */
    public static final int SASREPORTS_TYPE = 26;

    /**
     * The instance of the sasReports type
     */
    public static final OperItemObjectTypeType SASREPORTS = new OperItemObjectTypeType(SASREPORTS_TYPE, "sasReports");

    /**
     * The sasReportResult type
     */
    public static final int SASREPORTRESULT_TYPE = 27;

    /**
     * The instance of the sasReportResult type
     */
    public static final OperItemObjectTypeType SASREPORTRESULT = new OperItemObjectTypeType(SASREPORTRESULT_TYPE, "sasReportResult");

    /**
     * The sasReportResults type
     */
    public static final int SASREPORTRESULTS_TYPE = 28;

    /**
     * The instance of the sasReportResults type
     */
    public static final OperItemObjectTypeType SASREPORTRESULTS = new OperItemObjectTypeType(SASREPORTRESULTS_TYPE, "sasReportResults");

    /**
     * The sasField type
     */
    public static final int SASFIELD_TYPE = 29;

    /**
     * The instance of the sasField type
     */
    public static final OperItemObjectTypeType SASFIELD = new OperItemObjectTypeType(SASFIELD_TYPE, "sasField");

    /**
     * The sasFields type
     */
    public static final int SASFIELDS_TYPE = 30;

    /**
     * The instance of the sasFields type
     */
    public static final OperItemObjectTypeType SASFIELDS = new OperItemObjectTypeType(SASFIELDS_TYPE, "sasFields");

    /**
     * The sasCondition type
     */
    public static final int SASCONDITION_TYPE = 31;

    /**
     * The instance of the sasCondition type
     */
    public static final OperItemObjectTypeType SASCONDITION = new OperItemObjectTypeType(SASCONDITION_TYPE, "sasCondition");

    /**
     * The sasConditions type
     */
    public static final int SASCONDITIONS_TYPE = 32;

    /**
     * The instance of the sasConditions type
     */
    public static final OperItemObjectTypeType SASCONDITIONS = new OperItemObjectTypeType(SASCONDITIONS_TYPE, "sasConditions");

    /**
     * The sasPublish type
     */
    public static final int SASPUBLISH_TYPE = 33;

    /**
     * The instance of the sasPublish type
     */
    public static final OperItemObjectTypeType SASPUBLISH = new OperItemObjectTypeType(SASPUBLISH_TYPE, "sasPublish");

    /**
     * The sasPublishs type
     */
    public static final int SASPUBLISHS_TYPE = 34;

    /**
     * The instance of the sasPublishs type
     */
    public static final OperItemObjectTypeType SASPUBLISHS = new OperItemObjectTypeType(SASPUBLISHS_TYPE, "sasPublishs");

    /**
     * The sasInformation type
     */
    public static final int SASINFORMATION_TYPE = 35;

    /**
     * The instance of the sasInformation type
     */
    public static final OperItemObjectTypeType SASINFORMATION = new OperItemObjectTypeType(SASINFORMATION_TYPE, "sasInformation");

    /**
     * The sasDimensionResult type
     */
    public static final int SASDIMENSIONRESULT_TYPE = 36;

    /**
     * The instance of the sasDimensionResult type
     */
    public static final OperItemObjectTypeType SASDIMENSIONRESULT = new OperItemObjectTypeType(SASDIMENSIONRESULT_TYPE, "sasDimensionResult");

    /**
     * The sasReturnRecords type
     */
    public static final int SASRETURNRECORDS_TYPE = 37;

    /**
     * The instance of the sasReturnRecords type
     */
    public static final OperItemObjectTypeType SASRETURNRECORDS = new OperItemObjectTypeType(SASRETURNRECORDS_TYPE, "sasReturnRecords");

    /**
     * The sasQueryResult type
     */
    public static final int SASQUERYRESULT_TYPE = 38;

    /**
     * The instance of the sasQueryResult type
     */
    public static final OperItemObjectTypeType SASQUERYRESULT = new OperItemObjectTypeType(SASQUERYRESULT_TYPE, "sasQueryResult");

    /**
     * The sasSystemVariant type
     */
    public static final int SASSYSTEMVARIANT_TYPE = 39;

    /**
     * The instance of the sasSystemVariant type
     */
    public static final OperItemObjectTypeType SASSYSTEMVARIANT = new OperItemObjectTypeType(SASSYSTEMVARIANT_TYPE, "sasSystemVariant");

    /**
     * The sasCategory type
     */
    public static final int SASCATEGORY_TYPE = 40;

    /**
     * The instance of the sasCategory type
     */
    public static final OperItemObjectTypeType SASCATEGORY = new OperItemObjectTypeType(SASCATEGORY_TYPE, "sasCategory");

    /**
     * The sasCategorys type
     */
    public static final int SASCATEGORYS_TYPE = 41;

    /**
     * The instance of the sasCategorys type
     */
    public static final OperItemObjectTypeType SASCATEGORYS = new OperItemObjectTypeType(SASCATEGORYS_TYPE, "sasCategorys");

    /**
     * The sasPicture type
     */
    public static final int SASPICTURE_TYPE = 42;

    /**
     * The instance of the sasPicture type
     */
    public static final OperItemObjectTypeType SASPICTURE = new OperItemObjectTypeType(SASPICTURE_TYPE, "sasPicture");

    /**
     * The sasPictures type
     */
    public static final int SASPICTURES_TYPE = 43;

    /**
     * The instance of the sasPictures type
     */
    public static final OperItemObjectTypeType SASPICTURES = new OperItemObjectTypeType(SASPICTURES_TYPE, "sasPictures");

    /**
     * The sasDimensionMember type
     */
    public static final int SASDIMENSIONMEMBER_TYPE = 44;

    /**
     * The instance of the sasDimensionMember type
     */
    public static final OperItemObjectTypeType SASDIMENSIONMEMBER = new OperItemObjectTypeType(SASDIMENSIONMEMBER_TYPE, "sasDimensionMember");

    /**
     * The sasMeasureMember type
     */
    public static final int SASMEASUREMEMBER_TYPE = 45;

    /**
     * The instance of the sasMeasureMember type
     */
    public static final OperItemObjectTypeType SASMEASUREMEMBER = new OperItemObjectTypeType(SASMEASUREMEMBER_TYPE, "sasMeasureMember");

    /**
     * The sasDBTable type
     */
    public static final int SASDBTABLE_TYPE = 46;

    /**
     * The instance of the sasDBTable type
     */
    public static final OperItemObjectTypeType SASDBTABLE = new OperItemObjectTypeType(SASDBTABLE_TYPE, "sasDBTable");

    /**
     * The sasDisplayList type
     */
    public static final int SASDISPLAYLIST_TYPE = 47;

    /**
     * The instance of the sasDisplayList type
     */
    public static final OperItemObjectTypeType SASDISPLAYLIST = new OperItemObjectTypeType(SASDISPLAYLIST_TYPE, "sasDisplayList");

    /**
     * The sasReportDefine type
     */
    public static final int SASREPORTDEFINE_TYPE = 48;

    /**
     * The instance of the sasReportDefine type
     */
    public static final OperItemObjectTypeType SASREPORTDEFINE = new OperItemObjectTypeType(SASREPORTDEFINE_TYPE, "sasReportDefine");

    /**
     * The sasApplication type
     */
    public static final int SASAPPLICATION_TYPE = 49;

    /**
     * The instance of the sasApplication type
     */
    public static final OperItemObjectTypeType SASAPPLICATION = new OperItemObjectTypeType(SASAPPLICATION_TYPE, "sasApplication");

    /**
     * The sasApplications type
     */
    public static final int SASAPPLICATIONS_TYPE = 50;

    /**
     * The instance of the sasApplications type
     */
    public static final OperItemObjectTypeType SASAPPLICATIONS = new OperItemObjectTypeType(SASAPPLICATIONS_TYPE, "sasApplications");

    /**
     * The sasDataAuthorityDiv type
     */
    public static final int SASDATAAUTHORITYDIV_TYPE = 51;

    /**
     * The instance of the sasDataAuthorityDiv type
     */
    public static final OperItemObjectTypeType SASDATAAUTHORITYDIV = new OperItemObjectTypeType(SASDATAAUTHORITYDIV_TYPE, "sasDataAuthorityDiv");

    /**
     * The sasDataAuthorityDivs type
     */
    public static final int SASDATAAUTHORITYDIVS_TYPE = 52;

    /**
     * The instance of the sasDataAuthorityDivs type
     */
    public static final OperItemObjectTypeType SASDATAAUTHORITYDIVS = new OperItemObjectTypeType(SASDATAAUTHORITYDIVS_TYPE, "sasDataAuthorityDivs");

    /**
     * The sasDivDistributer type
     */
    public static final int SASDIVDISTRIBUTER_TYPE = 53;

    /**
     * The instance of the sasDivDistributer type
     */
    public static final OperItemObjectTypeType SASDIVDISTRIBUTER = new OperItemObjectTypeType(SASDIVDISTRIBUTER_TYPE, "sasDivDistributer");

    /**
     * The sasDivDistributers type
     */
    public static final int SASDIVDISTRIBUTERS_TYPE = 54;

    /**
     * The instance of the sasDivDistributers type
     */
    public static final OperItemObjectTypeType SASDIVDISTRIBUTERS = new OperItemObjectTypeType(SASDIVDISTRIBUTERS_TYPE, "sasDivDistributers");

    /**
     * The sasTasker type
     */
    public static final int SASTASKER_TYPE = 55;

    /**
     * The instance of the sasTasker type
     */
    public static final OperItemObjectTypeType SASTASKER = new OperItemObjectTypeType(SASTASKER_TYPE, "sasTasker");

    /**
     * The sasTaskers type
     */
    public static final int SASTASKERS_TYPE = 56;

    /**
     * The instance of the sasTaskers type
     */
    public static final OperItemObjectTypeType SASTASKERS = new OperItemObjectTypeType(SASTASKERS_TYPE, "sasTaskers");

    /**
     * The sasTaskerGroup type
     */
    public static final int SASTASKERGROUP_TYPE = 57;

    /**
     * The instance of the sasTaskerGroup type
     */
    public static final OperItemObjectTypeType SASTASKERGROUP = new OperItemObjectTypeType(SASTASKERGROUP_TYPE, "sasTaskerGroup");

    /**
     * The sasTaskerGroups type
     */
    public static final int SASTASKERGROUPS_TYPE = 58;

    /**
     * The instance of the sasTaskerGroups type
     */
    public static final OperItemObjectTypeType SASTASKERGROUPS = new OperItemObjectTypeType(SASTASKERGROUPS_TYPE, "sasTaskerGroups");

    /**
     * The sasReportDocList type
     */
    public static final int SASREPORTDOCLIST_TYPE = 59;

    /**
     * The instance of the sasReportDocList type
     */
    public static final OperItemObjectTypeType SASREPORTDOCLIST = new OperItemObjectTypeType(SASREPORTDOCLIST_TYPE, "sasReportDocList");

    /**
     * The sasReportDoc type
     */
    public static final int SASREPORTDOC_TYPE = 60;

    /**
     * The instance of the sasReportDoc type
     */
    public static final OperItemObjectTypeType SASREPORTDOC = new OperItemObjectTypeType(SASREPORTDOC_TYPE, "sasReportDoc");

    /**
     * The sasRTFTemplateField type
     */
    public static final int SASRTFTEMPLATEFIELD_TYPE = 61;

    /**
     * The instance of the sasRTFTemplateField type
     */
    public static final OperItemObjectTypeType SASRTFTEMPLATEFIELD = new OperItemObjectTypeType(SASRTFTEMPLATEFIELD_TYPE, "sasRTFTemplateField");

    /**
     * The sasConclusion type
     */
    public static final int SASCONCLUSION_TYPE = 62;

    /**
     * The instance of the sasConclusion type
     */
    public static final OperItemObjectTypeType SASCONCLUSION = new OperItemObjectTypeType(SASCONCLUSION_TYPE, "sasConclusion");

    /**
     * The sasConclusions type
     */
    public static final int SASCONCLUSIONS_TYPE = 63;

    /**
     * The instance of the sasConclusions type
     */
    public static final OperItemObjectTypeType SASCONCLUSIONS = new OperItemObjectTypeType(SASCONCLUSIONS_TYPE, "sasConclusions");

    /**
     * The sasIndicator type
     */
    public static final int SASINDICATOR_TYPE = 64;

    /**
     * The instance of the sasIndicator type
     */
    public static final OperItemObjectTypeType SASINDICATOR = new OperItemObjectTypeType(SASINDICATOR_TYPE, "sasIndicator");

    /**
     * The sasIndicators type
     */
    public static final int SASINDICATORS_TYPE = 65;

    /**
     * The instance of the sasIndicators type
     */
    public static final OperItemObjectTypeType SASINDICATORS = new OperItemObjectTypeType(SASINDICATORS_TYPE, "sasIndicators");

    /**
     * The sasIndicatorCategory type
     */
    public static final int SASINDICATORCATEGORY_TYPE = 66;

    /**
     * The instance of the sasIndicatorCategory type
     */
    public static final OperItemObjectTypeType SASINDICATORCATEGORY = new OperItemObjectTypeType(SASINDICATORCATEGORY_TYPE, "sasIndicatorCategory");

    /**
     * The sasIndicatorCategorys type
     */
    public static final int SASINDICATORCATEGORYS_TYPE = 67;

    /**
     * The instance of the sasIndicatorCategorys type
     */
    public static final OperItemObjectTypeType SASINDICATORCATEGORYS = new OperItemObjectTypeType(SASINDICATORCATEGORYS_TYPE, "sasIndicatorCategorys");

    /**
     * The sasSubscription type
     */
    public static final int SASSUBSCRIPTION_TYPE = 68;

    /**
     * The instance of the sasSubscription type
     */
    public static final OperItemObjectTypeType SASSUBSCRIPTION = new OperItemObjectTypeType(SASSUBSCRIPTION_TYPE, "sasSubscription");

    /**
     * The sasSubscriptions type
     */
    public static final int SASSUBSCRIPTIONS_TYPE = 69;

    /**
     * The instance of the sasSubscriptions type
     */
    public static final OperItemObjectTypeType SASSUBSCRIPTIONS = new OperItemObjectTypeType(SASSUBSCRIPTIONS_TYPE, "sasSubscriptions");

    /**
     * The sasCheckTables type
     */
    public static final int SASCHECKTABLES_TYPE = 70;

    /**
     * The instance of the sasCheckTables type
     */
    public static final OperItemObjectTypeType SASCHECKTABLES = new OperItemObjectTypeType(SASCHECKTABLES_TYPE, "sasCheckTables");

    /**
     * The sasReportPublish type
     */
    public static final int SASREPORTPUBLISH_TYPE = 71;

    /**
     * The instance of the sasReportPublish type
     */
    public static final OperItemObjectTypeType SASREPORTPUBLISH = new OperItemObjectTypeType(SASREPORTPUBLISH_TYPE, "sasReportPublish");

    /**
     * The sasMIDCategory type
     */
    public static final int SASMIDCATEGORY_TYPE = 72;

    /**
     * The instance of the sasMIDCategory type
     */
    public static final OperItemObjectTypeType SASMIDCATEGORY = new OperItemObjectTypeType(SASMIDCATEGORY_TYPE, "sasMIDCategory");

    /**
     * The sasMIDCategorys type
     */
    public static final int SASMIDCATEGORYS_TYPE = 73;

    /**
     * The instance of the sasMIDCategorys type
     */
    public static final OperItemObjectTypeType SASMIDCATEGORYS = new OperItemObjectTypeType(SASMIDCATEGORYS_TYPE, "sasMIDCategorys");

    /**
     * The sasMIDReport type
     */
    public static final int SASMIDREPORT_TYPE = 74;

    /**
     * The instance of the sasMIDReport type
     */
    public static final OperItemObjectTypeType SASMIDREPORT = new OperItemObjectTypeType(SASMIDREPORT_TYPE, "sasMIDReport");

    /**
     * The sasMIDReports type
     */
    public static final int SASMIDREPORTS_TYPE = 75;

    /**
     * The instance of the sasMIDReports type
     */
    public static final OperItemObjectTypeType SASMIDREPORTS = new OperItemObjectTypeType(SASMIDREPORTS_TYPE, "sasMIDReports");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private OperItemObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.OperItemObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of OperItemObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this OperItemObjectTypeType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("sasDatabaseType", SASDATABASETYPE);
        members.put("sasDatabaseTypes", SASDATABASETYPES);
        members.put("sasDatabase", SASDATABASE);
        members.put("sasDatabases", SASDATABASES);
        members.put("sasProcedures", SASPROCEDURES);
        members.put("sasProcedure", SASPROCEDURE);
        members.put("sasFilter", SASFILTER);
        members.put("sasFilters", SASFILTERS);
        members.put("sasRelation", SASRELATION);
        members.put("sasSQLFunction", SASSQLFUNCTION);
        members.put("sasSQLFunctions", SASSQLFUNCTIONS);
        members.put("sasLink", SASLINK);
        members.put("sasLinks", SASLINKS);
        members.put("sasDimension", SASDIMENSION);
        members.put("sasDimensions", SASDIMENSIONS);
        members.put("sasMeasure", SASMEASURE);
        members.put("sasMeasures", SASMEASURES);
        members.put("sasCube", SASCUBE);
        members.put("sasCubes", SASCUBES);
        members.put("sasHierarchy", SASHIERARCHY);
        members.put("sasHierarchys", SASHIERARCHYS);
        members.put("sasQuery", SASQUERY);
        members.put("sasQuerys", SASQUERYS);
        members.put("sasTemplate", SASTEMPLATE);
        members.put("sasTemplates", SASTEMPLATES);
        members.put("sasReport", SASREPORT);
        members.put("sasReports", SASREPORTS);
        members.put("sasReportResult", SASREPORTRESULT);
        members.put("sasReportResults", SASREPORTRESULTS);
        members.put("sasField", SASFIELD);
        members.put("sasFields", SASFIELDS);
        members.put("sasCondition", SASCONDITION);
        members.put("sasConditions", SASCONDITIONS);
        members.put("sasPublish", SASPUBLISH);
        members.put("sasPublishs", SASPUBLISHS);
        members.put("sasInformation", SASINFORMATION);
        members.put("sasDimensionResult", SASDIMENSIONRESULT);
        members.put("sasReturnRecords", SASRETURNRECORDS);
        members.put("sasQueryResult", SASQUERYRESULT);
        members.put("sasSystemVariant", SASSYSTEMVARIANT);
        members.put("sasCategory", SASCATEGORY);
        members.put("sasCategorys", SASCATEGORYS);
        members.put("sasPicture", SASPICTURE);
        members.put("sasPictures", SASPICTURES);
        members.put("sasDimensionMember", SASDIMENSIONMEMBER);
        members.put("sasMeasureMember", SASMEASUREMEMBER);
        members.put("sasDBTable", SASDBTABLE);
        members.put("sasDisplayList", SASDISPLAYLIST);
        members.put("sasReportDefine", SASREPORTDEFINE);
        members.put("sasApplication", SASAPPLICATION);
        members.put("sasApplications", SASAPPLICATIONS);
        members.put("sasDataAuthorityDiv", SASDATAAUTHORITYDIV);
        members.put("sasDataAuthorityDivs", SASDATAAUTHORITYDIVS);
        members.put("sasDivDistributer", SASDIVDISTRIBUTER);
        members.put("sasDivDistributers", SASDIVDISTRIBUTERS);
        members.put("sasTasker", SASTASKER);
        members.put("sasTaskers", SASTASKERS);
        members.put("sasTaskerGroup", SASTASKERGROUP);
        members.put("sasTaskerGroups", SASTASKERGROUPS);
        members.put("sasReportDocList", SASREPORTDOCLIST);
        members.put("sasReportDoc", SASREPORTDOC);
        members.put("sasRTFTemplateField", SASRTFTEMPLATEFIELD);
        members.put("sasConclusion", SASCONCLUSION);
        members.put("sasConclusions", SASCONCLUSIONS);
        members.put("sasIndicator", SASINDICATOR);
        members.put("sasIndicators", SASINDICATORS);
        members.put("sasIndicatorCategory", SASINDICATORCATEGORY);
        members.put("sasIndicatorCategorys", SASINDICATORCATEGORYS);
        members.put("sasSubscription", SASSUBSCRIPTION);
        members.put("sasSubscriptions", SASSUBSCRIPTIONS);
        members.put("sasCheckTables", SASCHECKTABLES);
        members.put("sasReportPublish", SASREPORTPUBLISH);
        members.put("sasMIDCategory", SASMIDCATEGORY);
        members.put("sasMIDCategorys", SASMIDCATEGORYS);
        members.put("sasMIDReport", SASMIDREPORT);
        members.put("sasMIDReports", SASMIDREPORTS);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance. <br/>
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toStringReturns the String representation of this
     * OperItemObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new OperItemObjectTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.OperItemObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid OperItemObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (OperItemObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.OperItemObjectTypeType valueOf(java.lang.String) 

}
