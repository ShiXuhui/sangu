package com.lingyun.manager_cms.dao.cmsdao;

import com.lingyun.framework.domain.Mailqueue;

public interface MailqueueMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Mailqueue record);

    int insertSelective(Mailqueue record);

    Mailqueue selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Mailqueue record);

    int updateByPrimaryKeyWithBLOBs(Mailqueue record);

    int updateByPrimaryKey(Mailqueue record);
}