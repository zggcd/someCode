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
 * Class DimensionMemberPropertyNodeTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionMemberPropertyNodeTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ndGroup type
     */
    public static final int NDGROUP_TYPE = 0;

    /**
     * The instance of the ndGroup type
     */
    public static final DimensionMemberPropertyNodeTypeType NDGROUP = new DimensionMemberPropertyNodeTypeType(NDGROUP_TYPE, "ndGroup");

    /**
     * The ndFilter type
     */
    public static final int NDFILTER_TYPE = 1;

    /**
     * The instance of the ndFilter type
     */
    public static final DimensionMemberPropertyNodeTypeType NDFILTER = new DimensionMemberPropertyNodeTypeType(NDFILTER_TYPE, "ndFilter");

    /**
     * The ndValue type
     */
    public static final int NDVALUE_TYPE = 2;

    /**
     * The instance of the ndValue type
     */
    public static final DimensionMemberPropertyNodeTypeType NDVALUE = new DimensionMemberPropertyNodeTypeType(NDVALUE_TYPE, "ndValue");

    /**
     * The ndAdvance type
     */
    public static final int NDADVANCE_TYPE = 3;

    /**
     * The instance of the ndAdvance type
     */
    public static final DimensionMemberPropertyNodeTypeType NDADVANCE = new DimensionMemberPropertyNodeTypeType(NDADVANCE_TYPE, "ndAdvance");

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

    private DimensionMemberPropertyNodeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionMemberPropertyNodeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimensionMemberPropertyNodeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DimensionMemberPropertyNodeTypeType
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
        members.put("ndGroup", NDGROUP);
        members.put("ndFilter", NDFILTER);
        members.put("ndValue", NDVALUE);
        members.put("ndAdvance", NDADVANCE);
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
     * DimensionMemberPropertyNodeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * DimensionMemberPropertyNodeTypeType based on the given
     * String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimensionMemberPropertyNodeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimensionMemberPropertyNodeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DimensionMemberPropertyNodeTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionMemberPropertyNodeTypeType valueOf(java.lang.String) 

}
