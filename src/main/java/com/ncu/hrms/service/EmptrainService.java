package com.ncu.hrms.service;

import com.ncu.hrms.bean.Emptrain;

import java.util.List;

public interface EmptrainService {
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
