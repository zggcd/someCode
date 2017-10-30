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
 * Class ReportDocCommitTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDocCommitTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The cmtSchedule type
     */
    public static final int CMTSCHEDULE_TYPE = 0;

    /**
     * The instance of the cmtSchedule type
     */
    public static final ReportDocCommitTypeType CMTSCHEDULE = new ReportDocCommitTypeType(CMTSCHEDULE_TYPE, "cmtSchedule");

    /**
     * The cmtTask type
     */
    public static final int CMTTASK_TYPE = 1;

    /**
     * The instance of the cmtTask type
     */
    public static final ReportDocCommitTypeType CMTTASK = new ReportDocCommitTypeType(CMTTASK_TYPE, "cmtTask");

    /**
     * The cmtManual type
     */
    public static final int CMTMANUAL_TYPE = 2;

    /**
     * The instance of the cmtManual type
     */
    public static final ReportDocCommitTypeType CMTMANUAL = new ReportDocCommitTypeType(CMTMANUAL_TYPE, "cmtManual");

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

    private ReportDocCommitTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportDocCommitTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ReportDocCommitTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this ReportDocCommitTypeTyp
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
        members.put("cmtSchedule", CMTSCHEDULE);
        members.put("cmtTask", CMTTASK);
        members.put("cmtManual", CMTMANUAL);
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
     * ReportDocCommitTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ReportDocCommitTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ReportDocCommitTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReportDocCommitTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ReportDocCommitTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportDocCommitTypeType valueOf(java.lang.String) 

}
