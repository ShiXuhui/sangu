package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.framework.domain.Crons;
import com.lingyun.manager_cms.dao.cmsdao.CronsMapper;
import com.lingyun.manager_cms.service.CronsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CronsServiceImpl implements CronsService{
    @Autowired
    private CronsMapper cronsMapper;

    @Override
    public List<Crons> query() {
        return cronsMapper.query();
    }
}
