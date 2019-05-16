package com.lingyun.manager_cms.dao.cmsdao.content;


import com.lingyun.framework.domain.content.Zhss;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZhssMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zhss record);

    int insertSelective(Zhss record);

    Zhss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zhss record);

    int updateByPrimaryKey(Zhss record);
    List<Zhss> zhssList (Zhss zhss);

    void pldelete(@Param("strid") String strid);
}