package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.PaymentControllerApi;
import com.lingyun.framework.domain.Payment;
import com.lingyun.manager_cms.service.cmsservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController implements PaymentControllerApi{
    @Autowired
    private PaymentService paymentService;


    @Override
    public List<Payment> querypayment() {
        return paymentService.querypayment();
    }

    @Override
    public Payment querypaymentId(Integer id) {
        return paymentService.querypaymentId(id);
    }

    @Override
    public void updatepayment(Payment payment) {
        paymentService.updatepayment(payment);
    }
}
