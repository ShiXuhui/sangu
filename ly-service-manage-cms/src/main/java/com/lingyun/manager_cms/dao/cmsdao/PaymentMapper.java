package com.lingyun.manager_cms.dao.cmsdao;

import com.lingyun.framework.domain.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKeyWithBLOBs(Payment record);

    int updateByPrimaryKey(Payment record);
}