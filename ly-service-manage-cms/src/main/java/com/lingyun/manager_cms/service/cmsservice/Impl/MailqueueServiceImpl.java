package com.lingyun.manager_cms.service.cmsservice.Impl;

import com.lingyun.framework.domain.Mailqueue;
import com.lingyun.manager_cms.dao.cmsdao.MailqueueMapper;
import com.lingyun.manager_cms.service.cmsservice.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailqueueServiceImpl implements MailqueueService {
    @Autowired
    private MailqueueMapper mailqueueMapper;

    @Override
    public List<Mailqueue> querymailqueue(Mailqueue mailqueue) {
        return mailqueueMapper.querymailqueue(mailqueue);
    }

    @Override
    public List<Mailqueue> delmailqueue(String ids) {
        return mailqueueMapper.querymailqueueplcx(ids);
    }

    @Override
    public List<Mailqueue> showmailqueue(String ids) {
        return mailqueueMapper.querymailqueueplcx(ids);
    }

    @Override
    public Mailqueue showmailqueueid(Integer integer) {
        return mailqueueMapper.selectByPrimaryKey(integer);
    }

    @Override
    public void addmailqueue(Mailqueue mailqueue) {
        mailqueueMapper.insertSelective(mailqueue);
    }

    @Override
    public void updatemailqueue(Mailqueue mailqueue) {
        mailqueueMapper.updateByPrimaryKeySelective(mailqueue);
    }
}
