package com.ncu.hrms.service.impl;


import com.ncu.hrms.bean.Emptransfer;
import com.ncu.hrms.mapper.EmptransferMapper;
import com.ncu.hrms.service.EmptransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmptransferServiceImpl implements EmptransferService {

    @Autowired
    private EmptransferMapper emptransferMapper;

    @Override
    public List<Emptransfer> getAllEmptransfer() {
        return emptransferMapper.getAllEmptransfer();
    }

    @Override
    public int addEmptransfer(Emptransfer emptransfer) {
        return emptransferMapper.addEmptransfer(emptransfer);
    }
}
