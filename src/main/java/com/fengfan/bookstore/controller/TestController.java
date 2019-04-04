package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Author fengfan
 * @Date 2019/4/4 14:22
 * @Description TODO
 * @Version 1.0
 **/
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public void test(){
        System.out.println();
        System.out.println("hello world");
    }
}
