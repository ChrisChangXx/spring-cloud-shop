package com.example.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 权力装客户端
 *
 * @author zhangh
 * @date 2021/06/15
 */
@FeignClient(name = "SERVER-POWER", fallback = PowerFeignClientFallback.class)
public interface PowerFeignClient {

    @RequestMapping("/getPower.do")
    Object getPower();
}
