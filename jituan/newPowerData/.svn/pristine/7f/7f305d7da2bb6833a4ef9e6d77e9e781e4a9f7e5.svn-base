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
 * Class InformationInfoTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class InformationInfoTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The sasWarning type
     */
    public static final int SASWARNING_TYPE = 0;

    /**
     * The instance of the sasWarning type
     */
    public static final InformationInfoTypeType SASWARNING = new InformationInfoTypeType(SASWARNING_TYPE, "sasWarning");

    /**
     * The sasError type
     */
    public static final int SASERROR_TYPE = 1;

    /**
     * The instance of the sasError type
     */
    public static final InformationInfoTypeType SASERROR = new InformationInfoTypeType(SASERROR_TYPE, "sasError");

    /**
     * The sasQuestion type
     */
    public static final int SASQUESTION_TYPE = 2;

    /**
     * The instance of the sasQuestion type
     */
    public static final InformationInfoTypeType SASQUESTION = new InformationInfoTypeType(SASQUESTION_TYPE, "sasQuestion");

    /**
     * The sasSuccess type
     */
    public static final int SASSUCCESS_TYPE = 3;

    /**
     * The instance of the sasSuccess type
     */
    public static final InformationInfoTypeType SASSUCCESS = new InformationInfoTypeType(SASSUCCESS_TYPE, "sasSuccess");

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

    private InformationInfoTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.InformationInfoTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of InformationInfoTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this InformationInfoTypeTyp
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
        members.put("sasWarning", SASWARNING);
        members.put("sasError", SASERROR);
        members.put("sasQuestion", SASQUESTION);
        members.put("sasSuccess", SASSUCCESS);
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
     * InformationInfoTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new InformationInfoTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.InformationInfoTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid InformationInfoTypeType";
            throw new IllegalArgumentException(err);
        }
        return (InformationInfoTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.InformationInfoTypeType valueOf(java.lang.String) 

}
