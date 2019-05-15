package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.manager_cms.dao.cmsdao.PaymentMapper;
import com.lingyun.manager_cms.service.cmsservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
}
