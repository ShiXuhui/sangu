package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.OauthhControllerApi;
import com.lingyun.manager_cms.service.cmsservice.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("oauth")
public class OauthController implements OauthhControllerApi{
    @Autowired
    private OauthService oauthService;
}
