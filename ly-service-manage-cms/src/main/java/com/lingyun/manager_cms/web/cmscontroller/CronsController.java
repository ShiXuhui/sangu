package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.CronsControllerApi;
import com.lingyun.framework.domain.Crons;
import com.lingyun.manager_cms.service.cmsservice.CronsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("crons")
public class CronsController implements CronsControllerApi{
    @Autowired
    private CronsService cronsService;

    @Override
    public List<Crons> query() {
        return cronsService.query();
    }
}
