package com.chenxing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ControllerTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 18:15
 */
@RestController
public class ControllerTest {
    @RequestMapping("/request")
    public String request(){
        return "Request 请求成功！~";
    }
    @RequestMapping("/get")
    public String get(){
        return "get 请求成功！~";
    }
    @RequestMapping("/post")
    public String post(){
        return "post 请求成功！~";
    }
    @RequestMapping("/put")
    public String put(){
        return "put 请求成功！~";
    }
    @RequestMapping("/delete")
    public String delete(){
        return "delete 请求成功！~";
    }
}
