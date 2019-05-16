package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.ExplainCategory;

import java.util.List;

public interface ExplainCategoryService {
    List<ExplainCategory> findAll();

    void saveExplainCategory(ExplainCategory explainCategory);

    void deleteExplainCategory(Integer id);

    void deleteExplainCategorys(String ids);

    ExplainCategory findById(Integer id);
}
