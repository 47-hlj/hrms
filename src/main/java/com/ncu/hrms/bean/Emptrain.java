package com.ncu.hrms.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Emptrain {
    private Integer id;
    private Integer eid;
    private Date trainDate;
    private String trainContent;
    private String remark;

    private Emp emp;

    public Emptrain() {
    }

    public Emptrain(Integer id, Integer eid, Date trainDate, String trainContent, String remark) {
        this.id = id;
        this.eid = eid;
        this.trainDate = trainDate;
        this.trainContent = trainContent;
        this.remark = remark;
    }
}
