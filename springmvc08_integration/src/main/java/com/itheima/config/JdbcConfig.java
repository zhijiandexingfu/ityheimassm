package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {


    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc-password}")
    private String password;
    @Value("${jdbc.driver-class-name}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Bean
    DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        return dataSource;
    }
}
