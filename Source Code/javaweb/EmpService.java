package com.szj.service;

import com.szj.pojo.Emp;
import com.szj.pojo.EmpQueryParam;
import com.szj.pojo.PageResult;

public interface EmpService {

    /**
     * 分页查询
     */
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    /**
     * 新增员工信息
     */
    void save(Emp emp) throws Exception;

    /**
     * 分页查询
     * @param page 页码
     * @param pageSize 每页记录数
     */
    //PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
}
