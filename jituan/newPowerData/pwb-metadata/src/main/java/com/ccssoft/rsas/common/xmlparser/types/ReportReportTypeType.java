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
 * Class ReportReportTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ReportReportTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rptSimple type
     */
    public static final int RPTSIMPLE_TYPE = 0;

    /**
     * The instance of the rptSimple type
     */
    public static final ReportReportTypeType RPTSIMPLE = new ReportReportTypeType(RPTSIMPLE_TYPE, "rptSimple");

    /**
     * The rptComplex type
     */
    public static final int RPTCOMPLEX_TYPE = 1;

    /**
     * The instance of the rptComplex type
     */
    public static final ReportReportTypeType RPTCOMPLEX = new ReportReportTypeType(RPTCOMPLEX_TYPE, "rptComplex");

    /**
     * The rptCross type
     */
    public static final int RPTCROSS_TYPE = 2;

    /**
     * The instance of the rptCross type
     */
    public static final ReportReportTypeType RPTCROSS = new ReportReportTypeType(RPTCROSS_TYPE, "rptCross");

    /**
     * The rptSQL type
     */
    public static final int RPTSQL_TYPE = 3;

    /**
     * The instance of the rptSQL type
     */
    public static final ReportReportTypeType RPTSQL = new ReportReportTypeType(RPTSQL_TYPE, "rptSQL");

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

    private ReportReportTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportReportTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ReportReportTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this ReportReportTypeType
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
        members.put("rptSimple", RPTSIMPLE);
        members.put("rptComplex", RPTCOMPLEX);
        members.put("rptCross", RPTCROSS);
        members.put("rptSQL", RPTSQL);
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
     * ReportReportTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ReportReportTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ReportReportTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReportReportTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ReportReportTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportReportTypeType valueOf(java.lang.String) 

}
