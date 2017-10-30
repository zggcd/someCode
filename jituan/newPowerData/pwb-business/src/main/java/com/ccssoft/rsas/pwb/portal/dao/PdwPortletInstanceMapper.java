/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortletInstance;
import com.ccssoft.rsas.pwb.portal.model.PdwPortletInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortletInstanceMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortletInstanceExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortletInstanceExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param portletInstanceId portletInstanceId
     * @return int
     */
    int deleteByPrimaryKey(String portletInstanceId);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortletInstance record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortletInstance record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<PdwPortletInstance>
     */
    List<PdwPortletInstance> selectByExample(PdwPortletInstanceExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param portletInstanceId portletInstanceId
     * @return PdwPortletInstance
     */
    PdwPortletInstance selectByPrimaryKey(String portletInstanceId);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortletInstance record, @Param("example") PdwPortletInstanceExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortletInstance record, @Param("example") PdwPortletInstanceExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortletInstance record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortletInstance record);
}