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
 * Class EvaluationTemplateTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationTemplateTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The tmpDoc type
     */
    public static final int TMPDOC_TYPE = 0;

    /**
     * The instance of the tmpDoc type
     */
    public static final EvaluationTemplateTypeType TMPDOC = new EvaluationTemplateTypeType(TMPDOC_TYPE, "tmpDoc");

    /**
     * The tmpHtm type
     */
    public static final int TMPHTM_TYPE = 1;

    /**
     * The instance of the tmpHtm type
     */
    public static final EvaluationTemplateTypeType TMPHTM = new EvaluationTemplateTypeType(TMPHTM_TYPE, "tmpHtm");

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

    private EvaluationTemplateTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of EvaluationTemplateTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * EvaluationTemplateTypeType
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
        members.put("tmpDoc", TMPDOC);
        members.put("tmpHtm", TMPHTM);
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
     * EvaluationTemplateTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new EvaluationTemplateTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid EvaluationTemplateTypeType";
            throw new IllegalArgumentException(err);
        }
        return (EvaluationTemplateTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTypeType valueOf(java.lang.String) 

}
