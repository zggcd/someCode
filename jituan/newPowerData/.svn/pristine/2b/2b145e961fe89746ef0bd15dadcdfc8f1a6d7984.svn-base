/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.xmlparser.types.AnalysesAnalysisModelType;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * �����ķ�������
 * 
 * @version $Revision$ $Date$
 */
public class Analyses implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ģ��
     */
    private com.ccssoft.rsas.common.xmlparser.types.AnalysesAnalysisModelType _analysisModel;

    /**
     * ������ص�ItemID
     */
    private java.lang.String _analysisItemID;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _analysisList
     */
    private java.util.Vector _analysisList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Analyses() {
        super();
        _analysisList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Analyses()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAnalysis
     * 
     * @param vAnalysis
     */
    public void addAnalysis(com.ccssoft.rsas.common.xmlparser.Analysis vAnalysis)
        throws java.lang.IndexOutOfBoundsException
    {
        _analysisList.addElement(vAnalysis);
    } //-- void addAnalysis(com.regaltec.rsas.common.xmlparser.Analysis) 

    /**
     * Method addAnalysis
     * 
     * @param index
     * @param vAnalysis
     */
    public void addAnalysis(int index, com.ccssoft.rsas.common.xmlparser.Analysis vAnalysis)
        throws java.lang.IndexOutOfBoundsException
    {
        _analysisList.insertElementAt(vAnalysis, index);
    } //-- void addAnalysis(int, com.regaltec.rsas.common.xmlparser.Analysis) 

    /**
     * Method enumerateAnalysis
     */
    public java.util.Enumeration enumerateAnalysis()
    {
        return _analysisList.elements();
    } //-- java.util.Enumeration enumerateAnalysis() 

    /**
     * Method getAnalysis
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Analysis getAnalysis(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _analysisList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Analysis) _analysisList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Analysis getAnalysis(int) 

    /**
     * Method getAnalysis
     */
    public com.ccssoft.rsas.common.xmlparser.Analysis[] getAnalysis()
    {
        int size = _analysisList.size();
        com.ccssoft.rsas.common.xmlparser.Analysis[] mArray = new com.ccssoft.rsas.common.xmlparser.Analysis[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Analysis) _analysisList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Analysis[] getAnalysis() 

    /**
     * Method getAnalysisCount
     */
    public int getAnalysisCount()
    {
        return _analysisList.size();
    } //-- int getAnalysisCount() 

    /**
     * Returns the value of field 'analysisItemID'. The field
     * 'analysisItemID' has the following description: ������ص�ItemID
     * 
     * @return the value of field 'analysisItemID'.
     */
    public java.lang.String getAnalysisItemID()
    {
        return this._analysisItemID;
    } //-- java.lang.String getAnalysisItemID() 

    /**
     * Returns the value of field 'analysisModel'. The field
     * 'analysisModel' has the following description: ����ģ��
     * 
     * @return the value of field 'analysisModel'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.AnalysesAnalysisModelType getAnalysisModel()
    {
        return this._analysisModel;
    } //-- com.regaltec.rsas.common.xmlparser.types.AnalysesAnalysisModelType getAnalysisModel() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllAnalysis
     */
    public void removeAllAnalysis()
    {
        _analysisList.removeAllElements();
    } //-- void removeAllAnalysis() 

    /**
     * Method removeAnalysis
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Analysis removeAnalysis(int index)
    {
        java.lang.Object obj = _analysisList.elementAt(index);
        _analysisList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Analysis) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Analysis removeAnalysis(int) 

    /**
     * Method setAnalysis
     * 
     * @param index
     * @param vAnalysis
     */
    public void setAnalysis(int index, com.ccssoft.rsas.common.xmlparser.Analysis vAnalysis)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _analysisList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _analysisList.setElementAt(vAnalysis, index);
    } //-- void setAnalysis(int, com.regaltec.rsas.common.xmlparser.Analysis) 

    /**
     * Method setAnalysis
     * 
     * @param analysisArray
     */
    public void setAnalysis(com.ccssoft.rsas.common.xmlparser.Analysis[] analysisArray)
    {
        //-- copy array
        _analysisList.removeAllElements();
        for (int i = 0; i < analysisArray.length; i++) {
            _analysisList.addElement(analysisArray[i]);
        }
    } //-- void setAnalysis(com.regaltec.rsas.common.xmlparser.Analysis) 

    /**
     * Sets the value of field 'analysisItemID'. The field
     * 'analysisItemID' has the following description: ������ص�ItemID
     * 
     * @param analysisItemID the value of field 'analysisItemID'.
     */
    public void setAnalysisItemID(java.lang.String analysisItemID)
    {
        this._analysisItemID = analysisItemID;
    } //-- void setAnalysisItemID(java.lang.String) 

    /**
     * Sets the value of field 'analysisModel'. The field
     * 'analysisModel' has the following description: ����ģ��
     * 
     * @param analysisModel the value of field 'analysisModel'.
     */
    public void setAnalysisModel(com.ccssoft.rsas.common.xmlparser.types.AnalysesAnalysisModelType analysisModel)
    {
        this._analysisModel = analysisModel;
    } //-- void setAnalysisModel(com.regaltec.rsas.common.xmlparser.types.AnalysesAnalysisModelType) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Analyses) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Analyses.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
