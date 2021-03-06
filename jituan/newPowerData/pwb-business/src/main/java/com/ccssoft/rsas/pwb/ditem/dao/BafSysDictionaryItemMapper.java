/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.ditem.dao;

import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItem;
import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BafSysDictionaryItemMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(BafSysDictionaryItemExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(BafSysDictionaryItemExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param itemid itemid
     * @return int
     */
    int deleteByPrimaryKey(String itemid);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(BafSysDictionaryItem record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(BafSysDictionaryItem record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<BafSysDictionaryItem>
     */
    List<BafSysDictionaryItem> selectByExample(BafSysDictionaryItemExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param itemid itemid
     * @return BafSysDictionaryItem
     */
    BafSysDictionaryItem selectByPrimaryKey(String itemid);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") BafSysDictionaryItem record, @Param("example") BafSysDictionaryItemExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") BafSysDictionaryItem record, @Param("example") BafSysDictionaryItemExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(BafSysDictionaryItem record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(BafSysDictionaryItem record);
}