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
 * Class HierarchyLimitItemOperSymbolType.
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyLimitItemOperSymbolType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The == type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the == type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_0 = new HierarchyLimitItemOperSymbolType(VALUE_0_TYPE, "==");

    /**
     * The } type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the } type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_1 = new HierarchyLimitItemOperSymbolType(VALUE_1_TYPE, "}");

    /**
     * The { type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the { type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_2 = new HierarchyLimitItemOperSymbolType(VALUE_2_TYPE, "{");

    /**
     * The }= type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the }= type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_3 = new HierarchyLimitItemOperSymbolType(VALUE_3_TYPE, "}=");

    /**
     * The {= type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the {= type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_4 = new HierarchyLimitItemOperSymbolType(VALUE_4_TYPE, "{=");

    /**
     * The != type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the != type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_5 = new HierarchyLimitItemOperSymbolType(VALUE_5_TYPE, "!=");

    /**
     * The LIKE type
     */
    public static final int VALUE_6_TYPE = 6;

    /**
     * The instance of the LIKE type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_6 = new HierarchyLimitItemOperSymbolType(VALUE_6_TYPE, "LIKE");

    /**
     * The !LIKE type
     */
    public static final int VALUE_7_TYPE = 7;

    /**
     * The instance of the !LIKE type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_7 = new HierarchyLimitItemOperSymbolType(VALUE_7_TYPE, "!LIKE");

    /**
     * The IS type
     */
    public static final int VALUE_8_TYPE = 8;

    /**
     * The instance of the IS type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_8 = new HierarchyLimitItemOperSymbolType(VALUE_8_TYPE, "IS");

    /**
     * The !IS type
     */
    public static final int VALUE_9_TYPE = 9;

    /**
     * The instance of the !IS type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_9 = new HierarchyLimitItemOperSymbolType(VALUE_9_TYPE, "!IS");

    /**
     * The IN type
     */
    public static final int VALUE_10_TYPE = 10;

    /**
     * The instance of the IN type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_10 = new HierarchyLimitItemOperSymbolType(VALUE_10_TYPE, "IN");

    /**
     * The !IN type
     */
    public static final int VALUE_11_TYPE = 11;

    /**
     * The instance of the !IN type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_11 = new HierarchyLimitItemOperSymbolType(VALUE_11_TYPE, "!IN");

    /**
     * The LEFT type
     */
    public static final int VALUE_12_TYPE = 12;

    /**
     * The instance of the LEFT type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_12 = new HierarchyLimitItemOperSymbolType(VALUE_12_TYPE, "LEFT");

    /**
     * The RIGHT type
     */
    public static final int VALUE_13_TYPE = 13;

    /**
     * The instance of the RIGHT type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_13 = new HierarchyLimitItemOperSymbolType(VALUE_13_TYPE, "RIGHT");

    /**
     * The {} type
     */
    public static final int VALUE_14_TYPE = 14;

    /**
     * The instance of the {} type
     */
    public static final HierarchyLimitItemOperSymbolType VALUE_14 = new HierarchyLimitItemOperSymbolType(VALUE_14_TYPE, "{}");

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

    private HierarchyLimitItemOperSymbolType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyLimitItemOperSymbolType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of HierarchyLimitItemOperSymbolType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * HierarchyLimitItemOperSymbolType
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
        members.put("==", VALUE_0);
        members.put("}", VALUE_1);
        members.put("{", VALUE_2);
        members.put("}=", VALUE_3);
        members.put("{=", VALUE_4);
        members.put("!=", VALUE_5);
        members.put("LIKE", VALUE_6);
        members.put("!LIKE", VALUE_7);
        members.put("IS", VALUE_8);
        members.put("!IS", VALUE_9);
        members.put("IN", VALUE_10);
        members.put("!IN", VALUE_11);
        members.put("LEFT", VALUE_12);
        members.put("RIGHT", VALUE_13);
        members.put("{}", VALUE_14);
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
     * HierarchyLimitItemOperSymbolType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new HierarchyLimitItemOperSymbolType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.HierarchyLimitItemOperSymbolType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid HierarchyLimitItemOperSymbolType";
            throw new IllegalArgumentException(err);
        }
        return (HierarchyLimitItemOperSymbolType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyLimitItemOperSymbolType valueOf(java.lang.String) 

}
