package com.ccssoft.rsas.pwb.portal.bo;

import java.util.Map;

/**
 * 
 * <p>portal布局接口。</p>
 * <p>创建日期：2016年7月26日 下午2:15:11</p>
 *
 * @author 
 */
public interface IPdwPortalLayoutBo {
    /**
     * 
     * <p>getLayout布局展示，portalId为实例id</p>
     * @param portalId
     * @return
     * @throws Exception
     */
    public Map<String, Object> getLayout(String portalId) throws Exception;

}
