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
 * Class ConditionDetailDateValueType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionDetailDateValueType implements java.io.Serializable {


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
    public static final ConditionDetailDateValueType DTCURRDATE = new ConditionDetailDateValueType(DTCURRDATE_TYPE, "dtCurrDate");

    /**
     * The dtCurrMonStart type
     */
    public static final int DTCURRMONSTART_TYPE = 1;

    /**
     * The instance of the dtCurrMonStart type
     */
    public static final ConditionDetailDateValueType DTCURRMONSTART = new ConditionDetailDateValueType(DTCURRMONSTART_TYPE, "dtCurrMonStart");

    /**
     * The dtCurrMonEnd type
     */
    public static final int DTCURRMONEND_TYPE = 2;

    /**
     * The instance of the dtCurrMonEnd type
     */
    public static final ConditionDetailDateValueType DTCURRMONEND = new ConditionDetailDateValueType(DTCURRMONEND_TYPE, "dtCurrMonEnd");

    /**
     * The dtLastMonStart type
     */
    public static final int DTLASTMONSTART_TYPE = 3;

    /**
     * The instance of the dtLastMonStart type
     */
    public static final ConditionDetailDateValueType DTLASTMONSTART = new ConditionDetailDateValueType(DTLASTMONSTART_TYPE, "dtLastMonStart");

    /**
     * The dtLastMonEnd type
     */
    public static final int DTLASTMONEND_TYPE = 4;

    /**
     * The instance of the dtLastMonEnd type
     */
    public static final ConditionDetailDateValueType DTLASTMONEND = new ConditionDetailDateValueType(DTLASTMONEND_TYPE, "dtLastMonEnd");

    /**
     * The dtQuarterStart type
     */
    public static final int DTQUARTERSTART_TYPE = 5;

    /**
     * The instance of the dtQuarterStart type
     */
    public static final ConditionDetailDateValueType DTQUARTERSTART = new ConditionDetailDateValueType(DTQUARTERSTART_TYPE, "dtQuarterStart");

    /**
     * The dtQuarterEnd type
     */
    public static final int DTQUARTEREND_TYPE = 6;

    /**
     * The instance of the dtQuarterEnd type
     */
    public static final ConditionDetailDateValueType DTQUARTEREND = new ConditionDetailDateValueType(DTQUARTEREND_TYPE, "dtQuarterEnd");

    /**
     * The dtYearStart type
     */
    public static final int DTYEARSTART_TYPE = 7;

    /**
     * The instance of the dtYearStart type
     */
    public static final ConditionDetailDateValueType DTYEARSTART = new ConditionDetailDateValueType(DTYEARSTART_TYPE, "dtYearStart");

    /**
     * The dtLastYearEnd type
     */
    public static final int DTLASTYEAREND_TYPE = 8;

    /**
     * The instance of the dtLastYearEnd type
     */
    public static final ConditionDetailDateValueType DTLASTYEAREND = new ConditionDetailDateValueType(DTLASTYEAREND_TYPE, "dtLastYearEnd");

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

    private ConditionDetailDateValueType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDetailDateValueType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionDetailDateValueType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionDetailDateValueType
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
        members.put("dtCurrMonStart", DTCURRMONSTART);
        members.put("dtCurrMonEnd", DTCURRMONEND);
        members.put("dtLastMonStart", DTLASTMONSTART);
        members.put("dtLastMonEnd", DTLASTMONEND);
        members.put("dtQuarterStart", DTQUARTERSTART);
        members.put("dtQuarterEnd", DTQUARTEREND);
        members.put("dtYearStart", DTYEARSTART);
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
     * ConditionDetailDateValueType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionDetailDateValueType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionDetailDateValueType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionDetailDateValueType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionDetailDateValueType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDetailDateValueType valueOf(java.lang.String) 

}
