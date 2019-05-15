package com.lingyun.api.cmsapi;

import com.lingyun.framework.domain.Mailqueue;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "计划任务接口", description = "计划任务接口，提供任务的增、删、改、查")
public interface MaliqueueControllerApi {
    @RequestMapping("querymailqueue")
    List<Mailqueue> querymailqueue(@RequestBody Mailqueue mailqueue);

    @RequestMapping("delmailqueue")
    List<Mailqueue> delmailqueue(@RequestParam("ids") String ids);

    @RequestMapping("showmailqueue")
    List<Mailqueue> showmailqueue(@RequestParam("ids") String ids);

    @RequestMapping("showmailqueueid")
    Mailqueue showmailqueueid(@RequestParam Integer integer);

    @RequestMapping("addmailqueue")
    void addmailqueue(@RequestBody Mailqueue mailqueue);

    @RequestMapping("updatemailqueue")
    void updatemailqueue(@RequestBody Mailqueue mailqueue);
}
