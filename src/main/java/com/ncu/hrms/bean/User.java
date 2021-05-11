package com.ncu.hrms.bean;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer enable;

    public User() {
    }

    public User(Integer id, String username, String password, String email, Integer enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enable = enable;
    }

}
