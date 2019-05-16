package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.HelpApi;
import com.lingyun.framework.domain.content.Help;
import com.lingyun.manager_cms.service.cmsservice.content.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelpConteroller implements HelpApi{
    @Autowired
    private HelpService helpService;
    @Override
    public List<Help> helpList(Help help) {
        return helpService.helpList(help);
    }

    @Override
    public void deletehelp(Integer id) {
        helpService.deletehelp(id);
    }

    @Override
    public void addhelp(Help help) {
        helpService.addhelp(help);
    }

    /**
     * 修改1
     *
     * @param id
     */
    @Override
    public Help selecthelp(Integer id) {
        return helpService.selecthelp(id);
    }
    /**
     * 修改2
     *
     * @param help
     */
    @Override
    public void updatehelp(Help help) {
     helpService.updatehelp(help);
    }
}
