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
 * Class DatabaseTypeDbTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DatabaseTypeDbTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dbInfomix type
     */
    public static final int DBINFOMIX_TYPE = 0;

    /**
     * The instance of the dbInfomix type
     */
    public static final DatabaseTypeDbTypeType DBINFOMIX = new DatabaseTypeDbTypeType(DBINFOMIX_TYPE, "dbInfomix");

    /**
     * The dbOracle type
     */
    public static final int DBORACLE_TYPE = 1;

    /**
     * The instance of the dbOracle type
     */
    public static final DatabaseTypeDbTypeType DBORACLE = new DatabaseTypeDbTypeType(DBORACLE_TYPE, "dbOracle");

    /**
     * The dbSybase type
     */
    public static final int DBSYBASE_TYPE = 2;

    /**
     * The instance of the dbSybase type
     */
    public static final DatabaseTypeDbTypeType DBSYBASE = new DatabaseTypeDbTypeType(DBSYBASE_TYPE, "dbSybase");

    /**
     * The dbDB2 type
     */
    public static final int DBDB2_TYPE = 3;

    /**
     * The instance of the dbDB2 type
     */
    public static final DatabaseTypeDbTypeType DBDB2 = new DatabaseTypeDbTypeType(DBDB2_TYPE, "dbDB2");

    /**
     * The dbSQLServer type
     */
    public static final int DBSQLSERVER_TYPE = 4;

    /**
     * The instance of the dbSQLServer type
     */
    public static final DatabaseTypeDbTypeType DBSQLSERVER = new DatabaseTypeDbTypeType(DBSQLSERVER_TYPE, "dbSQLServer");

    /**
     * The dbMySQL type
     */
    public static final int DBMYSQL_TYPE = 5;

    /**
     * The instance of the dbMySQL type
     */
    public static final DatabaseTypeDbTypeType DBMYSQL = new DatabaseTypeDbTypeType(DBMYSQL_TYPE, "dbMySQL");

    /**
     * The dbSybaseIQ type
     */
    public static final int DBSYBASEIQ_TYPE = 6;

    /**
     * The instance of the dbSybaseIQ type
     */
    public static final DatabaseTypeDbTypeType DBSYBASEIQ = new DatabaseTypeDbTypeType(DBSYBASEIQ_TYPE, "dbSybaseIQ");

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

    private DatabaseTypeDbTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDbTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DatabaseTypeDbTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DatabaseTypeDbTypeType
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
        members.put("dbInfomix", DBINFOMIX);
        members.put("dbOracle", DBORACLE);
        members.put("dbSybase", DBSYBASE);
        members.put("dbDB2", DBDB2);
        members.put("dbSQLServer", DBSQLSERVER);
        members.put("dbMySQL", DBMYSQL);
        members.put("dbSybaseIQ", DBSYBASEIQ);
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
     * DatabaseTypeDbTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DatabaseTypeDbTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDbTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DatabaseTypeDbTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DatabaseTypeDbTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDbTypeType valueOf(java.lang.String) 

}
