package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.Mailqueue;
import com.lingyun.service.cmsservice.MailqueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mailqueue")
public class MailqueueController {

    @Autowired
    private MailqueueService mailqueueService;

    /**
     * 条件查询
     * @param mailqueue
     * @return
     */
    @RequestMapping("querymailqueue")
    public List<Mailqueue> querymailqueue(Mailqueue mailqueue){

        return  mailqueueService.querymailqueue(mailqueue);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("delmailqueue")
    public List<Mailqueue> delmailqueue(String ids){

        return  mailqueueService.delmailqueue(ids);
    }

    /**
     * 根据id查询返回结果集
     * @param ids
     * @return
     */
    @RequestMapping("showmailqueue")
    public List<Mailqueue> showmailqueue(String ids){

        return  mailqueueService.showmailqueue(ids);
    }

    /**
     * 修改根据id查询
     * @param mailqueue
     * @return
     */
    @RequestMapping("showmailqueueid")
    public String showmailqueueid(Mailqueue mailqueue){
        Mailqueue m = mailqueueService.showmailqueueid(mailqueue.getmId());
        return  "";
    }

    /**
     * 修改
     * @param mailqueue
     */
    @RequestMapping("updatemailqueue")
    public void updatemailqueue(Mailqueue mailqueue){

        mailqueueService.updatemailqueue(mailqueue);
    }

    /**
     * 添加
     * @param mailqueue
     */
    @RequestMapping("addmailqueue")
    public void addmailqueue(Mailqueue mailqueue){

        mailqueueService.addmailqueue(mailqueue);
    }


}
