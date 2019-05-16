package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.Explain;
import com.lingyun.framework.domain.content.Notice;
import com.lingyun.manager_cms.dao.cmsdao.content.ExplainMapper;
import com.lingyun.manager_cms.service.cmsservice.content.ExplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExplainServiceImpl implements ExplainService{

    @Autowired
    private ExplainMapper explainMapper;

    @Override
    public Map<String,Object> findExplainAll(Explain explain, Integer pageNum, Integer pageSize) {
        long count=explainMapper.querycount(explain);
        int start=(pageNum-1)*pageSize;
        List<Explain> explainlist=explainMapper.findExplainAll(explain,start,pageSize);
        Map<String , Object> map = new HashMap<>();
        map.put("page",count);
        map.put("rows",explainlist);
        return map;
    }

    @Override
    public Explain findById(Integer id) {
        return explainMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
        explainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveExplain(Explain explain) {
            explainMapper.insert(explain);
    }

    @Override
    public void deleteExplains(String ids) {
            explainMapper.deleteExplains(ids);
    }
}
