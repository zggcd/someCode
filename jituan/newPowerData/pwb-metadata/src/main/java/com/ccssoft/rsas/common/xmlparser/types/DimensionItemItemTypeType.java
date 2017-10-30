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
 * Class DimensionItemItemTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionItemItemTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ndDIM type
     */
    public static final int NDDIM_TYPE = 0;

    /**
     * The instance of the ndDIM type
     */
    public static final DimensionItemItemTypeType NDDIM = new DimensionItemItemTypeType(NDDIM_TYPE, "ndDIM");

    /**
     * The ndDAT type
     */
    public static final int NDDAT_TYPE = 1;

    /**
     * The instance of the ndDAT type
     */
    public static final DimensionItemItemTypeType NDDAT = new DimensionItemItemTypeType(NDDAT_TYPE, "ndDAT");

    /**
     * The ndCAL type
     */
    public static final int NDCAL_TYPE = 2;

    /**
     * The instance of the ndCAL type
     */
    public static final DimensionItemItemTypeType NDCAL = new DimensionItemItemTypeType(NDCAL_TYPE, "ndCAL");

    /**
     * The ndCMP type
     */
    public static final int NDCMP_TYPE = 3;

    /**
     * The instance of the ndCMP type
     */
    public static final DimensionItemItemTypeType NDCMP = new DimensionItemItemTypeType(NDCMP_TYPE, "ndCMP");

    /**
     * The ndFUNC type
     */
    public static final int NDFUNC_TYPE = 4;

    /**
     * The instance of the ndFUNC type
     */
    public static final DimensionItemItemTypeType NDFUNC = new DimensionItemItemTypeType(NDFUNC_TYPE, "ndFUNC");

    /**
     * The ndCONST type
     */
    public static final int NDCONST_TYPE = 5;

    /**
     * The instance of the ndCONST type
     */
    public static final DimensionItemItemTypeType NDCONST = new DimensionItemItemTypeType(NDCONST_TYPE, "ndCONST");

    /**
     * The ndMEADIM type
     */
    public static final int NDMEADIM_TYPE = 6;

    /**
     * The instance of the ndMEADIM type
     */
    public static final DimensionItemItemTypeType NDMEADIM = new DimensionItemItemTypeType(NDMEADIM_TYPE, "ndMEADIM");

    /**
     * The ndVIRMEA type
     */
    public static final int NDVIRMEA_TYPE = 7;

    /**
     * The instance of the ndVIRMEA type
     */
    public static final DimensionItemItemTypeType NDVIRMEA = new DimensionItemItemTypeType(NDVIRMEA_TYPE, "ndVIRMEA");

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

    private DimensionItemItemTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionItemItemTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimensionItemItemTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DimensionItemItemTypeType
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
        members.put("ndDIM", NDDIM);
        members.put("ndDAT", NDDAT);
        members.put("ndCAL", NDCAL);
        members.put("ndCMP", NDCMP);
        members.put("ndFUNC", NDFUNC);
        members.put("ndCONST", NDCONST);
        members.put("ndMEADIM", NDMEADIM);
        members.put("ndVIRMEA", NDVIRMEA);
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
     * DimensionItemItemTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DimensionItemItemTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimensionItemItemTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimensionItemItemTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DimensionItemItemTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimensionItemItemTypeType valueOf(java.lang.String) 

}
