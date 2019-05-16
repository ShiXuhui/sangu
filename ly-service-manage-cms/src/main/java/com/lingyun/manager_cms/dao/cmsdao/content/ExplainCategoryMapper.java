package com.lingyun.manager_cms.dao.cmsdao.content;

import com.lingyun.framework.domain.content.ExplainCategory;

import java.util.List;

public interface ExplainCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExplainCategory record);

    int insertSelective(ExplainCategory record);

    ExplainCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExplainCategory record);

    int updateByPrimaryKey(ExplainCategory record);

    List<ExplainCategory> findAll();

    void deleteExplainCategorys(String ids);
}