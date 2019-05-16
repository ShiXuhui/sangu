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

    @RequestMapping("query")
    public List<Crons> query(){
        return cronsService.query();
    }
}
