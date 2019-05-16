package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.Hrtools;

import java.util.List;

public interface HrtolsService {
    List<Hrtools> Hrtoolslist(Hrtools hrtools);

    void deletehelp(Integer hId);
}
