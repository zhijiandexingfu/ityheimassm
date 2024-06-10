package com.zhh.study.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.zhh.study")
@Import({JDBCConfig.class,MybatisConfig.class})
@PropertySource({"jdbc.properties"})
@EnableTransactionManagement
public class SpringConfig {
}
