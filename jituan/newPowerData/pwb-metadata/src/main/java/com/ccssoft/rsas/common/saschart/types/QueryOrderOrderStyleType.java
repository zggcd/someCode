/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class QueryOrderOrderStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class QueryOrderOrderStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ordASC type
     */
    public static final int ORDASC_TYPE = 0;

    /**
     * The instance of the ordASC type
     */
    public static final QueryOrderOrderStyleType ORDASC = new QueryOrderOrderStyleType(ORDASC_TYPE, "ordASC");

    /**
     * The ordDESC type
     */
    public static final int ORDDESC_TYPE = 1;

    /**
     * The instance of the ordDESC type
     */
    public static final QueryOrderOrderStyleType ORDDESC = new QueryOrderOrderStyleType(ORDDESC_TYPE, "ordDESC");

    /**
     * The ordNONE type
     */
    public static final int ORDNONE_TYPE = 2;

    /**
     * The instance of the ordNONE type
     */
    public static final QueryOrderOrderStyleType ORDNONE = new QueryOrderOrderStyleType(ORDNONE_TYPE, "ordNONE");

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

    private QueryOrderOrderStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.QueryOrderOrderStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of QueryOrderOrderStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * QueryOrderOrderStyleType
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
        members.put("ordASC", ORDASC);
        members.put("ordDESC", ORDDESC);
        members.put("ordNONE", ORDNONE);
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
     * QueryOrderOrderStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new QueryOrderOrderStyleType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.QueryOrderOrderStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid QueryOrderOrderStyleType";
            throw new IllegalArgumentException(err);
        }
        return (QueryOrderOrderStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.QueryOrderOrderStyleType valueOf(java.lang.String) 

}
