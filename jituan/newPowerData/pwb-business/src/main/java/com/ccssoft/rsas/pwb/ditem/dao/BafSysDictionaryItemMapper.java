/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.ditem.dao;

import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItem;
import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BafSysDictionaryItemMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(BafSysDictionaryItemExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(BafSysDictionaryItemExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param itemid itemid
     * @return int
     */
    int deleteByPrimaryKey(String itemid);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(BafSysDictionaryItem record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(BafSysDictionaryItem record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<BafSysDictionaryItem>
     */
    List<BafSysDictionaryItem> selectByExample(BafSysDictionaryItemExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param itemid itemid
     * @return BafSysDictionaryItem
     */
    BafSysDictionaryItem selectByPrimaryKey(String itemid);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") BafSysDictionaryItem record, @Param("example") BafSysDictionaryItemExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") BafSysDictionaryItem record, @Param("example") BafSysDictionaryItemExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(BafSysDictionaryItem record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(BafSysDictionaryItem record);
}