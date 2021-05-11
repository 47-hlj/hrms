package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Emp;
import com.ncu.hrms.mapper.EmpMapper;
import com.ncu.hrms.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;


    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public Emp getEmpAndDeptById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public Emp getEmpByWorkID(Integer workID) {
        return empMapper.getEmpAndDeptById(workID);
    }

    @Override
    public List<Emp> getAllEmps() {
        return empMapper.getAllEmps();
    }

    @Override
    public List<Emp> getEmpAndDept() {
        return empMapper.getEmpAndDept();
    }

    @Override
    public int deleteEmpById(Integer id) {
        return empMapper.deleteEmpById(id);
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateEmp(emp);
    }

    @Override
    public List<Emp> query(String name) {
        return empMapper.query(name);
    }
}
