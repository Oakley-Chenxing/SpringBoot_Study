package com.chenxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName controller
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 12:23
 */
@Controller
public class service {
    @RequestMapping("/test")
    public String test(Model model){
        System.out.println("test() is running!~ ……");
        model.addAttribute("info", "ITLaoXie");
        return "index";
    }
}
