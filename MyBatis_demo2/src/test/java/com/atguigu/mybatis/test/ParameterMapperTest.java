package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.user;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*  MyBatis获取参数值的两种方式：${}和#{}
 ${}的本质就是字符串拼接，#{}的本质就是占位符赋值
${}使用字符串拼接的方式拼接sql，若为字符串类型或日期类型的字段进行赋值时，需要手动加单引
号；但是#{}使用占位符赋值的方式拼接sql，此时为字符串类型或日期类型的字段进行赋值时，可以自
动添加单引号

若mapper接口中的方法参数为多个时
此时MyBatis会自动将这些参数放在一个map集合中，以arg0,arg1...为键，以参数为值；以
param1,param2...为键，以参数为值；因此只需要通过${}和#{}访问map集合的键就可以获取相对应的
值，注意${}需要手动加单引号

若mapper接口中的方法需要的参数为多个时，此时可以手动创建map集合，将这些数据放在map中
只需要通过${}和#{}访问map集合的键就可以获取相对应的值，注意${}需要手动加单引号

若mapper接口中的方法参数为实体类对象时
此时可以使用${}和#{}，通过访问实体类对象中的属性名获取属性值，注意${}需要手动加单引号

5.可以通过@Param注解标识mapper接口中的方法参数
此时，会将这些参数放在map集合中，以@Param注解的value属性值为键，以参数为值；以
param1,param2...为键，以参数为值；只需要通过${}和#{}访问map集合的键就可以获取相对应的值，
注意${}需要手动加单引号
*/
public class ParameterMapperTest {
    @Test
    public void testgetAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<user>list=mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testJDBC() throws ClassNotFoundException, SQLException {
        String username="admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("","","");
        PreparedStatement ps = connection.prepareStatement("select *from t_user where username= ?");
        ps.setString(1,username);
    }

    @Test
    public void testgetUserByUsername() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        user us = mapper.GetUserByUsername("admin");
        System.out.println(us);
    }

    @Test
    public void testcheckLogin() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        user us = mapper.checkLogin("admin","123456");
        System.out.println(us);
    }

    @Test
    public void testcheckLoginByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object>map=new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        user us = mapper.checkLoginByMap(map);
        System.out.println(us);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new user(null, "李四", "123", 23, "男", "123@qq.com"));
        System.out.println(result);
    }

    @Test
    public void testcheckLoginByParam() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        user use = mapper.checkLoginByParam("admin", "123456");
        System.out.println(use);
    }
}
