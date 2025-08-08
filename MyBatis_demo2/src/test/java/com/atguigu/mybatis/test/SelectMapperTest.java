package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class SelectMapperTest {
    /**
     *
     * 查询出的数据只有一条，
     * a>可以通过实体类对象接收
     * a> list集合接收
     * a> map集合接收     {password=123, sex=男, id=4, age=23, email=123@qq.com, username=李四}
     * 若是多条，不能用实体类对象; 要用集合接收
     * a> 实体类类型的list 接收
     * b> map类型的list 接收
     * c> @MapKey("id") 注解
     *
     *
     *
     * mybatis 中设置了默认的类型别名
     * Java.lang.Integer -->int ,integer
     * int --> _int, _integer
     * Map--> map        String-->string
     */
    @Test
    public void testGetUserById() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(4));
    }

    @Test
    public void testAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUser());
    }

    @Test
    public void testgetCount() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }

    @Test
    public void testgetUserByIdToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(4));
    }

    @Test
    public void testgetAllUserToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUserToMap());
    }
}
