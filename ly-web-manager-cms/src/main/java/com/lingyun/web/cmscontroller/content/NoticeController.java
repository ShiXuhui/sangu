package com.lingyun.web.cmscontroller.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.lingyun.framework.domain.content.Notice;
import com.lingyun.service.cmsservice.content.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 查询公告列表 1
     *
     * @return
     */
    @RequestMapping("/queryNotice")
    public List<Notice> queryNotice(Notice notice){
        return noticeService.queryNotice(notice);
    }

    /**
     * 批量删除公告 1
     *
     * @param ids
     */
    @RequestMapping("/deleteNotices")
    public void deleteNotices(String ids){
        noticeService.deleteNotices(ids);
    }

    /**
     * 查询指定id公告
     */
    @RequestMapping("/findNoticeById")
    public Notice findNoticeById(Integer id){
       return   noticeService.findNoticeById(id);
    }
    /**
     * 新增或修改公告 1
     * @param notice
     */
     @RequestMapping("/saveNotice")
    public void saveNotice(Notice notice){
         noticeService.saveNotice(notice);
     }
    /**
     * 删除单个公告 1
     */
    @RequestMapping("/deleteNotice")
    public void deleteNotice(Integer id){
        noticeService.deleteNotice(id);
    }
}
