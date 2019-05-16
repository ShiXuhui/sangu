package com.lingyun.web.cmscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/tool")
public class ToolController {

    /**
     * 清除缓存
     * @return
     */
    @RequestMapping("clearcache")
    public String clearcache(){
        return  "cms/tool/clearcache";
    }

    /**
     * 计划任务
     * @return
     */
    @RequestMapping("crons")
    public String crons(){
        return  "cms/tool/crons";
    }

    /**
     * 添加计划任务
     * @return
     */
    @RequestMapping("cronsadd")
    public String cronsadd(){
        return  "cms/tool/cronsadd";
    }

    /**
     * 支付方式
     * @return
     */
    @RequestMapping("payment")
    public String payment(){
        return  "cms/tool/payment";
    }

    /**
     * 修改支付方式
     * @return
     */
    @RequestMapping("paymentUpdate")
    public String paymentUpdate(){
        return  "cms/tool/paymentUpdate";
    }


    /**
     *合作账号
     * @return
     */
    @RequestMapping("oauth")
    public String oauth(){
        return  "cms/tool/oauth";
    }
    @RequestMapping("oauth1")
    public String oauth1(){
        return  "cms/tool/oauth1";
    }
    @RequestMapping("oauth2")
    public String oauth2(){
        return  "cms/tool/oauth2";
    }
    @RequestMapping("oauth3")
    public String oauth3(){
        return  "cms/tool/oauth3";
    }

    /**
     * 风格模板
     * @return
     */
    @RequestMapping("tpl")
    public String tpl(){
        return  "cms/tool/tpl";
    }

    @RequestMapping("tpl1")
    public String tpl1(){
        return  "cms/tool/tpl1";
    }

    @RequestMapping("tpl2")
    public String tpl2(){
        return  "cms/tool/tpl2";
    }

    /**
     * 清除缓存后的跳转页面
     * @return
     */
    @RequestMapping("submit")
    public String submit(){
        return  "cms/tool/submit";
    }


    /**
     * 工具的树
     * @return
     */
    @RequestMapping("left")
    public String left(){
        return  "cms/tool/left";
    }
}
