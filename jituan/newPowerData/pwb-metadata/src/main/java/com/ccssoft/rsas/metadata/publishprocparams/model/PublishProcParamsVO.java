package com.ccssoft.rsas.metadata.publishprocparams.model;

import java.io.Serializable;


/**
 * <p>
 * ����:������Ԫ���ݶ���
 * </p>
 * <p>
 * ��������������洢���̲���Ԫ����VO����
 * </p>
 * <p>
 * ��Ȩ: Copyright (c) 2007
 * </p>
 * <p>
 * ��˾: �������ͨ�ż������޹�˾
 * </p>
 * 
 * @version 1.0
 * @author ������
 */
public class PublishProcParamsVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String publishID;// ����ID
	private String queryID; // ��ѯID
	private String publishConditionID;// ��������ID
	private String conditionID;// �󶨵�ɸѡ����ID
	private String procedureName;// �洢������
	private int paramOrder;// ���
	private String paramName;// ��������
	private int paramType;// ��������
	private int dataType;// ������������ 0--������� Input��1--������� Output��2--���롢�������
							// InOut
	private String defaultValue;// ����Ĭ��ֵ

	public String getConditionID() {
		return conditionID;
	}

	public void setConditionID(String conditionID) {
		this.conditionID = conditionID;
	}

	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}

	public String getQueryID() {
		if (this.queryID == null) {
			return "";
		} else {
			return this.queryID;
		}
	}

	public int getDataType() {
		return dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public int getParamOrder() {
		return paramOrder;
	}

	public void setParamOrder(int paramOrder) {
		this.paramOrder = paramOrder;
	}

	public int getParamType() {
		return paramType;
	}

	public void setParamType(int paramType) {
		this.paramType = paramType;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getPublishConditionID() {
		return publishConditionID;
	}

	public void setPublishConditionID(String publishConditionID) {
		this.publishConditionID = publishConditionID;
	}

	public String getPublishID() {
		return publishID;
	}

	public void setPublishID(String publishID) {
		this.publishID = publishID;
	}

}
