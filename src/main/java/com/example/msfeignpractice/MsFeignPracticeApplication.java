package com.example.msfeignpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFeignPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFeignPracticeApplication.class, args);
    }

}
