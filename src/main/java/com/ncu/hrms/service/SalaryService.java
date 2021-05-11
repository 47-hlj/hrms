package com.ncu.hrms.service;

import com.ncu.hrms.bean.Salary;

import java.util.List;

public interface SalaryService {
    //根据id查询
    Salary getSalaryById(Integer id);

    //查询所有
    List<Salary> getAllSalarys();

    //根据id删除
    int deleteSalaryById(Integer id);

    //添加
    int addSalary(Salary salary);

    //修改
    int updateSalary(Salary salary);
}
