package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.Help;
import org.springframework.ui.Model;

import java.util.List;

public interface HelpService {
    List<Help> helpList(Help help);
    void deletehelp(Integer id);
    void addhelp(Help help);
    void updatehelp(Help help);

    Help selecthelp(Integer id);
}
