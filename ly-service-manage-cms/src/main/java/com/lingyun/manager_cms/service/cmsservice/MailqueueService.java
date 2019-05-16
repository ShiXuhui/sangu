package com.lingyun.manager_cms.service.cmsservice;

import com.lingyun.framework.domain.Mailqueue;

import java.util.List;

public interface MailqueueService {
    List<Mailqueue> querymailqueue(Mailqueue mailqueue);

    List<Mailqueue> delmailqueue(String ids);

    List<Mailqueue> showmailqueue(String ids);

    Mailqueue showmailqueueid(Integer integer);

    void addmailqueue(Mailqueue mailqueue);

    void updatemailqueue(Mailqueue mailqueue);
}
