/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalChartInstance;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalChartInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalChartInstanceMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalChartInstanceExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalChartInstanceExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param chartId chartId
     * @return int
     */
    int deleteByPrimaryKey(String chartId);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalChartInstance record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalChartInstance record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<PdwPortalChartInstance>
     */
    List<PdwPortalChartInstance> selectByExample(PdwPortalChartInstanceExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param chartId chartId
     * @return PdwPortalChartInstance
     */
    PdwPortalChartInstance selectByPrimaryKey(String chartId);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalChartInstance record, @Param("example") PdwPortalChartInstanceExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalChartInstance record, @Param("example") PdwPortalChartInstanceExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalChartInstance record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalChartInstance record);
}