package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有员工信息 及对应的部门信息
     */
    List<Emp> getAllEmp();

    Emp getEmpAndDept(@Param("eid") Integer eid);

    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    List<Emp>getDeptAndEmpByStepTwo(@Param("did") Integer did);

}
