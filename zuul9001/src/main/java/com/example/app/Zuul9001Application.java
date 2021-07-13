package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul应用程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/7/12
 * @描述
 * @date 2021/07/12
 */
@EnableZuulProxy
@SpringBootApplication
public class Zuul9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9001Application.class);
    }
}
