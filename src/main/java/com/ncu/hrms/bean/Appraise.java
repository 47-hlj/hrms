package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appraise {
    private Integer id;
    private Integer eid;
    private Date appDate;
    private String appResult;
    private String appContent;
    private String remark;

    private Emp emp;
}
