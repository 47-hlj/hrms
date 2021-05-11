package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Emptrain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmptrainMapper {
    Emptrain getEmptrainById(Integer id);

    //    查询所有
    List<Emptrain> getAllEmptrains();

    List<Emptrain> getEmptrainAndEmp();

    //    根据id删除
    int deleteEmptrainById(Integer id);

    //    添加
    int addEmptrain(Emptrain emptrain);

    //    更新
    int updateEmptrain(Emptrain emptrain);

    List<Emptrain> query(String name);
}
