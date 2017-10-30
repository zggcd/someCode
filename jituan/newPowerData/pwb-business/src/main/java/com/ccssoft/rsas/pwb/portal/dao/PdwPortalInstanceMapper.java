/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstance;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalInstanceMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalInstanceExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalInstanceExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param instanceId instanceId
     * @return int
     */
    int deleteByPrimaryKey(String instanceId);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalInstance record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalInstance record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<PdwPortalInstance>
     */
    List<PdwPortalInstance> selectByExample(PdwPortalInstanceExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param instanceId instanceId
     * @return PdwPortalInstance
     */
    PdwPortalInstance selectByPrimaryKey(String instanceId);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalInstance record, @Param("example") PdwPortalInstanceExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalInstance record, @Param("example") PdwPortalInstanceExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalInstance record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalInstance record);
}