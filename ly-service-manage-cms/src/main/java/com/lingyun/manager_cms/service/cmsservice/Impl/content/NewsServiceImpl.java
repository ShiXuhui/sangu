package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.News;
import com.lingyun.manager_cms.dao.cmsdao.content.NewsMapper;
import com.lingyun.manager_cms.service.cmsservice.content.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> queryNews(News news) {
        return newsMapper.queryNews(news);
    }

    @Override
    public void deleteNews(Integer id) {
        newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveNews(News news) {
        newsMapper.insert(news);
    }

    @Override
    public void deleteNewss(String ids) {
        newsMapper.deleteNewss(ids);
    }

    @Override
    public News findById(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
