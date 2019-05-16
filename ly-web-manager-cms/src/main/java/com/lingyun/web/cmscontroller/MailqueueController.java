package com.lingyun.web.cmscontroller;

import com.lingyun.service.cmsservice.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mailqueue")
public class MailqueueController {

    @Autowired
    private MailqueueService mailqueueService;
}
