package com.ncu.hrms.service;

import com.ncu.hrms.bean.User;

import java.util.List;

public interface UserService {
    //后台登录
    User login(User user);

    //根据id查询
    User getUserById(Integer id);

    //查询所有
    List<User> getAllUsers();

    //根据id删除
    int deleteUserById(Integer id);

    //添加
    int addUser (User user);

    //修改
    int updateUser(User user);
}
