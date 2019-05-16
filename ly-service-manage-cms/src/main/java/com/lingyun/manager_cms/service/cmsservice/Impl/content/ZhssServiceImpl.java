package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.Zhss;
import com.lingyun.manager_cms.dao.cmsdao.content.ZhssMapper;
import com.lingyun.manager_cms.service.cmsservice.content.ZhssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhssServiceImpl implements ZhssService {

    @Autowired
     private ZhssMapper zhssMapper;
    @Override
    public List<Zhss> zhssList(Zhss zhss) {
        return zhssMapper.zhssList(zhss);
    }

    @Override
    public void deletezhss(Integer id) {
        zhssMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void pldelete(String strid) {
        zhssMapper.pldelete(strid);
    }


}
