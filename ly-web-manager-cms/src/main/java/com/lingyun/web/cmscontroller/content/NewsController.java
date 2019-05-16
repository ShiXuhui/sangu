package com.lingyun.web.cmscontroller.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.lingyun.framework.domain.content.News;
import com.lingyun.framework.domain.content.Notice;
import com.lingyun.service.cmsservice.content.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @ResponseBody
    @RequestMapping("/queryNews")
    public List<News> queryNews(News news){
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        List<News> list = newsService.queryNews(news);

        for (int i =0;i<list.size();i++){
            date.setTime(list.get(i).getDateline());
            list.get(i).setDatelineto(sdf.format(date));
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/findById")
    public News findById(Integer id){
        return newsService.findNewsById(id);
    }

    /**
     * 批量删除消息 1
     *
     * @param ids
     */
    @RequestMapping("/deleteNewss")
    public void deleteNewss(String ids){
        newsService.deleteNewss(ids);
    }

    /**
     * 新增或修改消息 1
     * @param
     */
    @RequestMapping("/saveNews")
    public void saveNews(News news){
        newsService.saveNews(news);
    }
    /**
     * 删除单个消息 1
     */
    @RequestMapping("/deleteNews")
    public void deleteNews(Integer id){
        newsService.deleteNews(id);
    }
}
