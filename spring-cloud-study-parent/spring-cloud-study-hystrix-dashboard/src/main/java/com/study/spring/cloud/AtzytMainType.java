package com.study.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

// 启用 Feign 客户端功能
// 启用 Hystrix 仪表盘功能
@EnableHystrixDashboard
@SpringBootApplication
public class AtzytMainType {
    public static void main(String[] args) {
        SpringApplication.run(AtzytMainType.class, args);
    }
}
