package com.chenxing.controller;

import com.chenxing.domain.User;
import com.chenxing.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 15:28
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    public @ResponseBody
    List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/add")
    public @ResponseBody String add(User user){
        userService.add(user);
        return "添加成功";
    }
    // http://127.0.0.1:9527/add?username=itlaoxie&password=laoxie
    // http://127.0.0.1:9527/findAll
}
