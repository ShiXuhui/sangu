package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.Payment;
import com.lingyun.service.cmsservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("querypayment")
    public List<Payment> querypayment(){
        return paymentService.querypayment();
    }

    /**
     * 根据id查询
     * @param payment
     * @return
     */
    @RequestMapping("querypaymentId")
    public String querypaymentId(Payment payment){
        Payment p = paymentService.querypaymentId(payment.getId());
        return "";
    }
    @RequestMapping("updatepayment")
    public void updatepayment(Payment payment){
        paymentService.updatepayment(payment);
    }

}
