package com.lingyun.manager_cms.service.webservice.Impl;

import com.lingyun.framework.domain.District;
import com.lingyun.manager_cms.dao.webdao.job.DistrictMapper;
import com.lingyun.manager_cms.service.webservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
	@Autowired
	private DistrictMapper districtMapper;

	@Override
	@Cacheable(value = "district",key = "#spell")
	public List<District> queryDistrict(String spell) {
		List<District> list1 = districtMapper.queryDistrict(spell);
		if (list1 !=null && list1.size()>0){
			List<District> list2 = districtMapper.queryDistrictById(list1.get(0).getId());
			if(list2 != null && list2.size()>0){
				list1.get(0).setChildren(list2);

			}


		}
		return list1;
	}
}
