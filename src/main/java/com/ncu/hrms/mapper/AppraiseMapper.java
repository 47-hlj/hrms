package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Appraise;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AppraiseMapper {
    Appraise getAppraiseById(Integer id);

    //查询所有
    List<Appraise> getAllAppraise();

    List<Appraise> getAll();

    //根据id删除
    int deleteAppraiseById(Integer id);

    //添加
    int addAppraise(Appraise appraise);

    //更新
    int updateAppraise(Appraise appraise);

    List<Appraise> query(String name);
}
