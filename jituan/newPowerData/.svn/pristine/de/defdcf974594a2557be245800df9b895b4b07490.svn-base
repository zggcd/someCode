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
 * Class RelationItemLogicSymbolType.
 * 
 * @version $Revision$ $Date$
 */
public class RelationItemLogicSymbolType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The lgcAND type
     */
    public static final int LGCAND_TYPE = 0;

    /**
     * The instance of the lgcAND type
     */
    public static final RelationItemLogicSymbolType LGCAND = new RelationItemLogicSymbolType(LGCAND_TYPE, "lgcAND");

    /**
     * The lgcOR type
     */
    public static final int LGCOR_TYPE = 1;

    /**
     * The instance of the lgcOR type
     */
    public static final RelationItemLogicSymbolType LGCOR = new RelationItemLogicSymbolType(LGCOR_TYPE, "lgcOR");

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

    private RelationItemLogicSymbolType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.RelationItemLogicSymbolType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of RelationItemLogicSymbolType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * RelationItemLogicSymbolType
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
        members.put("lgcAND", LGCAND);
        members.put("lgcOR", LGCOR);
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
     * RelationItemLogicSymbolType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new RelationItemLogicSymbolType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.RelationItemLogicSymbolType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RelationItemLogicSymbolType";
            throw new IllegalArgumentException(err);
        }
        return (RelationItemLogicSymbolType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.RelationItemLogicSymbolType valueOf(java.lang.String) 

}
