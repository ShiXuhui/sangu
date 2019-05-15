package com.lingyun.web.cmscontroller;

import com.lingyun.framework.domain.Crons;
import com.lingyun.service.cmsservice.CronsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("crons")
public class CronsController {
    @Autowired
    private CronsService cronsService;

    /**
     * 添加查询
     * @param crons
     * @return
     */
    @RequestMapping("querycrons")
    public List<Crons> querycrons(Crons crons){
        return cronsService.querycrons(crons);
    }

    /**
     * 添加
     * @param crons
     * @return
     */
    @RequestMapping("addcrons")
    public void addcrons(Crons crons){
         cronsService.addcrons(crons);
    }

    /**
     *批量删除
     * @param ids
     * @return
     */
    @RequestMapping("delcrons")
    public void delcrons(String ids){
         cronsService.delcrons(ids);
    }

    /**
     * 根据id查询
     * @param crons
     */
    @RequestMapping("querycronsid")
    public void querycronsid(Crons crons){
        Crons c=cronsService.querycronsid(crons.getCronid());
    }

    /**
     * 修改
     * @param crons
     * @return
     */
    @RequestMapping("updatecrons")
    public void updatecrons(Crons crons){
         cronsService.updatecrons(crons);
    }
}
