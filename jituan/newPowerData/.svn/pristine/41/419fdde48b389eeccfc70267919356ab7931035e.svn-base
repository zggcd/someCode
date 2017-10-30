package com.ccssoft.rsas.pwb.user.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.pwb.user.dao.BafOrgUserMapper;
import com.ccssoft.rsas.pwb.user.model.BafOrgUser;
import com.ccssoft.rsas.pwb.user.model.BafOrgUserExample;

@Component("pwb_userBOImpl")
public class UserBOImpl implements IUserBO {
    @Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

    /**
     * 
     * 此方方法由注解@Transactional生成事务。
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public void addUser(BafOrgUser user) throws Exception {

        // metaDataSqlSessionTemplate.getConfiguration().addMapper(BafOrgUserMapper.class);
        BafOrgUserMapper BafOrgUserDao = metaDataSqlSessionTemplate.getMapper(BafOrgUserMapper.class);
        BafOrgUserExample example = new BafOrgUserExample();
        example.createCriteria().andLoginnameEqualTo("sa");
        List<BafOrgUser> list = BafOrgUserDao.selectByExample(example);
        if (null != list && list.size() > 0) {
            BafOrgUser orgUser = list.get(0);
            BafOrgUser userx = new BafOrgUser();
            userx.setEmail("pzmdccccd@ccsosft.com.cn"); // 更新SA电子邮件
            userx.setUserid(orgUser.getUserid());
            BafOrgUserDao.updateByPrimaryKeySelective(userx);
        }
        this.updateUser(user);

    }

    /**
     * 
     * 更新用户信息
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public void updateUser(BafOrgUser user) throws Exception {

        BafOrgUserMapper BafOrgUserDao = metaDataSqlSessionTemplate.getMapper(BafOrgUserMapper.class);
        BafOrgUserExample example = new BafOrgUserExample();
        example.createCriteria().andLoginnameEqualTo("sa");
        List<BafOrgUser> list = BafOrgUserDao.selectByExample(example);
        if (null != list && list.size() > 0) {
            BafOrgUser orgUser = list.get(0);
            BafOrgUser userx = new BafOrgUser();
            userx.setFax("02131885901");
            userx.setUserid(orgUser.getUserid());
            BafOrgUserDao.updateByPrimaryKeySelective(userx);
        }
        throw new Exception("spring事务测试，SA用户信息更新出现异常，事务回滚！");

    }
}
