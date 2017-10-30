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
 * Class DatasetRenderAsType.
 * 
 * @version $Revision$ $Date$
 */
public class DatasetRenderAsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Line type
     */
    public static final int LINE_TYPE = 0;

    /**
     * The instance of the Line type
     */
    public static final DatasetRenderAsType LINE = new DatasetRenderAsType(LINE_TYPE, "Line");

    /**
     * The Pie type
     */
    public static final int PIE_TYPE = 1;

    /**
     * The instance of the Pie type
     */
    public static final DatasetRenderAsType PIE = new DatasetRenderAsType(PIE_TYPE, "Pie");

    /**
     * The Area type
     */
    public static final int AREA_TYPE = 2;

    /**
     * The instance of the Area type
     */
    public static final DatasetRenderAsType AREA = new DatasetRenderAsType(AREA_TYPE, "Area");

    /**
     * The Bar type
     */
    public static final int BAR_TYPE = 3;

    /**
     * The instance of the Bar type
     */
    public static final DatasetRenderAsType BAR = new DatasetRenderAsType(BAR_TYPE, "Bar");

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

    private DatasetRenderAsType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DatasetRenderAsType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DatasetRenderAsType
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
        members.put("Line", LINE);
        members.put("Pie", PIE);
        members.put("Area", AREA);
        members.put("Bar", BAR);
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
     * DatasetRenderAsType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DatasetRenderAsType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DatasetRenderAsType";
            throw new IllegalArgumentException(err);
        }
        return (DatasetRenderAsType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType valueOf(java.lang.String) 

}
