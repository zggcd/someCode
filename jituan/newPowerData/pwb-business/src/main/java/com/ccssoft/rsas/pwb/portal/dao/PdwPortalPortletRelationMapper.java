/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelation;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelationExample;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalPortletRelationMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param key key
     * @return int
     */
    int deleteByPrimaryKey(PdwPortalPortletRelationKey key);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalPortletRelation record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalPortletRelation record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<PdwPortalPortletRelation>
     */
    List<PdwPortalPortletRelation> selectByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param key key
     * @return PdwPortalPortletRelation
     */
    PdwPortalPortletRelation selectByPrimaryKey(PdwPortalPortletRelationKey key);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalPortletRelation record, @Param("example") PdwPortalPortletRelationExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalPortletRelation record, @Param("example") PdwPortalPortletRelationExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalPortletRelation record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalPortletRelation record);
}