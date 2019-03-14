package com.lby.dubbospringbootweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootWebApplication.class, args);
    }
}
