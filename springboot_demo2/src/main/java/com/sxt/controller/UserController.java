package com.sxt.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.sxt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
public class UserController {
    @Autowired
    private User user;
    @Autowired
    private DruidDataSource dataSource1;
    @Autowired
    private DruidDataSource dataSource2;
    @GetMapping("user")
    public String user() throws SQLException {
        return "hello..."+user+"--------"+dataSource1.getUsername()+"------------"+dataSource2.getUsername();
    }
}
