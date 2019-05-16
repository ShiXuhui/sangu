package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.HrtoolsApi;
import com.lingyun.framework.domain.content.Hrtools;
import com.lingyun.manager_cms.service.cmsservice.content.HrtolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HrtoolsConteroller implements HrtoolsApi{
    @Autowired
    private HrtolsService hrtolsService;
    @Override
    public List<Hrtools> Hrtoolslist(Hrtools hrtools) {
        return hrtolsService.Hrtoolslist(hrtools);
    }

    @Override
    public void deletehelp(Integer hId) {
        hrtolsService.deletehelp(hId);
    }
}
