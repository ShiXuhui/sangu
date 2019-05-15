package com.lingyun.service.cmsservice;

import com.lingyun.api.cmsapi.PaymentControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface PaymentService extends PaymentControllerApi{
}
