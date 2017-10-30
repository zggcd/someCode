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
 * Class HalfDimensionQueryStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class HalfDimensionQueryStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The DIMFIRST type
     */
    public static final int DIMFIRST_TYPE = 0;

    /**
     * The instance of the DIMFIRST type
     */
    public static final HalfDimensionQueryStyleType DIMFIRST = new HalfDimensionQueryStyleType(DIMFIRST_TYPE, "DIMFIRST");

    /**
     * The DIMLAST type
     */
    public static final int DIMLAST_TYPE = 1;

    /**
     * The instance of the DIMLAST type
     */
    public static final HalfDimensionQueryStyleType DIMLAST = new HalfDimensionQueryStyleType(DIMLAST_TYPE, "DIMLAST");

    /**
     * The FACTFIRST type
     */
    public static final int FACTFIRST_TYPE = 2;

    /**
     * The instance of the FACTFIRST type
     */
    public static final HalfDimensionQueryStyleType FACTFIRST = new HalfDimensionQueryStyleType(FACTFIRST_TYPE, "FACTFIRST");

    /**
     * The FACTLAST type
     */
    public static final int FACTLAST_TYPE = 3;

    /**
     * The instance of the FACTLAST type
     */
    public static final HalfDimensionQueryStyleType FACTLAST = new HalfDimensionQueryStyleType(FACTLAST_TYPE, "FACTLAST");

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

    private HalfDimensionQueryStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.HalfDimensionQueryStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of HalfDimensionQueryStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * HalfDimensionQueryStyleType
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
        members.put("DIMFIRST", DIMFIRST);
        members.put("DIMLAST", DIMLAST);
        members.put("FACTFIRST", FACTFIRST);
        members.put("FACTLAST", FACTLAST);
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
     * HalfDimensionQueryStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new HalfDimensionQueryStyleType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.HalfDimensionQueryStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid HalfDimensionQueryStyleType";
            throw new IllegalArgumentException(err);
        }
        return (HalfDimensionQueryStyleType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.HalfDimensionQueryStyleType valueOf(java.lang.String) 

}
