package com.ncu.hrms.bean;

import lombok.Data;
import java.util.Date;

@Data
public class Appraise {
    private Integer id;
    private Integer eid;
    private Date appDate;
    private String appResult;
    private String appContent;
    private String remark;

    private Emp emp;

    public Appraise(){}

    public Appraise(Integer id, Integer eid, Date appDate, String appResult, String appContent, String remark) {
        this.id = id;
        this.eid = eid;
        this.appDate = appDate;
        this.appResult = appResult;
        this.appContent = appContent;
        this.remark = remark;
    }
}
