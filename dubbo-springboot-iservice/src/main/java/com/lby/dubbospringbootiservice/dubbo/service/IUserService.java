package com.lby.dubbospringbootiservice.dubbo.service;


import com.lby.dubbospringbootiservice.dubbo.pojo.UserModel;

import java.util.List;

public interface IUserService {

    public String testUser(String name);

    public List<UserModel> findAllModels();
}
