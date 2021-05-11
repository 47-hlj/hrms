package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class Nation {
    private Integer id;
    private String name;

    public Nation() {
    }

    public Nation(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
