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
 * Class EvaluationTemplateTemplateTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationTemplateTemplateTypeType implements java.io.Serializable {


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
    public static final EvaluationTemplateTemplateTypeType TMPDOC = new EvaluationTemplateTemplateTypeType(TMPDOC_TYPE, "tmpDoc");

    /**
     * The tmpHtm type
     */
    public static final int TMPHTM_TYPE = 1;

    /**
     * The instance of the tmpHtm type
     */
    public static final EvaluationTemplateTemplateTypeType TMPHTM = new EvaluationTemplateTemplateTypeType(TMPHTM_TYPE, "tmpHtm");

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

    private EvaluationTemplateTemplateTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of EvaluationTemplateTemplateTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * EvaluationTemplateTemplateTypeType
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
     * EvaluationTemplateTemplateTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * EvaluationTemplateTemplateTypeType based on the given String
     * value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid EvaluationTemplateTemplateTypeType";
            throw new IllegalArgumentException(err);
        }
        return (EvaluationTemplateTemplateTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType valueOf(java.lang.String) 

}
