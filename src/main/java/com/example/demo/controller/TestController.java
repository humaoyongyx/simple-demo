package com.example.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author issac.hu
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public String test(){
        return testService.getValue();
    }

    @Value(value = "${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping(value = "/get")
    public boolean get() {
        return useLocalCache;
    }
}
