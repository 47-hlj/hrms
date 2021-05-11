package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Nation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NationMapper {
    List<Nation> getAllNations();
}
