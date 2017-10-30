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
 * Class HierarchyOwnerObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyOwnerObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The hrDim type
     */
    public static final int HRDIM_TYPE = 0;

    /**
     * The instance of the hrDim type
     */
    public static final HierarchyOwnerObjectTypeType HRDIM = new HierarchyOwnerObjectTypeType(HRDIM_TYPE, "hrDim");

    /**
     * The hrField type
     */
    public static final int HRFIELD_TYPE = 1;

    /**
     * The instance of the hrField type
     */
    public static final HierarchyOwnerObjectTypeType HRFIELD = new HierarchyOwnerObjectTypeType(HRFIELD_TYPE, "hrField");

    /**
     * The hrReport type
     */
    public static final int HRREPORT_TYPE = 2;

    /**
     * The instance of the hrReport type
     */
    public static final HierarchyOwnerObjectTypeType HRREPORT = new HierarchyOwnerObjectTypeType(HRREPORT_TYPE, "hrReport");

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

    private HierarchyOwnerObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of HierarchyOwnerObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * HierarchyOwnerObjectTypeType
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
        members.put("hrDim", HRDIM);
        members.put("hrField", HRFIELD);
        members.put("hrReport", HRREPORT);
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
     * HierarchyOwnerObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new HierarchyOwnerObjectTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid HierarchyOwnerObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (HierarchyOwnerObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType valueOf(java.lang.String) 

}
