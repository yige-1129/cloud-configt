package com.example.wan_blog_last;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.wan_blog_last.mapper")
public class WanBlogLastApplication {

    public static void main(String[] args) {
        SpringApplication.run(WanBlogLastApplication.class, args);
    }

}
