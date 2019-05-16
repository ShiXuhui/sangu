package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.ExplainCategory;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(description = "说明页分类")
@RequestMapping("/ExplainCategory")
public interface ExplainCategoryControllerApi {

    @RequestMapping("/findExplainCategoryAll")
    List<ExplainCategory> findExplainCategoryAll();

    @RequestMapping("/saveExplainCategory")
    void saveExplainCategory(ExplainCategory explainCategory);

    @RequestMapping("/deleteExplainCategory")
    void deleteExplainCategory(Integer id);

    @RequestMapping("/deleteExplainCategorys")
    void deleteExplainCategorys(String ids);

    @RequestMapping("/findExplainCategoryById")
    ExplainCategory findExplainCategoryById(Integer id);
}
