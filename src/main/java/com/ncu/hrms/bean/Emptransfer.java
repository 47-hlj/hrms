package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emptransfer {
    private Integer id;
    private String name;
    private String dept;
    private String position;
    private Date date;
    private String reason;
}
