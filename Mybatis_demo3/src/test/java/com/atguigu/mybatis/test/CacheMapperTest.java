package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void testCache() throws IOException {
        SqlSession  sqlSession1= SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
    }

    @Test
    public void testTwoCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(mapper.getEmpByEid(1));
        sqlSession1.close();
        CacheMapper mapper1 = sqlSession2.getMapper(CacheMapper.class);
        System.out.println(mapper1.getEmpByEid(1));
        sqlSession2.close();
    }
}
