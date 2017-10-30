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
 * Class ConditionDataSourceType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionDataSourceType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dsInput type
     */
    public static final int DSINPUT_TYPE = 0;

    /**
     * The instance of the dsInput type
     */
    public static final ConditionDataSourceType DSINPUT = new ConditionDataSourceType(DSINPUT_TYPE, "dsInput");

    /**
     * The dsDB type
     */
    public static final int DSDB_TYPE = 1;

    /**
     * The instance of the dsDB type
     */
    public static final ConditionDataSourceType DSDB = new ConditionDataSourceType(DSDB_TYPE, "dsDB");

    /**
     * The dsSQL type
     */
    public static final int DSSQL_TYPE = 2;

    /**
     * The instance of the dsSQL type
     */
    public static final ConditionDataSourceType DSSQL = new ConditionDataSourceType(DSSQL_TYPE, "dsSQL");

    /**
     * The dsList type
     */
    public static final int DSLIST_TYPE = 3;

    /**
     * The instance of the dsList type
     */
    public static final ConditionDataSourceType DSLIST = new ConditionDataSourceType(DSLIST_TYPE, "dsList");

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

    private ConditionDataSourceType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDataSourceType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionDataSourceType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this ConditionDataSourceTyp
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
        members.put("dsInput", DSINPUT);
        members.put("dsDB", DSDB);
        members.put("dsSQL", DSSQL);
        members.put("dsList", DSLIST);
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
     * ConditionDataSourceType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionDataSourceType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionDataSourceType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionDataSourceType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionDataSourceType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDataSourceType valueOf(java.lang.String) 

}
