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
 * Class ConstraintItemConstraintTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ConstraintItemConstraintTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ctField type
     */
    public static final int CTFIELD_TYPE = 0;

    /**
     * The instance of the ctField type
     */
    public static final ConstraintItemConstraintTypeType CTFIELD = new ConstraintItemConstraintTypeType(CTFIELD_TYPE, "ctField");

    /**
     * The ctCondition type
     */
    public static final int CTCONDITION_TYPE = 1;

    /**
     * The instance of the ctCondition type
     */
    public static final ConstraintItemConstraintTypeType CTCONDITION = new ConstraintItemConstraintTypeType(CTCONDITION_TYPE, "ctCondition");

    /**
     * The ctConst type
     */
    public static final int CTCONST_TYPE = 2;

    /**
     * The instance of the ctConst type
     */
    public static final ConstraintItemConstraintTypeType CTCONST = new ConstraintItemConstraintTypeType(CTCONST_TYPE, "ctConst");

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

    private ConstraintItemConstraintTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConstraintItemConstraintTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConstraintItemConstraintTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConstraintItemConstraintTypeType
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
        members.put("ctField", CTFIELD);
        members.put("ctCondition", CTCONDITION);
        members.put("ctConst", CTCONST);
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
     * ConstraintItemConstraintTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConstraintItemConstraintTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConstraintItemConstraintTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConstraintItemConstraintTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ConstraintItemConstraintTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConstraintItemConstraintTypeType valueOf(java.lang.String) 

}
