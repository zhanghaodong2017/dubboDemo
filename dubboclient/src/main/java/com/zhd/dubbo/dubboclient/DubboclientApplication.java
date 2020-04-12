package com.zhd.dubbo.dubboclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DubboclientApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboclientApplication.class, args);
        System.out.println("SUCCESS");
    }

}
