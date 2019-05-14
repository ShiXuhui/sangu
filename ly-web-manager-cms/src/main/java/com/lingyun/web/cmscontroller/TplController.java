package com.lingyun.web.cmscontroller;

import com.lingyun.service.cmsservice.TplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tpl")
public class TplController {
    @Autowired
    private TplService tplService;
}
