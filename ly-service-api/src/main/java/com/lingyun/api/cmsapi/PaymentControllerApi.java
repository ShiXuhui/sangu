package com.lingyun.api.cmsapi;

import com.lingyun.framework.domain.Payment;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "计划任务接口", description = "计划任务接口，提供任务的增、删、改、查")
public interface PaymentControllerApi {
    @RequestMapping("/querypayment")
    List<Payment> querypayment();

    @RequestMapping("/querypaymentId")
    Payment querypaymentId(Integer id);

    @RequestMapping("/updatepayment")
    void updatepayment(@RequestBody Payment payment);
}
