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
 * Class TaskerGroupExecuteTimeModeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerGroupExecuteTimeModeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The etmNone type
     */
    public static final int ETMNONE_TYPE = 0;

    /**
     * The instance of the etmNone type
     */
    public static final TaskerGroupExecuteTimeModeType ETMNONE = new TaskerGroupExecuteTimeModeType(ETMNONE_TYPE, "etmNone");

    /**
     * The etmOnce type
     */
    public static final int ETMONCE_TYPE = 1;

    /**
     * The instance of the etmOnce type
     */
    public static final TaskerGroupExecuteTimeModeType ETMONCE = new TaskerGroupExecuteTimeModeType(ETMONCE_TYPE, "etmOnce");

    /**
     * The etmMinute type
     */
    public static final int ETMMINUTE_TYPE = 2;

    /**
     * The instance of the etmMinute type
     */
    public static final TaskerGroupExecuteTimeModeType ETMMINUTE = new TaskerGroupExecuteTimeModeType(ETMMINUTE_TYPE, "etmMinute");

    /**
     * The etmHour type
     */
    public static final int ETMHOUR_TYPE = 3;

    /**
     * The instance of the etmHour type
     */
    public static final TaskerGroupExecuteTimeModeType ETMHOUR = new TaskerGroupExecuteTimeModeType(ETMHOUR_TYPE, "etmHour");

    /**
     * The etmDay type
     */
    public static final int ETMDAY_TYPE = 4;

    /**
     * The instance of the etmDay type
     */
    public static final TaskerGroupExecuteTimeModeType ETMDAY = new TaskerGroupExecuteTimeModeType(ETMDAY_TYPE, "etmDay");

    /**
     * The etmWeek type
     */
    public static final int ETMWEEK_TYPE = 5;

    /**
     * The instance of the etmWeek type
     */
    public static final TaskerGroupExecuteTimeModeType ETMWEEK = new TaskerGroupExecuteTimeModeType(ETMWEEK_TYPE, "etmWeek");

    /**
     * The etmMonth type
     */
    public static final int ETMMONTH_TYPE = 6;

    /**
     * The instance of the etmMonth type
     */
    public static final TaskerGroupExecuteTimeModeType ETMMONTH = new TaskerGroupExecuteTimeModeType(ETMMONTH_TYPE, "etmMonth");

    /**
     * The etmQuarter type
     */
    public static final int ETMQUARTER_TYPE = 7;

    /**
     * The instance of the etmQuarter type
     */
    public static final TaskerGroupExecuteTimeModeType ETMQUARTER = new TaskerGroupExecuteTimeModeType(ETMQUARTER_TYPE, "etmQuarter");

    /**
     * The etmYear type
     */
    public static final int ETMYEAR_TYPE = 8;

    /**
     * The instance of the etmYear type
     */
    public static final TaskerGroupExecuteTimeModeType ETMYEAR = new TaskerGroupExecuteTimeModeType(ETMYEAR_TYPE, "etmYear");

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

    private TaskerGroupExecuteTimeModeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupExecuteTimeModeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerGroupExecuteTimeModeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * TaskerGroupExecuteTimeModeType
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
        members.put("etmNone", ETMNONE);
        members.put("etmOnce", ETMONCE);
        members.put("etmMinute", ETMMINUTE);
        members.put("etmHour", ETMHOUR);
        members.put("etmDay", ETMDAY);
        members.put("etmWeek", ETMWEEK);
        members.put("etmMonth", ETMMONTH);
        members.put("etmQuarter", ETMQUARTER);
        members.put("etmYear", ETMYEAR);
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
     * TaskerGroupExecuteTimeModeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerGroupExecuteTimeModeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerGroupExecuteTimeModeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerGroupExecuteTimeModeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerGroupExecuteTimeModeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupExecuteTimeModeType valueOf(java.lang.String) 

}
