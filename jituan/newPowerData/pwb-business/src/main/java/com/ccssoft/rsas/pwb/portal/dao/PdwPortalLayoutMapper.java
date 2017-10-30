/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayout;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalLayoutMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalLayoutExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalLayoutExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param layoutId layoutId
     * @return int
     */
    int deleteByPrimaryKey(String layoutId);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalLayout record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalLayout record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<PdwPortalLayout>
     */
    List<PdwPortalLayout> selectByExample(PdwPortalLayoutExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param layoutId layoutId
     * @return PdwPortalLayout
     */
    PdwPortalLayout selectByPrimaryKey(String layoutId);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalLayout record, @Param("example") PdwPortalLayoutExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalLayout record, @Param("example") PdwPortalLayoutExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalLayout record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalLayout record);
}