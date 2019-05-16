package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lingyun.framework.domain.content.Notice;
import com.lingyun.manager_cms.dao.cmsdao.content.NoticeMapper;
import com.lingyun.manager_cms.service.cmsservice.content.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    /*public List<Notice> querynotice(Notice notice){
        return noticeMapper.querynotice(notice);
    }*/

    @Override
    public List<Notice> querynotice(Notice notice) {
        Date date=new Date();
        /*long count=noticeMapper.querycount(notice);
        int start=(notice.getPageNum()-1)*notice.getPageSize();*/
        if(notice.getCratetime()!=null){
            if(notice.getCratetime()==1){
                notice.setCratetime(date.getTime()-3*24*60*60*1000);
            }else if (notice.getCratetime()==2){
                notice.setCratetime(date.getTime()-7*24*60*60*1000);
            }else if (notice.getCratetime()==3){
                notice.setCratetime(date.getTime()-30*24*60*60*1000);
            }else if (notice.getCratetime()==4){
                notice.setCratetime(date.getTime()-182*24*60*60*1000);
            }else if (notice.getCratetime()==5){
                notice.setCratetime(date.getTime()-365*24*60*60*1000);
            }
        }
        List<Notice> list=noticeMapper.querynotice(notice);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i=0;i<list.size();i++){
            date.setTime(list.get(i).getAddtime());
            list.get(i).setAddtimestr(sdf.format(date));
        }
        return list;
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

    @Override
    public Notice findNoticeById(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }


}
