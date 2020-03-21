package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lipengfei
 * @title: CloudHystirxDashboard
 * @projectName cloud
 * @description: 微服务监控
 * @date 2020/03/17 15:40
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixDashboard.class, args);
    }
}
