package com.chenxing.mapper;

import com.chenxing.domain.Stu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName StuMapper
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 01/02/2023 13:26
 */
@Mapper
public interface StuMapper {
    @Select("select * from student")
    List<Stu> findAll();

    @Insert("insert into student(id, name, sex, age, score, tel, classid) " +
            "values (#{id}, #{name}, #{sex}, #{age}, #{score}, #{tel}, #{classid})")
    void insert(Stu stu);

    @Select("select * from student where id=#{id}")
    Stu findById(int id);

    @Update("update student set " +
            "name=#{name}, sex=#{sex}, age=#{age}, " +
            "score=#{score}, tel=#{tel}, classid=#{classid} " +
            "where id=#{id}")
    void update(Stu stu);

    @Delete("delete from student where id=#{id}")
    void deleteById(int id);


}
