package com.example.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 电源控制器
 *
 * @author zhangh
 * @date 2021/06/15
 */
@RestController
public class PowerController {
    @RequestMapping("/getPower.do")
    public Object getPoser() {
        Map<String, Object> map = new HashMap<>();
        map.put("key", "power1");
        return map;
    }
}
