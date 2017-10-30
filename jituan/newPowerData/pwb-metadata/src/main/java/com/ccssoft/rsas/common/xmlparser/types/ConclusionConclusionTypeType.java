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
 * Class ConclusionConclusionTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ConclusionConclusionTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The eltIf type
     */
    public static final int ELTIF_TYPE = 0;

    /**
     * The instance of the eltIf type
     */
    public static final ConclusionConclusionTypeType ELTIF = new ConclusionConclusionTypeType(ELTIF_TYPE, "eltIf");

    /**
     * The eltTopn type
     */
    public static final int ELTTOPN_TYPE = 1;

    /**
     * The instance of the eltTopn type
     */
    public static final ConclusionConclusionTypeType ELTTOPN = new ConclusionConclusionTypeType(ELTTOPN_TYPE, "eltTopn");

    /**
     * The eltWarn type
     */
    public static final int ELTWARN_TYPE = 2;

    /**
     * The instance of the eltWarn type
     */
    public static final ConclusionConclusionTypeType ELTWARN = new ConclusionConclusionTypeType(ELTWARN_TYPE, "eltWarn");

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

    private ConclusionConclusionTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConclusionConclusionTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConclusionConclusionTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConclusionConclusionTypeType
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
        members.put("eltIf", ELTIF);
        members.put("eltTopn", ELTTOPN);
        members.put("eltWarn", ELTWARN);
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
     * ConclusionConclusionTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConclusionConclusionTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConclusionConclusionTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConclusionConclusionTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ConclusionConclusionTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConclusionConclusionTypeType valueOf(java.lang.String) 

}
