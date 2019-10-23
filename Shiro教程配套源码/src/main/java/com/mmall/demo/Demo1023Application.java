package com.mmall.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.mmall.demo.mapper"})
public class Demo1023Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1023Application.class, args);
    }

}
