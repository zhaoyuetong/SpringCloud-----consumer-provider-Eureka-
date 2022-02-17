package com.study.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启用eureka服务器端功能
@EnableEurekaServer
@SpringBootApplication
public class AtzytMainType {
    public static void main(String[] args) {
        SpringApplication.run(AtzytMainType.class, args);
    }
}
