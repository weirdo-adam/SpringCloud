package com.monster.springcloud.service.impl;

import com.monster.springcloud.dao.PaymentDao;
import com.monster.springcloud.service.PaymentService;
import com.monster.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lipengfei
 * @title: PaymentServiceImpl
 * @projectName cloud
 * @description: TODO
 * @date 2020/03/15 17:05
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
