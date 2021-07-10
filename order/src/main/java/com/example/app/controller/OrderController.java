package com.example.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 顺序控制器
 *
 * @author zhangh
 * @date 2021/06/15
 */
@RestController
public class OrderController {
    @RequestMapping("/getOrder.do")
    public Object getOrder() {
        Map<String, Object> map = new HashMap<>();
        map.put("key", "order");
        return map;
    }
}
