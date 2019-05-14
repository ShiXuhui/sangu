package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.NoticeControllerApi;
import com.lingyun.framework.domain.content.Notice;
import com.lingyun.manager_cms.service.cmsservice.content.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController implements NoticeControllerApi{

    @Autowired
    public NoticeService noticeService;

    @Override
    public List<Notice> queryNotice(Notice notice) {
        return noticeService.querynotice(notice);
    }

    @Override
    public void deleteNotices(String ids) {
        noticeService.deleteNotices(ids);
    }

    @Override
    public void saveNotice(Notice notice) {
        noticeService.saveNotice(notice);
    }

    @Override
    public void deleteNotice(Integer id) {
        noticeService.deleteNotice(id);
    }

}
