package com.lingyun.manager_cms.service.cmsservice.content;

import com.lingyun.framework.domain.content.Zhss;

import java.util.List;

public interface ZhssService {

     List<Zhss>  zhssList(Zhss zhss);

     void deletezhss(Integer id);

     void pldelete(String strid);
}
