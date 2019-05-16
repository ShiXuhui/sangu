package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.OauthhControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface OauthService extends OauthhControllerApi{
}
