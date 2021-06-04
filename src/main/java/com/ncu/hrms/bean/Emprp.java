package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprp {
    private Integer id;
    private Integer eid;
    private Date rpDate;
    private String rpType;
    private String rpReason;
    private Integer rpPoint;
    private String  remark;

    private Emp emp;

}
