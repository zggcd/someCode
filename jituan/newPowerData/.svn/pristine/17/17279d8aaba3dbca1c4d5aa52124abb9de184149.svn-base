package com.ccssoft.rsas.nsg.util;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;

public class ResultSet implements Serializable, Cloneable{
	//串行化版本号
		private static final long serialVersionUID = 3258132436020770360L;
		//数据集合
		private Hashtable resultSet;
		
		/**
		 * 缺省的构造函数
		 */
		public ResultSet() {
			resultSet = new Hashtable();
		}
		
		public String toText()
		{
			return resultSet.toString();
		}
		/**
		 * 返回结果集
		 * @return 返回结果集.
		 */
		public Map getResultSet() {
			return resultSet;
		}
		
		/**
		 * 设置结果集
		 * @param resultSet 结果集.
		 */
		public void setResultSet(Map resultSet) {
			if ( resultSet != null )
				this.resultSet.putAll(resultSet);
		}
		
		/**
		 * 增加对象值对
		 * @param ObjectName  名称
		 * @param ObjectValue 值
		 */
		public void putObjectValue(String objectName,Object objectValue) {
			if ( this.resultSet == null )
				this.resultSet = new Hashtable();
			if ( objectName != null ) {
				this.resultSet.put(objectName,objectValue);
			}
		}	
}
