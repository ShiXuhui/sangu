package com.lingyun.manager_cms.dao.cmsdao;


import com.lingyun.framework.domain.Oauth;

public interface OauthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oauth record);

    int insertSelective(Oauth record);

    Oauth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oauth record);

    int updateByPrimaryKey(Oauth record);
}