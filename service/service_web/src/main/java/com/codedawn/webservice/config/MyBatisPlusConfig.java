package com.codedawn.webservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author codedawn
 * @date 2020-11-22 21:18
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.codedawn.webservice.mapper")
public class MyBatisPlusConfig {

}
