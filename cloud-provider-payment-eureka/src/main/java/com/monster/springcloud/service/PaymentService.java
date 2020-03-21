package com.monster.springcloud.service;

import com.monster.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lipengfei
 * @title: PaymentService
 * @projectName cloud
 * @description: TODO
 * @date 2020/03/15 17:04
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
