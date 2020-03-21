package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lipengfei
 * @title: CloudOrderZooKeeper
 * @projectName cloud
 * @description: TODO
 * @date 2020/03/16 11:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudOrderZookeeper {
    public static void main(String[] args) {
        SpringApplication.run(CloudOrderZookeeper.class,args);
    }
}
