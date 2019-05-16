package com.lingyun.web.cmscontroller;

import com.lingyun.api.cmsapi.content.HrtoolsApi;
import com.lingyun.framework.domain.content.Hrtools;
import com.lingyun.service.cmsservice.HrtoolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@RequestMapping("/Hrtools")
@Controller
public class Hrtoolscontroller{
    @Autowired
    private HrtoolsService hrtoolsService;
    @RequestMapping("/HelpList")
    @ResponseBody
    public List<Hrtools> Hrtoolslist(Hrtools hrtools) {
        return hrtoolsService.Hrtoolslist(hrtools);
    }
    @RequestMapping("/toHelpList")
    public String toquerymem() {
        return "cms/neirong/hrtools";

    }
    @RequestMapping("deletehelp")
    @ResponseBody
    public void  deletehelp(Integer hId){
        hrtoolsService.deletehelp(hId);
    }
}
