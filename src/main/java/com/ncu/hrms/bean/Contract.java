package com.ncu.hrms.bean;

import lombok.Data;
import java.util.Date;

@Data
public class Contract {
    private Integer id;
    private String workID;
    private Double contractTerm;
    private Date beginContract;
    private Date endContract;
    private String contractContent;

    private Emp emp;

    public Contract() { }

    public Contract(Integer id, String workID, Double contractTerm, Date beginContract, Date endContract, String contractContent, Emp emp) {
        this.id = id;
        this.workID = workID;
        this.contractTerm = contractTerm;
        this.beginContract = beginContract;
        this.endContract = endContract;
        this.contractContent = contractContent;
        this.emp = emp;
    }

//    @Override
//    public String toString() {
//        return "Contract{" +
//                "id=" + id +
//                ", workId='" + workId + '\'' +
//                ", contractTerm=" + contractTerm +
//                ", beginContract=" + beginContract +
//                ", endContract=" + endContract +
//                ", contractContent='" + contractContent + '\'' +
//                ", emp=" + emp +
//                '}';
//    }
}
