package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka3001应用程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/12
 * @描述
 * @date 2021/06/12
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3001Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3001Application.class);
    }
}
