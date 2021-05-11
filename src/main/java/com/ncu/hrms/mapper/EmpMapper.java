package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper {
    //根据id查询员工
    Emp getEmpById(Integer id);

    Emp getEmpAndDeptById(Integer id);

    //根据workID查询员工
    Emp getEmpByWorkID(Integer workID);

    //查询所有员工
    List<Emp> getAllEmps();

    List<Emp> getEmpAndDept();

    //根据id删除员工
    int deleteEmpById(Integer id);

    //添加员工
    int addEmp(Emp emp);

    //修改员工信息
    int updateEmp(Emp emp);

    List<Emp> query(String name);

}
