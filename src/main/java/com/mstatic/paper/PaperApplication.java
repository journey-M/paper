package com.mstatic.paper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mapper.mstatic.mapper.mstatic.paper.mapper.mapper")
public class PaperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaperApplication.class, args);
    }

}

