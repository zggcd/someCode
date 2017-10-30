/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class TitleAlignmentType.
 * 
 * @version $Revision$ $Date$
 */
public class TitleAlignmentType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alLeft type
     */
    public static final int ALLEFT_TYPE = 0;

    /**
     * The instance of the alLeft type
     */
    public static final TitleAlignmentType ALLEFT = new TitleAlignmentType(ALLEFT_TYPE, "alLeft");

    /**
     * The alCenter type
     */
    public static final int ALCENTER_TYPE = 1;

    /**
     * The instance of the alCenter type
     */
    public static final TitleAlignmentType ALCENTER = new TitleAlignmentType(ALCENTER_TYPE, "alCenter");

    /**
     * The alRight type
     */
    public static final int ALRIGHT_TYPE = 2;

    /**
     * The instance of the alRight type
     */
    public static final TitleAlignmentType ALRIGHT = new TitleAlignmentType(ALRIGHT_TYPE, "alRight");

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

    private TitleAlignmentType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.TitleAlignmentType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TitleAlignmentType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this TitleAlignmentType
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
        members.put("alLeft", ALLEFT);
        members.put("alCenter", ALCENTER);
        members.put("alRight", ALRIGHT);
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
     * TitleAlignmentType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TitleAlignmentType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.TitleAlignmentType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TitleAlignmentType";
            throw new IllegalArgumentException(err);
        }
        return (TitleAlignmentType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.TitleAlignmentType valueOf(java.lang.String) 

}
