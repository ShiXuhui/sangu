package com.lingyun.web.cmscontroller;

import com.lingyun.service.cmsservice.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("oauth")
public class OauthController {
    @Autowired
    private OauthService oauthService;
}
