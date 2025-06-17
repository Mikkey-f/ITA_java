package com.szj.mapper;

import com.szj.pojo.Emp;
import com.szj.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

/**
 * 员工信息
 */
@Mapper
public interface EmpMapper {

    // ---------------------------------- 原始分页查询实现 -------------------
    /**
     * 查询总记录数
     */
    //@Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
    //public Long count();

    /**
     * 分页查询
     */
    //@Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id " +
    //        "order by e.update_time desc limit #{start},#{pageSize}")
    //public List<Emp> list(Integer start, Integer pageSize);


    //@Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc")
    //public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

    /**
     * 条件查询员工信息
     */
    public List<Emp> list(EmpQueryParam empQueryParam);

    /**
     * 新增员工基本信息
     */
    @Options(useGeneratedKeys = true, keyProperty = "id") // 获取新增数据的主键值
    //useGeneratedKeys = true 表示使用数据库自动生成的主键值 keyProperty = "id" 表示将主键值保存到emp对象的id属性中
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) " +
            "VALUES (#{username}, #{name}, #{gender}, #{phone}, #{job}, #{salary}, #{image}, #{entryDate}, #{deptId}, #{createTime}, #{updateTime})")
    void insert(Emp emp);
}
