package com.lingyun.api.cmsapi.content;

import com.lingyun.framework.domain.content.Zhss;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Api(description="系统日志" )
public interface ZhssApi {
    /**
     * 查询系统日志
     */
    @RequestMapping("zhssList")
    List<Zhss>  zhssList(@RequestBody Zhss zhss);
    @RequestMapping("deletezhss")
    void  deletezhss(@RequestBody  Integer id);


    @RequestMapping("/pldelete")
    void pldelete(@RequestParam("strid") String strid);
}
