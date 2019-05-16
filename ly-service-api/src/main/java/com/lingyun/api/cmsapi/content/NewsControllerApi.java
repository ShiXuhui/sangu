package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.News;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(description = "消息")
public interface NewsControllerApi {

    @RequestMapping("/queryNews")
    List<News> queryNews(News news);

    @RequestMapping("/findNewsById")
    News findNewsById(Integer id);

    @RequestMapping("/deleteNewss")
    void deleteNewss(String ids);

    @RequestMapping("/saveNews")
    void saveNews(News news);

    @RequestMapping("/deleteNews")
    void deleteNews(Integer id);
}
