package com.lingyun.manager_cms.service.cmsservice.content;

import java.util.List;
import com.lingyun.framework.domain.content.Notice;

public interface NoticeService {

    List<Notice> querynotice(Notice notice);

    void deleteNotices(String ids);

    void saveNotice(Notice notice);

    void deleteNotice(Integer id);
}
