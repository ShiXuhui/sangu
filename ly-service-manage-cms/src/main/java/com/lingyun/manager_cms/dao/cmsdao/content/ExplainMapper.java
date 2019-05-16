package com.lingyun.manager_cms.dao.cmsdao.content;

import com.lingyun.framework.domain.content.Explain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExplainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Explain record);

    int insertSelective(Explain record);

    Explain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Explain record);

    int updateByPrimaryKeyWithBLOBs(Explain record);

    int updateByPrimaryKey(Explain record);

    List<Explain> findExplainAll(@Param("explain") Explain explain, @Param("pageNum")Integer pageNum, @Param("pageSize")Integer pageSize);

    long querycount(Explain explain);

    void deleteExplains(String ids);
}