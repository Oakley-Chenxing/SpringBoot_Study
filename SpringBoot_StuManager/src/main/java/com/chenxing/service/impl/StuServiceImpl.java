package com.chenxing.service.impl;

import com.chenxing.domain.Stu;
import com.chenxing.mapper.StuMapper;
import com.chenxing.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StuServiceImpl
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 01/02/2023 13:27
 */
@Service
public class StuServiceImpl implements StuService {
    @Resource
    private StuMapper stuMapper;

    @Override
    public List<Stu> findAll() {
        return stuMapper.findAll();
    }

    @Override
    public void insert(Stu stu) {
        stuMapper.insert(stu);
    }

    @Override
    public Stu findById(int id) {
        return stuMapper.findById(id);
    }

    @Override
    public void update(Stu stu) {
        stuMapper.update(stu);
    }

    @Override
    public void deleteById(int id) {
        stuMapper.deleteById(id);
    }
}
