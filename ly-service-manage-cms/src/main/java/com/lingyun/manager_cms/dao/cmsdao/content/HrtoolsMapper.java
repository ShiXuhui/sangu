package com.lingyun.manager_cms.dao.cmsdao.content;


import com.lingyun.framework.domain.content.Hrtools;

import java.util.List;

public interface HrtoolsMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(Hrtools record);

    int insertSelective(Hrtools record);

    Hrtools selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(Hrtools record);

    int updateByPrimaryKey(Hrtools record);
    List<Hrtools> Hrtoolslist(Hrtools hrtools);
}