package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.OauthhControllerApi;
import com.lingyun.framework.domain.Oauth;
import com.lingyun.manager_cms.service.cmsservice.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController implements OauthhControllerApi{
    @Autowired
    private OauthService oauthService;

    @Override
    public Oauth queryoauth(Integer id) {
        return oauthService.queryoauth(id);
    }

    @Override
    public void updateoauth(Oauth oauth) {
         oauthService.updateoauth(oauth);
    }
}
