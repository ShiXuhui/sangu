package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.ExplainCategory;
import com.lingyun.manager_cms.dao.cmsdao.content.ExplainCategoryMapper;
import com.lingyun.manager_cms.service.cmsservice.content.ExplainCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExplainCategoryServiceImpl implements ExplainCategoryService{
    @Autowired
    private ExplainCategoryMapper explainCategoryMapper;

    @Override
    public List<ExplainCategory> findAll() {
        return explainCategoryMapper.findAll();
    }

    @Override
    public void saveExplainCategory(ExplainCategory explainCategory) {
        explainCategoryMapper.insert(explainCategory);
    }

    @Override
    public void deleteExplainCategory(Integer id) {
        explainCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteExplainCategorys(String ids) {
        explainCategoryMapper.deleteExplainCategorys(ids);
    }

    @Override
    public ExplainCategory findById(Integer id) {
        return explainCategoryMapper.selectByPrimaryKey(id);
    }
}
