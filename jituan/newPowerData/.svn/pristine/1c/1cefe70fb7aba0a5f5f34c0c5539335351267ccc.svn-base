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
 * Class SasChartDataStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class SasChartDataStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The datInRow type
     */
    public static final int DATINROW_TYPE = 0;

    /**
     * The instance of the datInRow type
     */
    public static final SasChartDataStyleType DATINROW = new SasChartDataStyleType(DATINROW_TYPE, "datInRow");

    /**
     * The datInCol type
     */
    public static final int DATINCOL_TYPE = 1;

    /**
     * The instance of the datInCol type
     */
    public static final SasChartDataStyleType DATINCOL = new SasChartDataStyleType(DATINCOL_TYPE, "datInCol");

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

    private SasChartDataStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartDataStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SasChartDataStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this SasChartDataStyleType
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
        members.put("datInRow", DATINROW);
        members.put("datInCol", DATINCOL);
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
     * SasChartDataStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SasChartDataStyleType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.SasChartDataStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SasChartDataStyleType";
            throw new IllegalArgumentException(err);
        }
        return (SasChartDataStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartDataStyleType valueOf(java.lang.String) 

}
