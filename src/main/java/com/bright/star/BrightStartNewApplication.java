package com.bright.star;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bright.star.dao")
public class BrightStartNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightStartNewApplication.class, args);
    }

}
