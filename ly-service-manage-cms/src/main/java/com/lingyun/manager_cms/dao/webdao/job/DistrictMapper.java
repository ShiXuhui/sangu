package com.lingyun.manager_cms.dao.webdao.job;

import com.lingyun.framework.domain.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);

    List<District> queryDistrict(@Param("spell") String spell);

    List<District> queryDistrictById(Integer id);
}