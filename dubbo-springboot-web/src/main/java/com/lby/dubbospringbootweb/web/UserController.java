package com.lby.dubbospringbootweb.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lby.dubbospringbootiservice.dubbo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        System.out.println("test user index");
        System.out.println(userService.testUser("我的第一次Dubbo加springBoot的Test"));

        System.out.println(userService.findAllModels());

        return "user/index";
    }
}
