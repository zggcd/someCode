/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.nsg.dao;

import com.ccssoft.rsas.nsg.model.NsgServiceCallRecord;
import com.ccssoft.rsas.nsg.model.NsgServiceCallRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NsgServiceCallRecordMapper {
    /**
     * <p>countByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int countByExample(NsgServiceCallRecordExample example);

    /**
     * <p>deleteByExample由代码生成器创建。</p>
     * @param example example
     * @return int
     */
    int deleteByExample(NsgServiceCallRecordExample example);

    /**
     * <p>deleteByPrimaryKey由代码生成器创建。</p>
     * @param recordId recordId
     * @return int
     */
    int deleteByPrimaryKey(String recordId);

    /**
     * <p>insert由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insert(NsgServiceCallRecord record);

    /**
     * <p>insertSelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int insertSelective(NsgServiceCallRecord record);

    /**
     * <p>selectByExample由代码生成器创建。</p>
     * @param example example
     * @return List<NsgServiceCallRecord>
     */
    List<NsgServiceCallRecord> selectByExample(NsgServiceCallRecordExample example);

    /**
     * <p>selectByPrimaryKey由代码生成器创建。</p>
     * @param recordId recordId
     * @return NsgServiceCallRecord
     */
    NsgServiceCallRecord selectByPrimaryKey(String recordId);

    /**
     * <p>updateByExampleSelective由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") NsgServiceCallRecord record, @Param("example") NsgServiceCallRecordExample example);

    /**
     * <p>updateByExample由代码生成器创建。</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") NsgServiceCallRecord record, @Param("example") NsgServiceCallRecordExample example);

    /**
     * <p>updateByPrimaryKeySelective由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(NsgServiceCallRecord record);

    /**
     * <p>updateByPrimaryKey由代码生成器创建。</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(NsgServiceCallRecord record);
}