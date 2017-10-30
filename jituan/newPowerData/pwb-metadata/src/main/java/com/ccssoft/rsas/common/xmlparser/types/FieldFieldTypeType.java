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
 * Class FieldFieldTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class FieldFieldTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The fldDim type
     */
    public static final int FLDDIM_TYPE = 0;

    /**
     * The instance of the fldDim type
     */
    public static final FieldFieldTypeType FLDDIM = new FieldFieldTypeType(FLDDIM_TYPE, "fldDim");

    /**
     * The fldDat type
     */
    public static final int FLDDAT_TYPE = 1;

    /**
     * The instance of the fldDat type
     */
    public static final FieldFieldTypeType FLDDAT = new FieldFieldTypeType(FLDDAT_TYPE, "fldDat");

    /**
     * The fldSql type
     */
    public static final int FLDSQL_TYPE = 2;

    /**
     * The instance of the fldSql type
     */
    public static final FieldFieldTypeType FLDSQL = new FieldFieldTypeType(FLDSQL_TYPE, "fldSql");

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

    private FieldFieldTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.FieldFieldTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of FieldFieldTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this FieldFieldTypeType
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
        members.put("fldDim", FLDDIM);
        members.put("fldDat", FLDDAT);
        members.put("fldSql", FLDSQL);
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
     * FieldFieldTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new FieldFieldTypeType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.FieldFieldTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid FieldFieldTypeType";
            throw new IllegalArgumentException(err);
        }
        return (FieldFieldTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.FieldFieldTypeType valueOf(java.lang.String) 

}
