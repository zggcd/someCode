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
 * Class QueryComboTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class QueryComboTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The comRelation type
     */
    public static final int COMRELATION_TYPE = 0;

    /**
     * The instance of the comRelation type
     */
    public static final QueryComboTypeType COMRELATION = new QueryComboTypeType(COMRELATION_TYPE, "comRelation");

    /**
     * The comUnion type
     */
    public static final int COMUNION_TYPE = 1;

    /**
     * The instance of the comUnion type
     */
    public static final QueryComboTypeType COMUNION = new QueryComboTypeType(COMUNION_TYPE, "comUnion");

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

    private QueryComboTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryComboTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of QueryComboTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this QueryComboTypeType
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
        members.put("comRelation", COMRELATION);
        members.put("comUnion", COMUNION);
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
     * QueryComboTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new QueryComboTypeType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.QueryComboTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid QueryComboTypeType";
            throw new IllegalArgumentException(err);
        }
        return (QueryComboTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryComboTypeType valueOf(java.lang.String) 

}
