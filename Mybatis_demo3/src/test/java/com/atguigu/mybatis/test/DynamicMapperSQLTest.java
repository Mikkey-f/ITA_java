package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicMapperSQL;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *   if标签可通过test属性的表达式进行判断，若表达式的结果为true，则标签中的内容会执行；反之标签中
 * 的内容不会执行
 *
 * 2.  where和if一般结合使用：
 * a>若where标签中的if条件都不满足，则where标签没有任何功能，即不会添加where关键字
 * b>若where标签中的if条件满足，则where标签会自动添加where关键字，并将条件最前方多余的
 * and去掉
 * 注意：where标签不能去掉条件最后多余的and
 *
 * trim用于去掉或添加标签中的内容
 * 常用属性：
 * prefix：在trim标签中的内容的前面添加某些内容
 * prefixOverrides：在trim标签中的内容的前面去掉某些内容
 * suffix：在trim标签中的内容的后面添加某些内容
 * suffixOverrides：在trim标签中的内容的后面去掉某些内容
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *sql片段，可以记录一段公共sql片段，在使用的地方通过include标签进行引入
 *
 * <sql id="empColumns">
 *  eid,ename,age,sex,did
 *  </sql>
 *  select <include refid="empColumns"></include> from t_emp
 */

/**
 * 一级缓存是SqlSession级别的，通过同一个SqlSession查询的数据会被缓存，下次查询相同的数据，就
 * 会从缓存中直接获取，不会从数据库重新访问
 * 使一级缓存失效的四种情况：
 * 1) 不同的SqlSession对应不同的一级缓存
 * 2) 同一个SqlSession但是查询条件不同
 * 3) 同一个SqlSession两次查询期间执行了任何一次增删改操作
 * 4) 同一个SqlSession两次查询期间手动清空了缓存 sqlSession1.clearCache();
 */
public class DynamicMapperSQLTest {
    @Test
    public void testGetEmpByCondition() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicMapperSQL mapper = sqlSession.getMapper(DynamicMapperSQL.class);
        List<Emp> emp = mapper.getEmpByCondition(new Emp(null, "张三", 23, "男", "123@qq.com"));
        System.out.println(emp);
    }

    @Test
    public void testGetEmpByChoose() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicMapperSQL mapper = sqlSession.getMapper(DynamicMapperSQL.class);
        List<Emp> emp = mapper.getEmpBychoose(new Emp(null, "张三", 23, "男", "123@qq.com"));
        System.out.println(emp);
    }

    @Test
    public void testInsertMoreByList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicMapperSQL mapper = sqlSession.getMapper(DynamicMapperSQL.class);
        Emp emp1=new Emp(null,"a1",23,"男","123@qq.com");
        Emp emp2=new Emp(null,"a2",22,"男","123@qq.com");
        Emp emp3=new Emp(null,"a3",23,"男","123@qq.com");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        System.out.println(mapper.insertMoreByList(list));
    }
}
