package com.lingyun.manager_cms.service.cmsservice;

import com.lingyun.framework.domain.Crons;

import java.util.List;

public interface CronsService {
    List<Crons> query();

    List<Crons> querycrons(Crons crons);

    void addcrons(Crons crons);

    void delcrons(String ids);

    Crons querycronsid(Short cronid);

    void updatecrons(Crons crons);
}
