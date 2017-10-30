package com.ccssoft.rsas.nsg.interf;

/**
 *BOSS系统接口
 */

public interface INsgBossInterface extends BaseInterface{

	
	/**实时查询接口（已具备，协议已拿到） 
	1.实时查询用户宽带信息:（s1267QryL）
	2.实时查询宽带明细信息接口（sQryGdWindMsgL）
	**/
	
	/**1.实时查询用户宽带信息:（s1267QryL）**/
	public abstract String getUserWideBoardInformation();
	
	/**2.实时查询宽带明细信息接口（sQryGdWindMsgL）**/
	public abstract String getWideBoardDetailInformation();
	
}
