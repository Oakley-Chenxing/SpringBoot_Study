package com.chenxing;

import com.chenxing.domain.Student;
import com.chenxing.service.StuServiceImpl;
import com.chenxing.service.StuServiceXml;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootTest12MyBatisPlusApplicationTests {

    @Autowired
    private StuServiceImpl stuService;

    @Autowired
    private StuServiceXml stuServiceXml;

    @Test
    public void findAllTest() {

        List<Student> stuList = stuService.findAll();

        for (Student stu : stuList) {
            System.out.println(stu);
        }
    }

    @Test
    public void findAllXmlTest(){
        List<Student> stuList = stuServiceXml.findAll();

        for (Student stu : stuList) {
            System.out.println(stu);
        }
    }

}
