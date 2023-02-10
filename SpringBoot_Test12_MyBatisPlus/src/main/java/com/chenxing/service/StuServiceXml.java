package com.chenxing.service;

import com.chenxing.domain.Student;
import com.chenxing.mapper.StuXmlMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StuServiceXml
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 16:19
 */
@Service
public class StuServiceXml {
    // @Autowired
    @Resource(name = "stuXmlMapper")
    private StuXmlMapper stuXmlMapper;

    public List<Student> findAll(){
        return stuXmlMapper.findAll();
    }
}
