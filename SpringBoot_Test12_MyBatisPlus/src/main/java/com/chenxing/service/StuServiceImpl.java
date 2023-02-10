package com.chenxing.service;

import com.chenxing.domain.Student;
import com.chenxing.mapper.StuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StuServiceImpl
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 16:16
 */
@Service
public class StuServiceImpl {
    // @Autowired
    @Resource(name = "stuMapper")
    private StuMapper stuMapper;

    public List<Student> findAll(){
        return stuMapper.selectList(null);
    }
}
