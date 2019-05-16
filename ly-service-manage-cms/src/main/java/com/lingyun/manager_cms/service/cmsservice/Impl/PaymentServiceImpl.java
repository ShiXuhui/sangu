package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.framework.domain.Payment;
import com.lingyun.manager_cms.dao.cmsdao.PaymentMapper;
import com.lingyun.manager_cms.service.cmsservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public void updatepayment(Payment payment) {
        paymentMapper.updateByPrimaryKey(payment);
    }

    @Override
    public Payment querypaymentId(Integer id) {
        return paymentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Payment> querypayment() {
        return paymentMapper.querypayment();
    }
}
