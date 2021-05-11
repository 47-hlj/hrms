package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class Salary {
    private Integer id;
    private Integer basicSalary;
    private Integer bonus;
    private Integer lunchSalary;
    private Integer trafficSalary;
    private Integer allSalary;
    private Integer pensionBase;
    private Float pensionPer;
    private Integer medicalBase;
    private Float medicalPer;
    private Integer accumulationFundBase;
    private Float accumulationFundPer;
    private String name;

    public Salary() {
    }

    public Salary(Integer id, Integer basicSalary, Integer bonus, Integer lunchSalary, Integer trafficSalary, Integer allSalary, Integer pensionBase, Float pensionPer, Integer medicalBase, Float medicalPer, Integer accumulationFundBase, Float accumulationFundPer, String name) {
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.lunchSalary = lunchSalary;
        this.trafficSalary = trafficSalary;
        this.allSalary = allSalary;
        this.pensionBase = pensionBase;
        this.pensionPer = pensionPer;
        this.medicalBase = medicalBase;
        this.medicalPer = medicalPer;
        this.accumulationFundBase = accumulationFundBase;
        this.accumulationFundPer = accumulationFundPer;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Salary{" +
//                "id=" + id +
//                ", basicSalary=" + basicSalary +
//                ", bonus=" + bonus +
//                ", lunchSalary=" + lunchSalary +
//                ", trafficSalary=" + trafficSalary +
//                ", allSalary=" + allSalary +
//                ", pensionBase=" + pensionBase +
//                ", pensionPer=" + pensionPer +
//                ", medicalBase=" + medicalBase +
//                ", medicalPer=" + medicalPer +
//                ", accumulationFundBase=" + accumulationFundBase +
//                ", accumulationFundPer=" + accumulationFundPer +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
