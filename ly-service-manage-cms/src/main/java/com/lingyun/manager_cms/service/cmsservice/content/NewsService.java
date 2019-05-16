package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.News;

import java.util.List;

public interface NewsService {
    List<News> queryNews(News news);

    void deleteNews(Integer id);

    void saveNews(News news);

    void deleteNewss(String ids);

    News findById(Integer id);
}
