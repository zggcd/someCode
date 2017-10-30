/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.other.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ChartLegendPositionType.
 * 
 * @version $Revision$ $Date$
 */
public class ChartLegendPositionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The RIGHT type
     */
    public static final int RIGHT_TYPE = 0;

    /**
     * The instance of the RIGHT type
     */
    public static final ChartLegendPositionType RIGHT = new ChartLegendPositionType(RIGHT_TYPE, "RIGHT");

    /**
     * The BOTTOM type
     */
    public static final int BOTTOM_TYPE = 1;

    /**
     * The instance of the BOTTOM type
     */
    public static final ChartLegendPositionType BOTTOM = new ChartLegendPositionType(BOTTOM_TYPE, "BOTTOM");

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

    private ChartLegendPositionType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.ChartLegendPositionType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ChartLegendPositionType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this ChartLegendPositionTyp
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
        members.put("RIGHT", RIGHT);
        members.put("BOTTOM", BOTTOM);
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
     * ChartLegendPositionType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ChartLegendPositionType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.chart.other.types.ChartLegendPositionType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ChartLegendPositionType";
            throw new IllegalArgumentException(err);
        }
        return (ChartLegendPositionType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.ChartLegendPositionType valueOf(java.lang.String) 

}
