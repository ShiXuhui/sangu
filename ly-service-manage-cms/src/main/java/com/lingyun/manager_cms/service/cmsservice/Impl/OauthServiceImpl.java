package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.framework.domain.Oauth;
import com.lingyun.manager_cms.dao.cmsdao.OauthMapper;
import com.lingyun.manager_cms.service.cmsservice.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OauthServiceImpl implements OauthService {
    @Autowired
    private OauthMapper oauthMapper;

    @Override
    public Oauth queryoauth(Integer id) {
        return oauthMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateoauth(Oauth oauth) {
         oauthMapper.updateByPrimaryKey(oauth);
    }
}
