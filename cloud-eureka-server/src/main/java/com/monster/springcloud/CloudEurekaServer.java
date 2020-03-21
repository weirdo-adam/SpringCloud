package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lipengfei
 * @title: CloudEurekaServer
 * @projectName cloud
 * @description: eureka注册中心
 * @date 2020/03/16 9:08
 **/
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class,args);
    }
}
