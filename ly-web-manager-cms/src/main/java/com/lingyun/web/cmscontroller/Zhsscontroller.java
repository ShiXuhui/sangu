package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.content.Zhss;
import com.lingyun.service.cmsservice.ZhssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/zhss")
@Controller
public class Zhsscontroller {
    @Autowired
    private ZhssService zhssService;

    @RequestMapping("/zhssList")
    @ResponseBody
    public List<Zhss> zhssList(Zhss zhss){
         return zhssService.zhssList(zhss);

    }
    @RequestMapping("deletezhss")
    @ResponseBody
    public void deletezhss(Integer id){
        zhssService.deletezhss(id);

    }

    @RequestMapping("/tiaoleft")
    public String tiaoleft(){
        return "cms/neirong/left";

    }


    @RequestMapping("/tiaocenter")
    public String tiaocenter(){
        return "cms/neirong/center";

    }

    @RequestMapping("/tiaoshow")
    public String tiaoshow(){
        return "cms/neirong/show";

    }

    @RequestMapping("/toquerymem")
    public String toquerymem() {
        return "cms/neirong/center";

    }

    @RequestMapping("/pldelete")
    @ResponseBody
    public void pldelete(String strid){
        zhssService.pldelete(strid);
    }

}
