package com.lingyun.api.cmsapi;


import com.lingyun.framework.domain.Oauth;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "计划任务接口", description = "计划任务接口，提供任务的增、删、改、查")
public interface OauthhControllerApi {

    @RequestMapping("queryoauth")
    Oauth queryoauth(Integer id);

    @RequestMapping("updateoauth")
    void updateoauth(Oauth oauth);
}
