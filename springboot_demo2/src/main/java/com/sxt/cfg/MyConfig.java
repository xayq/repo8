package com.sxt.cfg;

import com.alibaba.druid.pool.DruidDataSource;
import com.sxt.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyConfig {
    @Bean
    public User user(){
        User user=new User();
        user.setName("张三");
        user.setAge(23);
        return user;
    }
    @Bean("dataSource1")
    public DruidDataSource dataSource1(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mydb");
        ds.setUsername("root1");
        ds.setPassword("root");
        return ds;
    }
}
