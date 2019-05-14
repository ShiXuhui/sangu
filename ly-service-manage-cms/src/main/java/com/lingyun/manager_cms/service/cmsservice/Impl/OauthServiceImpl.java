package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.manager_cms.dao.cmsdao.OauthMapper;
import com.lingyun.manager_cms.service.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OauthServiceImpl implements OauthService {
    @Autowired
    private OauthMapper oauthMapper;
}
