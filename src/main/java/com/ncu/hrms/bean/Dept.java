package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class Dept {
    private Integer id;
    private String name;

    public Dept() {
    }

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Dept{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
