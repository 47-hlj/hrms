package com.ncu.hrms.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Emprp {
    private Integer id;
    private Integer eid;
    private Date rpDate;
    private String rpType;
    private String rpReason;
    private Integer rpPoint;
    private String  remark;

    private Emp emp;

    public Emprp() {
    }

    public Emprp(Integer id, Integer eid, Date rpDate, String rpType, String rpReason, Integer rpPoint, String remark, Emp emp) {
        this.id = id;
        this.eid = eid;
        this.rpDate = rpDate;
        this.rpType = rpType;
        this.rpReason = rpReason;
        this.rpPoint = rpPoint;
        this.remark = remark;
        this.emp = emp;
    }
}
