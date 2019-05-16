package com.lingyun.web.cmscontroller;

import com.lingyun.framework.utils.CompactAlgorithm;
import com.lingyun.service.cmsservice.TplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@Controller
@RequestMapping("/tpl")
public class TplController {
    @Autowired
    private TplService tplService;
    @RequestMapping("/ZipOutputStreamDemo01")
    public String ZipOutputStreamDemo01(){
        File f = new File("G:/Users/lenovo/IdeaProjecs/sangu/ly-web-manager-cms/src/main/resources/templates/web");
        new CompactAlgorithm(new File( "D:/Users","风格模板备份"+".zip")).zipFiles(f);
        return "cms/tool/submit1";
    }
}
