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
 * Class RequisitionOptionType.
 * 
 * @version $Revision$ $Date$
 */
public class RequisitionOptionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The opDrillUp type
     */
    public static final int OPDRILLUP_TYPE = 0;

    /**
     * The instance of the opDrillUp type
     */
    public static final RequisitionOptionType OPDRILLUP = new RequisitionOptionType(OPDRILLUP_TYPE, "opDrillUp");

    /**
     * The opDrillDown type
     */
    public static final int OPDRILLDOWN_TYPE = 1;

    /**
     * The instance of the opDrillDown type
     */
    public static final RequisitionOptionType OPDRILLDOWN = new RequisitionOptionType(OPDRILLDOWN_TYPE, "opDrillDown");

    /**
     * The opPivotRow type
     */
    public static final int OPPIVOTROW_TYPE = 2;

    /**
     * The instance of the opPivotRow type
     */
    public static final RequisitionOptionType OPPIVOTROW = new RequisitionOptionType(OPPIVOTROW_TYPE, "opPivotRow");

    /**
     * The opPivotCol type
     */
    public static final int OPPIVOTCOL_TYPE = 3;

    /**
     * The instance of the opPivotCol type
     */
    public static final RequisitionOptionType OPPIVOTCOL = new RequisitionOptionType(OPPIVOTCOL_TYPE, "opPivotCol");

    /**
     * The opAddSchedule type
     */
    public static final int OPADDSCHEDULE_TYPE = 4;

    /**
     * The instance of the opAddSchedule type
     */
    public static final RequisitionOptionType OPADDSCHEDULE = new RequisitionOptionType(OPADDSCHEDULE_TYPE, "opAddSchedule");

    /**
     * The opUdpSchedule type
     */
    public static final int OPUDPSCHEDULE_TYPE = 5;

    /**
     * The instance of the opUdpSchedule type
     */
    public static final RequisitionOptionType OPUDPSCHEDULE = new RequisitionOptionType(OPUDPSCHEDULE_TYPE, "opUdpSchedule");

    /**
     * The opDelSchedule type
     */
    public static final int OPDELSCHEDULE_TYPE = 6;

    /**
     * The instance of the opDelSchedule type
     */
    public static final RequisitionOptionType OPDELSCHEDULE = new RequisitionOptionType(OPDELSCHEDULE_TYPE, "opDelSchedule");

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

    private RequisitionOptionType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionOptionType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of RequisitionOptionType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this RequisitionOptionType
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
        members.put("opDrillUp", OPDRILLUP);
        members.put("opDrillDown", OPDRILLDOWN);
        members.put("opPivotRow", OPPIVOTROW);
        members.put("opPivotCol", OPPIVOTCOL);
        members.put("opAddSchedule", OPADDSCHEDULE);
        members.put("opUdpSchedule", OPUDPSCHEDULE);
        members.put("opDelSchedule", OPDELSCHEDULE);
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
     * RequisitionOptionType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new RequisitionOptionType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.RequisitionOptionType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RequisitionOptionType";
            throw new IllegalArgumentException(err);
        }
        return (RequisitionOptionType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionOptionType valueOf(java.lang.String) 

}
