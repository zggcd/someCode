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
 * Class MeasureHeaderHeaderTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureHeaderHeaderTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The meaData type
     */
    public static final int MEADATA_TYPE = 0;

    /**
     * The instance of the meaData type
     */
    public static final MeasureHeaderHeaderTypeType MEADATA = new MeasureHeaderHeaderTypeType(MEADATA_TYPE, "meaData");

    /**
     * The meaCal type
     */
    public static final int MEACAL_TYPE = 1;

    /**
     * The instance of the meaCal type
     */
    public static final MeasureHeaderHeaderTypeType MEACAL = new MeasureHeaderHeaderTypeType(MEACAL_TYPE, "meaCal");

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

    private MeasureHeaderHeaderTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MeasureHeaderHeaderTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * MeasureHeaderHeaderTypeType
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
        members.put("meaData", MEADATA);
        members.put("meaCal", MEACAL);
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
     * MeasureHeaderHeaderTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MeasureHeaderHeaderTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MeasureHeaderHeaderTypeType";
            throw new IllegalArgumentException(err);
        }
        return (MeasureHeaderHeaderTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType valueOf(java.lang.String) 

}
