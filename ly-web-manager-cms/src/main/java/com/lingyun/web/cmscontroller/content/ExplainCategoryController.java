package com.lingyun.web.cmscontroller.content;

import java.util.List;
import com.lingyun.framework.domain.content.ExplainCategory;
import com.lingyun.service.cmsservice.content.ExplainCategoryService;
import com.lingyun.service.cmsservice.content.ExplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/explainCategory")
public class ExplainCategoryController {
    @Autowired
    private ExplainCategoryService explainCategoryService;


    @RequestMapping("/findExplainCategoryAll")
    public List<ExplainCategory> findExplainCategoryAll(){
        return explainCategoryService.findExplainCategoryAll();
    }

    @RequestMapping("/saveExplainCategory")
    public void saveExplainCategory(ExplainCategory explainCategory){
        explainCategoryService.saveExplainCategory(explainCategory);
    }

    @RequestMapping("/deleteExplainCategory")
    public void deleteExplainCategory(Integer id){
        explainCategoryService.deleteExplainCategory(id);
    }

    @RequestMapping("/deleteExplainCategorys")
    public void deleteExplainCategorys(String ids){
        explainCategoryService.deleteExplainCategorys(ids);
    }

    @RequestMapping("findExplainCategoryById")
    public ExplainCategory findExplainCategoryById(Integer id){
        return explainCategoryService.findExplainCategoryById(id);
    }
}
