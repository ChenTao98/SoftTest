package com.softtest.softtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.softtest.softtest.dao")
public class SofttestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofttestApplication.class, args);
    }

}
