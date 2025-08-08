package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.user;

import java.util.List;

public interface UserMapper {
     /**
      * MyBatis中可以面向接口操作数据，要保证两个一致：
      * a>mapper接口的全类名和映射文件的命名空间（namespace）保持一致
      * b>mapper接口中方法的方法名和映射文件中编写SQL的标签的id属性保持一致
      *
      */

     int insertUser();

     /**
      * 修改信息
      */
     void updateUser();

     /**
      * 删除信息
      */
     void deleteUser();

     /**
      * 根据id查询用户信息
      */
     user getUserById();

     /**
      * 查询所有信息
      */
     List<user> getAllUser();

}
