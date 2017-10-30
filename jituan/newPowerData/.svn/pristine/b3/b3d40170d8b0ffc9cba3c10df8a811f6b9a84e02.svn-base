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
 * Class TemplateTemplateTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TemplateTemplateTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The tmpXLS type
     */
    public static final int TMPXLS_TYPE = 0;

    /**
     * The instance of the tmpXLS type
     */
    public static final TemplateTemplateTypeType TMPXLS = new TemplateTemplateTypeType(TMPXLS_TYPE, "tmpXLS");

    /**
     * The tmpDOC type
     */
    public static final int TMPDOC_TYPE = 1;

    /**
     * The instance of the tmpDOC type
     */
    public static final TemplateTemplateTypeType TMPDOC = new TemplateTemplateTypeType(TMPDOC_TYPE, "tmpDOC");

    /**
     * The tmpHTM type
     */
    public static final int TMPHTM_TYPE = 2;

    /**
     * The instance of the tmpHTM type
     */
    public static final TemplateTemplateTypeType TMPHTM = new TemplateTemplateTypeType(TMPHTM_TYPE, "tmpHTM");

    /**
     * The tmpTXT type
     */
    public static final int TMPTXT_TYPE = 3;

    /**
     * The instance of the tmpTXT type
     */
    public static final TemplateTemplateTypeType TMPTXT = new TemplateTemplateTypeType(TMPTXT_TYPE, "tmpTXT");

    /**
     * The tmpSAS type
     */
    public static final int TMPSAS_TYPE = 4;

    /**
     * The instance of the tmpSAS type
     */
    public static final TemplateTemplateTypeType TMPSAS = new TemplateTemplateTypeType(TMPSAS_TYPE, "tmpSAS");

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

    private TemplateTemplateTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TemplateTemplateTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TemplateTemplateTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * TemplateTemplateTypeType
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
        members.put("tmpXLS", TMPXLS);
        members.put("tmpDOC", TMPDOC);
        members.put("tmpHTM", TMPHTM);
        members.put("tmpTXT", TMPTXT);
        members.put("tmpSAS", TMPSAS);
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
     * TemplateTemplateTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TemplateTemplateTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TemplateTemplateTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TemplateTemplateTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TemplateTemplateTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TemplateTemplateTypeType valueOf(java.lang.String) 

}
