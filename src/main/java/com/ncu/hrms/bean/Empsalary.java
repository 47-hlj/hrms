package com.ncu.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empsalary {
    private Integer id;
    private Integer eid;
    private Integer sid;
    private Double sal;

    private Emp emp;
    private Salary salary;

}
