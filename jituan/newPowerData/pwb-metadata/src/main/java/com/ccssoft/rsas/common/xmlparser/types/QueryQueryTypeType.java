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
 * Class QueryQueryTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class QueryQueryTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The qrySQL type
     */
    public static final int QRYSQL_TYPE = 0;

    /**
     * The instance of the qrySQL type
     */
    public static final QueryQueryTypeType QRYSQL = new QueryQueryTypeType(QRYSQL_TYPE, "qrySQL");

    /**
     * The qryCross type
     */
    public static final int QRYCROSS_TYPE = 1;

    /**
     * The instance of the qryCross type
     */
    public static final QueryQueryTypeType QRYCROSS = new QueryQueryTypeType(QRYCROSS_TYPE, "qryCross");

    /**
     * The qryProcedure type
     */
    public static final int QRYPROCEDURE_TYPE = 2;

    /**
     * The instance of the qryProcedure type
     */
    public static final QueryQueryTypeType QRYPROCEDURE = new QueryQueryTypeType(QRYPROCEDURE_TYPE, "qryProcedure");

    /**
     * The qryMajor type
     */
    public static final int QRYMAJOR_TYPE = 3;

    /**
     * The instance of the qryMajor type
     */
    public static final QueryQueryTypeType QRYMAJOR = new QueryQueryTypeType(QRYMAJOR_TYPE, "qryMajor");

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

    private QueryQueryTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryQueryTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of QueryQueryTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this QueryQueryTypeType
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
        members.put("qrySQL", QRYSQL);
        members.put("qryCross", QRYCROSS);
        members.put("qryProcedure", QRYPROCEDURE);
        members.put("qryMajor", QRYMAJOR);
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
     * QueryQueryTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new QueryQueryTypeType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.QueryQueryTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid QueryQueryTypeType";
            throw new IllegalArgumentException(err);
        }
        return (QueryQueryTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryQueryTypeType valueOf(java.lang.String) 

}