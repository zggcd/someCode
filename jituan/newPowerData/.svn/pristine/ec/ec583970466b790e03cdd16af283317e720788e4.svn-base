package com.ccssoft.rsas.metadata.publishprocparams.model;

import java.io.Serializable;


/**
 * <p>
 * 标题:报表工具元数据对象
 * </p>
 * <p>
 * 描述：发布对象存储过程参数元数据VO对象
 * </p>
 * <p>
 * 版权: Copyright (c) 2007
 * </p>
 * <p>
 * 公司: 广州瑞达通信技术有限公司
 * </p>
 * 
 * @version 1.0
 * @author 曾俊佳
 */
public class PublishProcParamsVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String publishID;// 发布ID
	private String queryID; // 查询ID
	private String publishConditionID;// 发布条件ID
	private String conditionID;// 绑定的筛选条件ID
	private String procedureName;// 存储过程名
	private int paramOrder;// 序号
	private String paramName;// 参数名称
	private int paramType;// 参数类型
	private int dataType;// 参数数据类型 0--输入参数 Input；1--输出参数 Output；2--输入、输出参数
							// InOut
	private String defaultValue;// 参数默认值

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
