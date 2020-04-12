package com.zhd.dubbo.dubboclient.controller;

import com.zhd.dubbo.dubboserver.simple.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghaodong
 * @description
 * @date: 2020-04-12 12:22
 */
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.selloHello(name);
    }
}
