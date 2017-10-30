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
 * Class DimensionItemGroupByType.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionItemGroupByType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The grpNone type
     */
    public static final int GRPNONE_TYPE = 0;

    /**
     * The instance of the grpNone type
     */
    public static final DimensionItemGroupByType GRPNONE = new DimensionItemGroupByType(GRPNONE_TYPE, "grpNone");

    /**
     * The grpSum type
     */
    public static final int GRPSUM_TYPE = 1;

    /**
     * The instance of the grpSum type
     */
    public static final DimensionItemGroupByType GRPSUM = new DimensionItemGroupByType(GRPSUM_TYPE, "grpSum");

    /**
     * The grpAvg type
     */
    public static final int GRPAVG_TYPE = 2;

    /**
     * The instance of the grpAvg type
     */
    public static final DimensionItemGroupByType GRPAVG = new DimensionItemGroupByType(GRPAVG_TYPE, "grpAvg");

    /**
     * The grpCount type
     */
    public static final int GRPCOUNT_TYPE = 3;

    /**
     * The instance of the grpCount type
     */
    public static final DimensionItemGroupByType GRPCOUNT = new DimensionItemGroupByType(GRPCOUNT_TYPE, "grpCount");

    /**
     * The grpPercent type
     */
    public static final int GRPPERCENT_TYPE = 4;

    /**
     * The instance of the grpPercent type
     */
    public static final DimensionItemGroupByType GRPPERCENT = new DimensionItemGroupByType(GRPPERCENT_TYPE, "grpPercent");

    /**
     * The grpMax type
     */
    public static final int GRPMAX_TYPE = 5;

    /**
     * The instance of the grpMax type
     */
    public static final DimensionItemGroupByType GRPMAX = new DimensionItemGroupByType(GRPMAX_TYPE, "grpMax");

    /**
     * The grpMin type
     */
    public static final int GRPMIN_TYPE = 6;

    /**
     * The instance of the grpMin type
     */
    public static final DimensionItemGroupByType GRPMIN = new DimensionItemGroupByType(GRPMIN_TYPE, "grpMin");

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

    private DimensionItemGroupByType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionItemGroupByType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimensionItemGroupByType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DimensionItemGroupByType
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
        members.put("grpNone", GRPNONE);
        members.put("grpSum", GRPSUM);
        members.put("grpAvg", GRPAVG);
        members.put("grpCount", GRPCOUNT);
        members.put("grpPercent", GRPPERCENT);
        members.put("grpMax", GRPMAX);
        members.put("grpMin", GRPMIN);
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
     * DimensionItemGroupByType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DimensionItemGroupByType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimensionItemGroupByType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimensionItemGroupByType";
            throw new IllegalArgumentException(err);
        }
        return (DimensionItemGroupByType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionItemGroupByType valueOf(java.lang.String) 

}
