package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Date birthday;
    private String IDCard;
    private String wedlock;
    private Integer nationId;
    private String nativePlace;
    private String email;
    private String phone;
    private String address;
    private Integer deptId;
    private Integer posId;
    private String degree;
    private String school;
    private Date edate;
    private String workState;
    private String workID;
    private Date conversionTime;
    private Integer workAge;
    private Date notWorkDate;

    private Nation nation;
    private Position position;
    private Dept dept;

}
