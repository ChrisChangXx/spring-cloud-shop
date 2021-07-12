package com.example.app.controller;


import com.example.app.service.PowerFeignClient;
import com.example.app.util.R;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制器
 *
 * @author zhangh
 * @date 2021/06/15
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    private static final String POWER_URL = "http://SERVER-POWER";
    private static final String ORDER_URL = "http://CLIENT-ORDER";

    @Autowired
    private PowerFeignClient powerFeignClient;


    @RequestMapping("/getUser.do")
    public R getUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("key", "user");
        return R.success("返回成功", map);
    }

    @RequestMapping("/getOrder.do")
    public R getOrder() {
        return R.success("操作成功", restTemplate.getForObject(ORDER_URL + "/getOrder.do", Object.class));
    }


    @RequestMapping("/getFeignPower.do")
    /*@HystrixCommand(fallbackMethod = "fallbackMethod", threadPoolKey = "power", threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "5"),
    })*/
    public R getFeignPower(String name) {
        return R.success("操作成功", powerFeignClient.getPower());
    }

    @RequestMapping("/getPower.do")
    /*@HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties = {
            //@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5")
    })*/
    /*@HystrixCommand(fallbackMethod = "fallbackMethod", threadPoolKey = "power", threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "5"),
    })*/
    public R getPower(String name) throws Exception {
        System.out.println("调用了方法");
        return R.success("操作成功", restTemplate.getForObject(POWER_URL + "/getPower.do", Object.class));
    }

    public R fallbackMethod(String name) {
        System.out.println(name);
        return R.error("降级信息");
    }

}
