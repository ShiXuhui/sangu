package com.lingyun.manager_cms.dao.cmsdao.content;

import com.lingyun.framework.domain.content.NoticeCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeCategoryMapper {
    int deleteByPrimaryKey(Short id);

    int insert(NoticeCategory record);

    int insertSelective(NoticeCategory record);

    NoticeCategory selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(NoticeCategory record);

    int updateByPrimaryKey(NoticeCategory record);

    List<NoticeCategory> findNoticeCategoryAll();

    void deleteNoticeCategorys(@Param("ids") String ids);
}