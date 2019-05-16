package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.Help;
import com.lingyun.manager_cms.dao.cmsdao.content.HelpMapper;
import com.lingyun.manager_cms.service.cmsservice.content.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class HelpServiceImpl implements HelpService{
    @Autowired
    private HelpMapper helpMapper;
    @Override
    public List<Help> helpList(Help help) {
        return helpMapper.helpList(help);
    }

    @Override
    public void deletehelp(Integer id) {
        helpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addhelp(Help help) {
        helpMapper.insert(help);
    }





    @Override
    public void updatehelp(Help help) {
        helpMapper.updateByPrimaryKey(help);
    }

    @Override
    public Help selecthelp(Integer id) {
        return helpMapper.selectByPrimaryKey(id);
    }


}
