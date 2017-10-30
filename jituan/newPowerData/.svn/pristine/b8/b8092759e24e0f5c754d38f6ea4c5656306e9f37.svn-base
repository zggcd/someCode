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
 * Class TaskerExportTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerExportTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The expNone type
     */
    public static final int EXPNONE_TYPE = 0;

    /**
     * The instance of the expNone type
     */
    public static final TaskerExportTypeType EXPNONE = new TaskerExportTypeType(EXPNONE_TYPE, "expNone");

    /**
     * The expHtml type
     */
    public static final int EXPHTML_TYPE = 1;

    /**
     * The instance of the expHtml type
     */
    public static final TaskerExportTypeType EXPHTML = new TaskerExportTypeType(EXPHTML_TYPE, "expHtml");

    /**
     * The expExcel type
     */
    public static final int EXPEXCEL_TYPE = 2;

    /**
     * The instance of the expExcel type
     */
    public static final TaskerExportTypeType EXPEXCEL = new TaskerExportTypeType(EXPEXCEL_TYPE, "expExcel");

    /**
     * The expPdf type
     */
    public static final int EXPPDF_TYPE = 3;

    /**
     * The instance of the expPdf type
     */
    public static final TaskerExportTypeType EXPPDF = new TaskerExportTypeType(EXPPDF_TYPE, "expPdf");

    /**
     * The expCsv type
     */
    public static final int EXPCSV_TYPE = 4;

    /**
     * The instance of the expCsv type
     */
    public static final TaskerExportTypeType EXPCSV = new TaskerExportTypeType(EXPCSV_TYPE, "expCsv");

    /**
     * The expDirect type
     */
    public static final int EXPDIRECT_TYPE = 5;

    /**
     * The instance of the expDirect type
     */
    public static final TaskerExportTypeType EXPDIRECT = new TaskerExportTypeType(EXPDIRECT_TYPE, "expDirect");

    /**
     * The expTxt type
     */
    public static final int EXPTXT_TYPE = 6;

    /**
     * The instance of the expTxt type
     */
    public static final TaskerExportTypeType EXPTXT = new TaskerExportTypeType(EXPTXT_TYPE, "expTxt");

    /**
     * The expDoc type
     */
    public static final int EXPDOC_TYPE = 7;

    /**
     * The instance of the expDoc type
     */
    public static final TaskerExportTypeType EXPDOC = new TaskerExportTypeType(EXPDOC_TYPE, "expDoc");

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

    private TaskerExportTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerExportTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerExportTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this TaskerExportTypeType
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
        members.put("expNone", EXPNONE);
        members.put("expHtml", EXPHTML);
        members.put("expExcel", EXPEXCEL);
        members.put("expPdf", EXPPDF);
        members.put("expCsv", EXPCSV);
        members.put("expDirect", EXPDIRECT);
        members.put("expTxt", EXPTXT);
        members.put("expDoc", EXPDOC);
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
     * TaskerExportTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerExportTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerExportTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerExportTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerExportTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerExportTypeType valueOf(java.lang.String) 

}
