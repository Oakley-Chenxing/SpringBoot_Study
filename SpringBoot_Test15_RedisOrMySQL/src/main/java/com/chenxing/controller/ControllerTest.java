package com.chenxing.controller;

import com.chenxing.domain.User;
import com.chenxing.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ControllerTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 19/01/2023 15:13
 */
@RestController
public class ControllerTest {
    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        //创建一个 2 个并发的线程池对象，每 2 个线程并发一次
        ExecutorService es = Executors.newFixedThreadPool(2);

        //循环创建 10 个线程每 2 个线程并发一次
        for (int i = 0; i < 10; i++) {
            //提交线程
            es.submit(new Runnable() {
                @Override
                public void run() {
                    userService.findAll();
                }
            });
        }
        return null;
        // return userService.findAll();
    }
}
