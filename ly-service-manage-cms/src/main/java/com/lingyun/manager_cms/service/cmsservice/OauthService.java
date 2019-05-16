package com.lingyun.manager_cms.service.cmsservice;

import com.lingyun.framework.domain.Oauth;

public interface OauthService {
    Oauth queryoauth(Integer id);

    void updateoauth(Oauth oauth);
}
