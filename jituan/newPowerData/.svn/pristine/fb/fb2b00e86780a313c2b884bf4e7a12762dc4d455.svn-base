package com.ccssoft.rsas.metadata.table.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 标题:报表工具元数据对象
 * </p>
 * <p>
 * 描述：数据库中的表名元数据对象
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
public class TableVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String tableID; // 引用ID
	private String objectID; // 对象类型
	private String objectType; // 对象类型包括：L --数据源对象D--维对象M--数据对象C--模型对象Q--查询对象F
								// -- 筛选条件对象
	private String tableName; // 引用的数据库表名
	private String tableCaption; // 数据表名称
	private String alias; // 别名
	private int left;
	private int top;
	private int width;
	private int height;
	private List DBFieldList; // 数据库字段对象，用于建模时读取数据库表中的字段信息
	private String desc;
	private int tbType;

	public int getTbType() {
		return tbType;
	}

	public void setTbType(int tbType) {
		this.tbType = tbType;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List getDBFieldList() {
		return this.DBFieldList;
	}

	public void setDBFieldList(List fieldList) {
		this.DBFieldList = fieldList;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getObjectID() {
		return this.objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	/**
	 * <P>
	 * 对象类型包括：L --数据源对象D--维对象M--数据对象C--模型对象Q--查询对象F -- 筛选条件对象
	 * </p>
	 * 
	 * @return String
	 */
	public String getObjectType() {
		return this.objectType;
	}

	/**
	 * <p>
	 * 对象类型包括：L --数据源对象D--维对象M--数据对象C--模型对象Q--查询对象F -- 筛选条件对象
	 * </P>
	 * 
	 * @param objectType
	 *            String
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getTableCaption() {
		return this.tableCaption;
	}

	public void setTableCaption(String tableCaption) {
		this.tableCaption = tableCaption;
	}

	public String getTableID() {
		return this.tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
