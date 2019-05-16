package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.TplControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface TplService extends TplControllerApi{
}
