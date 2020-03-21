package com.monster.springcloud.alibaba.controller;

import com.monster.springcloud.alibaba.domain.CommonResult;
import com.monster.springcloud.alibaba.domain.Order;
import com.monster.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author lipengfei
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;
    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        System.out.println(order.toString());
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
