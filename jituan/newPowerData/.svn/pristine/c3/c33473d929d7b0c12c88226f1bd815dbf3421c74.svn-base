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
 * Class EvaluationTemplateEncodeTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationTemplateEncodeTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ecNone type
     */
    public static final int ECNONE_TYPE = 0;

    /**
     * The instance of the ecNone type
     */
    public static final EvaluationTemplateEncodeTypeType ECNONE = new EvaluationTemplateEncodeTypeType(ECNONE_TYPE, "ecNone");

    /**
     * The ecBase64 type
     */
    public static final int ECBASE64_TYPE = 1;

    /**
     * The instance of the ecBase64 type
     */
    public static final EvaluationTemplateEncodeTypeType ECBASE64 = new EvaluationTemplateEncodeTypeType(ECBASE64_TYPE, "ecBase64");

    /**
     * The ecHex type
     */
    public static final int ECHEX_TYPE = 2;

    /**
     * The instance of the ecHex type
     */
    public static final EvaluationTemplateEncodeTypeType ECHEX = new EvaluationTemplateEncodeTypeType(ECHEX_TYPE, "ecHex");

    /**
     * The ecBin64 type
     */
    public static final int ECBIN64_TYPE = 3;

    /**
     * The instance of the ecBin64 type
     */
    public static final EvaluationTemplateEncodeTypeType ECBIN64 = new EvaluationTemplateEncodeTypeType(ECBIN64_TYPE, "ecBin64");

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

    private EvaluationTemplateEncodeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of EvaluationTemplateEncodeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * EvaluationTemplateEncodeTypeType
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
        members.put("ecNone", ECNONE);
        members.put("ecBase64", ECBASE64);
        members.put("ecHex", ECHEX);
        members.put("ecBin64", ECBIN64);
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
     * EvaluationTemplateEncodeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new EvaluationTemplateEncodeTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid EvaluationTemplateEncodeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (EvaluationTemplateEncodeTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType valueOf(java.lang.String) 

}
