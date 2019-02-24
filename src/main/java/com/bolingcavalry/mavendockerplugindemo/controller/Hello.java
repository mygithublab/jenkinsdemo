package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
        return " 缪凯生！！！！在干嘛！！！ 测试！欢迎光临!免费提供Linux 系统使用，有意者联系mygithublab@126.com " + new Date();
    }
}
