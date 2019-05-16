package com.lingyun.manager_cms.dao.cmsdao.content;

import com.lingyun.framework.domain.content.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer spmid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer spmid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> queryNews(News news);

    void deleteNewss(@Param("ids") String ids);
}