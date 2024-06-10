package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.itheima.service","com.itheima.dao"})
@Import({MybatisConfig.class,JdbcConfig.class})
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
