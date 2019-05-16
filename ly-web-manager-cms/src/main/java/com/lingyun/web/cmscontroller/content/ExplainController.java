package com.lingyun.web.cmscontroller.content;

import java.util.List;
import java.util.Map;

import com.lingyun.framework.domain.content.Explain;
import com.lingyun.service.cmsservice.content.ExplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explain")
public class ExplainController {

    @Autowired
    private ExplainService explainService;

    /**
     * 说明页列表查询
     * @param explain
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findExplainAll")
    public Map<String,Object> findExplainAll(Explain explain,
                                              @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                              @RequestParam(value = "pageSize",defaultValue = "2")Integer pageSize){
        return explainService.findExplainAll(explain,pageNum,pageSize);
    }

    /**
     * 单个说明查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Explain findById(Integer id){
        return explainService.findById(id);
    }

    /**
     * 删除单个说明
     * @param id
     */
    @RequestMapping("/deleteById")
    public void deleteById(Integer id){
        explainService.deleteById(id);
    }

    /**
     * 添加单个说明
     * @param explain
     */
    @RequestMapping("/saveExplain")
    public void saveExplain(Explain explain){
        explainService.saveExplain(explain);
    }

    /**
     * 批量删除说明页
     */
    @RequestMapping("/deleteExplains")
    public void deleteExplains(String ids){
        explainService.deleteExplains(ids);
    }
}
