package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.user;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class SQLMapperTest {

    @Test
    public void testGetUserByLike() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<user> lis = mapper.getUserByLike("a");
        System.out.println(lis);
    }

    @Test
    public void testDeleteMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int result = mapper.deleteMore("4,5,6");
        System.out.println(result);
    }

    @Test
    public void testgetUserByTableName() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<user> li = mapper.getUserByTableName("t_user");
        System.out.println(li);
    }

    @Test
    public void testJDBC() throws ClassNotFoundException, SQLException {
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement ps = connection.prepareStatement("insert ",Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet resultSet = ps.getGeneratedKeys();

    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        user user=new user(null,"王五","123",23,"男","123@163.com");
        mapper.insertUser(user);
        System.out.println(user);
    }


}
