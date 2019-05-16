package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.NoticeCategory;

import java.util.List;

public interface NoticeCategoryService {
    List<NoticeCategory> findNoticeCategoryAll();

    void saveNoticeCategory(NoticeCategory noticeCategory);

    NoticeCategory findNoticeCategoryById(Short id);

    void deleteNoticeCategory(Short id);

    void deleteNoticeCategorys(String ids);
}
