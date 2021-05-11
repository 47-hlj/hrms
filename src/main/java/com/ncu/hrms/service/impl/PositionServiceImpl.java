package com.ncu.hrms.service.impl;

import com.ncu.hrms.bean.Position;
import com.ncu.hrms.mapper.PositionMapper;
import com.ncu.hrms.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }
}
