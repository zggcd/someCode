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
 * Class ConditionValueDateValue1Type.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionValueDateValue1Type implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dtCurrDate type
     */
    public static final int DTCURRDATE_TYPE = 0;

    /**
     * The instance of the dtCurrDate type
     */
    public static final ConditionValueDateValue1Type DTCURRDATE = new ConditionValueDateValue1Type(DTCURRDATE_TYPE, "dtCurrDate");

    /**
     * The dtLastDate type
     */
    public static final int DTLASTDATE_TYPE = 1;

    /**
     * The instance of the dtLastDate type
     */
    public static final ConditionValueDateValue1Type DTLASTDATE = new ConditionValueDateValue1Type(DTLASTDATE_TYPE, "dtLastDate");

    /**
     * The dtCurrWeek type
     */
    public static final int DTCURRWEEK_TYPE = 2;

    /**
     * The instance of the dtCurrWeek type
     */
    public static final ConditionValueDateValue1Type DTCURRWEEK = new ConditionValueDateValue1Type(DTCURRWEEK_TYPE, "dtCurrWeek");

    /**
     * The dtCurrWeekStart type
     */
    public static final int DTCURRWEEKSTART_TYPE = 3;

    /**
     * The instance of the dtCurrWeekStart type
     */
    public static final ConditionValueDateValue1Type DTCURRWEEKSTART = new ConditionValueDateValue1Type(DTCURRWEEKSTART_TYPE, "dtCurrWeekStart");

    /**
     * The dtCurrWeekEnd type
     */
    public static final int DTCURRWEEKEND_TYPE = 4;

    /**
     * The instance of the dtCurrWeekEnd type
     */
    public static final ConditionValueDateValue1Type DTCURRWEEKEND = new ConditionValueDateValue1Type(DTCURRWEEKEND_TYPE, "dtCurrWeekEnd");

    /**
     * The dtLastWeek type
     */
    public static final int DTLASTWEEK_TYPE = 5;

    /**
     * The instance of the dtLastWeek type
     */
    public static final ConditionValueDateValue1Type DTLASTWEEK = new ConditionValueDateValue1Type(DTLASTWEEK_TYPE, "dtLastWeek");

    /**
     * The dtLastWeekStart type
     */
    public static final int DTLASTWEEKSTART_TYPE = 6;

    /**
     * The instance of the dtLastWeekStart type
     */
    public static final ConditionValueDateValue1Type DTLASTWEEKSTART = new ConditionValueDateValue1Type(DTLASTWEEKSTART_TYPE, "dtLastWeekStart");

    /**
     * The dtLastWeekEnd type
     */
    public static final int DTLASTWEEKEND_TYPE = 7;

    /**
     * The instance of the dtLastWeekEnd type
     */
    public static final ConditionValueDateValue1Type DTLASTWEEKEND = new ConditionValueDateValue1Type(DTLASTWEEKEND_TYPE, "dtLastWeekEnd");

    /**
     * The dtCurrMon type
     */
    public static final int DTCURRMON_TYPE = 8;

    /**
     * The instance of the dtCurrMon type
     */
    public static final ConditionValueDateValue1Type DTCURRMON = new ConditionValueDateValue1Type(DTCURRMON_TYPE, "dtCurrMon");

    /**
     * The dtCurrMonStart type
     */
    public static final int DTCURRMONSTART_TYPE = 9;

    /**
     * The instance of the dtCurrMonStart type
     */
    public static final ConditionValueDateValue1Type DTCURRMONSTART = new ConditionValueDateValue1Type(DTCURRMONSTART_TYPE, "dtCurrMonStart");

    /**
     * The dtCurrMonEnd type
     */
    public static final int DTCURRMONEND_TYPE = 10;

    /**
     * The instance of the dtCurrMonEnd type
     */
    public static final ConditionValueDateValue1Type DTCURRMONEND = new ConditionValueDateValue1Type(DTCURRMONEND_TYPE, "dtCurrMonEnd");

    /**
     * The dtLastMon type
     */
    public static final int DTLASTMON_TYPE = 11;

    /**
     * The instance of the dtLastMon type
     */
    public static final ConditionValueDateValue1Type DTLASTMON = new ConditionValueDateValue1Type(DTLASTMON_TYPE, "dtLastMon");

    /**
     * The dtLastMonStart type
     */
    public static final int DTLASTMONSTART_TYPE = 12;

    /**
     * The instance of the dtLastMonStart type
     */
    public static final ConditionValueDateValue1Type DTLASTMONSTART = new ConditionValueDateValue1Type(DTLASTMONSTART_TYPE, "dtLastMonStart");

    /**
     * The dtLastMonEnd type
     */
    public static final int DTLASTMONEND_TYPE = 13;

    /**
     * The instance of the dtLastMonEnd type
     */
    public static final ConditionValueDateValue1Type DTLASTMONEND = new ConditionValueDateValue1Type(DTLASTMONEND_TYPE, "dtLastMonEnd");

    /**
     * The dtCurrQuarter type
     */
    public static final int DTCURRQUARTER_TYPE = 14;

    /**
     * The instance of the dtCurrQuarter type
     */
    public static final ConditionValueDateValue1Type DTCURRQUARTER = new ConditionValueDateValue1Type(DTCURRQUARTER_TYPE, "dtCurrQuarter");

    /**
     * The dtCurrQuarterStart type
     */
    public static final int DTCURRQUARTERSTART_TYPE = 15;

    /**
     * The instance of the dtCurrQuarterStart type
     */
    public static final ConditionValueDateValue1Type DTCURRQUARTERSTART = new ConditionValueDateValue1Type(DTCURRQUARTERSTART_TYPE, "dtCurrQuarterStart");

    /**
     * The dtCurrQuarterEnd type
     */
    public static final int DTCURRQUARTEREND_TYPE = 16;

    /**
     * The instance of the dtCurrQuarterEnd type
     */
    public static final ConditionValueDateValue1Type DTCURRQUARTEREND = new ConditionValueDateValue1Type(DTCURRQUARTEREND_TYPE, "dtCurrQuarterEnd");

    /**
     * The dtLastQuarter type
     */
    public static final int DTLASTQUARTER_TYPE = 17;

    /**
     * The instance of the dtLastQuarter type
     */
    public static final ConditionValueDateValue1Type DTLASTQUARTER = new ConditionValueDateValue1Type(DTLASTQUARTER_TYPE, "dtLastQuarter");

    /**
     * The dtLastQuarterStart type
     */
    public static final int DTLASTQUARTERSTART_TYPE = 18;

    /**
     * The instance of the dtLastQuarterStart type
     */
    public static final ConditionValueDateValue1Type DTLASTQUARTERSTART = new ConditionValueDateValue1Type(DTLASTQUARTERSTART_TYPE, "dtLastQuarterStart");

    /**
     * The dtLastQuerterEnd type
     */
    public static final int DTLASTQUERTEREND_TYPE = 19;

    /**
     * The instance of the dtLastQuerterEnd type
     */
    public static final ConditionValueDateValue1Type DTLASTQUERTEREND = new ConditionValueDateValue1Type(DTLASTQUERTEREND_TYPE, "dtLastQuerterEnd");

    /**
     * The dtCurrHalfYear type
     */
    public static final int DTCURRHALFYEAR_TYPE = 20;

    /**
     * The instance of the dtCurrHalfYear type
     */
    public static final ConditionValueDateValue1Type DTCURRHALFYEAR = new ConditionValueDateValue1Type(DTCURRHALFYEAR_TYPE, "dtCurrHalfYear");

    /**
     * The dtCurrHalfYearStart type
     */
    public static final int DTCURRHALFYEARSTART_TYPE = 21;

    /**
     * The instance of the dtCurrHalfYearStart type
     */
    public static final ConditionValueDateValue1Type DTCURRHALFYEARSTART = new ConditionValueDateValue1Type(DTCURRHALFYEARSTART_TYPE, "dtCurrHalfYearStart");

    /**
     * The dtCurrHalfYearEnd type
     */
    public static final int DTCURRHALFYEAREND_TYPE = 22;

    /**
     * The instance of the dtCurrHalfYearEnd type
     */
    public static final ConditionValueDateValue1Type DTCURRHALFYEAREND = new ConditionValueDateValue1Type(DTCURRHALFYEAREND_TYPE, "dtCurrHalfYearEnd");

    /**
     * The dtLastHalfYear type
     */
    public static final int DTLASTHALFYEAR_TYPE = 23;

    /**
     * The instance of the dtLastHalfYear type
     */
    public static final ConditionValueDateValue1Type DTLASTHALFYEAR = new ConditionValueDateValue1Type(DTLASTHALFYEAR_TYPE, "dtLastHalfYear");

    /**
     * The dtLastHalfYearStart type
     */
    public static final int DTLASTHALFYEARSTART_TYPE = 24;

    /**
     * The instance of the dtLastHalfYearStart type
     */
    public static final ConditionValueDateValue1Type DTLASTHALFYEARSTART = new ConditionValueDateValue1Type(DTLASTHALFYEARSTART_TYPE, "dtLastHalfYearStart");

    /**
     * The dtLastHalfYearEnd type
     */
    public static final int DTLASTHALFYEAREND_TYPE = 25;

    /**
     * The instance of the dtLastHalfYearEnd type
     */
    public static final ConditionValueDateValue1Type DTLASTHALFYEAREND = new ConditionValueDateValue1Type(DTLASTHALFYEAREND_TYPE, "dtLastHalfYearEnd");

    /**
     * The dtCurrYear type
     */
    public static final int DTCURRYEAR_TYPE = 26;

    /**
     * The instance of the dtCurrYear type
     */
    public static final ConditionValueDateValue1Type DTCURRYEAR = new ConditionValueDateValue1Type(DTCURRYEAR_TYPE, "dtCurrYear");

    /**
     * The dtCurrYearStart type
     */
    public static final int DTCURRYEARSTART_TYPE = 27;

    /**
     * The instance of the dtCurrYearStart type
     */
    public static final ConditionValueDateValue1Type DTCURRYEARSTART = new ConditionValueDateValue1Type(DTCURRYEARSTART_TYPE, "dtCurrYearStart");

    /**
     * The dtCurrYearEnd type
     */
    public static final int DTCURRYEAREND_TYPE = 28;

    /**
     * The instance of the dtCurrYearEnd type
     */
    public static final ConditionValueDateValue1Type DTCURRYEAREND = new ConditionValueDateValue1Type(DTCURRYEAREND_TYPE, "dtCurrYearEnd");

    /**
     * The dtLastYear type
     */
    public static final int DTLASTYEAR_TYPE = 29;

    /**
     * The instance of the dtLastYear type
     */
    public static final ConditionValueDateValue1Type DTLASTYEAR = new ConditionValueDateValue1Type(DTLASTYEAR_TYPE, "dtLastYear");

    /**
     * The dtLastYearStart type
     */
    public static final int DTLASTYEARSTART_TYPE = 30;

    /**
     * The instance of the dtLastYearStart type
     */
    public static final ConditionValueDateValue1Type DTLASTYEARSTART = new ConditionValueDateValue1Type(DTLASTYEARSTART_TYPE, "dtLastYearStart");

    /**
     * The dtLastYearEnd type
     */
    public static final int DTLASTYEAREND_TYPE = 31;

    /**
     * The instance of the dtLastYearEnd type
     */
    public static final ConditionValueDateValue1Type DTLASTYEAREND = new ConditionValueDateValue1Type(DTLASTYEAREND_TYPE, "dtLastYearEnd");

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

    private ConditionValueDateValue1Type(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionValueDateValue1Type(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionValueDateValue1Type
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionValueDateValue1Type
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
        members.put("dtCurrDate", DTCURRDATE);
        members.put("dtLastDate", DTLASTDATE);
        members.put("dtCurrWeek", DTCURRWEEK);
        members.put("dtCurrWeekStart", DTCURRWEEKSTART);
        members.put("dtCurrWeekEnd", DTCURRWEEKEND);
        members.put("dtLastWeek", DTLASTWEEK);
        members.put("dtLastWeekStart", DTLASTWEEKSTART);
        members.put("dtLastWeekEnd", DTLASTWEEKEND);
        members.put("dtCurrMon", DTCURRMON);
        members.put("dtCurrMonStart", DTCURRMONSTART);
        members.put("dtCurrMonEnd", DTCURRMONEND);
        members.put("dtLastMon", DTLASTMON);
        members.put("dtLastMonStart", DTLASTMONSTART);
        members.put("dtLastMonEnd", DTLASTMONEND);
        members.put("dtCurrQuarter", DTCURRQUARTER);
        members.put("dtCurrQuarterStart", DTCURRQUARTERSTART);
        members.put("dtCurrQuarterEnd", DTCURRQUARTEREND);
        members.put("dtLastQuarter", DTLASTQUARTER);
        members.put("dtLastQuarterStart", DTLASTQUARTERSTART);
        members.put("dtLastQuerterEnd", DTLASTQUERTEREND);
        members.put("dtCurrHalfYear", DTCURRHALFYEAR);
        members.put("dtCurrHalfYearStart", DTCURRHALFYEARSTART);
        members.put("dtCurrHalfYearEnd", DTCURRHALFYEAREND);
        members.put("dtLastHalfYear", DTLASTHALFYEAR);
        members.put("dtLastHalfYearStart", DTLASTHALFYEARSTART);
        members.put("dtLastHalfYearEnd", DTLASTHALFYEAREND);
        members.put("dtCurrYear", DTCURRYEAR);
        members.put("dtCurrYearStart", DTCURRYEARSTART);
        members.put("dtCurrYearEnd", DTCURRYEAREND);
        members.put("dtLastYear", DTLASTYEAR);
        members.put("dtLastYearStart", DTLASTYEARSTART);
        members.put("dtLastYearEnd", DTLASTYEAREND);
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
     * ConditionValueDateValue1Type
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionValueDateValue1Type
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionValueDateValue1Type valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionValueDateValue1Type";
            throw new IllegalArgumentException(err);
        }
        return (ConditionValueDateValue1Type) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionValueDateValue1Type valueOf(java.lang.String) 

}
