package com.monster.springcloud;

import com.monster.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lipengfei
 * @title: CloudCustomerOrder
 * @projectName cloud
 * @description: 订单启动类
 * @date 2020/03/15 18:11
 **/
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients //openfeign
@EnableHystrix //断路器
//@RibbonClient(name = "CLOUD-EUREKA-PAYMENT",configuration = MySelfRule.class) //修改默认负载均衡算法
public class CloudCustomerOrder {
        public static void main(String[] args) {
            SpringApplication.run(CloudCustomerOrder.class, args);
        }
}
