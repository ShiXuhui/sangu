package com.lingyun.service.cmsservice.content;

import com.lingyun.api.cmsapi.content.NoticeControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ly-service-manage-cms")
public interface NoticeService extends NoticeControllerApi{
}
