package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.content.HrtoolsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface HrtoolsService extends HrtoolsApi {
}
