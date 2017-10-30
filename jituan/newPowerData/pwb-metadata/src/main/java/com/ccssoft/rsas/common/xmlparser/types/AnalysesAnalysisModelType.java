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
 * Class AnalysesAnalysisModelType.
 * 
 * @version $Revision$ $Date$
 */
public class AnalysesAnalysisModelType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The anaLine type
     */
    public static final int ANALINE_TYPE = 0;

    /**
     * The instance of the anaLine type
     */
    public static final AnalysesAnalysisModelType ANALINE = new AnalysesAnalysisModelType(ANALINE_TYPE, "anaLine");

    /**
     * The anaCurves type
     */
    public static final int ANACURVES_TYPE = 1;

    /**
     * The instance of the anaCurves type
     */
    public static final AnalysesAnalysisModelType ANACURVES = new AnalysesAnalysisModelType(ANACURVES_TYPE, "anaCurves");

    /**
     * The anaIndex type
     */
    public static final int ANAINDEX_TYPE = 2;

    /**
     * The instance of the anaIndex type
     */
    public static final AnalysesAnalysisModelType ANAINDEX = new AnalysesAnalysisModelType(ANAINDEX_TYPE, "anaIndex");

    /**
     * The anaAmend type
     */
    public static final int ANAAMEND_TYPE = 3;

    /**
     * The instance of the anaAmend type
     */
    public static final AnalysesAnalysisModelType ANAAMEND = new AnalysesAnalysisModelType(ANAAMEND_TYPE, "anaAmend");

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

    private AnalysesAnalysisModelType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.AnalysesAnalysisModelType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of AnalysesAnalysisModelType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * AnalysesAnalysisModelType
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
        members.put("anaLine", ANALINE);
        members.put("anaCurves", ANACURVES);
        members.put("anaIndex", ANAINDEX);
        members.put("anaAmend", ANAAMEND);
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
     * AnalysesAnalysisModelType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new AnalysesAnalysisModelType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.AnalysesAnalysisModelType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AnalysesAnalysisModelType";
            throw new IllegalArgumentException(err);
        }
        return (AnalysesAnalysisModelType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.AnalysesAnalysisModelType valueOf(java.lang.String) 

}
