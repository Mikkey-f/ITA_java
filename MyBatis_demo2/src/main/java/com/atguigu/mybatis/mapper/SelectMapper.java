package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {


    /**
     *  根据id查询用户信息
     */
    user getUserById(@Param("id") Integer id);
    List<user>getAllUser();

    /**
     * 查询用户信息的总记录数
     */
    Integer getCount();

    Map<String,Object>getUserByIdToMap(@Param("id") Integer id);

    List<Map<String,Object>>getAllUserToMap();
}
