package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 订单应用程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/14
 * @描述
 * @date 2021/06/14
 */
@SpringBootApplication
@EnableEurekaClient
public class Order1Application {
    public static void main(String[] args) {
        SpringApplication.run(Order1Application.class);
    }
}
