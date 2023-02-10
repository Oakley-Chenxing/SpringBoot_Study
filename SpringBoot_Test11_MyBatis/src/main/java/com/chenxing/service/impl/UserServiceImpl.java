package com.chenxing.service.impl;

import com.chenxing.domain.User;
import com.chenxing.mapper.UserMapper;
import com.chenxing.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 15:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        System.out.println("findAll() is running ...");

        return userMapper.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        System.out.println("add() is running ...");
        System.out.println(user);
        userMapper.insert(user);

        // System.out.println(10 / 0);

        user.setUsername(user.getUsername() + "New");
        user.setPassword(user.getPassword() + "New");
        System.out.println(user);

        userMapper.insert(user);
    }
}
