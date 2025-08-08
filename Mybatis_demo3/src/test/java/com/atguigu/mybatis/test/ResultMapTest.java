package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ResultMapTest {

    /*

    a>可以通过为字段起别名的方式，保证和实体类中的属性名保持一致
    b>可以在MyBatis的核心配置文件中设置一个全局配置信息mapUnderscoreToCamelCase，可
    以在查询表中数据时，自动将_类型的字段名转换为驼峰
     */
    @Test
    public void testGetAllEmp() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmp();
        list.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testgetEmpAndDept() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testgetEmpAndDeptByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(emp);
        System.out.println(emp.getEmpName()); // 李四
    }

    @Test
    public void testgetDeptEmpMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(2);
        System.out.println(dept);
    }

    @Test
    public void testgetDeptAndEmpByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept);
    }

}
