package com.monster.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lipengfei
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudSentinelMain
{
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelMain.class, args);
    }
}
