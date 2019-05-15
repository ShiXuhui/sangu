package com.lingyun.service.wbeservice;

import com.lingyun.api.webapi.JobContorllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface JobService extends JobContorllerApi {
}
