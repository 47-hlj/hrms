package com.ncu.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncu.hrms.bean.Emp;
import com.ncu.hrms.bean.Emptransfer;
import com.ncu.hrms.bean.Position;
import com.ncu.hrms.config.PaginationConstant;
import com.ncu.hrms.service.DeptService;
import com.ncu.hrms.service.EmpService;
import com.ncu.hrms.service.EmptransferService;
import org.elasticsearch.common.inject.multibindings.MapBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmptransferController {
    @Autowired
    private EmptransferService emptransferService;

    //查询所用
    @GetMapping("/emptransfers")
    public String list(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.CURRENT_NUM;
        }

        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);

        List<Emptransfer> emptransfers=emptransferService.getAllEmptransfer();


        PageInfo<Emptransfer> pageInfo=new PageInfo<>(emptransfers);

        model.addAttribute("pageInfo",pageInfo);

        return "emptransfer/emptransfer";
    }



}
