package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Emptransfer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmptransferMapper {

    List<Emptransfer> getAllEmptransfer();

    int addEmptransfer(Emptransfer emptransfer);

    int deleteEmptransfer(Integer id);
}
