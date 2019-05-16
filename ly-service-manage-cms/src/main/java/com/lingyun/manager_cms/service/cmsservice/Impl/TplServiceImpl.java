package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.manager_cms.dao.cmsdao.TplMapper;
import com.lingyun.manager_cms.service.cmsservice.TplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TplServiceImpl implements TplService {
    @Autowired
    private TplMapper tplMapper;
}
