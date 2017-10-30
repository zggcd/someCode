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
 * Class QueryBandBindObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class QueryBandBindObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The bndDim type
     */
    public static final int BNDDIM_TYPE = 0;

    /**
     * The instance of the bndDim type
     */
    public static final QueryBandBindObjectTypeType BNDDIM = new QueryBandBindObjectTypeType(BNDDIM_TYPE, "bndDim");

    /**
     * The bndField type
     */
    public static final int BNDFIELD_TYPE = 1;

    /**
     * The instance of the bndField type
     */
    public static final QueryBandBindObjectTypeType BNDFIELD = new QueryBandBindObjectTypeType(BNDFIELD_TYPE, "bndField");

    /**
     * The bndMeasure type
     */
    public static final int BNDMEASURE_TYPE = 2;

    /**
     * The instance of the bndMeasure type
     */
    public static final QueryBandBindObjectTypeType BNDMEASURE = new QueryBandBindObjectTypeType(BNDMEASURE_TYPE, "bndMeasure");

    /**
     * The bndQuery type
     */
    public static final int BNDQUERY_TYPE = 3;

    /**
     * The instance of the bndQuery type
     */
    public static final QueryBandBindObjectTypeType BNDQUERY = new QueryBandBindObjectTypeType(BNDQUERY_TYPE, "bndQuery");

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

    private QueryBandBindObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryBandBindObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of QueryBandBindObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * QueryBandBindObjectTypeType
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
        members.put("bndDim", BNDDIM);
        members.put("bndField", BNDFIELD);
        members.put("bndMeasure", BNDMEASURE);
        members.put("bndQuery", BNDQUERY);
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
     * QueryBandBindObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new QueryBandBindObjectTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.QueryBandBindObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid QueryBandBindObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (QueryBandBindObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.QueryBandBindObjectTypeType valueOf(java.lang.String) 

}
