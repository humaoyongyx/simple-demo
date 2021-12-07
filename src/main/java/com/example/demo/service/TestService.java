package com.example.demo.service;

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


    @PostConstruct
    public void  init(){
        System.out.println(test);
    }


}
