package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.ExplainCategoryControllerApi;
import com.lingyun.api.cmsapi.content.ExplainControllerApi;
import com.lingyun.framework.domain.content.ExplainCategory;
import com.lingyun.manager_cms.service.cmsservice.content.ExplainCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExplainCategoryController implements ExplainCategoryControllerApi{
        @Autowired
        private ExplainCategoryService explainCategoryService;

    @Override
    public List<ExplainCategory> findExplainCategoryAll() {
        return explainCategoryService.findAll();
    }

    @Override
    public void saveExplainCategory(ExplainCategory explainCategory) {
            explainCategoryService.saveExplainCategory(explainCategory);
    }

    @Override
    public void deleteExplainCategory(Integer id) {
            explainCategoryService.deleteExplainCategory(id);
    }

    @Override
    public void deleteExplainCategorys(String ids) {
            explainCategoryService.deleteExplainCategorys(ids);
    }

    @Override
    public ExplainCategory findExplainCategoryById(Integer id) {
        return explainCategoryService.findById(id);
    }
}
