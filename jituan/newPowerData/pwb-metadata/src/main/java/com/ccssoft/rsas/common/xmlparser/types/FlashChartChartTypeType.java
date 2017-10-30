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
 * Class FlashChartChartTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class FlashChartChartTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Pie type
     */
    public static final int PIE_TYPE = 0;

    /**
     * The instance of the Pie type
     */
    public static final FlashChartChartTypeType PIE = new FlashChartChartTypeType(PIE_TYPE, "Pie");

    /**
     * The Other type
     */
    public static final int OTHER_TYPE = 1;

    /**
     * The instance of the Other type
     */
    public static final FlashChartChartTypeType OTHER = new FlashChartChartTypeType(OTHER_TYPE, "Other");

    /**
     * The Angular type
     */
    public static final int ANGULAR_TYPE = 2;

    /**
     * The instance of the Angular type
     */
    public static final FlashChartChartTypeType ANGULAR = new FlashChartChartTypeType(ANGULAR_TYPE, "Angular");

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

    private FlashChartChartTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.FlashChartChartTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of FlashChartChartTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this FlashChartChartTypeTyp
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
        members.put("Pie", PIE);
        members.put("Other", OTHER);
        members.put("Angular", ANGULAR);
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
     * FlashChartChartTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new FlashChartChartTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.FlashChartChartTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid FlashChartChartTypeType";
            throw new IllegalArgumentException(err);
        }
        return (FlashChartChartTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.FlashChartChartTypeType valueOf(java.lang.String) 

}
