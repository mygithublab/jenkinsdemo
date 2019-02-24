package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
        return " 古语有云：不忘初心，方得始终，人生若只如初见!!!   ******欢迎光临!  联系：mygithublab@126.com****** " + new Date();
    }
}
