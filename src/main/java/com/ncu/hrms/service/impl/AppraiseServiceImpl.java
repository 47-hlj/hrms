package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Appraise;
import com.ncu.hrms.mapper.AppraiseMapper;
import com.ncu.hrms.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {

    @Autowired
    private AppraiseMapper appraiseMapper;

    @Override
    public Appraise getAppraiseById(Integer id) {
        return appraiseMapper.getAppraiseById(id);
    }

    @Override
    public List<Appraise> getAllAppraise() {
        return appraiseMapper.getAllAppraise();
    }

    @Override
    public List<Appraise> getAll() {
        return appraiseMapper.getAll();
    }

    @Override
    public int deleteAppraiseById(Integer id) {
        return appraiseMapper.deleteAppraiseById(id);
    }

    @Override
    public int addAppraise(Appraise appraise) {
        return appraiseMapper.addAppraise(appraise);
    }

    @Override
    public int updateAppraise(Appraise appraise) {
        return appraiseMapper.updateAppraise(appraise);
    }

    @Override
    public List<Appraise> query(String name) {
        return appraiseMapper.query(name);
    }
}
