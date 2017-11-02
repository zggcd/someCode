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
 * Class ReportConditionDataformatType.
 * 
 * @version $Revision$ $Date$
 */
public class ReportConditionDataformatType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dfYY type
     */
    public static final int DFYY_TYPE = 0;

    /**
     * The instance of the dfYY type
     */
    public static final ReportConditionDataformatType DFYY = new ReportConditionDataformatType(DFYY_TYPE, "dfYY");

    /**
     * The dfYH type
     */
    public static final int DFYH_TYPE = 1;

    /**
     * The instance of the dfYH type
     */
    public static final ReportConditionDataformatType DFYH = new ReportConditionDataformatType(DFYH_TYPE, "dfYH");

    /**
     * The dfYQ type
     */
    public static final int DFYQ_TYPE = 2;

    /**
     * The instance of the dfYQ type
     */
    public static final ReportConditionDataformatType DFYQ = new ReportConditionDataformatType(DFYQ_TYPE, "dfYQ");

    /**
     * The dfYM type
     */
    public static final int DFYM_TYPE = 3;

    /**
     * The instance of the dfYM type
     */
    public static final ReportConditionDataformatType DFYM = new ReportConditionDataformatType(DFYM_TYPE, "dfYM");

    /**
     * The dfYMD type
     */
    public static final int DFYMD_TYPE = 4;

    /**
     * The instance of the dfYMD type
     */
    public static final ReportConditionDataformatType DFYMD = new ReportConditionDataformatType(DFYMD_TYPE, "dfYMD");

    /**
     * The dfYMDH type
     */
    public static final int DFYMDH_TYPE = 5;

    /**
     * The instance of the dfYMDH type
     */
    public static final ReportConditionDataformatType DFYMDH = new ReportConditionDataformatType(DFYMDH_TYPE, "dfYMDH");

    /**
     * The dfYMDHM type
     */
    public static final int DFYMDHM_TYPE = 6;

    /**
     * The instance of the dfYMDHM type
     */
    public static final ReportConditionDataformatType DFYMDHM = new ReportConditionDataformatType(DFYMDHM_TYPE, "dfYMDHM");

    /**
     * The dfYMDHMS type
     */
    public static final int DFYMDHMS_TYPE = 7;

    /**
     * The instance of the dfYMDHMS type
     */
    public static final ReportConditionDataformatType DFYMDHMS = new ReportConditionDataformatType(DFYMDHMS_TYPE, "dfYMDHMS");

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

    private ReportConditionDataformatType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportConditionDataformatType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ReportConditionDataformatType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ReportConditionDataformatType
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
        members.put("dfYY", DFYY);
        members.put("dfYH", DFYH);
        members.put("dfYQ", DFYQ);
        members.put("dfYM", DFYM);
        members.put("dfYMD", DFYMD);
        members.put("dfYMDH", DFYMDH);
        members.put("dfYMDHM", DFYMDHM);
        members.put("dfYMDHMS", DFYMDHMS);
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
     * ReportConditionDataformatType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ReportConditionDataformatType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ReportConditionDataformatType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReportConditionDataformatType";
            throw new IllegalArgumentException(err);
        }
        return (ReportConditionDataformatType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportConditionDataformatType valueOf(java.lang.String) 

}