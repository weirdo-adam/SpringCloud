package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author lipengfei
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudConfigClient
{
    public static void main(String[] args) {
            SpringApplication.run(CloudConfigClient.class, args);
    }
}
