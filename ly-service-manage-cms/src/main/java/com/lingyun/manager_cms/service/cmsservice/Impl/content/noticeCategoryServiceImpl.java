package com.lingyun.manager_cms.service.cmsservice.Impl.content;

import com.lingyun.framework.domain.content.NoticeCategory;
import com.lingyun.manager_cms.dao.cmsdao.content.NoticeCategoryMapper;
import com.lingyun.manager_cms.service.cmsservice.content.NoticeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class noticeCategoryServiceImpl implements NoticeCategoryService{

   @Autowired
   private NoticeCategoryMapper noticeCategoryMapper;

    @Override
    public List<NoticeCategory> findNoticeCategoryAll() {
        return noticeCategoryMapper.findNoticeCategoryAll();
    }

    @Override
    public void saveNoticeCategory(NoticeCategory noticeCategory) {
        if(noticeCategory.getId()!=null){
            noticeCategoryMapper.updateByPrimaryKey(noticeCategory);
        }else{
            noticeCategoryMapper.insert(noticeCategory);
        }
    }

    @Override
    public NoticeCategory findNoticeCategoryById(Short id) {
        return noticeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteNoticeCategory(Short id) {
        noticeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteNoticeCategorys(String ids) {
        noticeCategoryMapper.deleteNoticeCategorys(ids);
    }

}
