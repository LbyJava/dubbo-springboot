package com.lby.dubbospringbootservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lby.dubbospringbootiservice.dubbo.pojo.UserModel;
import com.lby.dubbospringbootiservice.dubbo.service.IUserService;
import com.lby.dubbospringbootservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserModel> findAllModels() {
        return userMapper.findAllUsers();
    }

    @Override
    public String testUser(String name) {
        System.out.println(System.currentTimeMillis());
        return "hello "+name;
    }
}
