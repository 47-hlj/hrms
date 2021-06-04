package com.ncu.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncu.hrms.bean.Dept;
import com.ncu.hrms.config.PaginationConstant;
import com.ncu.hrms.service.DeptService;
import com.ncu.hrms.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService empService;

    //查询所用部门
    @GetMapping("/depts")
    public String list(Model model, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.CURRENT_NUM;
        }

        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);

        List<Dept> depts=deptService.getAllDepts();

        PageInfo<Dept> pageInfo=new PageInfo<>(depts);

        model.addAttribute("pageInfo",pageInfo);

        return "dept/dept";
    }


    //来到添加页面
    @GetMapping("/dept")
    public String toAddPage(Model model){
        //来打添加页面

        return "dept/add";
    }

    //部门添加
    @PostMapping("/dept")
    public String addDept(Dept dept){
        deptService.addDept(dept);

        return "redirect:/depts";
    }

    //来到修改页面
    @GetMapping("/dept/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id, Model model){
        Dept dept=deptService.getDeptById(id);
        model.addAttribute("dept",dept);

        return "dept/add";
    }

    //修改部门
    @PutMapping("/dept")
    public String updateDept(Dept dept){
        deptService.updateDept(dept);
        return "redirect:/depts";
    }

    //部门删除
    @DeleteMapping("/dept/{id}")
    public String deleteDeptById(@PathVariable("id") Integer id){
        empService.deleteEmpByDeptId(id);
        deptService.deleteDeptById(id);
        return "redirect:/depts";
    }

    //部门查询
    @PostMapping("/deptsearch")
    public String queryDept(@RequestParam String name,Model model,@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
        //查找数据
        List<Dept> depts=deptService.query(name);
        PageInfo<Dept> pageInfo=new PageInfo<>(depts);

        model.addAttribute("pageInfo",pageInfo);
        return "dept/dept";
    }

}
