package com.springboot.blog.service;

import com.springboot.blog.entity.User;

public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
