package com.lingyun.manager_cms.dao.cmsdao;


import com.lingyun.framework.domain.Crons;

import java.util.List;

public interface CronsMapper {
    int deleteByPrimaryKey(Short cronid);

    int insert(Crons record);

    int insertSelective(Crons record);

    Crons selectByPrimaryKey(Short cronid);

    int updateByPrimaryKeySelective(Crons record);

    int updateByPrimaryKey(Crons record);

    List<Crons> query();
}