package com.ccssoft.rsas.pwb.ditem.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.mybatis.generater.plugin.Page;
import com.ccssoft.rsas.pwb.ditem.dao.BafSysDictionaryItemMapper;
import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItem;
import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItemExample;

@Component("pwb_DictionaryItemsBOImpl")
public class DictionaryItemsBOImpl implements IDictionaryItemsBO {

    @Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

    /**
     * 
     * 此方方法由注解@Transactional生成只读事务。
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true, rollbackFor = Exception.class)
    public List<BafSysDictionaryItem> queryList(Page page) throws Exception {

        BafSysDictionaryItemMapper ditemsDao = metaDataSqlSessionTemplate.getMapper(BafSysDictionaryItemMapper.class);
        BafSysDictionaryItemExample example = new BafSysDictionaryItemExample();
        example.setPage(page);
        int totalRecords = ditemsDao.countByExample(example);
        page.setTotalRecords(totalRecords);
        List<BafSysDictionaryItem> list = ditemsDao.selectByExample(example);

        return list;
    }

}
