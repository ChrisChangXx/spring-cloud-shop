package com.example.app.service;

import com.example.app.util.R;
import org.springframework.stereotype.Component;

/**
 * @创建人 zhanghui
 * @创建时间 2021/7/11
 * @描述
 */
@Component
public class PowerFeignClientFallback implements PowerFeignClient {
    @Override
    public R getPower() {
        return R.error("PowerFeignClientFallback");
    }
}