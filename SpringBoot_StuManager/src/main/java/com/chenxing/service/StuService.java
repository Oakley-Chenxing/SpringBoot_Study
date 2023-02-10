package com.chenxing.service;

import com.chenxing.domain.Stu;

import java.util.List;

/**
 * @ClassName StuService
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 01/02/2023 13:27
 */
public interface StuService {
    // 查询全部
    List<Stu> findAll();
    // 添加学员
    void insert(Stu stu);
    // 根据ID查询学员
    Stu findById(int id);
    // 修改学员
    void update(Stu stu);
    // 根据ID删除学员
    void deleteById(int id);
}
