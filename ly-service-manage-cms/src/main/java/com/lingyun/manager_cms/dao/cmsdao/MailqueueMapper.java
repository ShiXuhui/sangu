package com.lingyun.manager_cms.dao.cmsdao;

import com.lingyun.framework.domain.Mailqueue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MailqueueMapper {
    int deleteByPrimaryKey(Integer mId);

    int deleteByPrimaryKeyplsc(@Param("ids") String ids);

    int insert(Mailqueue record);

    int insertSelective(Mailqueue record);

    Mailqueue selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Mailqueue record);

    int updateByPrimaryKeyWithBLOBs(Mailqueue record);

    int updateByPrimaryKey(Mailqueue record);

    List<Mailqueue> querymailqueue(Mailqueue mailqueue);

    List<Mailqueue> querymailqueueplcx(@Param("ids") String ids);
}