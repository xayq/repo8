package com.sxt.controller;

import com.sxt.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello1")
    public String hello1(){
        return "Hello springboot，我来了！";
    }
    @GetMapping("hello2")
    public User hello2(){
        return new User("张三",23);
    }
}
