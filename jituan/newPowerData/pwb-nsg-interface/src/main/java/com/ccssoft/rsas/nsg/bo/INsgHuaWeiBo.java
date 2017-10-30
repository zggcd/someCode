package com.ccssoft.rsas.nsg.bo;

/**
 *华为接口
 */

public interface INsgHuaWeiBo extends BaseInterface {
	
	/**获取单个家宽账号的基本信息**/
	public abstract String getFamilyWideBandAccountBasicInfor();
	
	/**实时查询全省或地市的在线用户数**/
	public abstract String getNumberOfOnlineUser();
	
	/**实时查询单个用户的上网记录**/
	public abstract String getUserAccessRecords();
	
	/**实时查询单个用户的失败原因记录**/
	public abstract String getFailedReasonRecords();
	
	
}
