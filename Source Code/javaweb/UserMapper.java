package com.szj.mapper;

import com.szj.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //应用程序在运行时，会自动创建UserMapper接口的实现类对象(代理对象)，并把对象添加到IOC容器中 - bean
public interface UserMapper {
    /**
     * 查询所有用户
     */
    //@Select("select * from user")
    public List<User> findAll();

    /**
     * 根据id删除用户
     */
//    @Delete("delete from user where id = #{id}")
//    public void deleteById(Integer id);

    @Delete("delete from user where id = #{id}")
    public Integer deleteById(Integer id);

    /**
     * 添加用户
     */
    @Insert("insert into user values(#{id},#{username},#{password},#{name},#{age})")
    public void insert(User user);

    /**
     * 修改用户
     */
    @Insert("update user set username=#{username},password=#{password},name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    /**
     * 根据用户名和密码查询用户
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    //public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    public User findByUsernameAndPassword(String username, String password);
}
