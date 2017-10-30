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
 * Class FactNamedRuleComposeStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class FactNamedRuleComposeStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rulPrefix type
     */
    public static final int RULPREFIX_TYPE = 0;

    /**
     * The instance of the rulPrefix type
     */
    public static final FactNamedRuleComposeStyleType RULPREFIX = new FactNamedRuleComposeStyleType(RULPREFIX_TYPE, "rulPrefix");

    /**
     * The rulPostfix type
     */
    public static final int RULPOSTFIX_TYPE = 1;

    /**
     * The instance of the rulPostfix type
     */
    public static final FactNamedRuleComposeStyleType RULPOSTFIX = new FactNamedRuleComposeStyleType(RULPOSTFIX_TYPE, "rulPostfix");

    /**
     * The rulReplace type
     */
    public static final int RULREPLACE_TYPE = 2;

    /**
     * The instance of the rulReplace type
     */
    public static final FactNamedRuleComposeStyleType RULREPLACE = new FactNamedRuleComposeStyleType(RULREPLACE_TYPE, "rulReplace");

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

    private FactNamedRuleComposeStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.FactNamedRuleComposeStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of FactNamedRuleComposeStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * FactNamedRuleComposeStyleType
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
        members.put("rulPrefix", RULPREFIX);
        members.put("rulPostfix", RULPOSTFIX);
        members.put("rulReplace", RULREPLACE);
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
     * FactNamedRuleComposeStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new FactNamedRuleComposeStyleType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.FactNamedRuleComposeStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid FactNamedRuleComposeStyleType";
            throw new IllegalArgumentException(err);
        }
        return (FactNamedRuleComposeStyleType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.FactNamedRuleComposeStyleType valueOf(java.lang.String) 

}
