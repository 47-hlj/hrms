package com.ncu.hrms.service;

import com.ncu.hrms.bean.Dept;

import java.util.List;

public interface DeptService {
    //根据id查询部门
    Dept getDeptById(Integer id);

    //查询所有部门
    List<Dept> getAllDepts();

    //根据id删除部门
    int deleteDeptById(Integer id);

    //添加部门
    int addDept(Dept dept);

    //更新部门
    int updateDept(Dept dept);
}
