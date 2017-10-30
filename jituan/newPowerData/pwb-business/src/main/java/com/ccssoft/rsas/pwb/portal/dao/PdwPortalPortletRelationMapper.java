/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.dao;

import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelation;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelationExample;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdwPortalPortletRelationMapper {
    /**
     * <p>countByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int countByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>deleteByExample�ɴ���������������</p>
     * @param example example
     * @return int
     */
    int deleteByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>deleteByPrimaryKey�ɴ���������������</p>
     * @param key key
     * @return int
     */
    int deleteByPrimaryKey(PdwPortalPortletRelationKey key);

    /**
     * <p>insert�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insert(PdwPortalPortletRelation record);

    /**
     * <p>insertSelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int insertSelective(PdwPortalPortletRelation record);

    /**
     * <p>selectByExample�ɴ���������������</p>
     * @param example example
     * @return List<PdwPortalPortletRelation>
     */
    List<PdwPortalPortletRelation> selectByExample(PdwPortalPortletRelationExample example);

    /**
     * <p>selectByPrimaryKey�ɴ���������������</p>
     * @param key key
     * @return PdwPortalPortletRelation
     */
    PdwPortalPortletRelation selectByPrimaryKey(PdwPortalPortletRelationKey key);

    /**
     * <p>updateByExampleSelective�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PdwPortalPortletRelation record, @Param("example") PdwPortalPortletRelationExample example);

    /**
     * <p>updateByExample�ɴ���������������</p>
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PdwPortalPortletRelation record, @Param("example") PdwPortalPortletRelationExample example);

    /**
     * <p>updateByPrimaryKeySelective�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PdwPortalPortletRelation record);

    /**
     * <p>updateByPrimaryKey�ɴ���������������</p>
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PdwPortalPortletRelation record);
}