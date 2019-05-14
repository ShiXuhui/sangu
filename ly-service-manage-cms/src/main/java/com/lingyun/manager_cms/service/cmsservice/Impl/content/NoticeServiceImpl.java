package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import java.util.List;
import com.lingyun.framework.domain.content.Notice;
import com.lingyun.manager_cms.dao.cmsdao.content.NoticeMapper;
import com.lingyun.manager_cms.service.cmsservice.content.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> querynotice(Notice notice){
        return noticeMapper.querynotice(notice);
    }

    @Override
    public void deleteNotices(String ids) {
        noticeMapper.deleteNotices(ids);
    }

    @Override
    public void saveNotice(Notice notice) {
        if (notice.getId()!=null){
            noticeMapper.updateByPrimaryKey(notice);
        }else {
            noticeMapper.insert(notice);
        }
    }

    @Override
    public void deleteNotice(Integer id) {
        noticeMapper.deleteByPrimaryKey(id);
    }


}
