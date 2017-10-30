/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class MarksMarkStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class MarksMarkStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The mrkValue type
     */
    public static final int MRKVALUE_TYPE = 0;

    /**
     * The instance of the mrkValue type
     */
    public static final MarksMarkStyleType MRKVALUE = new MarksMarkStyleType(MRKVALUE_TYPE, "mrkValue");

    /**
     * The mrkPercent type
     */
    public static final int MRKPERCENT_TYPE = 1;

    /**
     * The instance of the mrkPercent type
     */
    public static final MarksMarkStyleType MRKPERCENT = new MarksMarkStyleType(MRKPERCENT_TYPE, "mrkPercent");

    /**
     * The mrkLabel type
     */
    public static final int MRKLABEL_TYPE = 2;

    /**
     * The instance of the mrkLabel type
     */
    public static final MarksMarkStyleType MRKLABEL = new MarksMarkStyleType(MRKLABEL_TYPE, "mrkLabel");

    /**
     * The mrkLabelPercent type
     */
    public static final int MRKLABELPERCENT_TYPE = 3;

    /**
     * The instance of the mrkLabelPercent type
     */
    public static final MarksMarkStyleType MRKLABELPERCENT = new MarksMarkStyleType(MRKLABELPERCENT_TYPE, "mrkLabelPercent");

    /**
     * The mrkLabelValue type
     */
    public static final int MRKLABELVALUE_TYPE = 4;

    /**
     * The instance of the mrkLabelValue type
     */
    public static final MarksMarkStyleType MRKLABELVALUE = new MarksMarkStyleType(MRKLABELVALUE_TYPE, "mrkLabelValue");

    /**
     * The mrkLegend type
     */
    public static final int MRKLEGEND_TYPE = 5;

    /**
     * The instance of the mrkLegend type
     */
    public static final MarksMarkStyleType MRKLEGEND = new MarksMarkStyleType(MRKLEGEND_TYPE, "mrkLegend");

    /**
     * The mrkPercentTotal type
     */
    public static final int MRKPERCENTTOTAL_TYPE = 6;

    /**
     * The instance of the mrkPercentTotal type
     */
    public static final MarksMarkStyleType MRKPERCENTTOTAL = new MarksMarkStyleType(MRKPERCENTTOTAL_TYPE, "mrkPercentTotal");

    /**
     * The mrkAll type
     */
    public static final int MRKALL_TYPE = 7;

    /**
     * The instance of the mrkAll type
     */
    public static final MarksMarkStyleType MRKALL = new MarksMarkStyleType(MRKALL_TYPE, "mrkAll");

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

    private MarksMarkStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.MarksMarkStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MarksMarkStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this MarksMarkStyleType
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
        members.put("mrkValue", MRKVALUE);
        members.put("mrkPercent", MRKPERCENT);
        members.put("mrkLabel", MRKLABEL);
        members.put("mrkLabelPercent", MRKLABELPERCENT);
        members.put("mrkLabelValue", MRKLABELVALUE);
        members.put("mrkLegend", MRKLEGEND);
        members.put("mrkPercentTotal", MRKPERCENTTOTAL);
        members.put("mrkAll", MRKALL);
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
     * MarksMarkStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MarksMarkStyleType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.MarksMarkStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MarksMarkStyleType";
            throw new IllegalArgumentException(err);
        }
        return (MarksMarkStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.MarksMarkStyleType valueOf(java.lang.String) 

}
