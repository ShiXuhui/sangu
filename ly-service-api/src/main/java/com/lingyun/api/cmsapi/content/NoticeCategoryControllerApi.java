package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.NoticeCategory;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@Api( description = "内容分类")
public interface NoticeCategoryControllerApi {

    /**
     * 查询内容分类列表
     */
    @RequestMapping("findNoticeCategoryAll")
    List<NoticeCategory> findNoticeCategoryAll();

    /**
     * 添加内容分类
     */
    @RequestMapping("saveNoticeCategory")
    void saveNoticeCategory(NoticeCategory noticeCategory);

    /**
     * 根据id查询某个分类
     */
    @RequestMapping("findNoticeCategoryById")
    NoticeCategory findNoticeCategoryById(Short id);

    /**
     * 根据id删除指定分类
     */
    @RequestMapping("deleteNoticeCategory")
    void deleteNoticeCategory(Short id);

    /**
     * 批量删除内容分类
     */
    @RequestMapping("deleteNoticeCategorys")
    void deleteNoticeCategorys(String ids);
}
