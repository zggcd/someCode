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
 * Class ConditionLoadTreeTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionLoadTreeTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The trvParentAll type
     */
    public static final int TRVPARENTALL_TYPE = 0;

    /**
     * The instance of the trvParentAll type
     */
    public static final ConditionLoadTreeTypeType TRVPARENTALL = new ConditionLoadTreeTypeType(TRVPARENTALL_TYPE, "trvParentAll");

    /**
     * The trvParentNull type
     */
    public static final int TRVPARENTNULL_TYPE = 1;

    /**
     * The instance of the trvParentNull type
     */
    public static final ConditionLoadTreeTypeType TRVPARENTNULL = new ConditionLoadTreeTypeType(TRVPARENTNULL_TYPE, "trvParentNull");

    /**
     * The trvParentSelf type
     */
    public static final int TRVPARENTSELF_TYPE = 2;

    /**
     * The instance of the trvParentSelf type
     */
    public static final ConditionLoadTreeTypeType TRVPARENTSELF = new ConditionLoadTreeTypeType(TRVPARENTSELF_TYPE, "trvParentSelf");

    /**
     * The trvParentMiss type
     */
    public static final int TRVPARENTMISS_TYPE = 3;

    /**
     * The instance of the trvParentMiss type
     */
    public static final ConditionLoadTreeTypeType TRVPARENTMISS = new ConditionLoadTreeTypeType(TRVPARENTMISS_TYPE, "trvParentMiss");

    /**
     * The trvParentZero type
     */
    public static final int TRVPARENTZERO_TYPE = 4;

    /**
     * The instance of the trvParentZero type
     */
    public static final ConditionLoadTreeTypeType TRVPARENTZERO = new ConditionLoadTreeTypeType(TRVPARENTZERO_TYPE, "trvParentZero");

    /**
     * The trvTreeCode type
     */
    public static final int TRVTREECODE_TYPE = 5;

    /**
     * The instance of the trvTreeCode type
     */
    public static final ConditionLoadTreeTypeType TRVTREECODE = new ConditionLoadTreeTypeType(TRVTREECODE_TYPE, "trvTreeCode");

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

    private ConditionLoadTreeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionLoadTreeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionLoadTreeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionLoadTreeTypeType
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
        members.put("trvParentAll", TRVPARENTALL);
        members.put("trvParentNull", TRVPARENTNULL);
        members.put("trvParentSelf", TRVPARENTSELF);
        members.put("trvParentMiss", TRVPARENTMISS);
        members.put("trvParentZero", TRVPARENTZERO);
        members.put("trvTreeCode", TRVTREECODE);
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
     * ConditionLoadTreeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionLoadTreeTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionLoadTreeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionLoadTreeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionLoadTreeTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionLoadTreeTypeType valueOf(java.lang.String) 

}
