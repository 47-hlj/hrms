package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    private Integer id;
    private String workID;
    private Double contractTerm;
    private Date beginContract;
    private Date endContract;
    private String contractContent;

    private Emp emp;

}
