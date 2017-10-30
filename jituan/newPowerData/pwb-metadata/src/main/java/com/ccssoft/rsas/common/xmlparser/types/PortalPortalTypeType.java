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
 * Class PortalPortalTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class PortalPortalTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ptOwnUser type
     */
    public static final int PTOWNUSER_TYPE = 0;

    /**
     * The instance of the ptOwnUser type
     */
    public static final PortalPortalTypeType PTOWNUSER = new PortalPortalTypeType(PTOWNUSER_TYPE, "ptOwnUser");

    /**
     * The ptContentTemp type
     */
    public static final int PTCONTENTTEMP_TYPE = 1;

    /**
     * The instance of the ptContentTemp type
     */
    public static final PortalPortalTypeType PTCONTENTTEMP = new PortalPortalTypeType(PTCONTENTTEMP_TYPE, "ptContentTemp");

    /**
     * The ptLayoutTemp type
     */
    public static final int PTLAYOUTTEMP_TYPE = 2;

    /**
     * The instance of the ptLayoutTemp type
     */
    public static final PortalPortalTypeType PTLAYOUTTEMP = new PortalPortalTypeType(PTLAYOUTTEMP_TYPE, "ptLayoutTemp");

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

    private PortalPortalTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalPortalTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PortalPortalTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PortalPortalTypeType
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
        members.put("ptOwnUser", PTOWNUSER);
        members.put("ptContentTemp", PTCONTENTTEMP);
        members.put("ptLayoutTemp", PTLAYOUTTEMP);
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
     * PortalPortalTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PortalPortalTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PortalPortalTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PortalPortalTypeType";
            throw new IllegalArgumentException(err);
        }
        return (PortalPortalTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalPortalTypeType valueOf(java.lang.String) 

}
