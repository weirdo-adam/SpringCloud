package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lipengfei
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateWay
{
    public static void main(String[] args) {
            SpringApplication.run(CloudGateWay.class, args);
    }
}
