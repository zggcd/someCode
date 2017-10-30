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
 * Class DataInputFieldInputTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DataInputFieldInputTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The iptTxt type
     */
    public static final int IPTTXT_TYPE = 0;

    /**
     * The instance of the iptTxt type
     */
    public static final DataInputFieldInputTypeType IPTTXT = new DataInputFieldInputTypeType(IPTTXT_TYPE, "iptTxt");

    /**
     * The iptList type
     */
    public static final int IPTLIST_TYPE = 1;

    /**
     * The instance of the iptList type
     */
    public static final DataInputFieldInputTypeType IPTLIST = new DataInputFieldInputTypeType(IPTLIST_TYPE, "iptList");

    /**
     * The iptAuto type
     */
    public static final int IPTAUTO_TYPE = 2;

    /**
     * The instance of the iptAuto type
     */
    public static final DataInputFieldInputTypeType IPTAUTO = new DataInputFieldInputTypeType(IPTAUTO_TYPE, "iptAuto");

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

    private DataInputFieldInputTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataInputFieldInputTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataInputFieldInputTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DataInputFieldInputTypeType
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
        members.put("iptTxt", IPTTXT);
        members.put("iptList", IPTLIST);
        members.put("iptAuto", IPTAUTO);
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
     * DataInputFieldInputTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DataInputFieldInputTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DataInputFieldInputTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataInputFieldInputTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DataInputFieldInputTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataInputFieldInputTypeType valueOf(java.lang.String) 

}
