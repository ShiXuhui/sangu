package com.lingyun.service.cmsservice;


import com.lingyun.api.cmsapi.content.ZhssApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "ly-service-manage-cms")
public interface ZhssService extends ZhssApi {
}
