package com.chenxing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringBootTest13WebApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void teacherWriteAndRead() {
        redisTemplate.boundValueOps("teacher").set("IT老邪");
        // Object teacher = redisTemplate.boundValueOps("teacher").get();
        String teacher = redisTemplate.boundValueOps("teacher").get(0, -1);
        System.out.println(teacher);
    }

    @Test
    void studentWriteAndRead() {
        stringRedisTemplate.boundValueOps("student").set("IT小肆");
        String student = stringRedisTemplate.boundValueOps("student").get();
        System.out.println(student);
    }

}
