package com.bright.star;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.bright.star.infrastructure.persistence.dao")
public class BrightStartNewApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrightStartNewApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Bright Start").version("1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
