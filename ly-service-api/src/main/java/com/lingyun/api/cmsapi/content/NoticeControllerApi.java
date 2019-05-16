package com.lingyun.api.cmsapi.content;

import java.util.List;

import com.lingyun.framework.domain.content.Notice;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(description = "内容管理")
public interface NoticeControllerApi {

    /**
     * 查询公告列表 1
     *
     * @return
     */

    @RequestMapping("/queryNotice")
    List<Notice> queryNotice(@RequestBody Notice notice);

    /**
     * 批量删除公告 1
     *
     * @param ids
     */
    @RequestMapping("/deleteNotices")
    void deleteNotices(@RequestParam("ids") String ids);

    /**
     * 查询指定id公告
     */
    @RequestMapping("/findNoticeById")
    Notice findNoticeById(@RequestParam("id") Integer id);

    /**
     * 新增或修改公告 1
     * @param notice
     */
    @RequestMapping("/saveNotice")
    void saveNotice(Notice notice);

    /**
     * 删除单个公告 1
     */
    @RequestMapping("/deleteNotice")
    void deleteNotice(@RequestParam("id") Integer id);

}
