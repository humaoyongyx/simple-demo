package com.example.demo.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author issac.hu
 */
@Service
public class TestService {

    @Value("${demo.test}")
    private String test;

    @NacosValue(value = "${username:aaa}",autoRefreshed = true)
    private String userName;

    @NacosValue(value = "${enc:aaa}",autoRefreshed = true)
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
