package com.chenxing.controller;

import com.chenxing.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 31/01/2023 15:56
 */
@Controller
public class TestController {
    @RequestMapping("/test01")
    public String test01(Model model){
        model.addAttribute("MyName","Chenxing");
        // 你这两面得对应上，你这刚才写的是 User，html 里面给的 user，他能匹配上么……
        model.addAttribute("user",new User("Oakley","8888"));
        // 手动跳转不了这个有可能和你vpn有关，具体不太确定，但是能运行就行，有时候vpn确实会导致一些不可估计的错误
        return "test01";
    }

    @RequestMapping("/edit")
    public String edit(Model model){
        model.addAttribute("user", new User("Tommy", "6666"));
        return "edit";
    }

    @RequestMapping("/eachUser")
    public String eachUser(Model model){
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("root", "toor"));
        userList.add(new User("admin", "nimda"));
        userList.add(new User("andy", "ydna"));
        userList.add(new User("jack", "kcaj"));

        model.addAttribute("userList", userList);

        return "eachUser";
    }

    @RequestMapping("/eachUserMap")
    public String eachUserMap(Model model){
        HashMap<String, String> userMap = new HashMap<>();

        userMap.put("root", "toor");
        userMap.put("admin", "nimda");
        userMap.put("andy", "ydna");
        userMap.put("jack", "kcaj");

        model.addAttribute("userMap", userMap);

        return "eachUserMap";
    }
}
