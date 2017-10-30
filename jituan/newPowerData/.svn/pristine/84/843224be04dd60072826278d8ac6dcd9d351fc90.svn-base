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
 * Class DimHeaderAreaType.
 * 
 * @version $Revision$ $Date$
 */
public class DimHeaderAreaType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The arRow type
     */
    public static final int ARROW_TYPE = 0;

    /**
     * The instance of the arRow type
     */
    public static final DimHeaderAreaType ARROW = new DimHeaderAreaType(ARROW_TYPE, "arRow");

    /**
     * The arCol type
     */
    public static final int ARCOL_TYPE = 1;

    /**
     * The instance of the arCol type
     */
    public static final DimHeaderAreaType ARCOL = new DimHeaderAreaType(ARCOL_TYPE, "arCol");

    /**
     * The arDat type
     */
    public static final int ARDAT_TYPE = 2;

    /**
     * The instance of the arDat type
     */
    public static final DimHeaderAreaType ARDAT = new DimHeaderAreaType(ARDAT_TYPE, "arDat");

    /**
     * The arPage type
     */
    public static final int ARPAGE_TYPE = 3;

    /**
     * The instance of the arPage type
     */
    public static final DimHeaderAreaType ARPAGE = new DimHeaderAreaType(ARPAGE_TYPE, "arPage");

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

    private DimHeaderAreaType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimHeaderAreaType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimHeaderAreaType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DimHeaderAreaType
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
        members.put("arRow", ARROW);
        members.put("arCol", ARCOL);
        members.put("arDat", ARDAT);
        members.put("arPage", ARPAGE);
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
     * DimHeaderAreaType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DimHeaderAreaType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimHeaderAreaType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimHeaderAreaType";
            throw new IllegalArgumentException(err);
        }
        return (DimHeaderAreaType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimHeaderAreaType valueOf(java.lang.String) 

}
