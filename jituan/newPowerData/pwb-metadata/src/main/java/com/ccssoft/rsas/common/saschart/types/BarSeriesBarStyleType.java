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
 * Class BarSeriesBarStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class BarSeriesBarStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The barRectangle type
     */
    public static final int BARRECTANGLE_TYPE = 0;

    /**
     * The instance of the barRectangle type
     */
    public static final BarSeriesBarStyleType BARRECTANGLE = new BarSeriesBarStyleType(BARRECTANGLE_TYPE, "barRectangle");

    /**
     * The barPyramid type
     */
    public static final int BARPYRAMID_TYPE = 1;

    /**
     * The instance of the barPyramid type
     */
    public static final BarSeriesBarStyleType BARPYRAMID = new BarSeriesBarStyleType(BARPYRAMID_TYPE, "barPyramid");

    /**
     * The barInvertPyramid type
     */
    public static final int BARINVERTPYRAMID_TYPE = 2;

    /**
     * The instance of the barInvertPyramid type
     */
    public static final BarSeriesBarStyleType BARINVERTPYRAMID = new BarSeriesBarStyleType(BARINVERTPYRAMID_TYPE, "barInvertPyramid");

    /**
     * The barCylinder type
     */
    public static final int BARCYLINDER_TYPE = 3;

    /**
     * The instance of the barCylinder type
     */
    public static final BarSeriesBarStyleType BARCYLINDER = new BarSeriesBarStyleType(BARCYLINDER_TYPE, "barCylinder");

    /**
     * The barEllipse type
     */
    public static final int BARELLIPSE_TYPE = 4;

    /**
     * The instance of the barEllipse type
     */
    public static final BarSeriesBarStyleType BARELLIPSE = new BarSeriesBarStyleType(BARELLIPSE_TYPE, "barEllipse");

    /**
     * The barArrow type
     */
    public static final int BARARROW_TYPE = 5;

    /**
     * The instance of the barArrow type
     */
    public static final BarSeriesBarStyleType BARARROW = new BarSeriesBarStyleType(BARARROW_TYPE, "barArrow");

    /**
     * The barRectGradient type
     */
    public static final int BARRECTGRADIENT_TYPE = 6;

    /**
     * The instance of the barRectGradient type
     */
    public static final BarSeriesBarStyleType BARRECTGRADIENT = new BarSeriesBarStyleType(BARRECTGRADIENT_TYPE, "barRectGradient");

    /**
     * The barCone type
     */
    public static final int BARCONE_TYPE = 7;

    /**
     * The instance of the barCone type
     */
    public static final BarSeriesBarStyleType BARCONE = new BarSeriesBarStyleType(BARCONE_TYPE, "barCone");

    /**
     * The barBevel type
     */
    public static final int BARBEVEL_TYPE = 8;

    /**
     * The instance of the barBevel type
     */
    public static final BarSeriesBarStyleType BARBEVEL = new BarSeriesBarStyleType(BARBEVEL_TYPE, "barBevel");

    /**
     * The barSlantCube type
     */
    public static final int BARSLANTCUBE_TYPE = 9;

    /**
     * The instance of the barSlantCube type
     */
    public static final BarSeriesBarStyleType BARSLANTCUBE = new BarSeriesBarStyleType(BARSLANTCUBE_TYPE, "barSlantCube");

    /**
     * The barDiamond type
     */
    public static final int BARDIAMOND_TYPE = 10;

    /**
     * The instance of the barDiamond type
     */
    public static final BarSeriesBarStyleType BARDIAMOND = new BarSeriesBarStyleType(BARDIAMOND_TYPE, "barDiamond");

    /**
     * The barInvertArrow type
     */
    public static final int BARINVERTARROW_TYPE = 11;

    /**
     * The instance of the barInvertArrow type
     */
    public static final BarSeriesBarStyleType BARINVERTARROW = new BarSeriesBarStyleType(BARINVERTARROW_TYPE, "barInvertArrow");

    /**
     * The barInvertCone type
     */
    public static final int BARINVERTCONE_TYPE = 12;

    /**
     * The instance of the barInvertCone type
     */
    public static final BarSeriesBarStyleType BARINVERTCONE = new BarSeriesBarStyleType(BARINVERTCONE_TYPE, "barInvertCone");

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

    private BarSeriesBarStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesBarStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of BarSeriesBarStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this BarSeriesBarStyleType
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
        members.put("barRectangle", BARRECTANGLE);
        members.put("barPyramid", BARPYRAMID);
        members.put("barInvertPyramid", BARINVERTPYRAMID);
        members.put("barCylinder", BARCYLINDER);
        members.put("barEllipse", BARELLIPSE);
        members.put("barArrow", BARARROW);
        members.put("barRectGradient", BARRECTGRADIENT);
        members.put("barCone", BARCONE);
        members.put("barBevel", BARBEVEL);
        members.put("barSlantCube", BARSLANTCUBE);
        members.put("barDiamond", BARDIAMOND);
        members.put("barInvertArrow", BARINVERTARROW);
        members.put("barInvertCone", BARINVERTCONE);
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
     * BarSeriesBarStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new BarSeriesBarStyleType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.BarSeriesBarStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid BarSeriesBarStyleType";
            throw new IllegalArgumentException(err);
        }
        return (BarSeriesBarStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesBarStyleType valueOf(java.lang.String) 

}
