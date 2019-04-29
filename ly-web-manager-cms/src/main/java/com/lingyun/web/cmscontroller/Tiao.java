package com.lingyun.web.cmscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiao {
    /**
     * 跳转到后台群管理页面首页
     * @return
     */
    @RequestMapping("tiaoshow")
    public String tiaoshow(){
        return "cms/show";
    }

    /**
     * 加载后台管理页面左侧
     * @return
     */

    @RequestMapping("tiaoleft")
    public String tiaoleft(){
        return "cms/left";
    }

    /**
     * 加载后台管理页面上部
     * @return
     */
    @RequestMapping("tiaotop")
    public String tiaotop(){
        return "cms/top";
    }

    /**
     * 加载后台管理页面中部
     * @return
     */
    @RequestMapping("tiaocenter")
    public String tiaocenter(){
        return "cms/center";
    }

    /**
     * 跳转到内容管理页面
     * @return
     */
    @RequestMapping("tiaocontent")
    public String tiaocontent(){
        return "cms/content/show";
    }

    /**
     * 加载内容管理中部
     * @return
     */
    @RequestMapping("tiaocontentcenter")
    public String tiaocontentcenter(){
        return "cms/content/center";
    }

    /**
     * 加载内容管理左部
     * @return
     */
    @RequestMapping("tiaocontentleft")
    public String tiaocontentleft(){
        return "cms/content/left";
    }

    /**
     * 加载内容管理上部
     * @return
     */
    @RequestMapping("tiaocontenttop")
    public String tiaocontenttop(){
        return "cms/content/top";
    }

}
