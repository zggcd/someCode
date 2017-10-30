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
 * Class HierarchyLimitItemLimitTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyLimitItemLimitTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The limStr type
     */
    public static final int LIMSTR_TYPE = 0;

    /**
     * The instance of the limStr type
     */
    public static final HierarchyLimitItemLimitTypeType LIMSTR = new HierarchyLimitItemLimitTypeType(LIMSTR_TYPE, "limStr");

    /**
     * The limNum type
     */
    public static final int LIMNUM_TYPE = 1;

    /**
     * The instance of the limNum type
     */
    public static final HierarchyLimitItemLimitTypeType LIMNUM = new HierarchyLimitItemLimitTypeType(LIMNUM_TYPE, "limNum");

    /**
     * The LimWarn type
     */
    public static final int LIMWARN_TYPE = 2;

    /**
     * The instance of the LimWarn type
     */
    public static final HierarchyLimitItemLimitTypeType LIMWARN = new HierarchyLimitItemLimitTypeType(LIMWARN_TYPE, "LimWarn");

    /**
     * The LimDim type
     */
    public static final int LIMDIM_TYPE = 3;

    /**
     * The instance of the LimDim type
     */
    public static final HierarchyLimitItemLimitTypeType LIMDIM = new HierarchyLimitItemLimitTypeType(LIMDIM_TYPE, "LimDim");

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

    private HierarchyLimitItemLimitTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyLimitItemLimitTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of HierarchyLimitItemLimitTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * HierarchyLimitItemLimitTypeType
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
        members.put("limStr", LIMSTR);
        members.put("limNum", LIMNUM);
        members.put("LimWarn", LIMWARN);
        members.put("LimDim", LIMDIM);
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
     * HierarchyLimitItemLimitTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new HierarchyLimitItemLimitTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.HierarchyLimitItemLimitTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid HierarchyLimitItemLimitTypeType";
            throw new IllegalArgumentException(err);
        }
        return (HierarchyLimitItemLimitTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyLimitItemLimitTypeType valueOf(java.lang.String) 

}
