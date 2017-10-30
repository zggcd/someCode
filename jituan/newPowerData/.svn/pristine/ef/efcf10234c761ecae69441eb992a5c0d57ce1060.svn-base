package com.ccssoft.rsas.pwb.portal.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import com.ccssoft.rsas.pwb.portal.dao.PdwPortalInstanceMapper;
import com.ccssoft.rsas.pwb.portal.dao.PdwPortalLayoutMapper;
import com.ccssoft.rsas.pwb.portal.dao.PdwPortalLayoutPanelMapper;
import com.ccssoft.rsas.pwb.portal.dao.PdwPortalPortletRelationMapper;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstance;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalInstanceExample;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayout;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutPanel;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutPanelExample;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelation;
import com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelationExample;

/**
 * 
 * <p>portal布局实现类。</p>
 * <p>创建日期：2016年7月26日 下午2:15:11</p>
 *
 * @author 
 */
@Component("portal_pdwPortalLayout")
public class PdwPortalLayoutImpl implements IPdwPortalLayoutBo {
    @Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

    @Override
    // @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true, rollbackFor = Exception.class)
    public Map<String, Object> getLayout(String portalId) throws Exception {
        Map<String, Object> results = new HashMap<String, Object>();
        // 默认获取实例
        PdwPortalInstanceMapper portalInstanceMapper = metaDataSqlSessionTemplate.getMapper(PdwPortalInstanceMapper.class);
        PdwPortalInstanceExample instanceExample = new PdwPortalInstanceExample();
        instanceExample.createCriteria().andIsReleaseEqualTo(portalId);
        List<PdwPortalInstance> portalInstanceLst = portalInstanceMapper.selectByExample(instanceExample);
        PdwPortalInstance portalInstance = portalInstanceLst.get(0);
        String instanceId = portalInstance.getInstanceId();
        String layoutId = portalInstance.getLayoutId();
        System.out.println("layoutid:---------------------------" + layoutId);
        // 获取布局
        PdwPortalLayoutMapper pdwPortalLayoutMapper = metaDataSqlSessionTemplate.getMapper(PdwPortalLayoutMapper.class);
        PdwPortalLayout pdwPortalLayout = pdwPortalLayoutMapper.selectByPrimaryKey(layoutId);
        // 获取布局面板
        PdwPortalLayoutPanelMapper pdwPortalLayoutPanelMapper = metaDataSqlSessionTemplate.getMapper(PdwPortalLayoutPanelMapper.class);
        PdwPortalLayoutPanelExample example = new PdwPortalLayoutPanelExample();
        example.createCriteria().andLayoutIdEqualTo(layoutId);
        List<PdwPortalLayoutPanel> portalLayoutPanelLst = pdwPortalLayoutPanelMapper.selectByExample(example);

        results.put("pdwPortalLayout", pdwPortalLayout);
        results.put("portalLayoutPanelLst", portalLayoutPanelLst);
        // 获取面板和portal关联
        PdwPortalPortletRelationMapper portalPortletRelationMapper = metaDataSqlSessionTemplate.getMapper(PdwPortalPortletRelationMapper.class);
        PdwPortalPortletRelationExample portalPortletRelationExample = new PdwPortalPortletRelationExample();
        portalPortletRelationExample.createCriteria().andInstanceIdEqualTo(instanceId);
        List<PdwPortalPortletRelation> pdwPortalPortletRelationLst = portalPortletRelationMapper.selectByExample(portalPortletRelationExample);
        results.put("pdwPortalPortletRelationLst", pdwPortalPortletRelationLst);
        /*
         * //获取行总数 PdwPortalLayoutPanelMapper portalLayoutPanelCountMapper
         * =metaDataSqlSessionTemplate.getMapper(PdwPortalLayoutPanelMapper.class); PdwPortalLayoutPanelExample
         * portalLayoutPanelCountExample=new PdwPortalLayoutPanelExample();
         * portalLayoutPanelCountExample.createCriteria().
         * portalLayoutPanelCountMapper.countByExample(portalLayoutPanelCountExample);
         */
        return results;
    }
}
