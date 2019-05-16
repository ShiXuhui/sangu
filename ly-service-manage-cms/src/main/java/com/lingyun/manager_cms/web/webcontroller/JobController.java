package com.lingyun.manager_cms.web.webcontroller;

import com.lingyun.api.webapi.JobContorllerApi;
import com.lingyun.framework.domain.District;
import com.lingyun.manager_cms.service.webservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController implements JobContorllerApi {

	@Autowired
	private JobService jobService;


	@Override
	public List<District> queryDistrict(String spell) {


		return jobService.queryDistrict(spell);
	}
}
