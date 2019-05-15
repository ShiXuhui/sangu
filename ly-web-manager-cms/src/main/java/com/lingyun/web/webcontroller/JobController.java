package com.lingyun.web.webcontroller;

import com.lingyun.framework.domain.District;
import com.lingyun.service.wbeservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
	@Autowired
	private JobService jobService;

	@RequestMapping("/queryDistrict")
	public List<District> queryDistrict(String spell) {
		return jobService.queryDistrict(spell);
	}
}
