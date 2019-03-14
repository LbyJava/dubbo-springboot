package com.lby.dubbospringbootservice.mapper;

import com.lby.dubbospringbootiservice.dubbo.pojo.UserModel;

import java.util.List;

public interface UserMapper {

    List<UserModel> findAllUsers();
}
