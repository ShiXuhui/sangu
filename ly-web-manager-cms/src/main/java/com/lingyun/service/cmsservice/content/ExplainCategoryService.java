package com.lingyun.service.cmsservice.content;

import com.lingyun.api.cmsapi.content.ExplainCategoryControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ly-service-manage-cms")
public interface ExplainCategoryService extends ExplainCategoryControllerApi {
}
