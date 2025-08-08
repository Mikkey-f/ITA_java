package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    /**
     *  根据用户名模糊查询用户信息
     */
    List<user>getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);

    List<user> getUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加功能自增的主键
     */
    void insertUser(user user);
}
