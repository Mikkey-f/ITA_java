package com.szj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.szj.mapper.EmpExprMapper;
import com.szj.mapper.EmpMapper;
import com.szj.pojo.*;
import com.szj.service.EmpLogService;
import com.szj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;
    @Autowired
    private EmpLogService empLogService;

//    /**
//     * 原始分页查询
//     * @param page 页码
//     * @param pageSize 每页记录数
//     * @return
//     */
    /*@Override
    public PageResult<Emp> page(Integer page, Integer pageSize) {
        //1. 调用mapper接口, 查询总记录数
        Long total = empMapper.count();

        //2. 调用mapper接口, 查询结果列表
        Integer start = (page - 1) * pageSize;
        List<Emp> rows = empMapper.list(start, pageSize);

        //3. 封装结果 PageResult
        return new PageResult<Emp>(total, rows);
    }*/

//    /**
//     * PageHelper分页查询
//     * @param page 页码
//     * @param pageSize 每页记录数
//     * 注意事项:
//     *         1. 定义的SQL语句结尾不能加分号;
//     *         2. PageHelper仅仅能对紧跟在其后的第一个查询语句进行分页处理
//     */
    /*@Override
    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end) {
        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(page, pageSize);

        //2. 执行查询
        List<Emp> empList = empMapper.list(name, gender, begin, end);

        //3. 解析查询结果, 并封装
        Page<Emp> p = (Page<Emp>) empList; //Page是PageHelper的泛型参数，继承了 List
        return new PageResult<Emp>(p.getTotal(), p.getResult());
    }*/

    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam) {
        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());

        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);

        //3. 解析查询结果, 并封装
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult<Emp>(p.getTotal(), p.getResult());
    }

    @Transactional(rollbackFor = Exception.class) // 开启事务 - 默认出现运行时异常RuntimeException才会回滚
    @Override
    public void save(Emp emp) throws  Exception{
        try {
            //1。保存员工基本信息
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            empMapper.insert(emp);

            //2. 保存员工工作经历信息
            List<EmpExpr> exprList = emp.getExprList();
            if (!CollectionUtils.isEmpty(exprList)){
                //遍历集合，为每个员工工作经历设置员工id empId
                exprList.forEach(empExpr -> {
                    empExpr.setEmpId(emp.getId());
                });

    //            for (EmpExpr expr : exprList) {
    //                expr.setEmpId(emp.getId());
    //            }
                empExprMapper.insertBatch(exprList);
            }
        }
        finally {
            //记录员工操作日志
            EmpLog empLog = new EmpLog(null, LocalDateTime.now(), "添加员工:" + emp);
            empLogService.insertLog(empLog);//单独开启一个事务
        }

    }


}
