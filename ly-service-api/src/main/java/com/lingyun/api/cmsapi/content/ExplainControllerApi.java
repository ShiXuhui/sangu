package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.Explain;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Api(description = "说明页")
public interface ExplainControllerApi {

    @RequestMapping("findExplainAll")
    Map<String,Object> findExplainAll(@RequestBody(required = false) Explain explain,
                                       @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "2")Integer pageSize);

    @RequestMapping("/findById")
    Explain findById(Integer id);

    @RequestMapping("/deleteById")
    void deleteById(Integer id);

    @RequestMapping("/saveExplain")
    void saveExplain(Explain explain);

    @RequestMapping("/deleteExplains")
    void deleteExplains(String ids);
}
