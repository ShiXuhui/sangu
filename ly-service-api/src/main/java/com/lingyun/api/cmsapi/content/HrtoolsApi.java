package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.Hrtools;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "HR工具箱")
public interface HrtoolsApi {
    @RequestMapping("Hrtoolslist")
    List<Hrtools> Hrtoolslist(@RequestBody Hrtools hrtools);
    @RequestMapping("Hrtoolsdelet")
    void deletehelp(@RequestBody  Integer hId);
}
