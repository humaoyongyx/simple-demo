package com.example.demo.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author issac.hu
 */
@Service
@RefreshScope
public class TestService {

    @Value("${demo.test}")
    private String test;

    @Value(value = "${username:aaa}")
    private String userName;

    @Value(value = "${enc:aaa}")
    private String enc;

    @PostConstruct
    public void init() {
        System.out.println(test);
        System.out.println(userName);
    }

    public String getValue() {
        return userName + "--" + enc;
    }

}
