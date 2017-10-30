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
 * Class DataInputFieldShowTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DataInputFieldShowTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The stTreeKey type
     */
    public static final int STTREEKEY_TYPE = 0;

    /**
     * The instance of the stTreeKey type
     */
    public static final DataInputFieldShowTypeType STTREEKEY = new DataInputFieldShowTypeType(STTREEKEY_TYPE, "stTreeKey");

    /**
     * The stTreeCapition type
     */
    public static final int STTREECAPITION_TYPE = 1;

    /**
     * The instance of the stTreeCapition type
     */
    public static final DataInputFieldShowTypeType STTREECAPITION = new DataInputFieldShowTypeType(STTREECAPITION_TYPE, "stTreeCapition");

    /**
     * The stTreeParent type
     */
    public static final int STTREEPARENT_TYPE = 2;

    /**
     * The instance of the stTreeParent type
     */
    public static final DataInputFieldShowTypeType STTREEPARENT = new DataInputFieldShowTypeType(STTREEPARENT_TYPE, "stTreeParent");

    /**
     * The stNormal type
     */
    public static final int STNORMAL_TYPE = 3;

    /**
     * The instance of the stNormal type
     */
    public static final DataInputFieldShowTypeType STNORMAL = new DataInputFieldShowTypeType(STNORMAL_TYPE, "stNormal");

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

    private DataInputFieldShowTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataInputFieldShowTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataInputFieldShowTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DataInputFieldShowTypeType
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
        members.put("stTreeKey", STTREEKEY);
        members.put("stTreeCapition", STTREECAPITION);
        members.put("stTreeParent", STTREEPARENT);
        members.put("stNormal", STNORMAL);
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
     * DataInputFieldShowTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DataInputFieldShowTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DataInputFieldShowTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataInputFieldShowTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DataInputFieldShowTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataInputFieldShowTypeType valueOf(java.lang.String) 

}
