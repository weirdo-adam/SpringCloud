package com.monster.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author lipengfei
 */
@Configuration
@MapperScan({"com.monster.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
