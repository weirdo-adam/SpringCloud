package com.monster.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lipengfei
 * @title: CloudConfigCenter
 * @projectName cloud
 * @description: 微服务配置中心
 * @date 2020/03/17 16:57
 **/
@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenter {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter.class,args);
    }
}
