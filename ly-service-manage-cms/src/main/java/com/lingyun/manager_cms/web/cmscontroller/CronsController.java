package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.CronsControllerApi;
import com.lingyun.framework.domain.Crons;
import com.lingyun.manager_cms.service.cmsservice.CronsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CronsController implements CronsControllerApi{
    @Autowired
    private CronsService cronsService;

    @Override
    public List<Crons> querycrons(Crons crons) {
        return cronsService.querycrons(crons);
    }

    @Override
    public void addcrons(Crons crons) {
        cronsService.addcrons(crons);
    }

    @Override
    public void delcrons(String ids) {
        cronsService.delcrons(ids);
    }

    @Override
    public Crons querycronsid(Short cronid) {
        return cronsService.querycronsid(cronid);
    }

    @Override
    public void updatecrons(Crons crons) {
        cronsService.updatecrons(crons);
    }
}
