package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * index=(pageNum-1)*pageSize
 * a>在查询功能之前使用PageHelper.startPage(int pageNum, int pageSize)开启分页功能
 * pageNum：当前页的页码
 * pageSize：每页显示的条数
 * b>在查询获取list集合之后，使用PageInfo<T> pageInfo = new PageInfo<>(List<T> list, int
 *  navigatePages)获取分页相关数据
 * list：分页之后的数据
 * navigatePages：导航分页的页码数
 *
 * 1. 需要在查询功能之前开启分页
 * 2. 在查询功能之后获取分页的相关信息
 */
public class PageHelperTest {
    @Test
    public void testPageHelper() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp>list=mapper.selectByExample(null);
        list.forEach(emp -> System.out.println(emp));
    }
}
