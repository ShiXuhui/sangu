package com.lingyun.manager_cms.dao.cmsdao.content;

import java.util.List;
import com.lingyun.framework.domain.content.Notice;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> querynotice(Notice notice);

    void deleteNotices(@Param("ids") String ids);

}