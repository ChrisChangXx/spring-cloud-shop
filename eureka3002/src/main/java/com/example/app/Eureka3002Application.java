package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka3002应用程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/12
 * @描述
 * @date 2021/06/12
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3002Application.class);
    }
}
