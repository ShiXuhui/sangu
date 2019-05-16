package com.lingyun.api.webapi;

import com.lingyun.framework.domain.District;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "找工作页面",description = "基础数据的查询展示")
public interface JobContorllerApi {
	final String API_PRE = "/job";

	/**
	 * 根据id查地区及它的下级地区
	 * @param id
	 * @return
	 */
	@RequestMapping(API_PRE+"/queryDistrict")
	@ApiOperation("地区展示")
	public List<District> queryDistrict(@RequestParam(name = "spell") String spell);
}

