package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Emp;
import com.ncu.hrms.bean.Empsalary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmpsalaryMapper {
    //根据id查询员工薪水
    Empsalary getEmpsalaryById(Integer id);

    //查询所有员工薪水
    List<Empsalary> getAllEmpsalarys();

    List<Empsalary> getAll();

    //根据id删除员工薪水
    int deleteEmpsalaryById(Integer id);

    //添加员工薪水
    int addEmpsalary(Empsalary empsalary);

    //修改员工薪水
    int updateEmpsalary(Empsalary empsalary);

    List<Empsalary> query(String name);

}
