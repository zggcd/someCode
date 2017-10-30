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
 * Class DataAuthorityDivAuthorityTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DataAuthorityDivAuthorityTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The autInner type
     */
    public static final int AUTINNER_TYPE = 0;

    /**
     * The instance of the autInner type
     */
    public static final DataAuthorityDivAuthorityTypeType AUTINNER = new DataAuthorityDivAuthorityTypeType(AUTINNER_TYPE, "autInner");

    /**
     * The autExternal type
     */
    public static final int AUTEXTERNAL_TYPE = 1;

    /**
     * The instance of the autExternal type
     */
    public static final DataAuthorityDivAuthorityTypeType AUTEXTERNAL = new DataAuthorityDivAuthorityTypeType(AUTEXTERNAL_TYPE, "autExternal");

    /**
     * The autBDF type
     */
    public static final int AUTBDF_TYPE = 2;

    /**
     * The instance of the autBDF type
     */
    public static final DataAuthorityDivAuthorityTypeType AUTBDF = new DataAuthorityDivAuthorityTypeType(AUTBDF_TYPE, "autBDF");

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

    private DataAuthorityDivAuthorityTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataAuthorityDivAuthorityTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataAuthorityDivAuthorityTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DataAuthorityDivAuthorityTypeType
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
        members.put("autInner", AUTINNER);
        members.put("autExternal", AUTEXTERNAL);
        members.put("autBDF", AUTBDF);
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
     * DataAuthorityDivAuthorityTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * DataAuthorityDivAuthorityTypeType based on the given String
     * value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DataAuthorityDivAuthorityTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataAuthorityDivAuthorityTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DataAuthorityDivAuthorityTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataAuthorityDivAuthorityTypeType valueOf(java.lang.String) 

}
