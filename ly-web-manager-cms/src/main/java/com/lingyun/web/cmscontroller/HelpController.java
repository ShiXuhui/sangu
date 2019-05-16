package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.content.Help;
import com.lingyun.service.cmsservice.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@RequestMapping("/Help")
@Controller

public class HelpController {
    @Autowired
    public HelpService helpService;

    @RequestMapping("/HelpList")
    @ResponseBody
    public List<Help> HelpList(Help help){
        return helpService.helpList(help);
    }

    @RequestMapping("/deleteHelp")
    @ResponseBody
    public void deleteHelp(Integer id){
        helpService.deletehelp(id);

    }
    @RequestMapping("addhelp")
    @ResponseBody
    public void addhelp(Help help){
        System.out.println(help.getTitle());
        helpService.addhelp(help);

    }
       /* @RequestMapping("selecthelp")
        @ResponseBody
        public Help selecthelp(Integer id){

            return helpService.selecthelp(id);
        }*/
       @RequestMapping("/tiaoupForm")
        public String tiaoupForm(Help help, Model model){
        Help help1 = helpService.selecthelp(help.getId());
        model.addAttribute("wenti",help1);
        return "cms/neirong/updatehelp";
    }



    @RequestMapping("updatehelp")
    @ResponseBody
    public void updatehelp(Help help){
        helpService.updatehelp(help);
    }


    @RequestMapping("/tohelplist")
    public String toquerymem() {
        return "cms/neirong/bangzhu";

    }
    @RequestMapping("/tiaoaddhelp")
    public String tiaoaddhelp() {
        return "cms/neirong/addhelp";

    }




}
