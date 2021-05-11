package com.ncu.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncu.hrms.bean.Contract;
import com.ncu.hrms.bean.Emp;
import com.ncu.hrms.config.PaginationConstant;
import com.ncu.hrms.service.ContractService;
import com.ncu.hrms.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContractController {
    @Autowired
    private  ContractService contractService;

    @Autowired
    private EmpService empService;

    // 查询所有合同返回列表页面
    @GetMapping("/contracts")
    public String list(Model model, @RequestParam(value="pageNum",defaultValue="1")Integer pageNum) {
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.CURRENT_NUM;
        }
        //设置分页(当前页，和每页显示数据条数)
        PageHelper.startPage(pageNum, PaginationConstant.PAGE_SIZE);

        //查找数据
        List<Contract> contracts = contractService.getContractAndEmp();
        //将查找出的结果封装到PageInfo对象中，这个对象包含了 emps集合和关于分页的方法，如下
        //pageInfo.getPageNum();
        //pageInfo.getPages(); 得到总页数
        //pageInfo.getNextPage(); 得到下一页
        //pageInfo.getPrePage(); 得到前一页
        PageInfo<Contract> pageInfo=new PageInfo<>(contracts);
        //用Model传递对象到page页面
        model.addAttribute("pageInfo",pageInfo);
        return "contract/contract";
    }

    // 来到合同添加页面
    @GetMapping("/contract")
    public String toAddPage(Model model) {
        // 来到添加页面，查出所有的员工，在页面显示
        List<Emp> emps = empService.getAllEmps();
        model.addAttribute("emps",emps);
        return "contract/add";
    }

    // 合同添加
    // SpringMVC 自动将请求参数和入参对象的属性进行一一绑定，要求了请求参数的名字和javaBean入参的对象里面的属性名是一样的
    @PostMapping("/contract")
    public String addContract(Contract contract) {
        // 保存合同
        contractService.addContract(contract);
        // 来到合同列表页面
        // redirect: 表示重定向到一个地址 /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/contracts";
    }

    // 来到修改页面，查出当前合同，在页面显示
    @GetMapping("/contract/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id, Model model) {
        Contract contract = contractService.getContractById(id);
        model.addAttribute("contract",contract);

        // 页面要显示所有的员工列表
        List<Emp> emps = empService.getAllEmps();
        model.addAttribute("emps",emps);
        // 回到修改页面（add是一个修改添加二合一的页面）
        return "contract/add";
    }

    // 合同修改，需要提交合同id
    @PutMapping("/contract")
    public String updateContract(Contract contract) {
        contractService.updateContract(contract);
        return "redirect:/contracts";
    }

    //合同删除
    @DeleteMapping("/contract/{id}")
    public String deleteContractById(@PathVariable("id") Integer id){
        contractService.deleteContractById(id);
        return "redirect:/contracts";
    }

    @PostMapping("/consearch")//提交表单+传回前端的映射
    public String queryContract(@RequestParam String name, Model model,@RequestParam(value="pageNum",defaultValue="1")Integer pageNum){
        PageHelper.startPage(pageNum, PaginationConstant.PAGE_SIZE);
        //查找数据
        List<Contract> contracts = contractService.query(name);

        PageInfo<Contract> pageInfo=new PageInfo<>(contracts);

        model.addAttribute("pageInfo",pageInfo);
        return "contract/contract";
    }
}
