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
 * Class RuleOperSymbolType.
 * 
 * @version $Revision$ $Date$
 */
public class RuleOperSymbolType implements java.io.Serializable {


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
    public static final RuleOperSymbolType VALUE_0 = new RuleOperSymbolType(VALUE_0_TYPE, "==");

    /**
     * The } type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the } type
     */
    public static final RuleOperSymbolType VALUE_1 = new RuleOperSymbolType(VALUE_1_TYPE, "}");

    /**
     * The { type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the { type
     */
    public static final RuleOperSymbolType VALUE_2 = new RuleOperSymbolType(VALUE_2_TYPE, "{");

    /**
     * The }= type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the }= type
     */
    public static final RuleOperSymbolType VALUE_3 = new RuleOperSymbolType(VALUE_3_TYPE, "}=");

    /**
     * The {= type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the {= type
     */
    public static final RuleOperSymbolType VALUE_4 = new RuleOperSymbolType(VALUE_4_TYPE, "{=");

    /**
     * The != type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the != type
     */
    public static final RuleOperSymbolType VALUE_5 = new RuleOperSymbolType(VALUE_5_TYPE, "!=");

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

    private RuleOperSymbolType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.RuleOperSymbolType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of RuleOperSymbolType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this RuleOperSymbolType
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
     * RuleOperSymbolType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new RuleOperSymbolType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.RuleOperSymbolType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RuleOperSymbolType";
            throw new IllegalArgumentException(err);
        }
        return (RuleOperSymbolType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.RuleOperSymbolType valueOf(java.lang.String) 

}
