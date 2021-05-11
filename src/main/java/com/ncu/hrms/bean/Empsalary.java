package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class Empsalary {
    private Integer id;
    private Integer eid;
    private Integer sid;
    private Double sal;

    private Emp emp;
    private Salary salary;

    public Empsalary() {
    }

    public Empsalary(Integer id, Integer eid, Integer sid, Double sal, Emp emp, Salary salary) {
        this.id = id;
        this.eid = eid;
        this.sid = sid;
        this.sal = sal;
        this.emp = emp;
        this.salary = salary;
    }
}
