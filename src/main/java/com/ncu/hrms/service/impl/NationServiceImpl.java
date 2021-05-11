package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Nation;
import com.ncu.hrms.mapper.NationMapper;
import com.ncu.hrms.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationServiceImpl implements NationService {
    @Autowired
    private NationMapper nationMapper;

    @Override
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
