package com.ncu.hrms.bean;

import lombok.Data;

import java.util.Date;

@Data
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

    public Emp() {
    }

    public Emp(Integer id, String name, Integer age, String gender, Date birthday, String IDCard, String wedlock, Integer nationId, String nativePlace, String email, String phone, String address, Integer deptId, Integer posId, String degree, String school, Date edate, String workState, String workID, Date conversionTime, Integer workAge, Date notWorkDate, Nation nation, Position position, Dept dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.IDCard = IDCard;
        this.wedlock = wedlock;
        this.nationId = nationId;
        this.nativePlace = nativePlace;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.deptId = deptId;
        this.posId = posId;
        this.degree = degree;
        this.school = school;
        this.edate = edate;
        this.workState = workState;
        this.workID = workID;
        this.conversionTime = conversionTime;
        this.workAge = workAge;
        this.notWorkDate = notWorkDate;
        this.nation = nation;
        this.position = position;
        this.dept = dept;
    }

//    @Override
//    public String toString() {
//        return "Emp{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", birthday=" + birthday +
//                ", IDCard='" + IDCard + '\'' +
//                ", wedlock='" + wedlock + '\'' +
//                ", nationId=" + nationId +
//                ", nativePlace='" + nativePlace + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", address='" + address + '\'' +
//                ", deptId=" + deptId +
//                ", posId=" + posId +
//                ", degree='" + degree + '\'' +
//                ", school='" + school + '\'' +
//                ", edate=" + edate +
//                ", workState='" + workState + '\'' +
//                ", workID='" + workID + '\'' +
//                ", conversionTime=" + conversionTime +
//                ", workAge=" + workAge +
//                ", notWorkDate=" + notWorkDate +
//                ", nation=" + nation +
//                ", position=" + position +
//                ", dept=" + dept +
//                '}';
//    }
}
