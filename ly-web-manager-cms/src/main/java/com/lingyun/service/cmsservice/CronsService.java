package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.CronsControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface CronsService extends CronsControllerApi{
}
