package com.lingyun.web.webcontroller.Resume;

import com.lingyun.service.wbeservice.Resume.Resume_listService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Resume_listController {

    @Autowired
    private Resume_listService resume_listService;
}
