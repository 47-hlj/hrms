package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class Position {
    private Integer id;
    private String name;

    public Position() {
    }

    public Position(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
