/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstance;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalInstanceMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalInstanceExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalInstanceExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param instanceId instanceId
     * @return int
     */
    int deleteByPrimaryKey(String instanceId);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalInstance record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalInstance record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<PdwPortalInstance>
     */
    List<PdwPortalInstance> selectByExample(PdwPortalInstanceExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param instanceId instanceId
     * @return PdwPortalInstance
     */
    PdwPortalInstance selectByPrimaryKey(String instanceId);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalInstance record, @Param("example") PdwPortalInstanceExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalInstance record, @Param("example") PdwPortalInstanceExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalInstance record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalInstance record);
}