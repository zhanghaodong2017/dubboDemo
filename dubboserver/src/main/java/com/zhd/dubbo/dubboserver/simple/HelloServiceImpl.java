package com.zhd.dubbo.dubboserver.simple;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author: zhanghaodong
 * @description
 * @date: 2020-04-12 11:39
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String selloHello(String name) {
        return "hello " + name;
    }
}
