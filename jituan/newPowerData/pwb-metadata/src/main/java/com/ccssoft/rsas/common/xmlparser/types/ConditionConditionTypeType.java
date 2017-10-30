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
 * Class ConditionConditionTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionConditionTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The conNormal type
     */
    public static final int CONNORMAL_TYPE = 0;

    /**
     * The instance of the conNormal type
     */
    public static final ConditionConditionTypeType CONNORMAL = new ConditionConditionTypeType(CONNORMAL_TYPE, "conNormal");

    /**
     * The conDyna type
     */
    public static final int CONDYNA_TYPE = 1;

    /**
     * The instance of the conDyna type
     */
    public static final ConditionConditionTypeType CONDYNA = new ConditionConditionTypeType(CONDYNA_TYPE, "conDyna");

    /**
     * The conDim type
     */
    public static final int CONDIM_TYPE = 2;

    /**
     * The instance of the conDim type
     */
    public static final ConditionConditionTypeType CONDIM = new ConditionConditionTypeType(CONDIM_TYPE, "conDim");

    /**
     * The conDynaNormal type
     */
    public static final int CONDYNANORMAL_TYPE = 3;

    /**
     * The instance of the conDynaNormal type
     */
    public static final ConditionConditionTypeType CONDYNANORMAL = new ConditionConditionTypeType(CONDYNANORMAL_TYPE, "conDynaNormal");

    /**
     * The conDynaDim type
     */
    public static final int CONDYNADIM_TYPE = 4;

    /**
     * The instance of the conDynaDim type
     */
    public static final ConditionConditionTypeType CONDYNADIM = new ConditionConditionTypeType(CONDYNADIM_TYPE, "conDynaDim");

    /**
     * The conDepend type
     */
    public static final int CONDEPEND_TYPE = 5;

    /**
     * The instance of the conDepend type
     */
    public static final ConditionConditionTypeType CONDEPEND = new ConditionConditionTypeType(CONDEPEND_TYPE, "conDepend");

    /**
     * The conGroup type
     */
    public static final int CONGROUP_TYPE = 6;

    /**
     * The instance of the conGroup type
     */
    public static final ConditionConditionTypeType CONGROUP = new ConditionConditionTypeType(CONGROUP_TYPE, "conGroup");

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

    private ConditionConditionTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionConditionTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionConditionTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionConditionTypeType
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
        members.put("conNormal", CONNORMAL);
        members.put("conDyna", CONDYNA);
        members.put("conDim", CONDIM);
        members.put("conDynaNormal", CONDYNANORMAL);
        members.put("conDynaDim", CONDYNADIM);
        members.put("conDepend", CONDEPEND);
        members.put("conGroup", CONGROUP);
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
     * ConditionConditionTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionConditionTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionConditionTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionConditionTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionConditionTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionConditionTypeType valueOf(java.lang.String) 

}
