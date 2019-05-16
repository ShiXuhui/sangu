package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.Oauth;
import com.lingyun.service.cmsservice.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("oauth")
public class OauthController {
    @Autowired
    private OauthService oauthService;

    /**
     * 根据id查询
     */
    @RequestMapping("queryoauth")
    public Oauth queryoauth(Oauth oauth){
        return oauthService.queryoauth(oauth.getId());
    }
    /**
     * 修改
     */
    @RequestMapping("updateoauth")
    public void updateoauth(Oauth oauth){
        oauthService.updateoauth(oauth);
    }

}
