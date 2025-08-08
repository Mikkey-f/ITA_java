package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapperSQL {
    /**
     *  多条件查询
     */
    List<Emp>getEmpByCondition(Emp emp);

    /**
     * 测试 choose when otherwise
     */
    List<Emp>getEmpBychoose(Emp emp);

    /**
     * 通过数组来实现批量删除
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    int insertMoreByList(@Param("emps") List<Emp> emps);
}
