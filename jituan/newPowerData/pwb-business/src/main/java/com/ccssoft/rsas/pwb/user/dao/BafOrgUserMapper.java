package com.ccssoft.rsas.pwb.user.dao;

import com.ccssoft.rsas.pwb.user.model.BafOrgUser;
import com.ccssoft.rsas.pwb.user.model.BafOrgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BafOrgUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int countByExample(BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int deleteByExample(BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int deleteByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int insert(BafOrgUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int insertSelective(BafOrgUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	List<BafOrgUser> selectByExampleWithBLOBs(BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	List<BafOrgUser> selectByExample(BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	BafOrgUser selectByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByExampleSelective(@Param("record") BafOrgUser record, @Param("example") BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByExampleWithBLOBs(@Param("record") BafOrgUser record, @Param("example") BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByExample(@Param("record") BafOrgUser record, @Param("example") BafOrgUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByPrimaryKeySelective(BafOrgUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByPrimaryKeyWithBLOBs(BafOrgUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BAF_ORG_USER
	 * @mbggenerated  Thu May 19 16:13:12 CST 2016
	 */
	int updateByPrimaryKey(BafOrgUser record);
}