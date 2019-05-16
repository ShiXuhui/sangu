package com.lingyun.manager_cms.service.cmsservice;

import com.lingyun.framework.domain.Payment;

import java.util.List;

public interface PaymentService {
    void updatepayment(Payment payment);

    Payment querypaymentId(Integer id);

    List<Payment> querypayment();
}
