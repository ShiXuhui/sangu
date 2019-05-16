package com.lingyun.manager_cms.web.cmscontroller.content;

import com.lingyun.api.cmsapi.content.ZhssApi;
import com.lingyun.framework.domain.content.Zhss;
import com.lingyun.manager_cms.service.cmsservice.content.ZhssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZhssController implements ZhssApi {
    @Autowired
    public ZhssService zhssService;

    /**
     * 查询系统日志
     *
     * @param membersLong
     */
    @Override
    public List<Zhss> zhssList(Zhss membersLong) {
        return zhssService.zhssList(membersLong);
    }

    @Override
    public void deletezhss(Integer id) {
        zhssService.deletezhss(id);
    }

    @Override
    public void pldelete(String strid) {
        zhssService.pldelete(strid);
    }


}
