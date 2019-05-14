package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.manager_cms.dao.cmsdao.MailqueueMapper;
import com.lingyun.manager_cms.service.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailqueueServiceImpl implements MailqueueService {
    @Autowired
    private MailqueueMapper mailqueueMapper;
}
