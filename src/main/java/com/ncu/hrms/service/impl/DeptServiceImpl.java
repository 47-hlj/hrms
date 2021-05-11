package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Dept;
import com.ncu.hrms.mapper.DeptMapper;
import com.ncu.hrms.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public List<Dept> getAllDepts() {
        return deptMapper.getAllDepts();
    }

    @Override
    public int deleteDeptById(Integer id) {
        return deptMapper.deleteDeptById(id);
    }

    @Override
    public int addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }
}
