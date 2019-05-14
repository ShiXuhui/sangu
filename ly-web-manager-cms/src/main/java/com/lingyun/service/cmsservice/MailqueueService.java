package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.MaliqueueControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface MailqueueService extends MaliqueueControllerApi {
}
