package com.monster.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CloudPaymentConsul
{
    public static void main(String[] args) {
            SpringApplication.run(CloudPaymentConsul.class, args);
    }
}
