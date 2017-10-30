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
 * Class FunParamValueParamObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class FunParamValueParamObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ptCondition type
     */
    public static final int PTCONDITION_TYPE = 0;

    /**
     * The instance of the ptCondition type
     */
    public static final FunParamValueParamObjectTypeType PTCONDITION = new FunParamValueParamObjectTypeType(PTCONDITION_TYPE, "ptCondition");

    /**
     * The ptDimsion type
     */
    public static final int PTDIMSION_TYPE = 1;

    /**
     * The instance of the ptDimsion type
     */
    public static final FunParamValueParamObjectTypeType PTDIMSION = new FunParamValueParamObjectTypeType(PTDIMSION_TYPE, "ptDimsion");

    /**
     * The ptField type
     */
    public static final int PTFIELD_TYPE = 2;

    /**
     * The instance of the ptField type
     */
    public static final FunParamValueParamObjectTypeType PTFIELD = new FunParamValueParamObjectTypeType(PTFIELD_TYPE, "ptField");

    /**
     * The ptCons type
     */
    public static final int PTCONS_TYPE = 3;

    /**
     * The instance of the ptCons type
     */
    public static final FunParamValueParamObjectTypeType PTCONS = new FunParamValueParamObjectTypeType(PTCONS_TYPE, "ptCons");

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

    private FunParamValueParamObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of FunParamValueParamObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * FunParamValueParamObjectTypeType
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
        members.put("ptCondition", PTCONDITION);
        members.put("ptDimsion", PTDIMSION);
        members.put("ptField", PTFIELD);
        members.put("ptCons", PTCONS);
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
     * FunParamValueParamObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new FunParamValueParamObjectTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid FunParamValueParamObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (FunParamValueParamObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType valueOf(java.lang.String) 

}
