package com.chenxing.domain;

import lombok.Data;

/**
 * @ClassName User
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 15:22
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String permission;
}
