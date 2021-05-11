package com.ncu.hrms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ncu.hrms.mapper")
@SpringBootApplication
public class HrmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmsApplication.class, args);
    }

}
