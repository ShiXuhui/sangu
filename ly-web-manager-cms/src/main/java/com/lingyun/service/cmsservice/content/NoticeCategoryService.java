package com.lingyun.service.cmsservice.content;

import com.lingyun.api.cmsapi.content.NoticeCategoryControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ly-service-manage-cms")
public interface NoticeCategoryService extends NoticeCategoryControllerApi{
}
