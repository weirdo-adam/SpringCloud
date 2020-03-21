package com.monster.springcloud.dao;

import com.monster.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lipengfei
 * @title: PaymentDao
 * @projectName cloud
 * @description: 支付dao层
 * @date 2020/03/15 16:50
 **/
@Mapper
public interface PaymentDao {

    /**
     * 插入
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
