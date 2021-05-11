package com.ncu.hrms.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Emptransfer {
    private Integer id;
    private Integer eid;
    private Integer TDeptId;
    private Integer TPid;
    private Date TDate;
    private String TReason;
    private String remark;

    public Emptransfer() {
    }

    public Emptransfer(Integer id, Integer eid, Integer TDeptId, Integer TPid, Date TDate, String TReason, String remark) {
        this.id = id;
        this.eid = eid;
        this.TDeptId = TDeptId;
        this.TPid = TPid;
        this.TDate = TDate;
        this.TReason = TReason;
        this.remark = remark;
    }
}
