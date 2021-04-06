package com.springboot.blog.service.Impl;

import com.springboot.blog.dao.UserDao;
import com.springboot.blog.entity.User;
import com.springboot.blog.service.UserService;
import com.springboot.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.Code(password));
        return user;
    }
}
