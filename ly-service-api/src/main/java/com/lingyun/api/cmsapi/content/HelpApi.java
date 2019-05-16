package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.Help;
import io.swagger.annotations.Api;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "帮助中心")
public interface HelpApi {
    @RequestMapping("helpList")
    List<Help> helpList(@RequestBody  Help help);

    @RequestMapping("deletehelp")
    void  deletehelp (@RequestBody Integer id);

    @RequestMapping("addhelp")
    void   addhelp(@RequestBody Help help);
    /**
     * 修改1
     */
    @RequestMapping("selecthelp")
    Help selecthelp(@RequestBody  Integer id);
    /**
     * 修改2
     */
    @RequestMapping("updatehelp")
    void  updatehelp (@RequestBody  Help help);

}
