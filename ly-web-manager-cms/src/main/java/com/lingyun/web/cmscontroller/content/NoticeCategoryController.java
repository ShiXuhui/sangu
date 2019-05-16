package com.lingyun.web.cmscontroller.content;

import com.lingyun.framework.domain.content.NoticeCategory;
import com.lingyun.service.cmsservice.content.NoticeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("noticeCategory")
public class NoticeCategoryController {

    @Autowired
    private NoticeCategoryService noticeCategoryService;

    /**
     * 查询内容分类列表
     */
    @RequestMapping("/findNoticeCategoryAll")
    @ResponseBody
    public List<NoticeCategory> findNoticeCategoryAll(){
        return noticeCategoryService.findNoticeCategoryAll();
    }


    /**
     * 添加内容分类
     */
    @RequestMapping("/saveNoticeCategory")
    public void saveNoticeCategory(NoticeCategory noticeCategory){
        noticeCategoryService.saveNoticeCategory(noticeCategory);
    }

    /**
     * 根据id查询某个分类
     */
    @RequestMapping("/findNoticeCategoryById")
    public NoticeCategory findNoticeCategoryById(Short id){
        return noticeCategoryService.findNoticeCategoryById(id);
    }

    /**
     * 根据id删除指定分类
     */
    @RequestMapping("/deleteNoticeCategory")
    public void deleteNoticeCategory(Short id){
        noticeCategoryService.deleteNoticeCategory(id);
    }

    /**
     * 批量删除内容分类
     */
    @RequestMapping("/deleteNoticeCategorys")
    void deleteNoticeCategorys(String ids){
        noticeCategoryService.deleteNoticeCategorys(ids);
    }
}
