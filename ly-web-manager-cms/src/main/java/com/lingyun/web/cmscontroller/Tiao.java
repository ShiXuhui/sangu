package com.lingyun.web.cmscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiao {

    @RequestMapping("tiaoshow")
    public String tiaoshow(){
        return "cms/show";
    }
    @RequestMapping("tiaoleft")
    public String tiaoleft(){
        return "cms/left";
    }
    @RequestMapping("tiaotop")
    public String tiaotop(){
        return "cms/top";
    }
    @RequestMapping("tiaocenter")
    public String tiaocenter(){
        return "cms/center";
    }
}
