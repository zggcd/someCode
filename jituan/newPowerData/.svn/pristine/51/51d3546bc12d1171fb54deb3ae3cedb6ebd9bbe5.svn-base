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
 * Class DataPermissionValueDataTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DataPermissionValueDataTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dtChar type
     */
    public static final int DTCHAR_TYPE = 0;

    /**
     * The instance of the dtChar type
     */
    public static final DataPermissionValueDataTypeType DTCHAR = new DataPermissionValueDataTypeType(DTCHAR_TYPE, "dtChar");

    /**
     * The dtNum type
     */
    public static final int DTNUM_TYPE = 1;

    /**
     * The instance of the dtNum type
     */
    public static final DataPermissionValueDataTypeType DTNUM = new DataPermissionValueDataTypeType(DTNUM_TYPE, "dtNum");

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

    private DataPermissionValueDataTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataPermissionValueDataTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataPermissionValueDataTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DataPermissionValueDataTypeType
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
        members.put("dtChar", DTCHAR);
        members.put("dtNum", DTNUM);
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
     * DataPermissionValueDataTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DataPermissionValueDataTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DataPermissionValueDataTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataPermissionValueDataTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DataPermissionValueDataTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataPermissionValueDataTypeType valueOf(java.lang.String) 

}
