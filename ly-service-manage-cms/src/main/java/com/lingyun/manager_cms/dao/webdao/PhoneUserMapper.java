package com.lingyun.manager_cms.dao.webdao;


import com.lingyun.framework.domain.PhoneUser;

public interface PhoneUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneUser record);

    int insertSelective(PhoneUser record);

    PhoneUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhoneUser record);

    int updateByPrimaryKey(PhoneUser record);
}