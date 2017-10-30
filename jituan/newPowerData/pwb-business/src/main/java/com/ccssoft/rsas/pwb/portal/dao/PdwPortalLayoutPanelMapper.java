/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutPanel;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutPanelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalLayoutPanelMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalLayoutPanelExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalLayoutPanelExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param panelId panelId
     * @return int
     */
    int deleteByPrimaryKey(String panelId);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalLayoutPanel record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalLayoutPanel record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<PdwPortalLayoutPanel>
     */
    List<PdwPortalLayoutPanel> selectByExample(PdwPortalLayoutPanelExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param panelId panelId
     * @return PdwPortalLayoutPanel
     */
    PdwPortalLayoutPanel selectByPrimaryKey(String panelId);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalLayoutPanel record, @Param("example") PdwPortalLayoutPanelExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalLayoutPanel record, @Param("example") PdwPortalLayoutPanelExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalLayoutPanel record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalLayoutPanel record);
}