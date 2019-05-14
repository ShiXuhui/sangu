package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.MaliqueueControllerApi;
import com.lingyun.manager_cms.service.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mailqueue")
public class MailqueueController implements MaliqueueControllerApi{

    @Autowired
    private MailqueueService mailqueueService;
}
