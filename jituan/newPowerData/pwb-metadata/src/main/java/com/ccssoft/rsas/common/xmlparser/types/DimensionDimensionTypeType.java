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
 * Class DimensionDimensionTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionDimensionTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dimStar type
     */
    public static final int DIMSTAR_TYPE = 0;

    /**
     * The instance of the dimStar type
     */
    public static final DimensionDimensionTypeType DIMSTAR = new DimensionDimensionTypeType(DIMSTAR_TYPE, "dimStar");

    /**
     * The dimSnow type
     */
    public static final int DIMSNOW_TYPE = 1;

    /**
     * The instance of the dimSnow type
     */
    public static final DimensionDimensionTypeType DIMSNOW = new DimensionDimensionTypeType(DIMSNOW_TYPE, "dimSnow");

    /**
     * The dimBbk type
     */
    public static final int DIMBBK_TYPE = 2;

    /**
     * The instance of the dimBbk type
     */
    public static final DimensionDimensionTypeType DIMBBK = new DimensionDimensionTypeType(DIMBBK_TYPE, "dimBbk");

    /**
     * The dimHash type
     */
    public static final int DIMHASH_TYPE = 3;

    /**
     * The instance of the dimHash type
     */
    public static final DimensionDimensionTypeType DIMHASH = new DimensionDimensionTypeType(DIMHASH_TYPE, "dimHash");

    /**
     * The dimDate type
     */
    public static final int DIMDATE_TYPE = 4;

    /**
     * The instance of the dimDate type
     */
    public static final DimensionDimensionTypeType DIMDATE = new DimensionDimensionTypeType(DIMDATE_TYPE, "dimDate");

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

    private DimensionDimensionTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionDimensionTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimensionDimensionTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DimensionDimensionTypeType
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
        members.put("dimStar", DIMSTAR);
        members.put("dimSnow", DIMSNOW);
        members.put("dimBbk", DIMBBK);
        members.put("dimHash", DIMHASH);
        members.put("dimDate", DIMDATE);
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
     * DimensionDimensionTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DimensionDimensionTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimensionDimensionTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimensionDimensionTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DimensionDimensionTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionDimensionTypeType valueOf(java.lang.String) 

}
