package com.chenxing.service;

import com.chenxing.domain.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 15:25
 */

public interface UserService {
    List<User> findAll();
    void add(User user);
}
