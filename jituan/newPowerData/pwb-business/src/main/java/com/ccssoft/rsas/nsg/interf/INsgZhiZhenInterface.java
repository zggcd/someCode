package com.ccssoft.rsas.nsg.interf;

/**
 *直真接口
 */
public interface INsgZhiZhenInterface extends BaseInterface {
	
	/**终端（家庭网关、IMS网关、机顶盒）ping  tracertoute测试**/
	public abstract String getTerminalPingTracertouteCheck();
	
	/**终端（家庭网关、IMS网关、机顶盒）  tracertoute测试**/
	public abstract String getTerminalTracertouteCheck();
	
	/**终端（家庭网关、IMS网关、机顶盒）是否在线**/
	public abstract String getTerminalIsOnlineOrNot();
	
	/**终端（包括家庭网关、IMS网关、机顶盒）信息读取（包括终端链路信息（实时信息）
	 * 终端基本信息用户信息（ITMS数据库中保存的信息）,
	 * 获取宽带，ITV业务数据（实时信息）,LAN侧信息（实时信息）,终端注册信息等等。
	 */
	public abstract String getTerminalBasicUserInformation();
	
	/**实时查询OLT、FTTB是否在网**/
	public abstract String getOltorFttbIsOnlineOrNot();
	
	/**实时OLT、FTTB查询单板信息**/
	public abstract String getOltorFttbBoardInformation();
	
	/**实时查询单个OLT、FTTB ONU性能**/
	public abstract String getOltOrFttbOrOnuPerformance();
	
	/**实时查询单个ONU的终端在线状态**/
	public abstract String getOnuOlineState();
	
	/**实时查询指定PON口下ONU的终端在线状态**/
	public abstract String getOnuOnlineStateUnderPon();
	
	/**实时查询单个ONU光功率信息**/
	public abstract String getOnuOpticalPowerInformation();
	
	/**实时查询指定PON口下所有ONU光功率信息**/
	public abstract String getOnuOpticalPowerInformationUnderPon();
	
	/**实时查询单个ONU在OLT上的SVLAN/CVLAN**/
	public abstract String getOnuVlanOnOlt();
	
	/**实时查询单个OLT端口（上联口和PON口）状态**/
	public abstract String getOltState();
	
	/**查询FTTH ONU端口的状态**/
	public abstract String getFtthOnuState();
	
	/**查询OLT上用户速率模板**/
	public abstract String getUserRateTemplateOnOlt();
	
	/**查询OLT、FTTB ONU上IGMP开关配置（待定）**/
	public abstract String getSwitchConfiguration();
	
	/**查询网元是否在网**/
	public abstract String checkNeIsOnlineOrNot();
	
	/**查询网元设备信息以及性能数据**/
	public abstract String getNeInformationAndPerformance();
	
	/**查询口流量信息（拥塞)**/
	public abstract String getPortTrafficInformation();
	
}
