package com.chenxing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Stu
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 01/02/2023 13:28
 */
@Data
@AllArgsConstructor
public class Stu {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Double score;
    private String tel;
    private String classid;
}
