package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emptrain {
    private Integer id;
    private Integer eid;
    private Date trainDate;
    private String trainContent;
    private String remark;

    private Emp emp;

}
