package com.bright.star;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.bright.star.infrastructure.persistence.dao")
public class BrightStartNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightStartNewApplication.class, args);
    }

}
