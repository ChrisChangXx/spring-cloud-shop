package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 电力的应用
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/13
 * @描述
 * @date 2021/06/13
 */
@SpringBootApplication
@EnableEurekaClient
public class PowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PowerApplication.class);
    }
}
