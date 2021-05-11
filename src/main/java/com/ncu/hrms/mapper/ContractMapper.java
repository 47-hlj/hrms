package com.ncu.hrms.mapper;

import com.ncu.hrms.bean.Contract;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContractMapper {
    //根据id查询合同
    Contract getContractById(Integer id);

    //查询所有合同和员工
    List<Contract> getContractAndEmp();

    //查询所有合同
    List<Contract> getAllContracts();

    //根据id删除合同
    int deleteContractById(Integer id);

    //添加合同
    int addContract(Contract contract);

    //修改合同信息
    int updateContract(Contract contract);

    List<Contract> query(String name);


}
