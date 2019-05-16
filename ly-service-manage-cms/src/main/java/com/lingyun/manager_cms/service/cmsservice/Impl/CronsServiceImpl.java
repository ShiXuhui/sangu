package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.framework.domain.Crons;
import com.lingyun.manager_cms.dao.cmsdao.CronsMapper;
import com.lingyun.manager_cms.service.cmsservice.CronsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CronsServiceImpl implements CronsService {
    @Autowired
    private CronsMapper cronsMapper;

    @Override
    public List<Crons> query() {
        return cronsMapper.query();
    }

    @Override
    public List<Crons> querycrons(Crons crons) {
        return cronsMapper.querycrons(crons);
    }

    @Override
    public void addcrons(Crons crons) {
        cronsMapper.insertSelective(crons);
    }

    @Override
    public void delcrons(String ids) {
        cronsMapper.delcrons(ids);
    }

    @Override
    public Crons querycronsid(Short cronid) {
        return cronsMapper.selectByPrimaryKey(cronid);
    }

    @Override
    public void updatecrons(Crons crons) {
        cronsMapper.updateByPrimaryKey(crons);
    }
}
