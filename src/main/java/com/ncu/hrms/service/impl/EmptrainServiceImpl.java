package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Emptrain;
import com.ncu.hrms.mapper.EmptrainMapper;
import com.ncu.hrms.service.EmptrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmptrainServiceImpl implements EmptrainService {
    @Autowired
    private EmptrainMapper emptrainMapper;

    @Override
    public Emptrain getEmptrainById(Integer id) {
        return emptrainMapper.getEmptrainById(id);
    }

    @Override
    public List<Emptrain> getAllEmptrains() {
        return emptrainMapper.getAllEmptrains();
    }

    @Override
    public List<Emptrain> getEmptrainAndEmp() {
        return emptrainMapper.getEmptrainAndEmp();
    }

    @Override
    public int deleteEmptrainById(Integer id) {
        return emptrainMapper.deleteEmptrainById(id);
    }

    @Override
    public int addEmptrain(Emptrain emptrain) {
        return emptrainMapper.addEmptrain(emptrain);
    }

    @Override
    public int updateEmptrain(Emptrain emptrain) {
        return emptrainMapper.updateEmptrain(emptrain);
    }

    @Override
    public List<Emptrain> query(String name) {
        return emptrainMapper.query(name);
    }
}
