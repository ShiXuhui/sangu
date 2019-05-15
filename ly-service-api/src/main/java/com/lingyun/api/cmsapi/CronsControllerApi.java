package com.lingyun.api.cmsapi;


import com.lingyun.framework.domain.Crons;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "计划任务接口", description = "计划任务接口，提供任务的增、删、改、查")
public interface CronsControllerApi {

    @RequestMapping("querycrons")
    List<Crons> querycrons(@RequestBody Crons crons);

    @RequestMapping("addcrons")
    void addcrons(@RequestBody Crons crons);

    @RequestMapping("delcrons")
    void delcrons(@RequestParam String ids);

    @RequestMapping("querycronsid")
    Crons querycronsid(@RequestParam Short cronid);

    @RequestMapping("updatecrons")
    void updatecrons(@RequestBody Crons crons);
}
