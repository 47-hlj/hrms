package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Position;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> getAllPositions();
}
