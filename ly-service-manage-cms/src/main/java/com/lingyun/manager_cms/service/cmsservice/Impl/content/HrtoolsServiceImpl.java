package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.Hrtools;
import com.lingyun.manager_cms.dao.cmsdao.content.HrtoolsMapper;
import com.lingyun.manager_cms.service.cmsservice.content.HrtolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrtoolsServiceImpl implements HrtolsService{
    @Autowired
    private HrtoolsMapper hrtoolsMapper;
    @Override
    public List<Hrtools> Hrtoolslist(Hrtools hrtools) {
        return hrtoolsMapper.Hrtoolslist(hrtools);
    }

    @Override
    public void deletehelp(Integer hId) {
        hrtoolsMapper.deleteByPrimaryKey(hId);
    }
}
