package com.grupozoe.zoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.grupozoe.zoe.controller",
    "com.grupozoe.zoe.service",
    "com.grupozoe.zoe.repository",
    "com.grupozoe.zoe.model"
})
public class ZoeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZoeApplication.class, args);
    }
}
