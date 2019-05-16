package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.Explain;

import java.util.List;
import java.util.Map;

public interface ExplainService {
    Map<String,Object> findExplainAll(Explain explain, Integer pageNum, Integer pageSize);

    Explain findById(Integer id);

    void deleteById(Integer id);

    void saveExplain(Explain explain);

    void deleteExplains(String ids);
}
