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
 * Class ConditionValueDateValueType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionValueDateValueType implements java.io.Serializable {


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
    public static final ConditionValueDateValueType DTCURRDATE = new ConditionValueDateValueType(DTCURRDATE_TYPE, "dtCurrDate");

    /**
     * The dtCurrWeekStart type
     */
    public static final int DTCURRWEEKSTART_TYPE = 1;

    /**
     * The instance of the dtCurrWeekStart type
     */
    public static final ConditionValueDateValueType DTCURRWEEKSTART = new ConditionValueDateValueType(DTCURRWEEKSTART_TYPE, "dtCurrWeekStart");

    /**
     * The dtCurrWeekEnd type
     */
    public static final int DTCURRWEEKEND_TYPE = 2;

    /**
     * The instance of the dtCurrWeekEnd type
     */
    public static final ConditionValueDateValueType DTCURRWEEKEND = new ConditionValueDateValueType(DTCURRWEEKEND_TYPE, "dtCurrWeekEnd");

    /**
     * The dtLastWeekStart type
     */
    public static final int DTLASTWEEKSTART_TYPE = 3;

    /**
     * The instance of the dtLastWeekStart type
     */
    public static final ConditionValueDateValueType DTLASTWEEKSTART = new ConditionValueDateValueType(DTLASTWEEKSTART_TYPE, "dtLastWeekStart");

    /**
     * The dtLastWeekEnd type
     */
    public static final int DTLASTWEEKEND_TYPE = 4;

    /**
     * The instance of the dtLastWeekEnd type
     */
    public static final ConditionValueDateValueType DTLASTWEEKEND = new ConditionValueDateValueType(DTLASTWEEKEND_TYPE, "dtLastWeekEnd");

    /**
     * The dtCurrMonStart type
     */
    public static final int DTCURRMONSTART_TYPE = 5;

    /**
     * The instance of the dtCurrMonStart type
     */
    public static final ConditionValueDateValueType DTCURRMONSTART = new ConditionValueDateValueType(DTCURRMONSTART_TYPE, "dtCurrMonStart");

    /**
     * The dtCurrMonEnd type
     */
    public static final int DTCURRMONEND_TYPE = 6;

    /**
     * The instance of the dtCurrMonEnd type
     */
    public static final ConditionValueDateValueType DTCURRMONEND = new ConditionValueDateValueType(DTCURRMONEND_TYPE, "dtCurrMonEnd");

    /**
     * The dtLastMonStart type
     */
    public static final int DTLASTMONSTART_TYPE = 7;

    /**
     * The instance of the dtLastMonStart type
     */
    public static final ConditionValueDateValueType DTLASTMONSTART = new ConditionValueDateValueType(DTLASTMONSTART_TYPE, "dtLastMonStart");

    /**
     * The dtLastMonEnd type
     */
    public static final int DTLASTMONEND_TYPE = 8;

    /**
     * The instance of the dtLastMonEnd type
     */
    public static final ConditionValueDateValueType DTLASTMONEND = new ConditionValueDateValueType(DTLASTMONEND_TYPE, "dtLastMonEnd");

    /**
     * The dtQuarterStart type
     */
    public static final int DTQUARTERSTART_TYPE = 9;

    /**
     * The instance of the dtQuarterStart type
     */
    public static final ConditionValueDateValueType DTQUARTERSTART = new ConditionValueDateValueType(DTQUARTERSTART_TYPE, "dtQuarterStart");

    /**
     * The dtQuarterEnd type
     */
    public static final int DTQUARTEREND_TYPE = 10;

    /**
     * The instance of the dtQuarterEnd type
     */
    public static final ConditionValueDateValueType DTQUARTEREND = new ConditionValueDateValueType(DTQUARTEREND_TYPE, "dtQuarterEnd");

    /**
     * The dtYearStart type
     */
    public static final int DTYEARSTART_TYPE = 11;

    /**
     * The instance of the dtYearStart type
     */
    public static final ConditionValueDateValueType DTYEARSTART = new ConditionValueDateValueType(DTYEARSTART_TYPE, "dtYearStart");

    /**
     * The dtYearEnd type
     */
    public static final int DTYEAREND_TYPE = 12;

    /**
     * The instance of the dtYearEnd type
     */
    public static final ConditionValueDateValueType DTYEAREND = new ConditionValueDateValueType(DTYEAREND_TYPE, "dtYearEnd");

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

    private ConditionValueDateValueType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionValueDateValueType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionValueDateValueType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionValueDateValueType
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
        members.put("dtCurrWeekStart", DTCURRWEEKSTART);
        members.put("dtCurrWeekEnd", DTCURRWEEKEND);
        members.put("dtLastWeekStart", DTLASTWEEKSTART);
        members.put("dtLastWeekEnd", DTLASTWEEKEND);
        members.put("dtCurrMonStart", DTCURRMONSTART);
        members.put("dtCurrMonEnd", DTCURRMONEND);
        members.put("dtLastMonStart", DTLASTMONSTART);
        members.put("dtLastMonEnd", DTLASTMONEND);
        members.put("dtQuarterStart", DTQUARTERSTART);
        members.put("dtQuarterEnd", DTQUARTEREND);
        members.put("dtYearStart", DTYEARSTART);
        members.put("dtYearEnd", DTYEAREND);
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
     * ConditionValueDateValueType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionValueDateValueType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionValueDateValueType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionValueDateValueType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionValueDateValueType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionValueDateValueType valueOf(java.lang.String) 

}
