package com.spring.springbucks.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableCaching
public class WorkServiceApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(WorkServiceApplication.class, args);
    }


}
