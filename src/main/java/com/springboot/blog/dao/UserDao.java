package com.springboot.blog.dao;

import com.springboot.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//让Mybatis找到对应的mapper，在编译的时候动态生成代理类，实现相应SQL功能
@Mapper
@Repository
public interface UserDao {

    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
