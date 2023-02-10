package com.chenxing.mapper;

import com.chenxing.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName StuXmlMapper
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 16:18
 */
@Mapper
@Repository
public interface StuXmlMapper {
    List<Student> findAll();
}
