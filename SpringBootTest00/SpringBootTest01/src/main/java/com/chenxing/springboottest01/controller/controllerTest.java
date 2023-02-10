package com.chenxing.springboottest01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName controllerTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 17/01/2023 11:20
 */
@Controller
@ResponseBody

public class controllerTest {
    @RequestMapping("helloIdea")
    public String helloIdea(){
        return "Hello World (SpringBoot with Idea!)";
    }
}
