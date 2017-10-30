/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayout;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalLayoutMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalLayoutExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalLayoutExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param layoutId layoutId
     * @return int
     */
    int deleteByPrimaryKey(String layoutId);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalLayout record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalLayout record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<PdwPortalLayout>
     */
    List<PdwPortalLayout> selectByExample(PdwPortalLayoutExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param layoutId layoutId
     * @return PdwPortalLayout
     */
    PdwPortalLayout selectByPrimaryKey(String layoutId);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalLayout record, @Param("example") PdwPortalLayoutExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalLayout record, @Param("example") PdwPortalLayoutExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalLayout record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalLayout record);
}