package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.MaliqueueControllerApi;
import com.lingyun.framework.domain.Mailqueue;
import com.lingyun.manager_cms.service.cmsservice.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MailqueueController implements MaliqueueControllerApi{

    @Autowired
    private MailqueueService mailqueueService;

    @Override
    public List<Mailqueue> querymailqueue(Mailqueue mailqueue) {
        return mailqueueService.querymailqueue(mailqueue);
    }

    @Override
    public List<Mailqueue> delmailqueue(String ids) {
        return mailqueueService.delmailqueue(ids);
    }

    @Override
    public List<Mailqueue> showmailqueue(String ids) {
        return mailqueueService.showmailqueue(ids);
    }

    @Override
    public Mailqueue showmailqueueid(Integer integer) {
        return mailqueueService.showmailqueueid(integer);
    }

    @Override
    public void addmailqueue(Mailqueue mailqueue) {
        mailqueueService.addmailqueue(mailqueue);
    }

    @Override
    public void updatemailqueue(Mailqueue mailqueue) {
        mailqueueService.updatemailqueue(mailqueue);
    }
}
