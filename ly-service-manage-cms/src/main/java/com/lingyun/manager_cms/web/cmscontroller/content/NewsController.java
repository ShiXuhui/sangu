package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.NewsControllerApi;
import com.lingyun.framework.domain.content.News;
import com.lingyun.manager_cms.service.cmsservice.content.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class NewsController implements NewsControllerApi{

    @Autowired
    private NewsService newsService;

    @Override
    public List<News> queryNews(News news) {
        return newsService.queryNews(news);
    }

    @Override
    public News findNewsById(Integer id) {
        return newsService.findById(id);
    }

    @Override
    public void deleteNewss(String ids) {
        newsService.deleteNewss(ids);
    }

    @Override
    public void saveNews(News news) {
        newsService.saveNews(news);
    }

    @Override
    public void deleteNews(Integer id) {
        newsService.deleteNews(id);
    }
}
