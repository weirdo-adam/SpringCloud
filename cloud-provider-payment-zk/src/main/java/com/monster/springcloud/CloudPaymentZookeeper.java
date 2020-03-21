package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lipengfei
 * @title: CloudPaymentZK
 * @projectName cloud
 * @description: 使用zooKeeperk注册中心
 * @date 2020/03/16 10:50
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudPaymentZookeeper {
    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentZookeeper.class,args);
    }
}
