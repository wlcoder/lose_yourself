package com.wl.loseyourself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wl.loseyourself.mapper")
public class LoseyourselfApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoseyourselfApplication.class, args);
    }

}
