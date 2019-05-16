package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.ExplainControllerApi;
import com.lingyun.framework.domain.content.Explain;
import com.lingyun.manager_cms.service.cmsservice.content.ExplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ExplainController implements ExplainControllerApi{

    @Autowired
    private ExplainService explainService;

    @Override
    public Map<String,Object> findExplainAll(Explain explain, Integer pageNum, Integer pageSize) {
        return explainService.findExplainAll(explain,pageNum,pageSize);
    }

    @Override
    public Explain findById(Integer id) {
        return explainService.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        explainService.deleteById(id);
    }

    @Override
    public void saveExplain(Explain explain) {
        explainService.saveExplain(explain);
    }

    @Override
    public void deleteExplains(String ids) {
        explainService.deleteExplains(ids);
    }
}
