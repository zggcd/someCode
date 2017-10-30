package com.ccssoft.rsas.nsg.interf;

/**
 *飞思达接口
 */
public interface INsgFeiSiDaInterface extends BaseInterface {

	/**实时查询节目源（或者组播IP）探针测试信息信息接口**/
	public abstract String getProgramSourceProbeInformation();
	
	/**实时查询机顶盒信息和状态**/
	public abstract String getSetTopBoxInformationAndState();
}
