package com.example.app;

import config.OrderRuleConfig;
import config.PowerRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 用户应用程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/12
 * @描述
 * @date 2021/06/12
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClients({
        @RibbonClient(name = "CLIENT_ORDER", configuration = OrderRuleConfig.class),
        @RibbonClient(name = "SERVER_POWER", configuration = PowerRuleConfig.class)
})
@EnableFeignClients
@EnableHystrix
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
