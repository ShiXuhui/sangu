package com.lingyun.manager_cms.dao.cmsdao;


import com.lingyun.framework.domain.Tpl;

public interface TplMapper {
    int deleteByPrimaryKey(Integer tplId);

    int insert(Tpl record);

    int insertSelective(Tpl record);

    Tpl selectByPrimaryKey(Integer tplId);

    int updateByPrimaryKeySelective(Tpl record);

    int updateByPrimaryKey(Tpl record);
}