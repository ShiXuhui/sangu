package com.lingyun.manager_cms.service.webservice;

import com.lingyun.framework.domain.District;

import java.util.List;

public interface JobService {
	List<District> queryDistrict(String spell);
}
