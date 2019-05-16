package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.NoticeCategoryControllerApi;
import com.lingyun.framework.domain.content.NoticeCategory;
import com.lingyun.manager_cms.service.cmsservice.content.NoticeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeCategoryController implements NoticeCategoryControllerApi{
    @Autowired
    private NoticeCategoryService noticeCategoryService;

    @Override
    public List<NoticeCategory> findNoticeCategoryAll() {
        return noticeCategoryService.findNoticeCategoryAll();
    }

    @Override
    public void saveNoticeCategory(NoticeCategory noticeCategory) {
        noticeCategoryService.saveNoticeCategory(noticeCategory);
    }

    @Override
    public NoticeCategory findNoticeCategoryById(Short id) {
        return noticeCategoryService.findNoticeCategoryById(id);
    }

    @Override
    public void deleteNoticeCategory(Short id) {
        noticeCategoryService.deleteNoticeCategory(id);
    }

    @Override
    public void deleteNoticeCategorys(String ids) {
        noticeCategoryService.deleteNoticeCategorys(ids);
    }
}
