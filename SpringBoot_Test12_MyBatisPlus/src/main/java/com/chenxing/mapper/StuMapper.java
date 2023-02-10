package com.chenxing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenxing.domain.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName StuMapper
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/01/2023 16:12
 */
@Mapper
public interface StuMapper extends BaseMapper<Student> {
}
