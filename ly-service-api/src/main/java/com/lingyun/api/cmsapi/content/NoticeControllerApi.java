package com.lingyun.api.cmsapi.content;

import java.util.List;
import com.lingyun.framework.domain.content.Notice;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(description = "内容管理")
public interface NoticeControllerApi {

    /**
     * 查询公告列表
     *
     * @return
     */

    @RequestMapping("queryNotice")
    List<Notice> queryNotice(Notice notice);

    /**
     * 批量删除公告
     *
     * @param ids
     */
    @RequestMapping("deleteNotices")
    void deleteNotices(String ids);

    /**
     * 新增或修改公告
     * @param notice
     */
    @RequestMapping("saveNotice")
    void saveNotice(Notice notice);

    /**
     * 删除单个公告
     */
    @RequestMapping("deleteNotice")
    void deleteNotice(Integer id);

}
