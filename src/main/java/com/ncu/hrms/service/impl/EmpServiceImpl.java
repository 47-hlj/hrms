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
    private EmpMapper empMapperMapper;


    @Override
    public Emp getEmpById(Integer id) {
        return empMapperMapper.getEmpById(id);
    }

    @Override
    public Emp getEmpAndDeptById(Integer id) {
        return empMapperMapper.getEmpById(id);
    }

    @Override
    public Emp getEmpByWorkID(Integer workID) {
        return empMapperMapper.getEmpAndDeptById(workID);
    }

    @Override
    public List<Emp> getAllEmps() {
        return empMapperMapper.getAllEmps();
    }

    @Override
    public List<Emp> getEmpAndDept() {
        return empMapperMapper.getEmpAndDept();
    }

    @Override
    public int deleteEmpById(Integer id) {
        return empMapperMapper.deleteEmpById(id);
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapperMapper.addEmp(emp);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapperMapper.updateEmp(emp);
    }

    @Override
    public List<Emp> query(String name) {
        return empMapperMapper.query(name);
    }

    @Override
    public int deleteEmpByDeptId(Integer deptId) {
        return empMapperMapper.deleteEmpByDeptId(deptId);
    }

}
