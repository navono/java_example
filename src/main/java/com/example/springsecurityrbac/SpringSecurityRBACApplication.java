package com.example.springsecurityrbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springsecurityrbac.dao")
public class SpringSecurityRBACApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityRBACApplication.class, args);
    }
}
