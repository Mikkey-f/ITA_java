package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     *  查询所有员工信息 根据用户名查询用户信息
     */

    /**
     * 添加用户信息
     *
     *
     *
     *
    */

    user checkLoginByParam(@Param("username") String username, @Param("password") String password);
    int insertUser(user user);
     user checkLoginByMap(Map<String,Object>map);
    user checkLogin(String username,String password);
    user GetUserByUsername(String username);
    List<user> getAllUser();
}
